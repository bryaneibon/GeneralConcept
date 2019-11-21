package com.conditionAndLoop;

import java.util.Scanner;

public class TheSequence_WhileDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String elements = scan.next();
        int parser = Integer.parseInt(elements);
        int writeElement;
        int highest4Divisible = 0;

        if (parser > 30000) {
            System.out.println("Insert a Sequence lower than 30.000");
            return;
        }

        while(parser > 0){
            writeElement = scan.nextInt();

            if (writeElement > 1000) {
                System.out.println("The number of elements does not exceed 1000.");
                return;
            }

            if (writeElement % 4 == 0 && writeElement > highest4Divisible) {
                highest4Divisible = writeElement;
            }
            parser--;
        }
        System.out.println(highest4Divisible);
    }
}
