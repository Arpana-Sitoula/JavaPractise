
import java.sql.*;

public class DBConnec {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root","");

            // Execute a query to retrieve data from the database
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Loop through the result set and print the data
            while (rs.next()) {
                System.out.println("name: " + rs.getString("name"));
                System.out.println("address: " + rs.getString("address"));
            }

            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

