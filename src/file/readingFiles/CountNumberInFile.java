package file.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountNumberInFile {
    public static void main(String[] args) throws IOException {
        String pathToFile = "./myFiles/dataset_91022.txt";
        int countEqualOrGreaterThan9999 = 0;

        File file = new File(pathToFile);
        try (Scanner scanner = new Scanner(file)) {  // it throws FileNotFoundException (checked)

            while(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number >= 9999) {
                    countEqualOrGreaterThan9999 += 1;
                }
            }
            System.out.println(countEqualOrGreaterThan9999);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
    }
}
