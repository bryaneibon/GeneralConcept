package com.multiArray;

import java.util.Arrays;
import java.util.Scanner;

public class IteratingOverArrays_Theory {
    public static void main(String[] args) {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }

        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

        System.out.println("************************************************************");

        int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        System.out.println(broken ? "BROKEN" : "OK");

        System.out.println("************************************************************");
        System.out.println("**********            WRITE SOMETHING       ****************");
        System.out.println("************************************************************");

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        System.out.println(Arrays.toString(array)); // output the array
    }
}