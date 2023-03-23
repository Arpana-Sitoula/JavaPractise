

import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {
 
public static void main(String[] args) {
    JFrame jf = new JFrame();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    jf.add(btn1);
    jf.add(btn2);
    jf.setLayout(new FlowLayout(FlowLayout.CENTER,20,25));
    jf.setSize(500,500);
    jf.setVisible(true);
   
}
}
