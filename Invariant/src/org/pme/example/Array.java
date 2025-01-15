package org.pme.example;

import org.pme.Operator;

import java.util.Arrays;

public class Array {

    boolean isSorted(int[] source, int[] target) {
        if (source.length != target.length)
            return false;

        Arrays.sort(source);
        Arrays.sort(target);
        for (int i = 0; i < source.length; i++)
            if (source[i] != target[i])
                return false;

        return true;
    }

    @Operator("SELECT target FROM Sorted WHERE source = ?")
    int[] getSorted(int[] source) {
        Arrays.sort(source);
        return source;
    }

    boolean isIn(int sub, int[] sequence, int start) {
        assert start >= 0;
        assert start <= sequence.length;

        for (int i = start; i < sequence.length; i++)
            if (sub == sequence[i])
                return true;

        return false;
    }

    boolean isIn(int[] sub, int[] sequence, int start) {
        assert sequence.length >= sub.length;
        assert start >= 0;
        assert sub.length <= sequence.length - start;

        for (int i = start; i < sub.length; i++)
            if (sequence[i] != sub[i])
                return false;

        return true;
    }

    @Operator("SELECT start FROM In WHERE sequence = ? AND sub = ?")
    int indexOf(int[] value, int[] sub) {
        assert value.length >= sub.length;

        int strCount = sub.length;
        int valueCount = value.length;
        int first = sub[0];
        int max = (valueCount - strCount);
        for (int i = 0; i <= max; i++) {
            // Look for first character.
            if (value[i] != first)
                while (++i <= max && value[i] != first) ;

            // Found first character, now look at the rest of value
            if (i <= max) {
                int j = i + 1;
                int end = j + strCount - 1;
                for (int k = 1; j < end && value[j] == sub[k]; j++, k++) ;
                if (j == end)
                    // Found whole string.
                    return i;
            }
        }
        return -1;
    }
}
