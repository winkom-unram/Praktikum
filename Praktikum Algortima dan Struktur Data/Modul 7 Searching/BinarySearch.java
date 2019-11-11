package com.mycompany.searching;

public class BinarySearch {

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) {
        BinarySearch in = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int x = 7;
        int result = BinarySearch.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Elemen not present");
        } else {
            System.out.println("Elemen found at index = " + result);
        }
        
    }
}
