package file.filesTheory;

import java.io.File;

/**
 * Basic methods
 * An instance of File  would have a list of methods. Take a look at some of them:
 *
 * String getPath() returns the string path to this file or directory;
 * String getName() returns the name of this file or directory (just the last name of the path)
 * boolean isDirectory() returns true if it is a directory and exists, otherwise, false;
 * boolean isFile() returns true it is a file (not a directory) and exists, otherwise, false;
 * boolean exists() returns true if this file or directory actually exists in your file system, otherwise, false;
 * String getParent() returns the string path to the parent directory that contains this file or directory.
 */
public class FilesTheory {
    public static void main(String[] args) {
        File file = new File("./myFiles/GitNotesForProfessionals.pdf");
        File file2 = new File("./myFiles/test.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path:" + file.getParent());

        areSiblings(file, file2);

    }
    private static void areSiblings(File f1, File f2){
        System.out.println(f1.getParent().equals(f2.getParent()));
    }
}
