package org.pme;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class T2<T1, T2> implements Iterable<Object> {
    private final T1 v1;
    private final T2 v2;

    public T2(T1 v1, T2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    private static String toString(Object a) {
        var s = new StringBuilder();
        s.append("{");
        var first = true;
        for (int i = 0; i < Array.getLength(a); i++) {
            if (!first)
                s.append(",");
            s.append(Array.get(a, i));
            first = false;
        }
        s.append("}");
        return s.toString();
    }

    public T1 v1() {
        return v1;
    }

    public T2 v2() {
        return v2;
    }

    @Override
    public Iterator<Object> iterator() {
        var list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        return list.iterator();
    }

    public String toString() {
        var s = new StringBuilder();
        var first = true;
        for (var i : this) {
            if (!first)
                s.append(",");

            s.append(i.getClass().isArray() ? toString(i) : i);
            first = false;
        }
        return s.toString();
    }
}
