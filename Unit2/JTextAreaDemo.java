import javax.swing.*;
import java.awt.event.*;

public class JTextAreaDemo {
   public static void main(String[] args) {
    JFrame f = new JFrame();
    JTextArea area = new JTextArea();
    area.setBounds(20,75,250,250);
    f.add(area);
    JLabel l = new JLabel();
    l.setBounds(50,25,250,30);
    f.add(l);
    JButton btn = new JButton("Click me");
    btn.setBounds(100,400,120,30);
    btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String txt = area.getText();
        l.setText("count"+txt.length());
        }
    });
    f.add(btn);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
   } 
}
