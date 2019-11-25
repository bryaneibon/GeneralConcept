package file.writingFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * we will consider two ways: using the java.io.FileWriter and the java.io.PrintWriter classes.
 */
public class WritingFiles_Theory {
    public static void main(String[] args) throws IOException {
        File file = new File("./myFiles/test.txt");

        /**
         * FileWriter writer = new FileWriter(file); // overwrites the file
         * FileWriter writer2 = new FileWriter(file, true); // appends text to the file
         */

        try (FileWriter writerUsingException = new FileWriter(file)) {
            writerUsingException.write("Hello, World");
            writerUsingException.write("\n Test 1");
            writerUsingException.write("\n Test 2");
            writerUsingException.write("\n Test 3");

        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }

        File secondFile = new File("./myFiles/test_II.txt");
        try (PrintWriter printWriter = new PrintWriter(secondFile)) {
            printWriter.print("Hello"); // prints a string
            printWriter.println("Java"); // prints a string and then terminates the line
            printWriter.println(123); // prints a number
            printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
