package org.pme.example;

import org.junit.Test;
import org.pme.Function;
import org.pme.Predicate;

/*
1. Fractional
Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in
the knapsack. In Fractional Knapsack, we can break items for maximizing the total value of the knapsack.
Note: xi ∈ R and xi ≥ 0.

2. Zero-One
We are given N items where each item has some weight (wi) and value (vi) associated with it. We are also given a bag
with capacity W. The target is to put the items into the bag such that the sum of values associated with them is the
maximum possible. Note: here we can either put an item completely into the bag or cannot put it at all. xi ∈ {0, 1}

3. Bounded
Given N items, each item having a given weight wi and a value vi, the task is to maximize the value by selecting a
maximum of K items adding up to a maximum weight W.
Note: xi ∈ {0, 1, . . . , K}

4. Unbounded
Given a knapsack weight W and a set of N items with certain value vi and weight wi, we need to calculate the maximum
amount that could make up this quantity exactly.
Note: xi ∈ Z and xi ≥ 0.
 */
public class Knapsack {
    @Function
    float dot(float a, float b) {
        return a * b;
    }

    @Function
    float dot(float[] a, float[] b) {
        float s = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++)
            s += dot(a[i], b[i]);
        return s;
    }

    @Function
    int dot(int[][] a, int[][] b) {
        int s = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++)
            s += dot(a[i], b[i]);
        return s;
    }

    @Function
        // Axiom about simple multiplication
    int dot(int a, int b) {
        return a * b;
    }

    @Function // Axiom of scalar product
    public int dot(int[] a, int[] b) {
        int s = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++)
            s += dot(a[i], b[i]);
        return s;
    }

    @Predicate // Axiom of vector [x1, .., xn] where xi ∈ {0, 1} & n = length
    protected boolean isZeroOrOne(int[] vector, int length) {
        if (length <= 0 || vector.length != length)
            return false;

        for (int e : vector)
            if (!(e == 0 || e == 1))
                return false;
        return true;
    }

    @Predicate // Axiom of vector [x1, .., xn] where xi ∈ Z & n = length
    public boolean isGeZero(int[] vector, int length) {
        if (length <= 0 || vector.length != length)
            return false;

        for (int e : vector)
            if (e < 0)
                return false;
        return true;
    }

    @Function("SELECT MAX(dot(?v, N.vector)) FROM ZeroOrOne AS N WHERE N.length = ?n AND dot(?w, N.vector) <= ?W")
    public int zeroOne(int[] w, int[] v, int n, int W) {
        int[] m = new int[W + 1];
        int[] s = new int[W + 1];

        for (int ni = 0; ni < n; ni++) {
            for (int wi = W; wi >= 0; wi--) {
                if (w[ni] <= wi) {
                    var prevMax = m[wi - w[ni]];
                    if (m[wi] < prevMax + v[ni]) {
                        m[wi] = prevMax + v[ni];

                        s[wi] = ni + 1;
                    }
                }

                if (m[wi] > 0) {
                    var vector = new int[n];
                    for (var i = wi; i > 0; i -= w[s[i] - 1]) {
                        if (s[i] == 0)
                            break;
                        vector[s[i] - 1] = 1;
                    }
                    var maxValue = dot(v, vector);
                    assert isGeZero(vector, n) && dot(w, vector) <= W && maxValue == m[wi];
                }
            }
        }
        return m[W];
    }

    @Function("SELECT MAX(dot(?v, N.vector)) FROM GeZero AS N WHERE N.length = ?n AND dot(?w, N.vector) <= ?W")
    int unbounded(int[] w, int[] v, int n, int W) {
        int[] m = new int[W + 1];
        int[] s = new int[W + 1];

        for (int wi = 0; wi <= W; wi++) {
            for (int ni = 0; ni < n; ni++)
                if (w[ni] <= wi) {
                    var prevMax = m[wi - w[ni]];
                    if (m[wi] < prevMax + v[ni]) {
                        m[wi] = prevMax + v[ni];
                        s[wi] = ni + 1;
                    }
                }

            if (m[wi] > 0) {
                var vector = new int[n];
                for (var i = wi; i > 0; i -= w[s[i] - 1]) {
                    if (s[i] == 0)
                        break;
                    vector[s[i] - 1]++;
                }
                var maxValue = dot(v, vector);
                assert isGeZero(vector, n) && dot(w, vector) <= W && maxValue == m[wi];
            }
        }

        return m[W];
    }

    @Predicate
    boolean isJustOne(float[] vector, int length) {
        if (length <= 0 || vector.length != length)
            return false;

        var found = 0;
        for (var e : vector) {
            if (e == 0f)
                continue;

            found++;
            if (found > 1)
                return false;
        }
        return found == 1;
    }

    @Function("SELECT MAX(dot(?v, N.vector)) FROM JustOne AS N WHERE N.length = ?n AND dot(?w, N.vector) <= ?W")
    float fractional(float[] w, float[] v, int n, int W) {
        float maxPrice = Float.MIN_VALUE, maxValue = Float.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            float price = v[i] / w[i];
            if (price > maxPrice) {
                maxPrice = price;

                { // dot(?w, N.vector) <= ?W
                    var vector = new float[i + 1];
                    vector[i] = W / w[i];
                    assert isJustOne(vector, i + 1) && dot(w, vector) <= W && dot(v, vector) >= maxValue;
                    maxValue = dot(v, vector);
                }
            }
        }
        return W * maxPrice;
    }

    @Predicate
    boolean isBound(int[] vector, int length, int upper) {
        if (vector.length != length)
            return false;

        for (int e : vector)
            if (!(e < 0 || e > upper))
                return false;
        return true;
    }

    @Function("SELECT MAX(dot(?v, N.vector)) FROM Bound AS N WHERE N.length = ?n AND N.upper = ?max AND dot(?w, N.vector) <= ?W")
    int bound(int[] w, int[] v, int n, int W, int max) {
        int[] m = new int[W + 1];

        for (int i = 0; i < n; i++)
            for (int j = W; j >= w[i]; j--)
                m[j] = Math.max(m[j], v[i] + m[j - w[i]]);

        return m[W];
    }

    @Test
    public void test() {
        var ks = new Knapsack();

        // vector = [
        assert ks.zeroOne(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, 4, 3) == 3;
        assert ks.zeroOne(new int[]{3, 4, 5}, new int[]{30, 50, 60}, 3, 8) == 90;

        assert ks.unbounded(new int[]{5, 10, 15}, new int[]{10, 30, 20}, 3, 100) == 300;
        assert ks.fractional(new float[]{6, 7, 9, 8}, new float[]{14, 27, 44, 19}, 4, 50) == 244.44444f;

        // SELECT Weight.vector AS w, Profit.vector AS v, N.length AS n, N.upper AS max, dot(Weight.vector, N.vector) AS W
        // FROM Bound AS N, GeZero AS Weight, GeZero AS Profit WHERE N.length = Weight.length AND N.length = Profit.length
        assert ks.bound(new int[]{2, 5, 2, 3, 4}, new int[]{2, 7, 1, 5, 3}, 5, 8, 2) == 12;
    }
}
