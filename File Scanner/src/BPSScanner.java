import java.util.LinkedList;

/**
 * Scans through the BPS log and spawns a UserSearch thread when a critical event is found
 */
public class BPSScanner {
    private LinkedList<User> users;

    public void scan() {

    }
    public void addUser(String uname) {
        users.add(new User(uname));
    }
    public void config() {
        //write to xml file?
    }
}
