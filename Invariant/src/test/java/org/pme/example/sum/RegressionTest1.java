package org.pme.example.sum;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(155, 488);
        int int30 = sum0.sum(483, 101);
        int int33 = sum0.sum(856, 9);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 643 + "'", int27 == 643);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 584 + "'", int30 == 584);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 865 + "'", int33 == 865);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(368, 217);
        int int30 = sum0.sum(168, 292);
        int int33 = sum0.sum(207, 35);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 585 + "'", int27 == 585);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 230 + "'", int30 == 230);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 242 + "'", int33 == 242);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        int int24 = sum0.sum(515, 206);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 721 + "'", int24 == 721);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(363, 42);
        int int18 = sum0.sum(623, 1528);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 405 + "'", int15 == 405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2151 + "'", int18 == 2151);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(278, 831);
        int int24 = sum0.sum(641, 347);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1109 + "'", int21 == 1109);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 988 + "'", int24 == 988);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(539, 1277);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 908 + "'", int6 == 908);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(1276, 281);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1557 + "'", int24 == 1557);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(711, 443);
        int int27 = sum0.sum(282, 419);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1154 + "'", int24 == 1154);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 701 + "'", int27 == 701);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(599, 1014);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1613 + "'", int18 == 1613);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(503, 930);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1433 + "'", int21 == 1433);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(171, 953);
        int int15 = sum0.sum(522, 677);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 562 + "'", int12 == 562);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1199 + "'", int15 == 1199);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(520, 1977);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2497 + "'", int15 == 2497);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(343, 231);
        int int27 = sum0.sum(178, 168);
        int int30 = sum0.sum(865, 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 574 + "'", int24 == 574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 346 + "'", int27 == 346);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1157 + "'", int30 == 1157);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum((int) ' ', 82);
        int int15 = sum0.sum(344, 239);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 57 + "'", int12 == 57);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 583 + "'", int15 == 583);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(0, 1003);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1003 + "'", int27 == 1003);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        int int24 = sum0.sum(0, 475);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 475 + "'", int24 == 475);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum((int) (short) 1, 89);
        int int21 = sum0.sum(36, 198);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 117 + "'", int21 == 117);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(445, 0);
        int int18 = sum0.sum(93, 431);
        int int21 = sum0.sum(311, 493);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 445 + "'", int15 == 445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 262 + "'", int18 == 262);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 402 + "'", int21 == 402);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(409, (int) '#');
        int int30 = sum0.sum((int) (short) 0, 497);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 497 + "'", int30 == 497);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(703, 445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 176 + "'", int6 == 176);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1148 + "'", int9 == 1148);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(651, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 651 + "'", int15 == 651);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(400, 2769);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3169 + "'", int24 == 3169);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(1119, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1119 + "'", int21 == 1119);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(618, 183);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 801 + "'", int18 == 801);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(295, 86);
        int int24 = sum0.sum(57, 814);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381 + "'", int21 == 381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 871 + "'", int24 == 871);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(409, 363);
        int int18 = sum0.sum(117, 304);
        int int21 = sum0.sum(567, 174);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 772 + "'", int15 == 772);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421 + "'", int18 == 421);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 741 + "'", int21 == 741);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(86, 140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 113 + "'", int21 == 113);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(2082, 623);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2705 + "'", int24 == 2705);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(877, 536);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1413 + "'", int6 == 1413);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(929, 409);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1338 + "'", int18 == 1338);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(320, 321);
        int int27 = sum0.sum(240, 289);
        int int30 = sum0.sum(173, 257);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 641 + "'", int24 == 641);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 529 + "'", int27 == 529);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 215 + "'", int30 == 215);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(951, 528);
        int int21 = sum0.sum(1261, 282);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1479 + "'", int18 == 1479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1543 + "'", int21 == 1543);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (int) (short) 100);
        int int27 = sum0.sum(208, 2026);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1117 + "'", int27 == 1117);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(208, 35);
        int int12 = sum0.sum(157, 174);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 243 + "'", int9 == 243);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 331 + "'", int12 == 331);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(135, 63);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 198 + "'", int9 == 198);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(302, 117);
        int int27 = sum0.sum(1216, 332);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1548 + "'", int27 == 1548);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(353, 643);
        int int24 = sum0.sum(297, 1233);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 765 + "'", int24 == 765);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(249, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 349 + "'", int21 == 349);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(400, 192);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(825, 522);
        int int21 = sum0.sum(569, 1543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1347 + "'", int18 == 1347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1056 + "'", int21 == 1056);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1533, 170);
        int int18 = sum0.sum(721, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1703 + "'", int15 == 1703);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 721 + "'", int18 == 721);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(257, 203);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 460 + "'", int15 == 460);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(155, 2408);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2563 + "'", int21 == 2563);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(310, 384);
        int int21 = sum0.sum(361, 522);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 347 + "'", int18 == 347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 883 + "'", int21 == 883);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(234, 304);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = 0; // flaky: sum0.sum(391, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 391 + "'", int21 == 391);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        int int21 = sum0.sum(384, 156);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 540 + "'", int21 == 540);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');
        int int15 = sum0.sum((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(158, 304);
        int int27 = sum0.sum(26, 93);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 231 + "'", int24 == 231);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 119 + "'", int27 == 119);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(1276, 281);
        int int27 = sum0.sum(361, 2129);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1557 + "'", int24 == 1557);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1245 + "'", int27 == 1245);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(106, 719);
        int int21 = sum0.sum(0, 760);
        int int24 = sum0.sum(921, 701);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 825 + "'", int18 == 825);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 380 + "'", int21 == 380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1622 + "'", int24 == 1622);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        int int12 = sum0.sum(529, 363);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 892 + "'", int12 == 892);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(142, 821);
        int int27 = sum0.sum(1327, 142);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 963 + "'", int24 == 963);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1469 + "'", int27 == 1469);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(52, 31);
        int int18 = sum0.sum(1114, 856);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(368, 217);
        int int30 = sum0.sum(59, 1553);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 585 + "'", int27 == 585);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 806 + "'", int30 == 806);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(113, 671);
        int int21 = sum0.sum(178, 831);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1009 + "'", int21 == 1009);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(651, 0);
        int int18 = sum0.sum(173, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 651 + "'", int15 == 651);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 183 + "'", int18 == 183);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(359, 36);
        int int15 = sum0.sum(534, 139);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 395 + "'", int12 == 395);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 673 + "'", int15 == 673);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(155, 162);
        int int24 = sum0.sum(1757, 269);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 317 + "'", int21 == 317);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2026 + "'", int24 == 2026);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(4, 93);
        int int24 = sum0.sum(747, 67);
        int int27 = sum0.sum(421, 623);
        int int30 = sum0.sum(321, 1113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 522 + "'", int27 == 522);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 717 + "'", int30 == 717);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(139, 665);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 402 + "'", int24 == 402);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(208, 173);
        int int21 = sum0.sum(139, 0);
        int int24 = sum0.sum((int) (short) 0, 556);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 381 + "'", int18 == 381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 139 + "'", int21 == 139);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 278 + "'", int24 == 278);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1533, 170);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1703 + "'", int15 == 1703);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(407, 295);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 702 + "'", int15 == 702);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(0, 338);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 169 + "'", int6 == 169);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(168, 650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 689 + "'", int21 == 689);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 409 + "'", int24 == 409);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(2705, 99);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2804 + "'", int15 == 2804);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(246, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 246 + "'", int24 == 246);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(711, 194);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 905 + "'", int15 == 905);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(384, 16);
        int int30 = sum0.sum(2193, 205);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 400 + "'", int27 == 400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2398 + "'", int30 == 2398);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(207, 384);
        int int18 = sum0.sum(1843, 1843);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 591 + "'", int15 == 591);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1843 + "'", int18 == 1843);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(228, 677);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 905 + "'", int18 == 905);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(71, 54);
        int int21 = sum0.sum(177, 802);
        int int24 = sum0.sum(217, 191);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 979 + "'", int21 == 979);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 408 + "'", int24 == 408);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(511, 0);
        int int12 = sum0.sum(1347, 191);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 511 + "'", int9 == 511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1538 + "'", int12 == 1538);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(385, 803);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 594 + "'", int15 == 594);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(310, 384);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 347 + "'", int18 == 347);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(35, (int) (short) 1);
        int int30 = sum0.sum(47, 174);
        int int33 = sum0.sum(121, 202);
        int int36 = sum0.sum(369, 425);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 221 + "'", int30 == 221);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 323 + "'", int33 == 323);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 397 + "'", int36 == 397);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = sum0.sum(318, 677);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 995 + "'", int18 == 995);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(414, 591);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1005 + "'", int21 == 1005);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(643, 238);
        int int9 = sum0.sum(322, 336);
        int int12 = sum0.sum(529, 869);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 881 + "'", int6 == 881);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 329 + "'", int9 == 329);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 699 + "'", int12 == 699);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(343, 231);
        int int27 = sum0.sum(1669, 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 574 + "'", int24 == 574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2435 + "'", int27 == 2435);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(63, 308);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 371 + "'", int18 == 371);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(156, 205);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 361 + "'", int27 == 361);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(97, 172);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 269 + "'", int21 == 269);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(49, 335);
        int int24 = sum0.sum((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 192 + "'", int21 == 192);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(1119, 0);
        int int24 = sum0.sum(930, 130);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1119 + "'", int21 == 1119);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1060 + "'", int24 == 1060);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        int int24 = sum0.sum(188, 215);
        int int27 = sum0.sum(824, 510);
        int int30 = sum0.sum(941, 598);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 152 + "'", int21 == 152);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 403 + "'", int24 == 403);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1334 + "'", int27 == 1334);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1539 + "'", int30 == 1539);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(726, 423);
        int int27 = sum0.sum(733, 865);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 689 + "'", int21 == 689);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1149 + "'", int24 == 1149);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 799 + "'", int27 == 799);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = 0; // flaky: sum0.sum(430, (-1));
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 430 + "'", int18 == 430);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(409, 234);
        int int27 = sum0.sum(107, 1113);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 643 + "'", int24 == 643);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 610 + "'", int27 == 610);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(889, 237);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1126 + "'", int24 == 1126);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(353, 157);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 510 + "'", int15 == 510);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum((int) 'a', 109);
        int int15 = sum0.sum(0, 1121);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1121 + "'", int15 == 1121);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = sum0.sum(318, 677);
        int int21 = sum0.sum(272, 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 995 + "'", int18 == 995);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 809 + "'", int21 == 809);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(65, 438);
        int int27 = sum0.sum(343, 76);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 419 + "'", int27 == 419);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(317, 289);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 606 + "'", int12 == 606);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(59, 606);
        int int24 = sum0.sum(547, 141);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665 + "'", int21 == 665);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 688 + "'", int24 == 688);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(353, 643);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(1153, 1403);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1278 + "'", int12 == 1278);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        int int24 = sum0.sum(510, 643);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1153 + "'", int24 == 1153);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(249, 0);
        int int21 = sum0.sum(143, 220);
        int int24 = sum0.sum(0, 342);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 249 + "'", int18 == 249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 171 + "'", int24 == 171);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(4625, 94);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4719 + "'", int18 == 4719);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        int int18 = sum0.sum(349, 53);
        int int21 = sum0.sum(1533, 1561);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1668 + "'", int15 == 1668);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1547 + "'", int21 == 1547);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(16, 173);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 189 + "'", int12 == 189);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(409, (int) '#');
        int int30 = sum0.sum(930, 317);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1247 + "'", int30 == 1247);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(856, 258);
        int int21 = sum0.sum(2975, 136);
        int int24 = sum0.sum(717, 220);
        int int27 = sum0.sum(495, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1114 + "'", int18 == 1114);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3111 + "'", int21 == 3111);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 937 + "'", int24 == 937);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 495 + "'", int27 == 495);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum((int) '#', 249);
        int int18 = sum0.sum(0, 48);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(35, (int) (short) 1);
        int int30 = sum0.sum(47, 174);
        int int33 = sum0.sum(121, 202);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 221 + "'", int30 == 221);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 323 + "'", int33 == 323);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(220, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(497, 991);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744 + "'", int24 == 744);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(2193, 782);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2975 + "'", int18 == 2975);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(59, 606);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665 + "'", int21 == 665);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(245, 207);
        int int27 = sum0.sum(1219, 982);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452 + "'", int24 == 452);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2201 + "'", int27 == 2201);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(184, 1118);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 651 + "'", int18 == 651);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(249, 0);
        int int21 = sum0.sum(323, 1547);
        int int24 = sum0.sum(414, 1970);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 249 + "'", int18 == 249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 935 + "'", int21 == 935);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1192 + "'", int24 == 1192);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(342, 191);
        int int30 = sum0.sum(625, 1479);
        int int33 = sum0.sum(728, 1539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 533 + "'", int27 == 533);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1052 + "'", int30 == 1052);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2267 + "'", int33 == 2267);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(511, 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 511 + "'", int9 == 511);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(359, 190);
        int int18 = sum0.sum(217, 1413);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 549 + "'", int15 == 549);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 815 + "'", int18 == 815);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(172, 320);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 246 + "'", int15 == 246);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(175, 379);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 277 + "'", int24 == 277);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(208, 210);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 209 + "'", int24 == 209);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(208, 173);
        int int21 = sum0.sum(139, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 381 + "'", int18 == 381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 139 + "'", int21 == 139);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(197, 92);
        int int24 = sum0.sum(1341, 0);
        int int27 = sum0.sum(4625, 998);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 289 + "'", int21 == 289);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1341 + "'", int24 == 1341);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5623 + "'", int27 == 5623);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(854, 803);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1657 + "'", int18 == 1657);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(419, 368);
        int int18 = sum0.sum(1152, 109);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 787 + "'", int15 == 787);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1261 + "'", int18 == 1261);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(143, 1126);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1269 + "'", int24 == 1269);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        int int24 = sum0.sum(220, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 220 + "'", int24 == 220);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(427, (int) '4');
        int int18 = sum0.sum(86, 877);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 479 + "'", int15 == 479);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 963 + "'", int18 == 963);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(177, 929);
        int int15 = sum0.sum(329, 1103);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 553 + "'", int12 == 553);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 716 + "'", int15 == 716);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(4, 320);
        int int27 = sum0.sum(94, 49);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 162 + "'", int24 == 162);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 143 + "'", int27 == 143);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(0, 445);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 445 + "'", int18 == 445);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(618, 183);
        int int21 = sum0.sum(522, 63);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 801 + "'", int18 == 801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 585 + "'", int21 == 585);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (byte) 10, 443);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 453 + "'", int9 == 453);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = 0; // flaky: sum0.sum((-1), 54);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum(427, 145);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 572 + "'", int27 == 572);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(310, 643);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 953 + "'", int27 == 953);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(181, 2994);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3175 + "'", int21 == 3175);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(1289, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1485 + "'", int24 == 1485);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(220, 99);
        int int18 = sum0.sum(2315, 442);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 319 + "'", int15 == 319);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2757 + "'", int18 == 2757);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(342, 1494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 918 + "'", int9 == 918);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(744, 72);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 816 + "'", int18 == 816);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(711, 292);
        int int21 = sum0.sum(1013, 35);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1048 + "'", int21 == 1048);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(753, 1013);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 883 + "'", int15 == 883);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(129, 271);
        int int12 = sum0.sum(496, 2398);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1447 + "'", int12 == 1447);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1403, 643);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2046 + "'", int12 == 2046);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(168, (int) '4');
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(168, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 168 + "'", int18 == 168);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(427, (int) '4');
        int int18 = sum0.sum(336, 1233);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 479 + "'", int15 == 479);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569 + "'", int18 == 1569);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(160, 336);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 248 + "'", int27 == 248);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(91, 127);
        int int6 = sum0.sum(182, 160);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 342 + "'", int6 == 342);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(0, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(486, 177);
        int int21 = sum0.sum(0, 25);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 663 + "'", int18 == 663);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (byte) 10, 443);
        int int12 = sum0.sum(2129, 323);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 453 + "'", int9 == 453);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2452 + "'", int12 == 2452);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(208, 210);
        int int27 = sum0.sum(551, 196);
        int int30 = sum0.sum(0, 1757);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 209 + "'", int24 == 209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 747 + "'", int27 == 747);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1757 + "'", int30 == 1757);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(30, 59);
        int int12 = sum0.sum(1418, 110);
        int int15 = sum0.sum(1154, 641);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 89 + "'", int9 == 89);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1528 + "'", int12 == 1528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1795 + "'", int15 == 1795);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(53, (int) (short) 1);
        int int15 = sum0.sum(831, 288);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(227, 1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 228 + "'", int18 == 228);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(400, 145);
        int int24 = sum0.sum(174, 0);
        int int27 = sum0.sum(277, 262);
        int int30 = sum0.sum(1148, 892);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 545 + "'", int21 == 545);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 174 + "'", int24 == 174);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 539 + "'", int27 == 539);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2040 + "'", int30 == 2040);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(1120, 99);
        int int24 = sum0.sum(1014, 156);
        int int27 = sum0.sum(1631, 209);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1219 + "'", int21 == 1219);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1170 + "'", int24 == 1170);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1840 + "'", int27 == 1840);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(599, 1716);
        int int12 = sum0.sum(240, 2757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 176 + "'", int6 == 176);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2315 + "'", int9 == 2315);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2997 + "'", int12 == 2997);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(302, 117);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(1303, 779);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2082 + "'", int27 == 2082);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(109, 438);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 547 + "'", int21 == 547);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(443, 803);
        int int15 = sum0.sum(505, 444);
        int int18 = sum0.sum(199, 442);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 623 + "'", int12 == 623);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 641 + "'", int18 == 641);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(599, 63);
        int int21 = sum0.sum(336, 313);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 662 + "'", int18 == 662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 649 + "'", int21 == 649);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(193, 1413);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(1413, 303);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1716 + "'", int9 == 1716);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(363, 42);
        int int18 = sum0.sum(1841, 203);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 405 + "'", int15 == 405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2044 + "'", int18 == 2044);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        int int18 = sum0.sum(1569, 299);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1868 + "'", int18 == 1868);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum((int) (short) 10, 103);
        int int15 = sum0.sum(1757, 651);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 113 + "'", int12 == 113);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2408 + "'", int15 == 2408);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(4, 93);
        int int24 = sum0.sum(747, 67);
        int int27 = sum0.sum(209, 804);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013 + "'", int27 == 1013);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(585, 0);
        int int21 = sum0.sum(1569, 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 585 + "'", int18 == 585);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1726 + "'", int21 == 1726);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(1157, 1152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2309 + "'", int18 == 2309);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(516, 1233);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        int int21 = sum0.sum(206, 1553);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1759 + "'", int21 == 1759);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        int int9 = sum0.sum((int) (short) 0, 962);
        int int12 = sum0.sum(255, 704);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 481 + "'", int9 == 481);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 959 + "'", int12 == 959);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(53, (int) (short) 1);
        int int15 = sum0.sum(831, 288);
        int int18 = sum0.sum(1341, 343);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1684 + "'", int18 == 1684);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(384, 16);
        int int30 = sum0.sum((int) (short) 10, 1212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 400 + "'", int27 == 400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 611 + "'", int30 == 611);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(172, 320);
        int int18 = sum0.sum(1418, 1474);
        int int21 = sum0.sum(1527, 575);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 246 + "'", int15 == 246);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1446 + "'", int18 == 1446);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2102 + "'", int21 == 2102);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(255, 1058);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1313 + "'", int18 == 1313);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(129, 271);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(273, 831);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 552 + "'", int24 == 552);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(255, 402);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 657 + "'", int12 == 657);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(447, 940);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1387 + "'", int24 == 1387);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        int int21 = sum0.sum(551, 1543);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1047 + "'", int21 == 1047);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(1152, 1631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2783 + "'", int12 == 2783);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(106, 719);
        int int21 = sum0.sum(883, 194);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 825 + "'", int18 == 825);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1077 + "'", int21 == 1077);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(409, (int) '#');
        int int30 = sum0.sum((int) (short) 0, 497);
        int int33 = sum0.sum(1512, 594);
        int int36 = sum0.sum(657, 1239);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 497 + "'", int30 == 497);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2106 + "'", int33 == 2106);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 948 + "'", int36 == 948);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(35, (int) (short) 1);
        int int30 = sum0.sum(47, 174);
        int int33 = sum0.sum(551, 1077);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 221 + "'", int30 == 221);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 814 + "'", int33 == 814);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(49, 304);
        int int18 = sum0.sum(2044, 252);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 353 + "'", int15 == 353);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2296 + "'", int18 == 2296);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(245, 207);
        int int27 = sum0.sum(52, 54);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452 + "'", int24 == 452);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = sum0.sum(403, 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1321 + "'", int18 == 1321);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum((int) '#', 249);
        int int18 = sum0.sum(0, 48);
        int int21 = sum0.sum(2224, 1475);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3699 + "'", int21 == 3699);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(1668, 923);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2591 + "'", int6 == 2591);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(1005, 806);
        int int21 = sum0.sum(589, 245);
        int int24 = sum0.sum(598, 427);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1811 + "'", int18 == 1811);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 834 + "'", int21 == 834);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1025 + "'", int24 == 1025);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 529 + "'", int18 == 529);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1636, 0);
        int int15 = sum0.sum(300, 529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 829 + "'", int15 == 829);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        int int24 = sum0.sum(395, 405);
        int int27 = sum0.sum(304, 1483);
        int int30 = sum0.sum(168, 272);
        int int33 = sum0.sum(665, 229);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1787 + "'", int27 == 1787);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 220 + "'", int30 == 220);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 894 + "'", int33 == 894);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(443, 648);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1091 + "'", int15 == 1091);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(140, 50);
        int int27 = sum0.sum((int) (short) 1, 107);
        int int30 = sum0.sum(391, 138);
        int int33 = sum0.sum(3111, 539);
        int int36 = sum0.sum(232, 53);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 529 + "'", int30 == 529);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3650 + "'", int33 == 3650);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 285 + "'", int36 == 285);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        int int15 = sum0.sum(1056, 585);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1641 + "'", int15 == 1641);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(1261, (int) '4');
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1313 + "'", int21 == 1313);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(414, 1081);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1495 + "'", int12 == 1495);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum(585, 806);
        int int15 = sum0.sum((int) (byte) 100, 1254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1391 + "'", int12 == 1391);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 677 + "'", int15 == 677);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(266, 272);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 269 + "'", int21 == 269);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        int int15 = sum0.sum(1056, 585);
        int int18 = sum0.sum(360, 1190);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1641 + "'", int15 == 1641);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 775 + "'", int18 == 775);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        int int21 = sum0.sum(159, 89);
        int int24 = sum0.sum(87, 981);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 248 + "'", int21 == 248);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        int int21 = sum0.sum(1716, 628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2344 + "'", int21 == 2344);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(312, (int) (short) 10);
        int int27 = sum0.sum(1018, 312);
        int int30 = sum0.sum(1396, 115);
        int int33 = sum0.sum(487, 824);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1330 + "'", int27 == 1330);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1511 + "'", int30 == 1511);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1311 + "'", int33 == 1311);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(197, 92);
        int int24 = sum0.sum(1341, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 289 + "'", int21 == 289);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1341 + "'", int24 == 1341);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(320, 321);
        int int27 = sum0.sum(240, 289);
        int int30 = sum0.sum(279, 272);
        int int33 = sum0.sum(1525, 921);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 641 + "'", int24 == 641);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 529 + "'", int27 == 529);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 551 + "'", int30 == 551);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2446 + "'", int33 == 2446);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum((int) (short) 10, 347);
        int int24 = sum0.sum(0, 217);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(953, 373);
        int int27 = sum0.sum(3481, 752);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1326 + "'", int24 == 1326);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4233 + "'", int27 == 4233);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(486, 177);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 663 + "'", int18 == 663);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(1081, 71);
        int int27 = sum0.sum(111, 99);
        int int30 = sum0.sum(113, 536);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152 + "'", int24 == 1152);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 210 + "'", int27 == 210);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 649 + "'", int30 == 649);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(769, 99);
        int int24 = sum0.sum(338, 1397);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1735 + "'", int24 == 1735);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1970, 533);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2503 + "'", int9 == 2503);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(501, 1452);
        int int18 = sum0.sum(1084, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1953 + "'", int15 == 1953);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1242 + "'", int18 == 1242);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(407, 295);
        int int18 = sum0.sum(209, 221);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 702 + "'", int15 == 702);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 215 + "'", int18 == 215);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(353, 318);
        int int30 = sum0.sum(1121, 1014);
        int int33 = sum0.sum(0, 921);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 671 + "'", int27 == 671);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2135 + "'", int30 == 2135);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 921 + "'", int33 == 921);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        int int24 = sum0.sum(395, 405);
        int int27 = sum0.sum(304, 1483);
        int int30 = sum0.sum(168, 272);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1787 + "'", int27 == 1787);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 220 + "'", int30 == 220);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(269, 2344);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2613 + "'", int24 == 2613);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(825, 522);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1347 + "'", int18 == 1347);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(323, 109);
        int int21 = sum0.sum(174, 1326);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 432 + "'", int18 == 432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 750 + "'", int21 == 750);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(16, 245);
        int int27 = sum0.sum(335, 1);
        int int30 = sum0.sum(1212, 504);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 336 + "'", int27 == 336);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1716 + "'", int30 == 1716);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(155, 162);
        int int24 = sum0.sum(540, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 317 + "'", int21 == 317);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 540 + "'", int24 == 540);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(1114, 140);
        int int30 = sum0.sum(0, 384);
        int int33 = sum0.sum(0, 1063);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1254 + "'", int27 == 1254);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 192 + "'", int30 == 192);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1063 + "'", int33 == 1063);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        int int21 = sum0.sum(551, 1543);
        int int24 = sum0.sum(1474, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1047 + "'", int21 == 1047);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1474 + "'", int24 == 1474);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, 50);
        int int18 = sum0.sum((int) (byte) 1, 1568);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569 + "'", int18 == 1569);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(83, 959);
        int int18 = sum0.sum(1433, 1703);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 521 + "'", int15 == 521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1568 + "'", int18 == 1568);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(0, 245);
        int int21 = sum0.sum(487, 242);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 729 + "'", int21 == 729);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(1178, 1624);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1401 + "'", int12 == 1401);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(739, 138);
        int int21 = sum0.sum(379, 702);
        int int24 = sum0.sum(400, 1133);
        int int27 = sum0.sum(1452, 0);
        int int30 = sum0.sum(308, 599);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1081 + "'", int21 == 1081);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1533 + "'", int24 == 1533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1452 + "'", int27 == 1452);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 907 + "'", int30 == 907);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(391, 757);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 574 + "'", int12 == 574);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(1330, 2019);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3349 + "'", int18 == 3349);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(677, 443);
        int int27 = sum0.sum(345, 539);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1120 + "'", int24 == 1120);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 442 + "'", int27 == 442);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        int int21 = sum0.sum(397, 295);
        int int24 = sum0.sum(30, 1613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 692 + "'", int21 == 692);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1643 + "'", int24 == 1643);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(150, 346);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(3757, 1326);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5083 + "'", int9 == 5083);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1095, 373);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1468 + "'", int9 == 1468);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(2151, 5623);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3887 + "'", int12 == 3887);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(409, (int) '#');
        int int30 = sum0.sum((int) (short) 0, 497);
        int int33 = sum0.sum(1512, 594);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 497 + "'", int30 == 497);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2106 + "'", int33 == 2106);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        int int24 = sum0.sum(515, 206);
        int int27 = sum0.sum(101, 203);
        int int30 = sum0.sum(239, 1843);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 721 + "'", int24 == 721);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 152 + "'", int27 == 152);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1041 + "'", int30 == 1041);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, 50);
        int int18 = sum0.sum(0, 577);
        int int21 = sum0.sum(279, 2445);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 577 + "'", int18 == 577);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1362 + "'", int21 == 1362);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        int int18 = sum0.sum(365, 641);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 503 + "'", int18 == 503);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1636, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        int int21 = sum0.sum(801, 645);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1446 + "'", int21 == 1446);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(278, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(272, 609);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 881 + "'", int21 == 881);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(744, 72);
        int int21 = sum0.sum(510, 471);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 816 + "'", int18 == 816);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 981 + "'", int21 == 981);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(205, 0);
        int int27 = sum0.sum(1878, 562);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 205 + "'", int24 == 205);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2440 + "'", int27 == 2440);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(0, 522);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 261 + "'", int27 == 261);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = sum0.sum(405, (int) (short) 1);
        int int24 = sum0.sum(689, 719);
        int int27 = sum0.sum(1643, 1418);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 704 + "'", int24 == 704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3061 + "'", int27 == 3061);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(1622, (int) (short) 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1622 + "'", int21 == 1622);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(400, 145);
        int int24 = sum0.sum(174, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 545 + "'", int21 == 545);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 174 + "'", int24 == 174);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(308, 1561);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1869 + "'", int15 == 1869);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(45, 369);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        int int24 = sum0.sum(192, 908);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 338 + "'", int21 == 338);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 550 + "'", int24 == 550);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 177);
        int int18 = sum0.sum(1669, 559);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 498 + "'", int15 == 498);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2228 + "'", int18 == 2228);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(368, 63);
        int int21 = sum0.sum(237, 227);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 431 + "'", int18 == 431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 464 + "'", int21 == 464);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(323, 288);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 611 + "'", int18 == 611);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(220, 99);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 319 + "'", int15 == 319);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(302, 117);
        int int27 = sum0.sum(1511, 856);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2367 + "'", int27 == 2367);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(739, 138);
        int int21 = sum0.sum(379, 702);
        int int24 = sum0.sum(400, 1133);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1081 + "'", int21 == 1081);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1533 + "'", int24 == 1533);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(3699, 2047);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5746 + "'", int24 == 5746);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(308, 1081);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1389 + "'", int18 == 1389);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(49, 335);
        int int24 = sum0.sum((int) (byte) 0, 0);
        int int27 = sum0.sum(1250, 1401);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 192 + "'", int21 == 192);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2651 + "'", int27 == 2651);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(342, 191);
        int int30 = sum0.sum(625, 1479);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 533 + "'", int27 == 533);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1052 + "'", int30 == 1052);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        int int21 = sum0.sum(384, 156);
        int int24 = sum0.sum(149, 514);
        int int27 = sum0.sum(0, 716);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 540 + "'", int21 == 540);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 663 + "'", int24 == 663);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 358 + "'", int27 == 358);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(1063, 486);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1549 + "'", int24 == 1549);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        int int21 = sum0.sum(475, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(53, 106);
        int int24 = sum0.sum(668, 129);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 797 + "'", int24 == 797);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(295, 86);
        int int24 = 0; // flaky: sum0.sum((int) (short) -1, 57);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381 + "'", int21 == 381);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(936, 1527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2463 + "'", int15 == 2463);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        int int18 = sum0.sum(2525, 1192);
        int int21 = sum0.sum(987, 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3717 + "'", int18 == 3717);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1347 + "'", int21 == 1347);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(516, 1233);
        int int24 = sum0.sum(76, 534);
        int int27 = sum0.sum(413, 453);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 305 + "'", int24 == 305);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 433 + "'", int27 == 433);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum((int) 'a', 272);
        int int24 = sum0.sum(536, 1483);
        int int27 = sum0.sum(1497, 575);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 369 + "'", int21 == 369);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2019 + "'", int24 == 2019);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2072 + "'", int27 == 2072);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(1153, (int) (byte) 0);
        int int15 = sum0.sum(232, 548);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1153 + "'", int12 == 1153);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 390 + "'", int15 == 390);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(500, 207);
        int int21 = sum0.sum(0, 643);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 707 + "'", int18 == 707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 643 + "'", int21 == 643);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(955, 510);
        int int15 = sum0.sum(1538, 4233);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1465 + "'", int12 == 1465);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5771 + "'", int15 == 5771);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(140, 50);
        int int27 = sum0.sum((int) (short) 1, 107);
        int int30 = sum0.sum(391, 138);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 529 + "'", int30 == 529);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, 829);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 829 + "'", int15 == 829);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(402, 719);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1121 + "'", int15 == 1121);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(677, 443);
        int int27 = sum0.sum(929, 76);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1120 + "'", int24 == 1120);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1005 + "'", int27 == 1005);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(625, 53);
        int int27 = sum0.sum(166, 2044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 678 + "'", int24 == 678);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1105 + "'", int27 == 1105);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(1403, 406);
        int int18 = sum0.sum(2315, 569);
        int int21 = sum0.sum(713, 432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1809 + "'", int15 == 1809);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2884 + "'", int18 == 2884);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1145 + "'", int21 == 1145);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum((int) (short) 10, 10);
        int int12 = sum0.sum(202, 139);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 341 + "'", int12 == 341);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(445, 0);
        int int18 = sum0.sum(1114, 1511);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 445 + "'", int15 == 445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2625 + "'", int18 == 2625);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        int int12 = sum0.sum(0, 1120);
        int int15 = sum0.sum(775, 2201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 560 + "'", int12 == 560);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1488 + "'", int15 == 1488);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(4, 93);
        int int24 = sum0.sum(747, 67);
        int int27 = sum0.sum(0, 444);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 222 + "'", int27 == 222);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(142, 140);
        int int27 = sum0.sum(31, 486);
        int int30 = sum0.sum(94, 856);
        int int33 = sum0.sum(415, 1543);
        int int36 = sum0.sum(500, 839);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282 + "'", int24 == 282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 517 + "'", int27 == 517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 475 + "'", int30 == 475);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 979 + "'", int33 == 979);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1339 + "'", int36 == 1339);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(310, 384);
        int int21 = sum0.sum(361, 522);
        int int24 = sum0.sum(815, 5512);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 347 + "'", int18 == 347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 883 + "'", int21 == 883);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6327 + "'", int24 == 6327);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(257, 203);
        int int18 = sum0.sum(384, 111);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 460 + "'", int15 == 460);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 495 + "'", int18 == 495);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(719, (int) (byte) 0);
        int int21 = sum0.sum(312, 1133);
        int int24 = sum0.sum(574, 138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 719 + "'", int18 == 719);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445 + "'", int21 == 1445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 712 + "'", int24 == 712);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(419, 536);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        int int21 = sum0.sum(2273, 1389);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3662 + "'", int21 == 3662);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(0, 1003);
        int int30 = sum0.sum(109, 160);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1003 + "'", int27 == 1003);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 269 + "'", int30 == 269);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        int int21 = sum0.sum(467, 337);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 804 + "'", int21 == 804);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(769, 939);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854 + "'", int21 == 854);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(0, 1543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1543 + "'", int12 == 1543);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1095, 373);
        int int12 = sum0.sum(291, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1468 + "'", int9 == 1468);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 291 + "'", int12 == 291);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(71, 54);
        int int21 = sum0.sum(177, 802);
        int int24 = 0; // flaky: sum0.sum((int) (byte) -1, 1261);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 979 + "'", int21 == 979);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 630 + "'", int24 == 630);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(189, 536);
        int int18 = sum0.sum(4, 241);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 725 + "'", int15 == 725);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(1293, 365);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1658 + "'", int18 == 1658);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1447, 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1729 + "'", int12 == 1729);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(345, 2799);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1572 + "'", int21 == 1572);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(1179, 99);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1278 + "'", int21 == 1278);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(245, 207);
        int int27 = sum0.sum(1219, 982);
        int int30 = sum0.sum(802, 2783);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452 + "'", int24 == 452);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2201 + "'", int27 == 2201);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3585 + "'", int30 == 3585);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(142, 140);
        int int27 = sum0.sum(31, 486);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282 + "'", int24 == 282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 517 + "'", int27 == 517);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(409, (int) '#');
        int int30 = sum0.sum(930, 317);
        int int33 = sum0.sum(299, 0);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1247 + "'", int30 == 1247);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 299 + "'", int33 == 299);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(140, 72);
        int int18 = sum0.sum(4854, 3481);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 212 + "'", int15 == 212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8335 + "'", int18 == 8335);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(142, 821);
        int int27 = sum0.sum(2503, 142);
        int int30 = sum0.sum(297, 172);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 963 + "'", int24 == 963);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2645 + "'", int27 == 2645);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 469 + "'", int30 == 469);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(92, 65);
        int int21 = sum0.sum(1391, 1319);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 157 + "'", int18 == 157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2710 + "'", int21 == 2710);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        int int18 = sum0.sum(537, 4181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2359 + "'", int18 == 2359);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(349, 202);
        int int15 = sum0.sum(615, 354);
        int int18 = sum0.sum(726, 47);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 551 + "'", int12 == 551);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 969 + "'", int15 == 969);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 773 + "'", int18 == 773);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(249, 1199);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 724 + "'", int18 == 724);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum((int) (short) 100, 385);
        int int24 = sum0.sum(25, 120);
        int int27 = sum0.sum(176, 1);
        int int30 = sum0.sum(460, 561);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 485 + "'", int21 == 485);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 145 + "'", int24 == 145);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 177 + "'", int27 == 177);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1021 + "'", int30 == 1021);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(877, 536);
        int int9 = sum0.sum(1063, 278);
        int int12 = sum0.sum(391, 2613);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1413 + "'", int6 == 1413);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1341 + "'", int9 == 1341);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1502 + "'", int12 == 1502);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(10, 116);
        int int24 = sum0.sum(106, 121);
        int int27 = sum0.sum(939, 376);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 63 + "'", int21 == 63);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 227 + "'", int24 == 227);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1315 + "'", int27 == 1315);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(569, 36);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 605 + "'", int12 == 605);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(856, 258);
        int int21 = sum0.sum(460, 2408);
        int int24 = sum0.sum(327, 393);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1114 + "'", int18 == 1114);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1434 + "'", int21 == 1434);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 360 + "'", int24 == 360);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(741, 953);
        int int27 = sum0.sum(1549, (int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 847 + "'", int24 == 847);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1584 + "'", int27 == 1584);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(72, 83);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 155 + "'", int9 == 155);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(142, 821);
        int int27 = sum0.sum(2503, 142);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 963 + "'", int24 == 963);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2645 + "'", int27 == 2645);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(166, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 166 + "'", int21 == 166);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        int int18 = sum0.sum(1569, 299);
        int int21 = sum0.sum(48, 963);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1868 + "'", int18 == 1868);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1011 + "'", int21 == 1011);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(0, 338);
        int int9 = sum0.sum(551, 385);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 169 + "'", int6 == 169);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 936 + "'", int9 == 936);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(109, 438);
        int int24 = sum0.sum(427, 26);
        int int27 = sum0.sum(4719, 793);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 547 + "'", int21 == 547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5512 + "'", int27 == 5512);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(0, 1237);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1237 + "'", int21 == 1237);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(0, 241);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 241 + "'", int21 == 241);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(251, 485);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(384, 336);
        int int6 = sum0.sum(1047, 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 720 + "'", int3 == 720);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1196 + "'", int6 == 1196);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(713, 405);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1118 + "'", int12 == 1118);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(1114, 140);
        int int30 = sum0.sum(2874, 1229);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1254 + "'", int27 == 1254);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4103 + "'", int30 == 4103);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(705, 2296);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3001 + "'", int21 == 3001);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(139, 1254);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1393 + "'", int24 == 1393);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(1303, 779);
        int int30 = sum0.sum(719, 269);
        int int33 = sum0.sum(498, 230);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2082 + "'", int27 == 2082);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 988 + "'", int30 == 988);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 728 + "'", int33 == 728);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(0, 0);
        int int15 = sum0.sum(824, 97);
        int int18 = sum0.sum(111, 995);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 921 + "'", int15 == 921);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 553 + "'", int18 == 553);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(869, 941);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 905 + "'", int15 == 905);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(1270, 1050);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2320 + "'", int15 == 2320);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(182, 1953);
        int int18 = sum0.sum(4719, 429);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2135 + "'", int15 == 2135);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5148 + "'", int18 == 5148);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(719, (int) (byte) 0);
        int int21 = sum0.sum(312, 1133);
        int int24 = sum0.sum(725, 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 719 + "'", int18 == 719);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445 + "'", int21 == 1445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1385 + "'", int24 == 1385);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(220, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(155, 103);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 258 + "'", int21 == 258);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(249, 0);
        int int21 = sum0.sum(1569, 663);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 249 + "'", int18 == 249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2232 + "'", int21 == 2232);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(747, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 747 + "'", int15 == 747);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(923, 11);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 934 + "'", int18 == 934);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(261, 164);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 425 + "'", int15 == 425);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(26, 500);
        int int21 = sum0.sum(547, 1713);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1130 + "'", int21 == 1130);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(889, 237);
        int int27 = sum0.sum(1967, 76);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1126 + "'", int24 == 1126);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2043 + "'", int27 == 2043);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(741, 877);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 809 + "'", int12 == 809);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(949, 0);
        int int18 = sum0.sum(392, 505);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 897 + "'", int18 == 897);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(559, 312);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 871 + "'", int21 == 871);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(72, 83);
        int int12 = sum0.sum(505, 279);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 155 + "'", int9 == 155);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 784 + "'", int12 == 784);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(651, 0);
        int int18 = sum0.sum(173, (int) (byte) 10);
        int int21 = sum0.sum(53, 1548);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 651 + "'", int15 == 651);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 183 + "'", int18 == 183);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1601 + "'", int21 == 1601);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(219, 0);
        int int27 = sum0.sum(205, 1293);
        int int30 = sum0.sum(511, 4100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 219 + "'", int24 == 219);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 749 + "'", int27 == 749);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4611 + "'", int30 == 4611);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(384, 395);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 779 + "'", int18 == 779);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(376, 120);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 496 + "'", int18 == 496);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(116, 412);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 264 + "'", int21 == 264);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(91, 127);
        int int6 = sum0.sum(848, 2007);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2855 + "'", int6 == 2855);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(63, 4);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum(170, 548);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 359 + "'", int12 == 359);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(269, 263);
        int int24 = sum0.sum(425, 2463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 532 + "'", int21 == 532);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1444 + "'", int24 == 1444);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(113, 671);
        int int21 = sum0.sum(304, 35);
        int int24 = sum0.sum(1869, 2655);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 339 + "'", int21 == 339);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2262 + "'", int24 == 2262);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        int int24 = sum0.sum(515, 286);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 801 + "'", int24 == 801);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(240, 726);
        int int24 = sum0.sum(395, 273);
        int int27 = sum0.sum(2367, 726);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 668 + "'", int24 == 668);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3093 + "'", int27 == 3093);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(1114, 140);
        int int30 = sum0.sum(997, 1528);
        int int33 = sum0.sum(0, 549);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1254 + "'", int27 == 1254);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2525 + "'", int30 == 2525);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 549 + "'", int33 == 549);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(321, 36);
        int int24 = sum0.sum(3717, 2003);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5720 + "'", int24 == 5720);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(115, 1293);
        int int24 = sum0.sum(339, 208);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 704 + "'", int21 == 704);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 547 + "'", int24 == 547);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(269, 445);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 357 + "'", int24 == 357);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(488, 1548);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1018 + "'", int18 == 1018);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(189, 979);
        int int21 = sum0.sum(1387, 0);
        int int24 = sum0.sum(1576, 431);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 584 + "'", int18 == 584);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1387 + "'", int21 == 1387);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2007 + "'", int24 == 2007);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(63, 308);
        int int21 = sum0.sum(2655, 0);
        int int24 = sum0.sum(1179, 466);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 371 + "'", int18 == 371);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2655 + "'", int21 == 2655);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1645 + "'", int24 == 1645);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(312, 1154);
        int int21 = sum0.sum(42, 212);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 733 + "'", int18 == 733);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 127 + "'", int21 == 127);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(53, (int) (short) 1);
        int int15 = sum0.sum(939, 3887);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2413 + "'", int15 == 2413);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 203 + "'", int21 == 203);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(1479, 89);
        int int15 = sum0.sum(1017, 54);
        int int18 = sum0.sum(1538, 295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1071 + "'", int15 == 1071);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1833 + "'", int18 == 1833);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(113, 671);
        int int21 = sum0.sum(304, 35);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 339 + "'", int21 == 339);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        int int18 = sum0.sum(10, 181);
        int int21 = sum0.sum(537, 641);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 589 + "'", int21 == 589);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum((int) '4', 321);
        int int18 = sum0.sum(218, 585);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 373 + "'", int15 == 373);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 803 + "'", int18 == 803);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(335, 110);
        int int24 = sum0.sum(869, 1468);
        int int27 = sum0.sum(803, 1267);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2337 + "'", int24 == 2337);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1035 + "'", int27 == 1035);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(155, 488);
        int int30 = sum0.sum(0, 172);
        int int33 = sum0.sum(1050, 392);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 643 + "'", int27 == 643);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 86 + "'", int30 == 86);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1442 + "'", int33 == 1442);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(651, 0);
        int int18 = sum0.sum(173, (int) (byte) 10);
        int int21 = sum0.sum(558, 1152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 651 + "'", int15 == 651);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 183 + "'", int18 == 183);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855 + "'", int21 == 855);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(54, 129);
        int int24 = sum0.sum(612, 214);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 183 + "'", int21 == 183);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 826 + "'", int24 == 826);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(98, 84);
        int int12 = sum0.sum(1631, 2994);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 182 + "'", int9 == 182);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4625 + "'", int12 == 4625);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(106, 719);
        int int21 = sum0.sum(0, 760);
        int int24 = sum0.sum(85, 262);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 825 + "'", int18 == 825);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 380 + "'", int21 == 380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 347 + "'", int24 == 347);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(704, 1878);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 158 + "'", 158, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 145 + "'", 145, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 392 + "'", 392, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 500 + "'", 500, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 1291 + "'", 1291, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(645, (short) 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 645 + "'", 645, int12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((byte) 0, (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 312);
        int int21 = sum0.sum(365, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 10 + "'", 10, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 50 + "'", 50, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 430 + "'", 430, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 156 + "'", 156, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 365 + "'", 365, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(312, 1154);
        int int21 = sum0.sum(1713, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 93 + "'", 93, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 259 + "'", 259, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 733 + "'", 733, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1713 + "'", 1713, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum((short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(721, 598);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 99 + "'", 99, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 217 + "'", 217, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1319 + "'", 1319, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (byte) 0);
        int int21 = sum0.sum((short) 1, 197);
        int int24 = sum0.sum(503, 336);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 98 + "'", 98, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 197 + "'", 197, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 99 + "'", 99, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 839 + "'", 839, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(365, 1103);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 734 + "'", 734, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(42, (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(384, 16);
        int int30 = sum0.sum(2193, 205);
        int int33 = sum0.sum(164, 1669);
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 71 + "'", 71, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 49 + "'", 49, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 169 + "'", 169, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 94 + "'", 94, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 384 + "'", 384, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 207 + "'", 207, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 273 + "'", 273, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 400 + "'", 400, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 2398 + "'", 2398, int30);
        Assert.assertEquals("'" + int33 + "' != '" + 1833 + "'", 1833, int33);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(251, 485);
        int int21 = sum0.sum(92, 312);
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 158 + "'", 158, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 275 + "'", 275, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 310 + "'", 310, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 251 + "'", 251, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 368 + "'", 368, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 202 + "'", 202, int21);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(1479, 89);
        int int15 = sum0.sum(1017, 54);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 158 + "'", 158, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 275 + "'", 275, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 1568 + "'", 1568, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1071 + "'", 1071, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum((short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (byte) 100);
        int int27 = sum0.sum(1114, 140);
        int int30 = sum0.sum(997, 1528);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 99 + "'", 99, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 150 + "'", 150, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 257 + "'", 257, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1254 + "'", 1254, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 2525 + "'", 2525, int30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(599, 1716);
        int int12 = sum0.sum(814, 832);
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 176 + "'", 176, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 2315 + "'", 2315, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 823 + "'", 823, int12);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(498, 532);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 515 + "'", 515, int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(2046, 0);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 363 + "'", 363, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 237 + "'", 237, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 2046 + "'", 2046, int12);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum('#', ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(208, 84);
        int int27 = sum0.sum(120, 0);
        int int30 = sum0.sum(641, 1081);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 67 + "'", 67, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 150 + "'", 150, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 292 + "'", 292, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 120 + "'", 120, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 861 + "'", 861, int30);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum((byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum('#', 249);
        int int18 = sum0.sum(321, 172);
        int int21 = sum0.sum(1084, 1350);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 45 + "'", 45, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 335 + "'", 335, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 142 + "'", 142, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 493 + "'", 493, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1217 + "'", 1217, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (byte) 0);
        int int21 = sum0.sum(240, 726);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 98 + "'", 98, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 197 + "'", 197, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 483 + "'", 483, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(599, 1716);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 176 + "'", 176, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 2315 + "'", 2315, int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(' ', (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(310, 384);
        int int21 = sum0.sum(361, 522);
        int int24 = sum0.sum(83, 282);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 42 + "'", 42, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 196 + "'", 196, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 347 + "'", 347, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 883 + "'", 883, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 365 + "'", 365, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (short) 0);
        int int21 = sum0.sum(164, 192);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 162 + "'", 162, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 89 + "'", 89, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 380 + "'", 380, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 178 + "'", 178, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(3405, 1247);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 99 + "'", 99, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 4652 + "'", 4652, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum((byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(951, 528);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 45 + "'", 45, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 1063 + "'", 1063, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 338 + "'", 338, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 1479 + "'", 1479, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(1120, 99);
        int int24 = sum0.sum(1636, 127);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 93 + "'", 93, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 100 + "'", 100, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 321 + "'", 321, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1219 + "'", 1219, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1763 + "'", 1763, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, '#');
        int int15 = sum0.sum(0, (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(0, 241);
        int int24 = sum0.sum(1081, 156);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 85 + "'", 85, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1 + "'", 1, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 36 + "'", 36, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 241 + "'", 241, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1237 + "'", 1237, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum((short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (byte) 100);
        int int27 = sum0.sum(353, 318);
        int int30 = sum0.sum(1121, 1014);
        int int33 = sum0.sum(0, 921);
        int int36 = sum0.sum(3027, 854);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 99 + "'", 99, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 150 + "'", 150, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 257 + "'", 257, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 671 + "'", 671, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 2135 + "'", 2135, int30);
        Assert.assertEquals("'" + int33 + "' != '" + 921 + "'", 921, int33);
        Assert.assertEquals("'" + int36 + "' != '" + 3881 + "'", 3881, int36);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(145, (byte) 10);
        int int9 = sum0.sum(97, (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = 0; // flaky: sum0.sum(138, (int) (short) -1);
        int int21 = sum0.sum(953, 3250);
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 155 + "'", 155, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 197 + "'", 197, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 121 + "'", 121, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 345 + "'", 345, int15);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 138 + "'", int18 == 138);
        Assert.assertEquals("'" + int21 + "' != '" + 4203 + "'", 4203, int21);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('a', (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(260, 689);
        int int24 = sum0.sum(1793, 48);
        int int27 = sum0.sum(' ', 1233);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 197 + "'", 197, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 238 + "'", 238, int9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        Assert.assertEquals("'" + int15 + "' != '" + 803 + "'", 803, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 241 + "'", 241, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 949 + "'", 949, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1841 + "'", 1841, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1265 + "'", 1265, int27);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(' ', (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(400, 2769);
        int int27 = sum0.sum(472, 800);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 42 + "'", 42, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 196 + "'", 196, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 162 + "'", 162, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 188 + "'", 188, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 3169 + "'", 3169, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 636 + "'", 636, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((short) 1, (byte) 100);
        int int18 = sum0.sum(0, (byte) 100);
        int int21 = sum0.sum(799, 1190);
        int int24 = sum0.sum(1622, 2193);
        int int27 = sum0.sum(91, 45);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 101 + "'", 101, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 50 + "'", 50, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1989 + "'", 1989, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 3815 + "'", 3815, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 136 + "'", 136, int27);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(189, 536);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 572 + "'", 572, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 805 + "'", 805, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 725 + "'", 725, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(243, 174);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 227 + "'", 227, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 279 + "'", 279, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 113 + "'", 113, int15);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        Assert.assertEquals("'" + int21 + "' != '" + 689 + "'", 689, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 417 + "'", 417, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum(30, (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (short) 100);
        int int27 = sum0.sum(881, 177);
        int int30 = sum0.sum(288, 302);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 65 + "'", 65, int9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        Assert.assertEquals("'" + int15 + "' != '" + 92 + "'", 92, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 208 + "'", 208, int18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        Assert.assertEquals("'" + int24 + "' != '" + 203 + "'", 203, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1058 + "'", 1058, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 295 + "'", 295, int30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(145, (byte) 10);
        int int9 = sum0.sum(97, (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(63, 308);
        int int21 = sum0.sum(2655, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 155 + "'", 155, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 197 + "'", 197, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 121 + "'", 121, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 611 + "'", 611, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 371 + "'", 371, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 2655 + "'", 2655, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum((short) 10, 347);
        int int24 = sum0.sum(0, 217);
        int int27 = sum0.sum(183, 85);
        int int30 = sum0.sum(678, 1448);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 162 + "'", 162, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 89 + "'", 89, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 206 + "'", 206, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 357 + "'", 357, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 217 + "'", 217, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 268 + "'", 268, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 1063 + "'", 1063, int30);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(475, 251);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 726 + "'", 726, int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum((byte) 1, 110);
        int int30 = sum0.sum(1077, 936);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 162 + "'", 162, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 89 + "'", 89, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 206 + "'", 206, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 220 + "'", 220, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 237 + "'", 237, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 111 + "'", 111, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 2013 + "'", 2013, int30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum((short) 0, 99);
        int int21 = sum0.sum(306, 1083);
        int int24 = sum0.sum(1757, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 99 + "'", 99, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1389 + "'", 1389, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1757 + "'", 1757, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(353, 203);
        int int24 = sum0.sum(195, 141);
        int int27 = sum0.sum(734, 136);
        int int30 = sum0.sum(353, 865);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 169 + "'", 169, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 320 + "'", 320, int15);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        Assert.assertEquals("'" + int21 + "' != '" + 556 + "'", 556, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 336 + "'", 336, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 870 + "'", 870, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 609 + "'", 609, int30);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(1729, 0);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 1729 + "'", 1729, int12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (byte) 0);
        int int21 = sum0.sum(486, (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(1303, 779);
        int int30 = sum0.sum(719, 269);
        int int33 = sum0.sum(498, 230);
        int int36 = sum0.sum(871, 510);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 98 + "'", 98, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 197 + "'", 197, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 487 + "'", 487, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 373 + "'", 373, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 2082 + "'", 2082, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 988 + "'", 988, int30);
        Assert.assertEquals("'" + int33 + "' != '" + 728 + "'", 728, int33);
        Assert.assertEquals("'" + int36 + "' != '" + 1381 + "'", 1381, int36);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(391, 3757);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 158 + "'", 158, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 275 + "'", 275, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 2074 + "'", 2074, int12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((byte) 0, 487);
        int int24 = sum0.sum(1688, 1041);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 85 + "'", 85, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 229 + "'", 229, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 240 + "'", 240, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 487 + "'", 487, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 2729 + "'", 2729, int24);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(217, 192);
        int int18 = sum0.sum(1212, 699);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 10 + "'", 10, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 335 + "'", 335, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 409 + "'", 409, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 1911 + "'", 1911, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        int int24 = sum0.sum(395, 405);
        int int27 = sum0.sum(304, 1483);
        int int30 = sum0.sum(1109, (short) 0);
        int int33 = sum0.sum(998, 0);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 59 + "'", 59, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 263 + "'", 263, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 175 + "'", 175, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 400 + "'", 400, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1787 + "'", 1787, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 1109 + "'", 1109, int30);
        Assert.assertEquals("'" + int33 + "' != '" + 998 + "'", 998, int33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum('a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum('a', 272);
        int int24 = sum0.sum(536, 1483);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 97 + "'", 97, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 343 + "'", 343, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 111 + "'", 111, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 252 + "'", 252, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 369 + "'", 369, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 2019 + "'", 2019, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(127, 45);
        int int18 = sum0.sum(975, 1278);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 158 + "'", 158, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 275 + "'", 275, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 310 + "'", 310, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 172 + "'", 172, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 2253 + "'", 2253, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum((short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (byte) 100);
        int int27 = sum0.sum(353, 318);
        int int30 = sum0.sum(1121, 1014);
        int int33 = sum0.sum(650, 1107);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 99 + "'", 99, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 150 + "'", 150, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 257 + "'", 257, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 671 + "'", 671, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 2135 + "'", 2135, int30);
        Assert.assertEquals("'" + int33 + "' != '" + 1757 + "'", 1757, int33);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(1413, 407);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        Assert.assertEquals("'" + int12 + "' != '" + 191 + "'", 191, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1043 + "'", 1043, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 1820 + "'", 1820, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(0, 103);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 227 + "'", 227, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 279 + "'", 279, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 103 + "'", 103, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(220, 99);
        int int18 = sum0.sum(1475, 3237);
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 10 + "'", 10, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 335 + "'", 335, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 319 + "'", 319, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 2356 + "'", 2356, int18);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum((short) 10, 197);
        int int12 = sum0.sum((short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(1179, 99);
        int int24 = sum0.sum(104, 587);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 207 + "'", 207, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 53 + "'", 53, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1474 + "'", 1474, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 476 + "'", 476, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1278 + "'", 1278, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 691 + "'", 691, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum(30, (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (short) 100);
        int int27 = sum0.sum(881, 177);
        int int30 = sum0.sum(273, 323);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 65 + "'", 65, int9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        Assert.assertEquals("'" + int15 + "' != '" + 92 + "'", 92, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 208 + "'", 208, int18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        Assert.assertEquals("'" + int24 + "' != '" + 203 + "'", 203, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1058 + "'", 1058, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 298 + "'", 298, int30);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        int int24 = sum0.sum(395, 405);
        int int27 = sum0.sum(0, 3222);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 59 + "'", 59, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 263 + "'", 263, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 175 + "'", 175, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 400 + "'", 400, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1611 + "'", 1611, int27);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(645, (short) 0);
        int int15 = sum0.sum(3234, 237);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 645 + "'", 645, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 3471 + "'", 3471, int15);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum((byte) 0, (byte) 100);
        int int9 = sum0.sum(511, 0);
        int int12 = sum0.sum(1347, 191);
        int int15 = sum0.sum(889, 2757);
        int int18 = sum0.sum(2855, 665);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 50 + "'", 50, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 511 + "'", 511, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 1538 + "'", 1538, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1823 + "'", 1823, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 3520 + "'", 3520, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((byte) 0, (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 312);
        int int21 = sum0.sum(419, 142);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 10 + "'", 10, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 50 + "'", 50, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 430 + "'", 430, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 156 + "'", 156, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 561 + "'", 561, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        int int24 = sum0.sum(192, 908);
        int int27 = sum0.sum((byte) 100, 1494);
        int int30 = sum0.sum(323, 907);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 93 + "'", 93, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 299 + "'", 299, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 559 + "'", 559, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 338 + "'", 338, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 550 + "'", 550, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 797 + "'", 797, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 615 + "'", 615, int30);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('a', (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(42, 1247);
        int int24 = sum0.sum(801, 521);
        int int27 = sum0.sum('#', 1261);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 197 + "'", 197, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 238 + "'", 238, int9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        Assert.assertEquals("'" + int15 + "' != '" + 803 + "'", 803, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 241 + "'", 241, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 1289 + "'", 1289, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1322 + "'", 1322, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 648 + "'", 648, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum((byte) 1, 'a');
        int int15 = sum0.sum(0, ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(10, 116);
        int int24 = sum0.sum(106, 121);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 49 + "'", 49, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 16 + "'", 16, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 140 + "'", 140, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 63 + "'", 63, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 227 + "'", 227, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum('#', 0);
        int int12 = sum0.sum(540, 1682);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 35 + "'", 35, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 1111 + "'", 1111, int12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (byte) 0);
        int int21 = sum0.sum(486, (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(1303, 779);
        int int30 = sum0.sum(719, 269);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 98 + "'", 98, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 197 + "'", 197, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 487 + "'", 487, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 373 + "'", 373, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 2082 + "'", 2082, int27);
        Assert.assertEquals("'" + int30 + "' != '" + 988 + "'", 988, int30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum(30, (byte) 100);
        int int12 = sum0.sum('4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(2253, 465);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 65 + "'", 65, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 107 + "'", 107, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 219 + "'", 219, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 2718 + "'", 2718, int18);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(761, 514);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 93 + "'", 93, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 100 + "'", 100, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 1275 + "'", 1275, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(10, '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(172, 1121);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 31 + "'", 31, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 10 + "'", 10, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 335 + "'", 335, int12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        Assert.assertEquals("'" + int21 + "' != '" + 1293 + "'", 1293, int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum(30, (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(11, 1107);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 65 + "'", 65, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 173 + "'", 173, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 774 + "'", 774, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 559 + "'", 559, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(100, (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 110 + "'", 110, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 93 + "'", 93, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 100 + "'", 100, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 321 + "'", 321, int18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        int int21 = sum0.sum(0, (short) 0);
        int int24 = sum0.sum(172, 106);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 59 + "'", 59, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 191 + "'", 191, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 0 + "'", 0, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 278 + "'", 278, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(539, 1277);
        int int9 = sum0.sum(529, 1278);
        int int12 = sum0.sum(530, 135);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 908 + "'", 908, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1807 + "'", 1807, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 665 + "'", 665, int12);
    }
}
