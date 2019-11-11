package com.mycompany.searching;

public class SquentialSearch {

    public static int linearSearch(int[] inputArray, int key) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr1 = {5, 9, 10, 2, 90, 4};

        int key = 2;
        int result = linearSearch(arr1, key);
        System.out.println((result != -1) ? "Required key: " + key + " index ke: " + result : "Key " + key + " tidak ada");

    }
}
