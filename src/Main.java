import javax.swing.*;

/**
 * Created by tahnik on 22/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        if(!Utilities.verifyArgs(args)) {
            System.err.println("Not enough arguments. Please provide the path of the directory and target directory");
            System.exit(ErrorCodes.NOT_ENOUGH_ARGUMENTS);
        }
        FolderVerifier directoryToCopy = new FolderVerifier(args[0]);
        FolderVerifier targetDirectory = new FolderVerifier(args[1]);

        if(!directoryToCopy.verify()) {
            System.err.println("Directory to copy is not a valid directory. Please check the path");
            System.exit(ErrorCodes.INVALID_DIRECTORY_TO_COPY);
        }else if(!targetDirectory.verify()) {
            if(args[2].equals("gui")) {
                int input = JOptionPane.showConfirmDialog(null, "Target directory does not exist or not valid. Do you want me to create it?", "",JOptionPane.YES_NO_OPTION);
                if(input == 1) {
                    System.out.println("Not creating any directory. Exiting...");
                    System.out.println();
                }
            }else if(args[2].equals("console")) {

            }else {
                System.err.println("Third argument is not valid. Valid arguments are gui or console");
                System.exit(ErrorCodes.APP_TYPE_NOT_VALID);
            }

        }else {
            System.out.println("All directories valid. Proceeding to copy");
        }



    }
}
