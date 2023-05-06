import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TextEditor {
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
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}
