package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentOperations {
    public void addStudent(Student student) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO students (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getEmail());
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding student!");
            e.printStackTrace();
        }
    }

    public void showStudents() {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Student List:");
            while (rs.next()) {
System.out.println("ID: " + rs.getInt("id") +", Name: " + rs.getString("name") +", Email: " + rs.getString("email"));
            }
        } catch (Exception e) {
            System.out.println("Error fetching students!");
            e.printStackTrace();
        }
    }
}
