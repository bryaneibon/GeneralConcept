package com.processingString;

import java.util.Scanner;

public class ProcessingStrings_MaxSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        int charCounter = 0;
        int output = 0;

        if (userInput.isEmpty() || userInput.length() == 1){
            System.out.println(userInput.length());
        } else {
            for(int i=0;i<userInput.length();){
                char begin = userInput.charAt(i);

                for(int j=i+1; j<userInput.length();j++){
                    char next = userInput.charAt(j);
                    if(begin == next){
                        charCounter++;
                    }
                    else{
                        break;
                    }
                }
                i+= charCounter+1;
                if(output <= charCounter){
                    output = charCounter+1;
                }
                charCounter=0;
            }
            System.out.println(output);
        }
    }
}

