package file.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFiles_Theory {
    public static void main(String[] args) throws IOException {
        String pathToFile = "./myFiles/test.txt";
        File file = new File(pathToFile);
        try (Scanner scanner = new Scanner(file)) {  // it throws FileNotFoundException (checked)
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

        System.out.println("=======================");

        String fichier = "./myFiles/dataset_91007.txt";

        try {
            System.out.println(readFileAsString(fichier));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }

    private static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
