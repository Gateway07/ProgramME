package org.pme;

import com.google.common.collect.Lists;

import java.util.Iterator;

public class T5<T1, T2, T3, T4, T5> extends org.pme.T4<T1, T2, T3, T4> {
    private final T5 v5;

    public T5(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        super(v1, v2, v3, v4);
        this.v5 = v5;
    }

    public T5 v5() {
        return v5;
    }

    @Override
    public Iterator<Object> iterator() {
        var list = Lists.newArrayList(super.iterator());
        list.add(v5);
        return list.iterator();
    }
}
