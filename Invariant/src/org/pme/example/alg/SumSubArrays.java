package org.pme.example.alg;

import org.junit.Test;

import java.util.stream.IntStream;

public class SumSubArrays {
    int sum(int[] a) {
        int max_sum = Integer.MIN_VALUE;
        for (var i = 0; i < a.length; i++)
            for (var j = i; j < a.length; j++) {
                var s = IntStream.of(a).skip(i).limit(j + 1).sum();
                if (s > max_sum)
                    max_sum = s;
            }

        return max_sum;
    }

    int max(int[] a) {
        int res = a[0];
        int max_ending = a[0];
        for (var i = 1; i < a.length; i++) {
            max_ending = Math.max(max_ending + a[i], a[i]);
            res = Math.max(res, max_ending);
        }
        return res;
    }

    @Test
    public void test() {
        assert 11 == max(new int[]{2, 3, -8, 7, -1, 2, 3});

        assert -2 == max(new int[]{-2, -4});

        assert 25 == max(new int[]{5, 4, 1, 7, 8});
    }
}
