package org.pme.example;

import com.microsoft.z3.Context;
import com.microsoft.z3.IntExpr;
import com.microsoft.z3.IntNum;
import com.microsoft.z3.Solver;
import org.javatuples.Triplet;
import org.junit.Test;
import org.pme.Operator;
import org.pme.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GCD {
    public boolean isReminder(int reminder, int dividend, int factor) {
        return reminder == (dividend % factor);
    }

    boolean isDivisor(int dividend, int factor) {
        return dividend % factor == 0;
    }

    @Operator("SELECT factor, a, b FROM Divisor d1, Divisor d2 WHERE d1.factor = d2.factor")
    boolean isCommonDivisor(int factor, int a, int b) {
        return isDivisor(a, factor) && isDivisor(b, factor);
    }
    Iterable<Triplet<Integer, Integer, Integer>> getCommonDivisor() {
        throw new UnsupportedOperationException("Because of limitless"); }

    @Operator("SELECT dividend, a, b FROM Divisor d1, Divisor d2 WHERE d1.dividend = d2.dividend")
    boolean isCommonDividend(int dividend, int a, int b) {
        return isDivisor(dividend, a) && isDivisor(dividend, b);
    }
    Iterable<Triplet<Integer, Integer, Integer>> getCommonDividend() { throw new UnsupportedOperationException("Because of limitless"); }

    @Operator("SELECT factor FROM Divisor WHERE dividend = 0") // It's always True
    boolean isIfDividendZero(int factor) {
        return true;
    }
    Iterable<Integer> getIfDividendZero() { return null; }

    @Operator("SELECT factor FROM CommonDivisor WHERE a = :a AND b = :b")
    List<Integer> getCommonDivisors(int a, int b) {
        int greatest = gcd(a, b);
        var list = new ArrayList<Integer>();
        list.add(greatest);
        for (int i = 2; i * i <= greatest; i++) {
            if (greatest % i != 0)
                continue;
            if (i * i != greatest)
                list.add(greatest / i);
            list.add(i);
        }
        list.add(1);

        return list;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    @Operator("SELECT MAX(factor) FROM CommonDivisor WHERE a = ? AND b = ?")
    int getMaxDivisor(int a, int b) {
        return b == 0 ? a : getMaxDivisor(b, a % b);
    }

    @Operator("SELECT MIN(dividend) FROM CommonDividend WHERE a = ? AND b = ?")
    int getMinDividend(int a, int b) {
        return lcm(a, b);
    }

    @Test
    public void testCommonDivisors() {
        for (var factor : getCommonDivisors(12, 18)) {
            assert isCommonDivisor(factor, 12, 18);
        }
    }

    @Test // Test - to be generated as output
    public void test() {
        Context ctx = new Context();
        IntExpr dividend = ctx.mkIntConst("dividend");
        IntExpr factor = ctx.mkIntConst("factor");
        var rem = ctx.mkRem(dividend, factor);
        var f = ctx.mkEq(rem, ctx.mkInt(0));
        Solver s = ctx.mkSolver();
        s.add(f, ctx.mkNot(ctx.mkEq(factor, dividend)), ctx.mkGt(factor, ctx.mkInt(1)), ctx.mkGt(dividend, ctx.mkInt(1)));

        for (var m : Utils.gen(ctx, s, 10, dividend, factor)) {
            var dividendInt = (IntNum) m.getConstInterp(dividend);
            var factorInt = (IntNum) m.getConstInterp(factor);
            System.out.println(dividendInt + ", " + factorInt);

            s.add(ctx.mkNot(ctx.mkEq(factor, factorInt)), ctx.mkNot(ctx.mkEq(dividend, dividendInt)));

            int a = factorInt.getInt();
            int b = dividendInt.getInt();
            assert isCommonDivisor(getMaxDivisor(a, b), a, b);
        }
    }

    public int gcd1(int a, int b) {
        if (a == b) return a;
        if (a == 0) return b;
        if (b == 0) return a;

        assert a > 0 && b > 0; // Pre-condition

        int result = a, x = b;
        int prevX = x, prevResult = result;
        BiPredicate<Integer, Integer> term = isTerminated(x, result);
        while (result != x) { // Exit-condition
            // Invariant: assert gcd(a, b) == gcd(result, x);
            if (result > x)
                result = result - x;
            else
                x = x - result;

            assert x < prevX || result < prevResult; // Termination-condition
            prevX = x;
            prevResult = result;

            assert term.test(x, result);
        }
        return result;
    }

    BiPredicate<Integer, Integer> isTerminated(int x, int result) {
        final int[] prev = new int[2];
        prev[0] = x;
        prev[1] = result;
        return ((a, b) -> {
            var is = a < prev[0] || b < prev[1];
            prev[0] = a;
            prev[1] = b;
            return is;
        });
    }

    Supplier<Integer> makeState() {
        final int[] counter = new int[1];
        return () -> ++counter[0];
    }

}
