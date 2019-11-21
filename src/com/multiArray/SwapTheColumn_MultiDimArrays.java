package com.multiArray;

import java.util.Scanner;

class SwapTheColumn_MultiDimArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfArrays = scan.nextInt();
        int elementPerArray = scan.nextInt();
        int userInput;
        int[][] swapTheColumn = new int [numberOfArrays][elementPerArray];
        int firstColumnToSwap, secondColumnToSwap, swap;

        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < elementPerArray; j++) {
                userInput = scan.nextInt();
                swapTheColumn[i][j] = userInput;
            }
        }
        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < elementPerArray; j++) {
                System.out.print(swapTheColumn[i][j] + " ");
            }
            System.out.println();
        }

        firstColumnToSwap = scan.nextInt();
        secondColumnToSwap = scan.nextInt();

        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < elementPerArray; j++) {
                if (firstColumnToSwap == i){
                    swap = swapTheColumn[i][j];
                    swapTheColumn[i][j] = swapTheColumn[secondColumnToSwap][j];
                    swapTheColumn[secondColumnToSwap][j] = swap;
                }
            }
        }

        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < elementPerArray; j++) {
                System.out.print(swapTheColumn[i][j] + " ");
            }
            System.out.println();
        }
    }
}
