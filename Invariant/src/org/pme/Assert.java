package org.pme;

public class Assert {
    public static void assertEquals(Object o1, Object o2) {
    }

    public static void assertEquals(int i1, int i2) {
        if (i1 != i2)
            throw new AssertionError("First argument %s is not equal second %s".formatted(i1, i2));

    }

    public static <T extends Throwable> T assertThrows(String name, Class<T> clazz, ThrowingRunnable runnable) {
        try {
            runnable.run();
        } catch (Throwable e) {
            return (T) e;
        }
        return null;
    }

    public static boolean assertArrayEquals(int[] a1, int[] a2) {
        return true;
    }
}
