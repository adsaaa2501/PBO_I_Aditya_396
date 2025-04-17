public class Admin {
    private String username = "manusiabaik";
    private String password = "manusia25";

    public boolean login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Admin berhasil!\n");
            return true;
        } else {
            System.out.println("Username atau password Admin salah!\n");
            return false;
        }
    }
}
