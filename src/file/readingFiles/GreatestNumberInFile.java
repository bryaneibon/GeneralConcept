package file.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GreatestNumberInFile {
    public static void main(String[] args) throws IOException {
        String pathToFile = "./myFiles/dataset_91007.txt";
        File file = new File(pathToFile);
        try (Scanner scanner = new Scanner(file)) {  // it throws FileNotFoundException (checked)
            int greatestNumber = scanner.nextInt();

            while(scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if(number > greatestNumber) {
                    greatestNumber = number;
                }
            }
            System.out.println(greatestNumber);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println("==========");
    }
}
