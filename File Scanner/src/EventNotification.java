import java.io.File;

/**
 * Interface for passing events from the File Scanner module to the Scan Controller Module
 */
public interface EventNotification {
    String getUsername();
    int getID();
    long getTime();
    File getPkgdFiles();
}
