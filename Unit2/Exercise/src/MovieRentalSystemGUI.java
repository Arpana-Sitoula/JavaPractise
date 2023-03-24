/* 
You are hired by a reputed software company which is going to  design an application for "Movie rental system". 
 Your responsibility is to design a schema named MRS and create a table named Movie(id, title, genre, language, length). 
 WAP to design a GUI form to take input for this table and insert the data into table after clicking the OK button.
 */
package src;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieRentalSystemGUI extends JFrame implements ActionListener {
    JLabel titleLabel, genreLabel, languageLabel, lengthLabel;
    JTextField titleTextField, genreTextField, languageTextField, lengthTextField;
    JButton okButton;

    public MovieRentalSystemGUI() {
        super("Movie Rental System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        titleLabel = new JLabel("Title:");
        titleTextField = new JTextField(20);
        genreLabel = new JLabel("Genre:");
        genreTextField = new JTextField(20);
        languageLabel = new JLabel("Language:");
        languageTextField = new JTextField(20);
        lengthLabel = new JLabel("Length:");
        lengthTextField = new JTextField(20);
        okButton = new JButton("OK");

        add(titleLabel);
        add(titleTextField);
        add(genreLabel);
        add(genreTextField);
        add(languageLabel);
        add(languageTextField);
        add(lengthLabel);
        add(lengthTextField);
        add(okButton);

        okButton.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == okButton) {
            PreparedStatement stmt = null;
            Connection conn = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MRS", "root", "");

                String sql = "INSERT INTO Movie (title, genre, language, length) VALUES (?, ?, ?, ?)";
                stmt = conn.prepareStatement(sql);

                stmt.setString(1, titleTextField.getText());
                stmt.setString(2, genreTextField.getText());
                stmt.setString(3, languageTextField.getText());
                stmt.setString(4, lengthTextField.getText());

                stmt.executeUpdate();
            } catch (Exception exc) {
                exc.printStackTrace();
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new MovieRentalSystemGUI();

    }

}
