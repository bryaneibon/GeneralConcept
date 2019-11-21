package com.multiArray;

import java.util.Scanner;

public class SymmetricMatrix_MultiDimensionalArray {
    public static void main(String[] args) {
        symmetricMatrix();
    }

    public static void symmetricMatrix(){
        Scanner scan = new Scanner(System.in);
        int definedDimension = scan.nextInt();
        int [][] matrix2Dim = new int [definedDimension][definedDimension];
        boolean symmetric = false;
        for (int i = 0; i < definedDimension; i++) {
            for (int j = 0; j < definedDimension; j++) {
                matrix2Dim[i][j] = scan.nextInt();
            }
        }

        for (int k = 0; k < definedDimension; k++) {
            for (int l = 0; l < definedDimension; l++) {
                if (matrix2Dim[k][l] != matrix2Dim[l][k]){
                    System.out.println("NO");
                    return;
                } else{
                    symmetric = true;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("YES");
        }
    }
}
