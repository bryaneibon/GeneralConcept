package com.processingString;

import java.util.Scanner;

public class ProcessingStrings_CompressionAlgorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        int charCounter = 0;
        String output = "";

        if (userInput.isEmpty() || userInput.length() == 1){
            System.out.println(userInput+""+userInput.length());
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
                if(charCounter>0){
                    String add = begin + "";
                    int tempcount = charCounter +1;

                    output += add + tempcount;

                }
                else{
                    String addSingleChar = begin + "";
                    int tempcountSingleChar = charCounter +1;
                    output += addSingleChar + tempcountSingleChar;
                }
                charCounter=0;
            }
            System.out.println(output);
        }
    }
}
