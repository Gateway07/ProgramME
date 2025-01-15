package org.pme.example.test;

import org.junit.Test;
import org.pme.Operator;
import org.pme.T5;
import org.pme.example.Knapsack;

import java.util.ArrayList;
import java.util.Random;

public class KnapsackTest extends Knapsack {

    @Operator("SELECT MAX(dot(?v, vector)) FROM ZeroOrOne WHERE length = ?n AND dot(?w, vector) <= ?W")
    int getMaxByVector(int[] w, int[] v, int n, int W) {
        int max = 0;
        for (var vec : getVectors(n)) {
            var weight = dot(vec, w);
            if (weight > W)
                continue;

            var profit = dot(vec, v);
            if (max < profit)
                max = profit;
        }
        return max;
    }

    @Operator("SELECT WZ.vector AS w, VZ.vector AS v, N.length AS n, Z.value AS W, " +
            "(SELECT MAX(dot(VZ.vector, vector)) FROM ZeroOrOne WHERE " +
            "length = VZ.length AND dot(WZ.vector, vector) <= Z.value) AS max " +
            "FROM ZeroOrOne AS N, GeZero AS WZ, GeZero AS VZ, Integer AS Z AS " +
            "WHERE N.length = WZ.length AND N.length = VZ.length LIMIT 5")
    Iterable<T5<int[], int[], Integer, Integer, Integer>> generateZeroOne() {
        var rand = new Random();

        var list = new ArrayList<T5<int[], int[], Integer, Integer, Integer>>();
        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(0, 10);
            int[] w = rand.ints(n, 0, 100).toArray();
            assert isGeZero(w, n);

            int[] v = rand.ints(n, 0, 100).toArray();
            assert isGeZero(v, n);

            int W = rand.nextInt(1, 100);
            assert Integer.class.isInstance(W);

            var max = getMaxByVector(w, v, n, W);
            list.add(new T5(w, v, n, W, max));
        }
        return list;
    }

    @Test // TestLoop
    public void test() {
        for (var t : generateZeroOne()) {
            assert knapsackZeroOne(t.v1(), t.v2(), t.v3(), t.v4()) == t.v5();
        }
    }
}