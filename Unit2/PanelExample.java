import java.awt.*;
import javax.swing.*;
    
public class PanelExample {
   PanelExample(){
    JFrame f = new JFrame("Panel Example");
    JPanel panel = new JPanel();
    panel.setBounds(40,80,200,200);
    panel.setBackground(Color.red);
    JButton b1 = new JButton("Click");
    JButton b2 = new JButton("Click");
    b1.setBounds(50,100,200,200);
    b2.setBounds(100,200,200,200);
    b1.setBackground(Color.green);
    b2.setBackground(Color.blue);
    f.add(b1);
    f.add(b2);
    f.add(panel);
    f.setSize(500,500);
    f.setVisible(true);

   }
   public static void main(String[] args) {
    new PanelExample();
   }
    
}
