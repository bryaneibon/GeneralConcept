package com.conditionAndLoop; /**
 * Typical task for a job interview.
 * A chocolate bar has the shape of a rectangle, divided into NxM segments.
 * You can break down this chocolate bar into two parts by a single straight line (only once).
 * Find whether you can break off exactly K segments from the chocolate. Each segment is 1x1.
 *
 * Input data format
 *
 * The program gets an input of three integers: N, M, K
 *
 * Output data format
 *
 * The program must output one of the two words: YES or NO.
 *
 * Sample Input 1:
 * 4
 * 2
 * 6
 * Sample Output 1:
 * YES
 *
 * Sample Input 2:
 * 2
 * 10
 * 7
 * Sample Output 2:
 * NO
 * Sample Input 3:
 * 7
 * 4
 * 21
 * Sample Output 3:
 * YES
 */

import java.util.Scanner;

class ConditionalStatement_Chocolate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2;//scan.nextInt();
        int m = 10;//scan.nextInt();
        int k = 7;//scan.nextInt();

        if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
