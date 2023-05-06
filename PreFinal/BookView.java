import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BookView {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JTextField tf1, tf2, tf3;
    private JLabel l1, l2, l3;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JComboBox cb;
    public BookView(){
        fr = new JFrame("BookView");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField(5);
        l1 = new JLabel("Name");
        l2 = new JLabel("Price");
        l3 = new JLabel("Type");
        btn1 = new JButton("Add");
        btn2 = new JButton("Update");
        btn3 = new JButton("Delete");
        btn4 = new JButton(">>>");
        btn5 = new JButton("<<<");
        String s1[] = {"General", "Computer", "Math&Sci", "Photo"};
        cb = new JComboBox(s1);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.add(p3, BorderLayout.SOUTH);
        
        // Panel 1
        p1.setLayout(new GridLayout(3,2));
        p1.add(l1); p1.add(tf1);
        p1.add(l2); p1.add(tf2);
        p1.add(l3); p1.add(cb);
        
        // Panel 2
        p2.setLayout(new FlowLayout());
        p2.add(btn5); p2.add(tf3); p2.add(btn4);
        
        // Panel 3
        p3.setLayout(new FlowLayout());
        p3.add(btn1); p3.add(btn2); p3.add(btn3);
        
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new BookView();
    }
}
