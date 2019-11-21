package com.packageTheory;

public class Package_BinarySearch {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 10000;
        int [] array2 = {10, 11, 12, 13, 14};
        System.out.println(callBinarySearch(array2, key));
    }

    /**
     * @param nums ordered sequence of integers
     * @param key an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }
}
