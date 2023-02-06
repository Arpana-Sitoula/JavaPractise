
import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
 
public class CheckBoxExample {
    CheckBoxExample(){
        JFrame f = new JFrame("CheckBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        f.add(label);
        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(150,100,50,50);
        f.add(checkbox1);
        checkbox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("C++ Checkbox: " + (e.getStateChange()==1 ? "check":"uncheck"));
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
