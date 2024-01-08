package org.pme;

import com.microsoft.z3.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {
    public static Iterable<Model> gen(Context ctx, Solver s, int n, Expr... terms) {
        return new ModelIterator(ctx, s, n, terms);
    }

    private static class ModelIterator implements Iterator<Model>, Iterable<Model> {
        private final Solver s;
        private final Context ctx;
        private final Expr[] terms;
        private final int n;
        private int count = 0;

        ModelIterator(Context ctx, Solver s, int n, Expr[] terms) {
            this.ctx = ctx;
            this.s = s;
            this.n = n;
            this.terms = terms;
        }

        @Override
        public boolean hasNext() {
            return count < n && s.check() != Status.UNSATISFIABLE;
        }

        @Override
        public Model next() {
            var m = s.getModel();
            count++;

            List<BoolExpr> exps = new ArrayList<>();
            for (var t : terms) {
                exps.add(ctx.mkNot(ctx.mkEq(t, m.eval(t, true))));
            }
            s.add(ctx.mkOr(exps.toArray(new BoolExpr[0])));
            return m;
        }

        public Iterator<Model> iterator() {
            return this;
        }
    }

}
