//package Unit2;

import javax.swing.*;
public class TextFieldExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Form");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //HEADING
        JLabel label = new JLabel("Register here:");
        label.setBounds(50,20,200,30);
        f.add(label);

        //FORM GOES HERE
        JTextField t1,t2;
        JLabel l1,l2;
        //first name
        l1 = new JLabel("FIrst Name");
        l1.setBounds(50,50,200,30);
        t1 = new JTextField();
        t1.setBounds(150,50,200,30);
        f.add(t1);
        f.add(l1);
        //last name
        l2 = new JLabel("Last Name");
        l2.setBounds(50,80,200,30); 
        t2 = new JTextField();
        t2.setBounds(150,80,200,30);
        f.add(t2);
        f.add(l2);

        //Submit button
        JButton btn = new JButton("Submit");
        btn.setBounds(150,120,80,30);
        f.add(btn);

        f.setLayout(null);
        f.setVisible(true);
    }
}
