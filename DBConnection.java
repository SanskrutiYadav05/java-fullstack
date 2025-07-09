package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:5432/studentdb";
            String user = "postgres";
            String pass = "root123";  

            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}
