package org.pme;

import com.google.common.collect.Lists;

import java.util.Iterator;

public class T4<T1, T2, T3, T4> extends org.pme.T3<T1, T2, T3> {
    private final T4 v4;

    public T4(T1 v1, T2 v2, T3 v3, T4 v4) {
        super(v1, v2, v3);
        this.v4 = v4;
    }

    public T4 v4() {
        return v4;
    }

    @Override
    public Iterator<Object> iterator() {
        var list = Lists.newArrayList(super.iterator());
        list.add(v4);
        return list.iterator();
    }
}
