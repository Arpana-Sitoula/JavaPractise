//package Unit4.PreparedStatement.src;
import java.sql.*;

public class PrepStat {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            // Prepare the SQL statement
            String sql = "INSERT INTO users (id, name, address) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set the parameters
            preparedStatement.setInt(1,05);
            preparedStatement.setString(2, "Chandu");
            preparedStatement.setString(3, "Pkh");

            // Execute the statement
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the prepared statement and connection
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
