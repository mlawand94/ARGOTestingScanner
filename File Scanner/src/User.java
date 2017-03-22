/**
 * Note: this will probably get moved to
 */
public class User {
    private String username;
    private boolean isLoggedIn;

    public User() {
        username = "";
        isLoggedIn = false;
    }
    public User(String u) {
        username = u;
        isLoggedIn = true;
    }

    public void logout() {
        isLoggedIn = false;
    }
}
