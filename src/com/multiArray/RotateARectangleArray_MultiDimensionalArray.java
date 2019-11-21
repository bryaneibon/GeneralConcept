package com.multiArray;

import java.util.Scanner;

public class RotateARectangleArray_MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfArrays = scan.nextInt();
        int elementPerArray = scan.nextInt();
        int userInput;
        int[][] rotateRectangle = new int [numberOfArrays][elementPerArray];

        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < elementPerArray; j++) {
                userInput = scan.nextInt();
                rotateRectangle[i][j] = userInput;
            }
        }
        for (int j = 0; j < elementPerArray; j++) {
            for (int i = numberOfArrays-1 ; i >= 0; i--) {
                System.out.print(rotateRectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
