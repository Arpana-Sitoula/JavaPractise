import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.*;

public class MenuDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenu menu,submenu;
        JMenuItem i1,i2,i3,i4,i5;
        JMenuBar mb = new JMenuBar();


        menu = new JMenu("Menu");

        submenu = new JMenu("SubMenu");

        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);



        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
