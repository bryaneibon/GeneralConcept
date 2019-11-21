package com.conditionAndLoop;

import java.util.Scanner;

public class TheSmallestValue_WhileDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long number = scan.nextLong();
        long result = 1;
        while (number > 1){
            result = result * number;
            System.out.println(result + "\t" + number);
            number--;
        }
        System.out.println(result);
    }
}
