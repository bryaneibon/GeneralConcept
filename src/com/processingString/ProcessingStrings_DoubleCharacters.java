package com.processingString;

import java.util.Scanner;

public class ProcessingStrings_DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String output = "";
        for (int i = 0; i < userInput.length(); i++) {
            output = output + userInput.charAt(i) + userInput.charAt(i);
        }
        System.out.println(output);
    }
}
