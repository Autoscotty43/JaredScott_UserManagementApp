package comjareddao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/user_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Jelloverse1419";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver Not Found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }
        return connection;
    }
}