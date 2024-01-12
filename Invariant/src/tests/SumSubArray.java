package tests;

import org.junit.Test;

import java.util.ArrayList;

public class SumSubArray {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0, b = 0, f = 0;
        for (f = 0; f < n; f++) {
            sum += arr[f];
            if (sum == s)
                break;
            if (sum < s)
                continue;
            sum -= arr[b++] + arr[f--];
        }
        if (sum != s || b > f)
            result.add(-1);
        else {
            result.add(b + 1);
            result.add(f + 1);
        }
        return result;
    }

    @Test
    public void test() {
        int N = 1, S = 0;
        int[] a = {0};

        var r = subarraySum(a, N, S);
        assert r.get(0) == 2;
        assert r.get(1) == 4;
    }
}
