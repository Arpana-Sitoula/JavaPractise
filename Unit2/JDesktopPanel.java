import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class JDesktopPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JDesktopPane dp = new JDesktopPane();
        JInternalFrame ifr = new JInternalFrame("IFrame", true, true,true,true);
        ifr.setBounds(60,100,300,300);

        JLabel label = new JLabel("Internal Label");
        f.add(label);
       
        ifr.setVisible(true);
        dp.add(ifr);
        f.add(dp);

        f.setSize(300,300);
        f.setVisible(true);
    }
}
