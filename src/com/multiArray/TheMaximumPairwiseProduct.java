package com.multiArray;

import java.util.Scanner;

public class TheMaximumPairwiseProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int [] intArray = new int [arrayLength];
        String sequence = "";
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Math.abs(scan.nextInt());
            if (sequence.equals("")){
                sequence = String.valueOf(intArray[i]);
            } else{
                sequence = sequence + " "+ intArray[i];
            }
        }
        // System.out.println(sequence);

        int initialPair = 0;
        int finalPair = 0;
        if (arrayLength != 1){
            for (int i = 0; i < intArray.length; i++) {
                for (int j = 1; j < intArray.length; j++) {
                    initialPair = intArray[i]*intArray[j];
                    if (finalPair <= initialPair){
                        finalPair = initialPair;
                    }
                }
            }
        } else{
            finalPair = intArray[0];
        }

        System.out.println(finalPair);
    }
}