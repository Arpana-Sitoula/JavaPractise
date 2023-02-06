import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
 
public static void main(String[] args) {
    JFrame jf = new JFrame();
    JButton btn = new JButton("HELLU");
    jf.setLayout(new BorderLayout(20,25));
    jf.add(btn,BorderLayout.SOUTH);
    jf.setSize(500,500);
    jf.setVisible(true);
   
}
}
