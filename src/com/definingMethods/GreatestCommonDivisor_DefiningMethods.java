package com.definingMethods;

public class GreatestCommonDivisor_DefiningMethods {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        gcd(3, 7);

        gcd(4, 6);

        gcd(3, 6);

        gcd(1, 3);

        gcd(6, 2);

        gcd(1, 1);
    }
}

