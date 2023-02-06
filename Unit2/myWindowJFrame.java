//package Unit2;
import javax.swing.*;

public class myWindowJFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello world");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Arpsss");
        f.add(label);
        f.setVisible(true);
    }
    
}
