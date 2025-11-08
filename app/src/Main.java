public class Main {
    public static void main(String[] args) {
        // Create a user
        //CreateUser.createUser("ahl", "ahl@example.com", 42);

        // Read all users
        ReadUsers.readUsers();

        // Update a user
        UpdateUser.updateUser(1, "ahl", "ahl@example.com", 42);

        // Delete a user
        //DeleteUser.deleteUser(1);
    }
}
