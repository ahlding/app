import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateUser {
    public static void createUser(String name, String email, int age) {
        String query = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, age);
            stmt.executeUpdate();
            System.out.println("User added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
