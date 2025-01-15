package org.pme.example;

public interface Sort {
    default boolean isGt(int a, int b) {
        return a > b;
    }

    default boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isGt(arr[i], arr[i + 1]))
                return false;
        }
        return true;
    }
}
