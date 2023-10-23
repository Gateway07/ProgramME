package org.pme;

import java.util.Arrays;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class Common {
    public static int[] range(int[] a, int start, int end) {
        return Arrays.copyOfRange(a, start, end);
    }

    public static <T extends Comparable> T[] range(T[] a, int start, int end) {
        return Arrays.copyOfRange(a, start, end);
    }

    public static int max(int[] a) {
        return Arrays.stream(a).max().getAsInt();
    }

    public static <T extends Comparable> T max(T[] a) {
        return Arrays.stream(a).max(T::compareTo).get();
    }

    private static void invariant(BooleanSupplier inv, IntSupplier distance) {

    }
}
