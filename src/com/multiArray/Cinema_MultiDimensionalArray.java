package com.multiArray;

import java.util.Scanner;

class Cinema_MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfRows = scan.nextInt();
        int numberOfSeats = scan.nextInt();
        int userInput;
        int selectedRow= 0;
        int countSeatsAvailable = 0;
        int[][] cinema = new int [11][5];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                userInput = scan.nextInt();
                cinema[i][j] = userInput;
            }
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                System.out.print(cinema[i][j] + " ");
            }
             System.out.println();
        }

        int availability = scan.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats - 1; j++) {
                if(countSeatsAvailable == availability){
                    selectedRow = i;
                    break;
                }
                if (countSeatsAvailable <= availability) {
                    selectedRow = i;
                    if (cinema[i][j] == 0 && cinema[i][j] == cinema[i][j+1]){
                        countSeatsAvailable += 2;
                    }
                }
            }
        }

        if(countSeatsAvailable < availability){
            System.out.println(0);
        } else{
            System.out.println(selectedRow);
        }
    }
}
