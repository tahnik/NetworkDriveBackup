import javax.swing.*;

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
            if(args[3] == null) {
                JOptionPane.showInputDialog("Target directory does not exist or not valid. Do you want me to create it?");
            }

        }else {
            System.out.println("All directories valid. Proceeding to copy");
        }


    }
}
