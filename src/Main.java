/**
 * Created by tahnik on 22/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        if(!Utilities.verifyArgs(args)) {
            System.err.println("Not enough arguments. Please provide the path of the directory and target directory");
            System.exit(1);
        }
        FolderVerifier directoryToCopy = new FolderVerifier(args[0]);
        FolderVerifier targetDirectory = new FolderVerifier(args[1]);

        if(!directoryToCopy.verify()) {
            System.err.println("Directory to copy is not a valid directory. Please check the path");
            System.exit(2);
        }else if(!targetDirectory.verify()) {
            System.err.println("Target directory is not a valid directory. Please check the path");
            System.exit(2);
        }else {
            System.out.println("All directories valid. Proceeding to copy");
        }


    }
}
