import javax.swing.*;

public class JTableDemo {
    public static void main(String[] args) {
       JFrame f = new JFrame();
       String data[][]={{"101","Lord"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"},{"102","Siva"}};
       String column[]= {"Id","Name"};
       
       JTable j = new JTable(data, column);
       j.setBounds(30,30,100,100);
       JScrollPane sp = new JScrollPane(j);
       f.add(sp);

       //f.setLayout(null);
       f.setSize(300,300);
       f.setVisible(true);
    }
    
}
