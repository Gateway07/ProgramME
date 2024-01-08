package org.pme.example.smt;

import com.microsoft.z3.Context;
import com.microsoft.z3.IntExpr;
import com.microsoft.z3.IntNum;
import com.microsoft.z3.Solver;
import org.junit.Test;
import org.pme.Utils;

public class Rem {
    @Test // Test - to be generated as output
    public void test() {
        System.out.println("%: " + (2 % 3) + ", " + (5 % 3));
        System.out.println("%: " + (8 % 3) + ", " + (5 % 3));

        Context ctx = new Context();
        IntExpr dividend = ctx.mkIntConst("dividend");
        IntExpr factor = ctx.mkIntConst("factor");
        var rem = ctx.mkRem(dividend, factor);
        // dividend % factor == 0
        var remIsZero = ctx.mkAnd(ctx.mkEq(rem, ctx.mkInt(0)), ctx.mkNot(ctx.mkEq(factor, ctx.mkInt(0))));

        Solver s = ctx.mkSolver();
        // ForAll factor (0 % factor == 0)
        // ForAll dividend (dividend % 1 == dividend)
        // ForAll dividend, factor (dividend == factor -> dividend % factor == 0)
        // ForAll dividend, factor (dividend % factor == dividend % (factor +- dividend))
        // ForAll dividend, factor (dividend % factor == (dividend +- factor) % factor)

        s.add(remIsZero, ctx.mkEq(dividend, ctx.mkInt(0)));
        for (var m : Utils.gen(ctx, s, 10, dividend, factor)) {
            var dividendInt = (IntNum) m.getConstInterp(dividend);
            var factorInt = (IntNum) m.getConstInterp(factor);

            System.out.println(dividendInt + " % " + factorInt);
        }
    }
}
