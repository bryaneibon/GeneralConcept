package file.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountEvenNumber {
    public static void main(String[] args) throws IOException {
        String pathToFile = "./myFiles/dataset_91065.txt";

        int countEven = 0;
        boolean verificator = true;
        File file = new File(pathToFile);
        try (Scanner scanner = new Scanner(file)) {  // it throws FileNotFoundException (checked)

            while(scanner.hasNextInt() && verificator) {
                int number = scanner.nextInt();
                if(number % 2 == 0 && number != 0) {
                    countEven += 1;
                }

                if(number == 0) {
                    verificator = false;
                }
            }
            System.out.println(countEven);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
    }
}