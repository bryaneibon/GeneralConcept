package com.multiArray;

import java.util.Arrays;

public class MultiDimensionalArray_Theory {
    public static void main(String[] args) {
        // two-dim array - the array of arrays
        int[][] twoDimArray = {
                {1, 2, 3, 1}, // first array of int
                {3, 4, 1, 2}, // second array of int
                {4, 4, 1, 0}  // third array of int
        };
        int number = twoDimArray[0][2]; // it is 3
        System.out.println(Arrays.toString(twoDimArray));
        System.out.println(number);
        System.out.println("\n********************\n");
        int[][] twoDimArray2 = new int[4][]; // The first number define
        //the number of array.

        twoDimArray2[0] = new int[] { 1, 2, 3, 4 }; // the length is 4
        twoDimArray2[1] = new int[] { 5, 7, 3};     // the length is 3
        twoDimArray2[2] = new int[] { 8 };          // the length is 1

// let's output the array
        for (int i = 0; i < twoDimArray2.length; i++) {
            System.out.println(Arrays.toString(twoDimArray2[i]));
        }

        System.out.println("\n********************\n");

        int[][][] cubic = new int[3][4][5]; // an three-dimensiona array (cube)

        int current = 1; // it stores a value to fill elements

        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = current; // assign a value to an element
                }
            }
            current++; // get the next value to the next "matrix"
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int numberCubic = cubic[0][2][0];
        System.out.println(numberCubic);

        int[][] c = {
                {40, 30, 25, 30, 15},
                {13, 12, 16},
                {101, 125, 114, 131}
        };
        System.out.println(String.format("%d %d %d %d",
                c.length, c[0].length, c[1].length, c[2].length));

    }
}
