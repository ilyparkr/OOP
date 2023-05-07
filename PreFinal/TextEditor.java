import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class TextEditor implements ActionListener {
    private JFrame fr;
    private JTextArea ta;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem i1, i2, i3, i4;
    public TextEditor(){
        fr = new JFrame("My Text Editor");
        ta = new JTextArea(20,45);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Close");
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb.add(m1);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        fr.add(ta);
        fr.setJMenuBar(mb);
        
        
        fr.pack();
        fr.setVisible(true);
        
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(i1)){
            ta.setText("");
        }
        if (ae.getSource().equals(i2)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            String str = "";
            try (FileReader br = new FileReader(f)){
                int ch;
                while ((ch = br.read()) != -1){
                    str += (char)ch;
                }
                br.close();
            }
            catch(IOException ex){}
            ta.setText(str);
        }
        if (ae.getSource().equals(i3)){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
            try(FileWriter fw = new FileWriter(f);){
                String str = ta.getText();
                fw.write(str);
            }
            catch(IOException ex){}
        }
        if (ae.getSource().equals(i4)){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new TextEditor();
    }
}
