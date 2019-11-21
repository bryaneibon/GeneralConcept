package com.processingString;

import java.util.Scanner;

public class ProcessingString_Count_ab {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        int charCounter = 0;
        int output = 0;

        if (userInput.isEmpty() || userInput.length() == 1){
            System.out.println(userInput.length());
        } else {
            for(int i=0;i<userInput.length();){
                char begin = 'a';

                for(int j=i+1; j<userInput.length();j++){
                    char next = 'b';
                    if(userInput.charAt(i) == begin && userInput.charAt(j) == next){
                        charCounter++;
                    }
                }
                i += charCounter+1;
                if(output <= charCounter){
                    output = charCounter;
                }
                charCounter=0;
            }
            System.out.println(output);
        }
    }
}


