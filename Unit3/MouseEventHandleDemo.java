package Unit3;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.*;

public class MouseEventHandleDemo {
    public static void main(String[] args) {
        JTextArea textarea = new JTextArea();
        JFrame jf = new JFrame();
        jf.add(new JScrollPane(textarea));
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setLayout(null);

        textarea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textarea.setText("Mouse Clicked: " + e.getX() + ", " + e.getY() + "\n");
            }
            @Override
            public void mousePressed(MouseEvent e){
                textarea.setText("Mouse Pressed: "+e.getX()+","+e.getY()+"\n");
            }
            @Override
            public void  mouseReleased(MouseEvent e){
                textarea.setText("Mouse Released: "+e.getX()+","+e.getY()+"\n");
            }
        });

        textarea.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e){
                textarea.setText("Mouse Moved: "+e.getX()+","+e.getY()+"\n");
            }
        });
    }
    
}
