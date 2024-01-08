package org.pme.example;

import org.pme.Function;
import org.pme.Predicate;

import java.util.Arrays;

public class BinPacking {
    @Predicate
    boolean isPartition(final int[] items, final int[][] parts) {
        var target = new int[items.length];
        int i = 0, l = 0;
        for (var part : parts) {
            if (items.length < (l += part.length))
                return false;
            for (var p : part)
                target[i++] = p;
        }
        if (items.length != i)
            return false;

        Arrays.sort(items);
        Arrays.sort(target);
        for (i = 0; i < items.length; i++)
            if (items[i] != target[i])
                return false;
        return true;
    }

    @Predicate
    boolean isCapacity(int[] pack, int capacity) {
        var sum = 0;
        for (var p : pack)
            sum += p;
        return sum <= capacity;
    }

    @Predicate
    boolean isPack(int[] items, int[][] packs, int capacity) {
        if (!isPartition(items, packs))
            return false;

        for (var pack : packs)
            if (!isCapacity(pack, capacity))
                return false;

        return true;
    }

    @Function("SELECT MIN(COUNT(packs)) FROM Pack WHERE items = ? AND capacity = ?")
    int getBinPacking(int[] items, int capacity) {
        return 0;
    }
}
