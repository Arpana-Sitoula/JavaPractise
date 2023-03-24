import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
 
public static void main(String[] args) {
    JFrame jf = new JFrame();
    JButton btn1 = new JButton("HELLUA");
    JButton btn2 = new JButton("HELLUB");
    JButton btn3 = new JButton("HELLUC");
    JButton btn4 = new JButton("HELLUD");
    JButton btn5 = new JButton("HELLUE");
    jf.setLayout(new GridLayout(3,2,20,25));
    jf.add(btn1);
    jf.add(btn2);
    jf.add(btn3);
    jf.add(btn4);
    jf.add(btn5);
    jf.setSize(500,500);
    jf.setVisible(true);
   
}
}
