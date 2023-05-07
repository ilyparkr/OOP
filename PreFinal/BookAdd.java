import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class BookAdd{
    private JFrame fr;
    private JPanel p1, p2;
    private JTextField tf1, tf2;
    private JLabel l1, l2, l3;
    private JComboBox cb;
    private JButton btn;
    public BookAdd(){
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        l1 = new JLabel("Name");
        l2 = new JLabel("Price");
        l3 = new JLabel("Type");
        String s1[] = {"General", "Computer", "Math&Sci", "Photo"};
        cb = new JComboBox(s1);
        btn = new JButton("Insert");
        
        // JFrame
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        
        // JPanel 1
        p1.setLayout(new GridLayout(3,2));
        p1.add(l1); p1.add(tf1);
        p1.add(l2); p1.add(tf2);
        p1.add(l3); p1.add(cb);
        
        // JPanel 2
        p2.setLayout(new FlowLayout());
        p2.add(btn);
        
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new BookAdd();
    }
}
