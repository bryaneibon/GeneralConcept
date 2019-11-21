package com.conditionAndLoop;

import java.util.Scanner;

public class CollatzConjecture_WhileDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int naturalNumber = scan.nextInt();

        if (naturalNumber != 1){
            System.out.print(naturalNumber + " ");
        }

        do {
            if (naturalNumber == 1){
                System.out.print(naturalNumber + " ");
                break;
            } else if (naturalNumber % 2 == 0 ){
                naturalNumber /= 2;
                System.out.print(naturalNumber + " ");
            } else{
                naturalNumber = naturalNumber * 3 + 1;
                System.out.print(naturalNumber + " ");
            }
        }while(naturalNumber !=1);
    }
}
