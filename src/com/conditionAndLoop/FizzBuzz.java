package com.conditionAndLoop; /**
 * Fizz Buzz is a classic programming problem. Here is its slightly modified version.
 *
 * Write a program that takes the input of two integers:
 * the beginning and the end of the interval (both numbers belong to the interval).
 *
 * The program should output the numbers from this interval,
 * but if the number is divisible by 3, you should output Fizz instead of it;
 * if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output com.conditionAndLoop.FizzBuzz.
 *
 * Output each number or the word on a separate line.
 *
 * Sample Input 1:
 * 8 16
 * Sample Output 1:
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * com.conditionAndLoop.FizzBuzz
 * 16
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beginning = scan.nextInt();
        int end = scan.nextInt();

        if (end < beginning){
            int inverse;
            inverse = beginning;
            beginning = end;
            end = inverse;
        }

        for (int i = beginning; i<=end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("com.conditionAndLoop.FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
