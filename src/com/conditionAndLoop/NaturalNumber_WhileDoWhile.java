package com.conditionAndLoop;

import java.util.Scanner;

public class NaturalNumber_WhileDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int highestNumber = 0;
        int number;
        int stop = 1;
        do {
            number = scan.nextInt();
            if(highestNumber < number){
                highestNumber = number;
            }

            if (number == 0){
                stop = number;
            }
        }while (stop != 0);

        System.out.println(highestNumber);
    }
}
