package com.processingString;

public class ProcessingStrings {
    public static void main(String[] args) {
        char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };

        String stringFromChars = String.valueOf(chars); // "ABCDEF"

        char[] charsFromString = stringFromChars.toCharArray(); // { 'A', 'B', 'C', 'D', 'E', 'F' }

        String theSameString = new String(charsFromString); // "ABCDEF"

        String text = "a long text";
        String[] parts = text.split(" "); // [a, long, text]


        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2);
    }
}
