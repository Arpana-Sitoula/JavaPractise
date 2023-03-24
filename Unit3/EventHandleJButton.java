//basic calculation using event handling

package Unit3;
import javax.swing.*;
public class EventHandleJButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Form Validation");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //HEADING
        JLabel label = new JLabel("Calculator");
        label.setBounds(50,20,200,30);
        //label.isFontSet(BoldAction);
        f.add(label);

        JLabel l1,l2,l3;
        JTextField t1,t2,t3;

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        

        l1.setBounds(50,50,200,30);
        l2.setBounds(50,90,200,30);
        l3.setBounds(50,130,200,30);

        t1.setBounds(150,50,200,30);
        t2.setBounds(150,90,200,30);
        t3.setBounds(150,130,200,30);
       

        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        

        //Sum
        JButton Abtn = new JButton("Add");
        Abtn.setBounds(150,170,60,30);
        Abtn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a+b;
            t3.setText(String.valueOf(sum));
            
        });
        f.add(Abtn);

        //Sub
        JButton Sbtn = new JButton("Sub");
        Sbtn.setBounds(230,170,60,30);
        Sbtn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sub = a-b;
            t3.setText(String.valueOf(sub));
            
        });
        f.add(Sbtn);

        //Mul
        JButton Mbtn = new JButton("Mul");
        Mbtn.setBounds(310,170,60,30);
        Mbtn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int mul = a*b;
            t3.setText(String.valueOf(mul));
            
        });
        f.add(Mbtn);

        //Div
        JButton Dbtn = new JButton("Div");
        Dbtn.setBounds(390,170,60,30);
        Dbtn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            float div = a/b;
            t3.setText(String.valueOf(div));
            
        });
        f.add(Dbtn);

        f.setLayout(null);
        f.setVisible(true);

    }
}
