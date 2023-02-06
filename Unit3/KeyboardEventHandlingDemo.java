package Unit3;
//Program to trap a key which is pressed on the keyboard and display its name in the txt area.

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.*;

public class KeyboardEventHandlingDemo {
    public static void main(String[] args) {
        JTextArea textarea = new JTextArea();
        JFrame jf = new JFrame();
        jf.add(new JScrollPane(textarea));
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);


        //AdapterClass used = KeyAdapter
        //ListenerObject used = addKeyListener
        //EventClass used = KeyEvent
        //Method override = keyPressed
        textarea.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                //To display the key pressed in each different time, we can used .append() instead of .setText() method.
                textarea.setText("Key Pressed: "+ keyText);
            }
        });
    }
    
}
