package org.pme.example;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Loop invariant assert statement
            for (int idx = 0; idx < i; idx++) {
                assert isSorted(arr, idx);
            }
        }
        return arr;
    }

    // Helper method to check if subarray is sorted
    private static boolean isSorted(int[] arr, int end) {
        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 1};
        insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

