import java.io.File;

/**
 * This object is an event, and it will hold information about an event and the packaged files going along with it
 */
public class Event implements EventNotification{
    private int eventID;
    private String username;
    private File pkgdFile; //this may need to be changed to another file type, ZipFile iirc
    private long time;

    public Event() {
        eventID = -1;
        username = "";
        pkgdFile = null;
        time = -1;
    }
    public Event(int id, String uname, long t) {
        eventID = id;
        username = uname;
        time = t;
    }

    public int getID() {
        return eventID;
    }
    public String getUsername() {
        return username;
    }
    public long getTime() {
        return time;
    }
    public File getPkgdFiles() {
        return null;
    }

    public void attachFiles() {
        //set pkgdFile to the location of the zipped up files from the file packager module
    }
}
