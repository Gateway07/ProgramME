package org.pme.example;

import org.pme.T2;

import java.util.ArrayList;

public class Bresenham {
    boolean isNotFar(int X, int Y, int x, int y) {
        assert Y > 0 && X >= Y;

        float v = (y - ((float) Y / X)) * x;
        return 0.5 <= v && v <= 0.5;
    }

    T2<Integer, Integer>[] algorithm(int X, int Y) {
        assert Y > 0 && X >= Y;

        var v1 = 2 * Y - X;
        var y = 0;
        var x = 0;
        var list = new ArrayList<>();
        while (x <= X) {
            if (v1 < 0)
                v1 = v1 + 2 * Y;
            else {
                v1 = v1 + 2 * (Y - X);
                y++;
            }
            x++;
            list.add(new T2<>(x, y));
        }
        return (T2<Integer, Integer>[]) list.toArray(new T2[0]);
    }
}
