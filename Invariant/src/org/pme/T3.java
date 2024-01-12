package org.pme;

import com.google.common.collect.Lists;

import java.util.Iterator;

public class T3<T1, T2, T3> extends org.pme.T2<T1, T2> {
    private final T3 v3;

    public T3(T1 v1, T2 v2, T3 v3) {
        super(v1, v2);
        this.v3 = v3;
    }

    public T3 v3() {
        return v3;
    }

    @Override
    public Iterator<Object> iterator() {
        var list = Lists.newArrayList(super.iterator());
        list.add(v3);
        return list.iterator();
    }
}
