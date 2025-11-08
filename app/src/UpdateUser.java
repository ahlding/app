import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateUser {
    public static void updateUser(int id, String name, String email, int age) {
        String query = "UPDATE users SET name = ?, email = ?, age = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, age);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            System.out.println("User updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
