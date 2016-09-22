import java.io.File;

/**
 * Created by tahnik on 22/09/2016.
 */
public class FolderVerifier {
    private String path = "";
    public FolderVerifier(String path) {
        this.setPath(path);
    }

    public boolean verify() {
        File fp = new File(this.path);
        return fp.isDirectory();
    }

    private String getPath() {
        return path;
    }

    private boolean setPath(String path) {
        if(path.equals("") || path == null) {
            return false;
        }
        this.path = path;
        return true;
    }
}
