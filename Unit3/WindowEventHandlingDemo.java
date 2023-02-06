package Unit3;

import javax.swing.JFrame;
import java.awt.event.*;

public class WindowEventHandlingDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Window Event Handling Example");
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setLayout(null);
        
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent e){
                System.out.println("Window opened");
            }
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
            }
            @Override
            public void windowClosed(WindowEvent e){
                System.out.println("Window Closed");
            }
        });

    }
}
