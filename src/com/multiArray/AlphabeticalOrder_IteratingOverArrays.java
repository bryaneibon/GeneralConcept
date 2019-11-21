package com.multiArray;

import java.util.Scanner;

class AlphabeticalOrder_IteratingOverArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean verificator = false;
        String userInput = scan.nextLine();
        int compare;

        String [] sequence = userInput.split(" ");

        for (int i = 0; i < sequence.length-1; i++) {
            compare = sequence[i].compareTo(sequence[i+1]);
            if (compare > 0){ // [i+1] is smaller.
                verificator = false;
                System.out.println(false);
                break;
            } else{
                verificator = true; // [i] is smaller.
            }
        }

        if (verificator){
            System.out.println(true);
        }
    }
}