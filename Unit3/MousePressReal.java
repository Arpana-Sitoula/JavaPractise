/*
write a GUI program using components to find the sum and differences of two numbers. 
Use two text fields for giving input and a label for output.
The program should display sum if user presses mouse and difference if user release mouse. 
*/
package Unit3;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class MousePressReal {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        FlowLayout boxLayout = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(boxLayout);

        JTextField number1 = new JTextField(20);
        JTextField number2 = new JTextField(20);
        JLabel label = new JLabel();

        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                int a = Integer.parseInt(number1.getText());
                int b = Integer.parseInt(number2.getText());
                label.setText("Sum is:"+(a + b));
            }

            public void mouseReleased(MouseEvent mouseEvent) {
                int a = Integer.parseInt(number1.getText());
                int b = Integer.parseInt(number2.getText());
                label.setText("Diff is:"+(a - b));
            }
        });

        frame.add(number1);
        frame.add(number2);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
