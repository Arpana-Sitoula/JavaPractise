import java.awt.*;
import javax.swing.*;

public class Grid {
 
public static void main(String[] args) {
    JFrame jf = new JFrame();
    JButton btn1 = new JButton("HELLU");
    JButton btn2 = new JButton("HELLU");
    JButton btn3 = new JButton("HELLU");
    JButton btn4 = new JButton("HELLU");
    jf.setLayout(new GridLayout(2,2,20,25));
    jf.add(btn1);
    jf.add(btn2);
    jf.add(btn3);
    jf.add(btn4);
    jf.setSize(500,500);
    jf.setVisible(true);
   
}
}
