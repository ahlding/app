import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteUser {
    public static void deleteUser(int id) {
        String query = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("User deleted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
