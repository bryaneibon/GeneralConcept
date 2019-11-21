package com.multiArray;

import java.util.Scanner;

public class PrettyLookingPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        String [][] prettyLookingPattern = new String[4][4];
        String [] colors = {"W", "B", "R", "G"};

        for (int i = 0; i < prettyLookingPattern.length; i++) {
            for (int j = 0; j < prettyLookingPattern.length; j++) {
                userInput = scan.next();
                prettyLookingPattern[i][j] = userInput;
            }
        }

        for (int i = 0; i < prettyLookingPattern.length; i++) {
            for (int j = 0; j < prettyLookingPattern.length; j++) {
                System.out.print(prettyLookingPattern[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < prettyLookingPattern.length; i++) {
            for (int j = 0; j < prettyLookingPattern.length; j++) {
                if(prettyLookingPattern[i][j] == colors [j]){
                    System.out.println(colors[j]);
                }
            }
        }
    }
}
