import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Load MySQL JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Connect to the database
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String password = "shri@2309";
            con = DriverManager.getConnection(url, user, password);

            // Ask user for input
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter new marks: ");
            int marks = sc.nextInt();

            // Prepare the UPDATE query
            String sql = "UPDATE students SET marks = ? WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, marks);
            ps.setInt(2, id);

            // Execute the update
            int rowsAffected = ps.executeUpdate();

            // Show result
            if (rowsAffected > 0) {
                System.out.println("Marks updated successfully for student ID " + id);
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found. Please add the connector JAR to your project.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ignore) {}
            sc.close();
        }
    }
}