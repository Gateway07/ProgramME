package programme;

import com.google.common.primitives.Ints;
import org.pme.T2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.Stream;

public class Lang {
    // Arithmetic
    public static int random(int i1, int i2) {
        return new Random().nextInt(i1, i2);
    }

    public static int sum(int i1, int i2) {
        return i1 + i2;
    }

    public static int mul(int i1, int i2) {
        return i1 * i2;
    }

    public static int div(int i1, int i2) {
        return i1 / i2;
    }

    public static int mod(int i1, int i2) {
        return i1 % i2;
    }

    public static int neg(int i1) {
        return -i1;
    }

    public static boolean lt(int i1, int i2) {
        return i1 < i2;
    }

    public static boolean le(int i1, int i2) {
        return i1 <= i2;
    }

    // String
    public static String concat(String i1, String i2) {
        return i1.concat(i2);
    }

    public static String left(String i1, int i2) {
        return i1.substring(0, i2);
    }

    public static String right(String i1, int i2) {
        return i1.substring(i2);
    }

    public static String replace(String i1, String i2, String i3) {
        return i1.replace(i2, i3);
    }

    public static String trim(String i1, int i2) {
        return i1.trim();
    }

    public static String str(int i1) {
        return String.valueOf(i1);
    }

    public static String lower(String i1) {
        return i1.toLowerCase();
    }

    public static String upper(String i1) {
        return i1.toUpperCase();
    }

    public static int len(String i1) {
        return i1.length();
    }

    public static int find(String i1, String i2) {
        return i1.indexOf(i2);
    }

    public static boolean equals(String i1, String i2) {
        return i1.equals(i2);
    }

    public static boolean lt(String i1, String i2) {
        return i1.compareTo(i2) < 0;
    }

    public static boolean le(String i1, String i2) {
        return i1.compareTo(i2) <= 0;
    }

    public static boolean gt(String i1, String i2) {
        return i1.compareTo(i2) > 0;
    }

    public static boolean ge(String i1, String i2) {
        return i1.compareTo(i2) >= 0;
    }

    // Array
    public static int head(int[] i1) {
        return i1[0];
    }

    public static String head(String[] i1) {
        return i1[0];
    }

    public static int[] tail(int[] i1) {
        int[] target = new int[i1.length - 1];
        System.arraycopy(i1, 1, target, 0, target.length);
        return target;
    }

    public static String[] tail(String[] i1) {
        String[] target = new String[i1.length - 1];
        System.arraycopy(i1, 1, target, 0, target.length);
        return target;
    }

    public static int[] unit(int i1) {
        return new int[]{i1};
    }

    public static String[] unit(String i1) {
        return new String[]{i1};
    }

    public static int[] concat(int[] i1, int i2) {
        return concat(i1, unit(i2));
    }

    public static String[] concat(String[] i1, String i2) {
        return concat(i1, unit(i2));
    }

    public static int[] concat(int[] i1, int[] i2) {
        return Ints.concat(i1, i1);
    }

    public static String[] concat(String[] i1, String[] i2) {
        return (String[]) Stream.concat(Arrays.stream(i1), Arrays.stream(i2)).toArray();
    }

    // Control
    public static <R> R iif(boolean i1, R then, R other) {
        return i1 ? then : other;
    }

    // Stream
    public static LangStream<Integer> stream(int[] i1) {
        return new LangStream<Integer>(i1);
    }

    public static LangStream<String> stream(String[] i1) {
        return null;
    }

    public static LangStream<Integer> stream(int i1, IntUnaryOperator f) {
        return new LangStream<>(i1, f);
    }

    public static LangStream<Integer> stream(int i1, int i2) {
        return new LangStream<>(i1, i2);
    }

    public static <T> LangStream<T> stream(T i) {
        return new LangStream<T>(i);
    }

    public static <A, B> LangStream<T2<A, B>> join(LangStream<A> i1, LangStream<B> i2) {
        return new LangStream<T2<A, B>>(i1, i2);
    }
}
