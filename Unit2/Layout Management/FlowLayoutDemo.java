
import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {
 
public static void main(String[] args) {
    JFrame jf = new JFrame();
    JButton btn = new JButton();
    jf.add(btn);
    jf.setLayout(new FlowLayout(FlowLayout.LEFT,20,25));
    jf.setSize(500,500);
    jf.setVisible(true);
   
}
}
