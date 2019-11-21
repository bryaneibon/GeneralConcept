package com.conditionAndLoop;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        final int java   = 1;
        final int kotlin = 2;
        final int scala  = 3;
        final int python = 4;

        switch (userInput){
            case java :
                System.out.println("Yes!");
                break;
            case kotlin :
                System.out.println("No!");
                break;
            case scala :
                System.out.println("No!");
                break;
            case python :
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
