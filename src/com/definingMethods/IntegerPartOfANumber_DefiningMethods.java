package com.definingMethods;

import java.util.Scanner;

public class IntegerPartOfANumber_DefiningMethods {

    public static boolean isVowel(char ch) {
        // A, E, I, O, U, and sometimes Y.
        String character = String.valueOf(ch);
        boolean yesOrNo = false;
        if (character.equalsIgnoreCase("a") ||
                character.equalsIgnoreCase("e") ||
                character.equalsIgnoreCase("i") ||
                character.equalsIgnoreCase("o") ||
                character.equalsIgnoreCase("u")) {
            yesOrNo = true;
            return yesOrNo;
        }
        else{
            return yesOrNo;

        }
    }

    /* Do not change code below */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");

        double[] doubles = new double[] { 1.0d, 1.1d, 1.2d };

        int[] numbers = new int[] { 1, 2, 3 };

        String[] words = { "first", "second", "third" };

        char[] letters = new char[] { 'A', 'B', 'C' };
    }
}
