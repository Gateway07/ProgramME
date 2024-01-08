package org.pme.example.sum;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(16, 245);
        int int27 = sum0.sum(551, 1113);
        int int30 = sum0.sum(232, 884);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 832 + "'", int27 == 832);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 558 + "'", int30 == 558);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(106, 54);
        int int18 = sum0.sum(92, 48);
        int int21 = sum0.sum(369, 103);
        int int24 = sum0.sum(138, 1101);
        int int27 = sum0.sum(921, 1549);
        int int30 = sum0.sum(753, 993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 160 + "'", int15 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 472 + "'", int21 == 472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1239 + "'", int24 == 1239);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1235 + "'", int27 == 1235);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 873 + "'", int30 == 873);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(497, 991);
        int int27 = sum0.sum(1752, 2491);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744 + "'", int24 == 744);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4243 + "'", int27 == 4243);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        int int21 = sum0.sum(397, 295);
        int int24 = sum0.sum(551, 744);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 692 + "'", int21 == 692);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1295 + "'", int24 == 1295);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(809, 4611);
        int int27 = sum0.sum(272, 7676);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2710 + "'", int24 == 2710);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3974 + "'", int27 == 3974);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum(585, 806);
        int int15 = sum0.sum(2201, 208);
        int int18 = sum0.sum(194, 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1391 + "'", int12 == 1391);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2409 + "'", int15 == 2409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 981 + "'", int18 == 981);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        int int24 = sum0.sum(291, 0);
        int int27 = sum0.sum(991, 1901);
        int int30 = sum0.sum(0, 262);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1446 + "'", int27 == 1446);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 131 + "'", int30 == 131);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(677, 443);
        int int27 = sum0.sum(321, 182);
        int int30 = sum0.sum(235, 31);
        int int33 = sum0.sum(895, 1050);
        int int36 = sum0.sum(728, 572);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1120 + "'", int24 == 1120);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 503 + "'", int27 == 503);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 266 + "'", int30 == 266);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1945 + "'", int33 == 1945);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1300 + "'", int36 == 1300);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(599, 63);
        int int21 = sum0.sum(336, 313);
        int int24 = sum0.sum(1303, 874);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 662 + "'", int18 == 662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 649 + "'", int21 == 649);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2177 + "'", int24 == 2177);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        int int33 = sum0.sum(466, 30);
        int int36 = sum0.sum(339, 1719);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 496 + "'", int33 == 496);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1029 + "'", int36 == 1029);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(692, 594);
        int int24 = sum0.sum(1700, 620);
        int int27 = sum0.sum(1800, 371);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1286 + "'", int21 == 1286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2320 + "'", int24 == 2320);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2171 + "'", int27 == 2171);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(208, 35);
        int int12 = sum0.sum(157, 174);
        int int15 = sum0.sum(559, 4344);
        int int18 = sum0.sum(645, 805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 243 + "'", int9 == 243);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 331 + "'", int12 == 331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4903 + "'", int15 == 4903);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 725 + "'", int18 == 725);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(0, 0);
        int int15 = sum0.sum(734, 1333);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2067 + "'", int15 == 2067);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(504, 1811);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2315 + "'", int21 == 2315);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(1063, 486);
        int int27 = sum0.sum(181, 1662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1549 + "'", int24 == 1549);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1843 + "'", int27 == 1843);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(50, 89);
        int int27 = sum0.sum(1806, 4875);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 139 + "'", int24 == 139);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6681 + "'", int27 == 6681);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(1179, 1014);
        int int30 = sum0.sum(2373, 0);
        int int33 = sum0.sum(806, 2497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2193 + "'", int27 == 2193);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2373 + "'", int30 == 2373);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3303 + "'", int33 == 3303);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum((int) (byte) 1, 110);
        int int30 = sum0.sum(1077, 936);
        int int33 = sum0.sum(3065, 5623);
        int int36 = sum0.sum(1817, 2373);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 111 + "'", int27 == 111);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2013 + "'", int30 == 2013);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4344 + "'", int33 == 4344);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2095 + "'", int36 == 2095);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        int int18 = sum0.sum(155, (int) (byte) 0);
        int int21 = sum0.sum(127, 107);
        int int24 = sum0.sum(306, 645);
        int int27 = sum0.sum(321, 2344);
        int int30 = sum0.sum(120, 965);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234 + "'", int21 == 234);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 951 + "'", int24 == 951);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2665 + "'", int27 == 2665);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1085 + "'", int30 == 1085);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(923, 11);
        int int21 = sum0.sum(5465, 627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 934 + "'", int18 == 934);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6092 + "'", int21 == 6092);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        int int21 = sum0.sum(384, 156);
        int int24 = sum0.sum(149, 514);
        int int27 = sum0.sum(2492, 1547);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 540 + "'", int21 == 540);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 663 + "'", int24 == 663);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4039 + "'", int27 == 4039);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(85, 158);
        int int27 = sum0.sum(0, 720);
        int int30 = sum0.sum(534, 331);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 243 + "'", int24 == 243);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 865 + "'", int30 == 865);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (int) (short) 100);
        int int27 = sum0.sum(881, 177);
        int int30 = sum0.sum(288, 302);
        int int33 = sum0.sum(1291, 877);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058 + "'", int27 == 1058);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 295 + "'", int30 == 295);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2168 + "'", int33 == 2168);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(83, 959);
        int int18 = sum0.sum(1018, 369);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 521 + "'", int15 == 521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1387 + "'", int18 == 1387);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        int int12 = sum0.sum(497, 255);
        int int15 = sum0.sum(1723, 1745);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 752 + "'", int12 == 752);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1734 + "'", int15 == 1734);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(317, 289);
        int int15 = sum0.sum(135, 361);
        int int18 = sum0.sum(1538, 2367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 606 + "'", int12 == 606);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 248 + "'", int15 == 248);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3905 + "'", int18 == 3905);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(344, 1003);
        int int18 = sum0.sum(1250, 1646);
        int int21 = sum0.sum(2739, 1538);
        int int24 = sum0.sum(2716, 4396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1347 + "'", int15 == 1347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1448 + "'", int18 == 1448);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4277 + "'", int21 == 4277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3556 + "'", int24 == 3556);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(540, 689);
        int int15 = sum0.sum(1295, 637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1229 + "'", int12 == 1229);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1932 + "'", int15 == 1932);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        int int27 = sum0.sum(0, 897);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 897 + "'", int27 == 897);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        int int18 = sum0.sum(10, 181);
        int int21 = sum0.sum(237, 540);
        int int24 = sum0.sum(0, 650);
        int int27 = sum0.sum(369, 2685);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 777 + "'", int21 == 777);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 325 + "'", int24 == 325);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1527 + "'", int27 == 1527);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(196, 1803);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1999 + "'", int24 == 1999);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(139, 0);
        int int18 = sum0.sum(1748, 3637);
        int int21 = sum0.sum(1130, 2093);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5385 + "'", int18 == 5385);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3223 + "'", int21 == 3223);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(170, 125);
        int int24 = sum0.sum(1179, 1849);
        int int27 = sum0.sum(408, 10);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1514 + "'", int24 == 1514);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 418 + "'", int27 == 418);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(419, 368);
        int int18 = sum0.sum(1152, 109);
        int int21 = sum0.sum(184, 156);
        int int24 = sum0.sum(1103, 5333);
        int int27 = sum0.sum(2106, 3903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 787 + "'", int15 == 787);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1261 + "'", int18 == 1261);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 340 + "'", int21 == 340);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3218 + "'", int24 == 3218);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6009 + "'", int27 == 6009);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(59, 606);
        int int24 = sum0.sum(438, 1745);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665 + "'", int21 == 665);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2183 + "'", int24 == 2183);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        int int18 = sum0.sum(176, 277);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 453 + "'", int18 == 453);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        int int33 = sum0.sum(1291, 116);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1407 + "'", int33 == 1407);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(0, 354);
        int int18 = sum0.sum(1548, 1262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 177 + "'", int15 == 177);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2810 + "'", int18 == 2810);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int33 = sum0.sum(1118, 1397);
        int int36 = sum0.sum(212, 1622);
        int int39 = sum0.sum(276, 1476);
        java.lang.Class<?> wildcardClass40 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2515 + "'", int33 == 2515);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 917 + "'", int36 == 917);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 876 + "'", int39 == 876);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(119, 856);
        int int21 = sum0.sum(261, 4233);
        int int24 = sum0.sum(592, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 975 + "'", int18 == 975);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2247 + "'", int21 == 2247);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 592 + "'", int24 == 592);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(26, 500);
        int int21 = sum0.sum(117, 2398);
        int int24 = sum0.sum(658, 30);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2515 + "'", int21 == 2515);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 688 + "'", int24 == 688);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(0, 725);
        int int21 = sum0.sum(993, 365);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 725 + "'", int18 == 725);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1358 + "'", int21 == 1358);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1533, 170);
        int int18 = sum0.sum(2770, 939);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1703 + "'", int15 == 1703);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3709 + "'", int18 == 3709);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(384, 395);
        int int21 = sum0.sum(955, 89);
        int int24 = sum0.sum(304, 157);
        int int27 = sum0.sum(4396, 278);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 779 + "'", int18 == 779);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1044 + "'", int21 == 1044);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 461 + "'", int24 == 461);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4674 + "'", int27 == 4674);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(2845, 881);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3726 + "'", int18 == 3726);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(562, 1216);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 889 + "'", int15 == 889);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(63, 868);
        int int21 = sum0.sum(1279, 1667);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 931 + "'", int18 == 931);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1473 + "'", int21 == 1473);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(251, 485);
        int int21 = sum0.sum(156, 229);
        int int24 = sum0.sum(1548, 448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 385 + "'", int21 == 385);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1996 + "'", int24 == 1996);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(539, 1277);
        int int9 = sum0.sum(1219, 2261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 908 + "'", int6 == 908);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1740 + "'", int9 == 1740);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(445, 0);
        int int18 = sum0.sum(93, 431);
        int int21 = sum0.sum(311, 493);
        int int24 = sum0.sum(1219, 503);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 445 + "'", int15 == 445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 262 + "'", int18 == 262);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 402 + "'", int21 == 402);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1722 + "'", int24 == 1722);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        int int21 = sum0.sum(65, 11);
        int int24 = sum0.sum(702, 130);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 76 + "'", int21 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 832 + "'", int24 == 832);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        int int21 = sum0.sum(273, 1780);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2053 + "'", int21 == 2053);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(856, 753);
        int int12 = sum0.sum(1251, 797);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1609 + "'", int9 == 1609);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(597, 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 746 + "'", int21 == 746);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(4, 93);
        int int24 = sum0.sum(747, 67);
        int int27 = sum0.sum(4271, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4303 + "'", int27 == 4303);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(2403, 3997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3200 + "'", int21 == 3200);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(246, (int) '4');
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 298 + "'", int21 == 298);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(1330, 2151);
        int int21 = sum0.sum(208, 403);
        int int24 = sum0.sum(991, 1748);
        int int27 = sum0.sum(7809, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3481 + "'", int18 == 3481);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 611 + "'", int21 == 611);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2739 + "'", int24 == 2739);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7809 + "'", int27 == 7809);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(272, 609);
        int int24 = sum0.sum(222, 516);
        int int27 = sum0.sum(2159, 242);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 881 + "'", int21 == 881);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 369 + "'", int24 == 369);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2401 + "'", int27 == 2401);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(1119, 0);
        int int24 = sum0.sum(438, 998);
        int int27 = sum0.sum(950, 404);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1119 + "'", int21 == 1119);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 718 + "'", int24 == 718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1354 + "'", int27 == 1354);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(359, 36);
        int int15 = sum0.sum(534, 139);
        int int18 = sum0.sum(481, 202);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 395 + "'", int12 == 395);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 673 + "'", int15 == 673);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 683 + "'", int18 == 683);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(2267, 1833);
        int int15 = sum0.sum(725, 0);
        int int18 = sum0.sum(1117, 1362);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4100 + "'", int12 == 4100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 725 + "'", int15 == 725);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2479 + "'", int18 == 2479);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        int int33 = sum0.sum(156, 940);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 548 + "'", int33 == 548);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(1354, 241);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1595 + "'", int18 == 1595);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(548, 3771);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4319 + "'", int9 == 4319);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        int int21 = sum0.sum(4293, 729);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5022 + "'", int21 == 5022);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(321, 262);
        int int24 = sum0.sum(347, 1245);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 583 + "'", int21 == 583);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 796 + "'", int24 == 796);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum((int) (byte) 1, 110);
        int int30 = sum0.sum(190, 380);
        int int33 = sum0.sum(517, 135);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 111 + "'", int27 == 111);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 285 + "'", int30 == 285);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 652 + "'", int33 == 652);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(235, 514);
        int int27 = sum0.sum(1625, 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 749 + "'", int24 == 749);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2380 + "'", int27 == 2380);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(500, (int) (short) 10);
        int int15 = sum0.sum(479, 637);
        int int18 = sum0.sum(1343, 2435);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 510 + "'", int12 == 510);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 558 + "'", int15 == 558);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1889 + "'", int18 == 1889);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(2375, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2949 + "'", int24 == 2949);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(110, (int) (byte) 1);
        int int21 = sum0.sum(1475, 1631);
        int int24 = sum0.sum(1313, 48);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1553 + "'", int21 == 1553);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1361 + "'", int24 == 1361);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(1188, 951);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2139 + "'", int18 == 2139);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(54, 129);
        int int24 = sum0.sum(854, 1149);
        int int27 = sum0.sum(1190, 1117);
        int int30 = sum0.sum(1285, 376);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 183 + "'", int21 == 183);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2003 + "'", int24 == 2003);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2307 + "'", int27 == 2307);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1661 + "'", int30 == 1661);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(349, 202);
        int int15 = sum0.sum(1433, 246);
        int int18 = sum0.sum(9109, 4986);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 551 + "'", int12 == 551);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1679 + "'", int15 == 1679);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14095 + "'", int18 == 14095);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(2975, 2093);
        int int27 = sum0.sum(2028, 281);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5068 + "'", int24 == 5068);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2309 + "'", int27 == 2309);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(59, 606);
        int int24 = sum0.sum(94, 668);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665 + "'", int21 == 665);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 381 + "'", int24 == 381);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(1492, 1573);
        int int24 = sum0.sum(197, 1339);
        int int27 = sum0.sum(666, 384);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3065 + "'", int21 == 3065);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 768 + "'", int24 == 768);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1050 + "'", int27 == 1050);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(951, 528);
        int int21 = sum0.sum(1261, 282);
        int int24 = sum0.sum(1281, 847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1479 + "'", int18 == 1479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1543 + "'", int21 == 1543);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2128 + "'", int24 == 2128);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(651, 0);
        int int18 = sum0.sum(173, (int) (byte) 10);
        int int21 = sum0.sum(53, 1548);
        int int24 = sum0.sum(4109, 113);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 651 + "'", int15 == 651);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 183 + "'", int18 == 183);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1601 + "'", int21 == 1601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4222 + "'", int24 == 4222);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(2193, 782);
        int int21 = sum0.sum(1795, 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2975 + "'", int18 == 2975);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2524 + "'", int21 == 2524);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(726, 423);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 689 + "'", int21 == 689);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1149 + "'", int24 == 1149);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        int int18 = sum0.sum(1561, 2799);
        int int21 = sum0.sum(561, 1237);
        int int24 = sum0.sum(1703, 0);
        int int27 = sum0.sum(1396, 2309);
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 677 + "'", 677, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 196 + "'", 196, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 2180 + "'", 2180, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 899 + "'", 899, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1703 + "'", 1703, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 3705 + "'", 3705, int27);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((short) 1, (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(257, 349);
        int int24 = sum0.sum(2044, 402);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 101 + "'", 101, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 48 + "'", 48, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 303 + "'", 303, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 2446 + "'", 2446, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(368, 63);
        int int21 = sum0.sum(237, 227);
        int int24 = sum0.sum(2101, 1989);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 99 + "'", 99, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 431 + "'", 431, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 464 + "'", 464, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 4090 + "'", 4090, int24);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 0, 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(67, 487);
        int int24 = sum0.sum(802, 185);
        int int27 = sum0.sum(3463, 814);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 97 + "'", 97, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 116 + "'", 116, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 106 + "'", 106, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 227 + "'", 227, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 142 + "'", 142, int15);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        Assert.assertEquals("'" + int21 + "' != '" + 277 + "'", 277, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 987 + "'", 987, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 4277 + "'", 4277, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum('a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = sum0.sum(569, 91);
        int int18 = sum0.sum(2459, 2168);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 97 + "'", 97, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 207 + "'", 207, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 660 + "'", 660, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 4627 + "'", 4627, int18);
    }
}
