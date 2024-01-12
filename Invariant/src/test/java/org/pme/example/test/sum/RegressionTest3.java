package org.pme.example.test.sum;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        int int9 = sum0.sum(1193, 1242);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2435 + "'", int9 == 2435);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        int int24 = sum0.sum(2019, 809);
        int int27 = sum0.sum(0, 1780);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2828 + "'", int24 == 2828);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 890 + "'", int27 == 890);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        int int24 = sum0.sum(515, 206);
        int int27 = sum0.sum(1071, 464);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 721 + "'", int24 == 721);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1535 + "'", int27 == 1535);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        int int21 = sum0.sum(505, 747);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(129, 271);
        int int12 = sum0.sum(548, 1148);
        int int15 = sum0.sum(0, 677);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 848 + "'", int12 == 848);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 677 + "'", int15 == 677);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(36, 219);
        int int24 = sum0.sum(113, 574);
        int int27 = sum0.sum(381, 1643);
        int int30 = sum0.sum(1206, 3249);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255 + "'", int21 == 255);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 687 + "'", int24 == 687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1012 + "'", int27 == 1012);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4455 + "'", int30 == 4455);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(1479, 89);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(344, 1003);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1347 + "'", int15 == 1347);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(119, 856);
        int int21 = sum0.sum(261, 4233);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 975 + "'", int18 == 975);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2247 + "'", int21 == 2247);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        int int33 = sum0.sum(1497, 1553);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1525 + "'", int33 == 1525);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(190, 683);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 873 + "'", int24 == 873);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(181, 537);
        int int24 = sum0.sum(338, 551);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 359 + "'", int21 == 359);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 889 + "'", int24 == 889);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        int int36 = sum0.sum(2003, 2309);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2156 + "'", int36 == 2156);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) 'a', 72);
        int int21 = sum0.sum(1393, 3771);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 169 + "'", int18 == 169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2582 + "'", int21 == 2582);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(16, 173);
        int int15 = sum0.sum(1445, 49);
        int int18 = sum0.sum(2151, 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 189 + "'", int12 == 189);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1494 + "'", int15 == 1494);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2685 + "'", int18 == 2685);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(1149, 3169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2159 + "'", int15 == 2159);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(4908, 718);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5626 + "'", int15 == 5626);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(243, 447);
        int int27 = sum0.sum(1547, 3771);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 345 + "'", int24 == 345);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2659 + "'", int27 == 2659);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(3349, 1052);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4401 + "'", int24 == 4401);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        int int33 = sum0.sum(4190, 1446);
        int int36 = sum0.sum(541, 1645);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5636 + "'", int33 == 5636);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1093 + "'", int36 == 1093);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(243, 447);
        int int27 = sum0.sum(1911, 0);
        int int30 = sum0.sum(1939, 5335);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 345 + "'", int24 == 345);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1911 + "'", int27 == 1911);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3637 + "'", int30 == 3637);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        int int30 = sum0.sum(205, 821);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 513 + "'", int30 == 513);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(170, 125);
        int int24 = sum0.sum(1179, 1849);
        int int27 = sum0.sum(104, 395);
        int int30 = sum0.sum(3345, 230);
        int int33 = sum0.sum(1735, 142);
        int int36 = sum0.sum(1319, 515);
        int int39 = sum0.sum(270, 42);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1514 + "'", int24 == 1514);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 499 + "'", int27 == 499);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3575 + "'", int30 == 3575);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1877 + "'", int33 == 1877);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1834 + "'", int36 == 1834);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 312 + "'", int39 == 312);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        int int33 = sum0.sum(483, 511);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 497 + "'", int33 == 497);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(511, 0);
        int int12 = sum0.sum(1347, 191);
        int int15 = sum0.sum(534, 1911);
        int int18 = sum0.sum(1591, 1639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 511 + "'", int9 == 511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1538 + "'", int12 == 1538);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2445 + "'", int15 == 2445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1615 + "'", int18 == 1615);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(322, 269);
        int int15 = sum0.sum(3929, 483);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 591 + "'", int12 == 591);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4412 + "'", int15 == 4412);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        int int30 = sum0.sum(149, 63);
        int int33 = sum0.sum(904, 341);
        int int36 = sum0.sum(831, (int) '#');
        int int39 = sum0.sum(397, 142);
        int int42 = sum0.sum(1149, 1833);
        int int45 = sum0.sum(3474, 750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 400 + "'", int27 == 400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 212 + "'", int30 == 212);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1245 + "'", int33 == 1245);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 866 + "'", int36 == 866);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 539 + "'", int39 == 539);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1491 + "'", int42 == 1491);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4224 + "'", int45 == 4224);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(856, 258);
        int int21 = sum0.sum(2975, 136);
        int int24 = sum0.sum(717, 220);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1114 + "'", int18 == 1114);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3111 + "'", int21 == 3111);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 937 + "'", int24 == 937);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 312);
        int int21 = sum0.sum(419, 142);
        int int24 = sum0.sum(245, 1475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 156 + "'", int18 == 156);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 561 + "'", int21 == 561);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 860 + "'", int24 == 860);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(720, 278);
        int int30 = sum0.sum(231, 678);
        int int33 = sum0.sum(1239, 1645);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 998 + "'", int27 == 998);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 909 + "'", int30 == 909);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1442 + "'", int33 == 1442);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(119, 856);
        int int21 = sum0.sum(261, 4233);
        int int24 = sum0.sum(551, 171);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 975 + "'", int18 == 975);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2247 + "'", int21 == 2247);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 722 + "'", int24 == 722);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = sum0.sum(560, 511);
        int int21 = sum0.sum(1327, 358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1071 + "'", int18 == 1071);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1685 + "'", int21 == 1685);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        int int33 = sum0.sum(768, 774);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 771 + "'", int33 == 771);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum((int) '4', 321);
        int int18 = sum0.sum(1198, 1103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 373 + "'", int15 == 373);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2301 + "'", int18 == 2301);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(511, 139);
        int int27 = sum0.sum(142, 884);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 513 + "'", int27 == 513);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(597, 594);
        int int12 = sum0.sum(618, 649);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1191 + "'", int9 == 1191);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1267 + "'", int12 == 1267);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(1668, 93);
        int int12 = sum0.sum(342, 4652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1761 + "'", int9 == 1761);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2497 + "'", int12 == 2497);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(2175, 448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2623 + "'", int12 == 2623);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(0, 103);
        int int18 = sum0.sum(2046, 699);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2745 + "'", int18 == 2745);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum((int) 'a', 272);
        int int24 = sum0.sum(536, 1483);
        int int27 = sum0.sum(1291, 648);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 369 + "'", int21 == 369);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2019 + "'", int24 == 2019);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1939 + "'", int27 == 1939);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(1443, 442);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1885 + "'", int21 == 1885);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(175, 379);
        int int27 = sum0.sum(514, 753);
        int int30 = sum0.sum(24, 2705);
        int int33 = sum0.sum(935, 1090);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 277 + "'", int24 == 277);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1267 + "'", int27 == 1267);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2729 + "'", int30 == 2729);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2025 + "'", int33 == 2025);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(57, 951);
        int int18 = sum0.sum(1953, 1452);
        int int21 = sum0.sum(286, 726);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 504 + "'", int15 == 504);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3405 + "'", int18 == 3405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 506 + "'", int21 == 506);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(208, 210);
        int int27 = sum0.sum(609, 884);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 209 + "'", int24 == 209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1493 + "'", int27 == 1493);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        int int12 = sum0.sum(529, 363);
        int int15 = sum0.sum(271, 553);
        int int18 = sum0.sum(0, 1326);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 892 + "'", int12 == 892);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 412 + "'", int15 == 412);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 663 + "'", int18 == 663);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(207, 1119);
        int int24 = sum0.sum(506, 82);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 663 + "'", int21 == 663);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 588 + "'", int24 == 588);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(769, 939);
        int int24 = sum0.sum(2427, 2112);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854 + "'", int21 == 854);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4539 + "'", int24 == 4539);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(84, 93);
        int int21 = sum0.sum(97, 408);
        int int24 = sum0.sum(1293, 4434);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 177 + "'", int18 == 177);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 505 + "'", int21 == 505);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5727 + "'", int24 == 5727);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        int int27 = sum0.sum(485, 1);
        int int30 = sum0.sum(136, 9);
        int int33 = sum0.sum(354, 500);
        int int36 = sum0.sum(1113, 569);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 145 + "'", int30 == 145);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 427 + "'", int33 == 427);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1682 + "'", int36 == 1682);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = 0; // flaky: sum0.sum(84, (int) (short) -1);
        int int12 = sum0.sum(2175, 1970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4145 + "'", int12 == 4145);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        int int18 = sum0.sum(349, 53);
        int int21 = sum0.sum(1533, 1561);
        int int24 = sum0.sum(1105, 1716);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1668 + "'", int15 == 1668);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1547 + "'", int21 == 1547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2821 + "'", int24 == 2821);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        int int18 = sum0.sum(349, 53);
        int int21 = sum0.sum(1533, 1561);
        int int24 = sum0.sum(1003, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1668 + "'", int15 == 1668);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1547 + "'", int21 == 1547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1003 + "'", int24 == 1003);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(349, 202);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 551 + "'", int12 == 551);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        int int15 = sum0.sum(149, 1239);
        int int18 = sum0.sum(54, 2515);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 694 + "'", int15 == 694);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2569 + "'", int18 == 2569);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(158, 304);
        int int27 = sum0.sum(206, 199);
        int int30 = sum0.sum(1903, 1665);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 231 + "'", int24 == 231);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 405 + "'", int27 == 405);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3568 + "'", int30 == 3568);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(1005, 806);
        int int21 = sum0.sum(502, 1192);
        int int24 = sum0.sum(953, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1811 + "'", int18 == 1811);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 847 + "'", int21 == 847);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 953 + "'", int24 == 953);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(164, 115);
        int int21 = sum0.sum(493, 894);
        int int24 = sum0.sum(1471, 594);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 279 + "'", int18 == 279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1387 + "'", int21 == 1387);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2065 + "'", int24 == 2065);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(445, 0);
        int int18 = sum0.sum(1114, 1511);
        int int21 = sum0.sum(940, 94);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 445 + "'", int15 == 445);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2625 + "'", int18 == 2625);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1034 + "'", int21 == 1034);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(110, (int) (byte) 1);
        int int21 = sum0.sum(0, 4455);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4455 + "'", int21 == 4455);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(2781, 765);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3546 + "'", int27 == 3546);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        int int21 = sum0.sum(397, 295);
        int int24 = sum0.sum(551, 744);
        int int27 = sum0.sum(689, 2661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 692 + "'", int21 == 692);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1295 + "'", int24 == 1295);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1675 + "'", int27 == 1675);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(57, 951);
        int int18 = sum0.sum(1953, 1452);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 504 + "'", int15 == 504);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3405 + "'", int18 == 3405);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(711, 292);
        int int21 = sum0.sum(210, 1187);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1397 + "'", int21 == 1397);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(53, 106);
        int int24 = sum0.sum(668, 129);
        int int27 = sum0.sum(557, 2199);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 797 + "'", int24 == 797);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1378 + "'", int27 == 1378);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(135, 63);
        int int12 = sum0.sum(31, (int) ' ');
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 198 + "'", int9 == 198);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        int int21 = sum0.sum(1354, 2213);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3567 + "'", int21 == 3567);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        int int21 = sum0.sum(384, 156);
        int int24 = sum0.sum(149, 514);
        int int27 = sum0.sum(220, 1684);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 540 + "'", int21 == 540);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 663 + "'", int24 == 663);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 952 + "'", int27 == 952);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(97, 206);
        int int24 = sum0.sum(948, 1317);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 303 + "'", int21 == 303);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2265 + "'", int24 == 2265);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1233, 185);
        int int15 = sum0.sum(158, 174);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1418 + "'", int12 == 1418);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 166 + "'", int15 == 166);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(136, 42);
        int int18 = sum0.sum((int) (short) 100, 282);
        int int21 = sum0.sum(320, 824);
        int int24 = sum0.sum(802, 1251);
        int int27 = sum0.sum(1667, 914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 178 + "'", int15 == 178);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 572 + "'", int21 == 572);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2053 + "'", int24 == 2053);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2581 + "'", int27 == 2581);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(71, (int) (short) 1);
        int int27 = sum0.sum(815, 99);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 914 + "'", int27 == 914);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(245, 0);
        int int15 = sum0.sum(145, 641);
        int int18 = sum0.sum(1276, 300);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 393 + "'", int15 == 393);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1576 + "'", int18 == 1576);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(891, 592);
        int int24 = sum0.sum(3209, 380);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1483 + "'", int21 == 1483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3589 + "'", int24 == 3589);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(769, 939);
        int int24 = sum0.sum(747, 85);
        int int27 = sum0.sum(6327, 1153);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854 + "'", int21 == 854);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 832 + "'", int24 == 832);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7480 + "'", int27 == 7480);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        int int24 = sum0.sum(510, 643);
        int int27 = sum0.sum(1165, 1326);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1153 + "'", int24 == 1153);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2491 + "'", int27 == 2491);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        int int33 = sum0.sum(741, 2673);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1707 + "'", int33 == 1707);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(951, 548);
        int int18 = sum0.sum(50, 3542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1499 + "'", int15 == 1499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1796 + "'", int18 == 1796);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(1569, 0);
        int int27 = sum0.sum(4, 705);
        int int30 = sum0.sum(5601, 4854);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 709 + "'", int27 == 709);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10455 + "'", int30 == 10455);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(2262, 2613);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4875 + "'", int27 == 4875);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        int int18 = sum0.sum(176, 277);
        int int21 = sum0.sum(3222, 2033);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 453 + "'", int18 == 453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5255 + "'", int21 == 5255);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(335, 110);
        int int24 = sum0.sum(99, 2710);
        int int27 = 0; // flaky: sum0.sum((-1), 282);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2809 + "'", int24 == 2809);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 281 + "'", int27 == 281);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        int int24 = sum0.sum((int) (short) 0, 815);
        int int27 = sum0.sum(1729, 0);
        int int30 = sum0.sum(1334, 3273);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 815 + "'", int24 == 815);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1729 + "'", int27 == 1729);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4607 + "'", int30 == 4607);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(127, 45);
        int int18 = sum0.sum(1013, 2326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3339 + "'", int18 == 3339);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(45, 100);
        int int18 = sum0.sum(2409, 2044);
        int int21 = sum0.sum(993, 5366);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145 + "'", int15 == 145);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4453 + "'", int18 == 4453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6359 + "'", int21 == 6359);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(562, 203);
        int int21 = sum0.sum(302, 962);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 632 + "'", int21 == 632);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(359, 228);
        int int18 = sum0.sum(929, 249);
        int int21 = sum0.sum(1300, 1833);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 587 + "'", int15 == 587);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1178 + "'", int18 == 1178);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3133 + "'", int21 == 3133);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(275, 517);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 396 + "'", int12 == 396);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        int int24 = sum0.sum(443, 2783);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1613 + "'", int24 == 1613);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(486, 177);
        int int21 = sum0.sum(3405, 7809);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 663 + "'", int18 == 663);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5607 + "'", int21 == 5607);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(500, 207);
        int int21 = sum0.sum(2440, 797);
        int int24 = sum0.sum(3027, 948);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 707 + "'", int18 == 707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3237 + "'", int21 == 3237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3975 + "'", int24 == 3975);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        int int27 = sum0.sum(158, 575);
        int int30 = sum0.sum(941, 1326);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 733 + "'", int27 == 733);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2267 + "'", int30 == 2267);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(419, 536);
        int int21 = sum0.sum(1763, 1599);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3362 + "'", int21 == 3362);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(331, 136);
        int int21 = sum0.sum(1212, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 467 + "'", int18 == 467);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1212 + "'", int21 == 1212);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        int int18 = sum0.sum(365, 641);
        int int21 = sum0.sum(2296, 1217);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 503 + "'", int18 == 503);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3513 + "'", int21 == 3513);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        int int27 = sum0.sum(158, 575);
        int int30 = sum0.sum(941, 1326);
        int int33 = sum0.sum(967, 2408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 733 + "'", int27 == 733);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2267 + "'", int30 == 2267);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3375 + "'", int33 == 3375);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(2705, 289);
        int int18 = sum0.sum(406, 2044);
        int int21 = sum0.sum(1330, 421);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2994 + "'", int15 == 2994);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1225 + "'", int18 == 1225);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1751 + "'", int21 == 1751);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(119, 856);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 975 + "'", int18 == 975);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(5727, 249);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5976 + "'", int15 == 5976);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(320, 107);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 427 + "'", int18 == 427);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(36, 219);
        int int24 = sum0.sum(113, 574);
        int int27 = sum0.sum(381, 1643);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255 + "'", int21 == 255);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 687 + "'", int24 == 687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1012 + "'", int27 == 1012);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        int int33 = sum0.sum(4611, 157);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4768 + "'", int33 == 4768);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 177);
        int int18 = sum0.sum(1669, 559);
        int int21 = sum0.sum(1219, 0);
        int int24 = sum0.sum(1309, 1643);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 498 + "'", int15 == 498);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2228 + "'", int18 == 2228);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1219 + "'", int21 == 1219);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1476 + "'", int24 == 1476);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        int int33 = sum0.sum(4652, 599);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5251 + "'", int33 == 5251);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum((int) '4', 321);
        int int18 = sum0.sum(218, 585);
        int int21 = sum0.sum(1254, 1404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 373 + "'", int15 == 373);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 803 + "'", int18 == 803);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1329 + "'", int21 == 1329);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = sum0.sum(1206, 904);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2110 + "'", int15 == 2110);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(217, 192);
        int int18 = sum0.sum(2003, 1219);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 409 + "'", int15 == 409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3222 + "'", int18 == 3222);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(733, 71);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 804 + "'", int24 == 804);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(1479, 89);
        int int15 = sum0.sum(1017, 54);
        int int18 = sum0.sum(222, 6192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1071 + "'", int15 == 1071);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3207 + "'", int18 == 3207);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(0, 648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(140, 72);
        int int18 = sum0.sum(1347, 5579);
        int int21 = sum0.sum(1684, 540);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 212 + "'", int15 == 212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3463 + "'", int18 == 3463);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2224 + "'", int21 == 2224);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(975, 660);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1635 + "'", int9 == 1635);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(181, 537);
        int int24 = sum0.sum(338, 551);
        int int27 = sum0.sum(1379, 2581);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 359 + "'", int21 == 359);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 889 + "'", int24 == 889);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1980 + "'", int27 == 1980);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(0, 170);
        int int18 = sum0.sum(2757, 5623);
        int int21 = sum0.sum(3609, 4507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 85 + "'", int15 == 85);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4190 + "'", int18 == 4190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4058 + "'", int21 == 4058);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(278, 831);
        int int24 = sum0.sum(1329, 157);
        int int27 = sum0.sum(1334, 1126);
        int int30 = sum0.sum(464, 2043);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1109 + "'", int21 == 1109);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1486 + "'", int24 == 1486);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2460 + "'", int27 == 2460);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2507 + "'", int30 == 2507);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(1119, 0);
        int int24 = sum0.sum(1393, 106);
        int int27 = sum0.sum(1488, 1212);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1119 + "'", int21 == 1119);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1499 + "'", int24 == 1499);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2700 + "'", int27 == 2700);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(951, 528);
        int int21 = sum0.sum(1261, 282);
        int int24 = sum0.sum(260, 26);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1479 + "'", int18 == 1479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1543 + "'", int21 == 1543);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 286 + "'", int24 == 286);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        int int24 = sum0.sum((int) (short) 0, 815);
        int int27 = sum0.sum(1155, 1121);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 815 + "'", int24 == 815);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2276 + "'", int27 == 2276);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(353, 643);
        int int24 = sum0.sum(1091, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1091 + "'", int24 == 1091);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(312, (int) (short) 10);
        int int27 = sum0.sum(1911, 1735);
        int int30 = sum0.sum(0, 5499);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3646 + "'", int27 == 3646);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5499 + "'", int30 == 5499);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(2398, 2367);
        int int27 = sum0.sum(2398, 707);
        int int30 = sum0.sum(801, 1242);
        int int33 = sum0.sum(4432, 414);
        int int36 = sum0.sum(1467, 2757);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4765 + "'", int24 == 4765);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3105 + "'", int27 == 3105);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2043 + "'", int30 == 2043);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4846 + "'", int33 == 4846);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2112 + "'", int36 == 2112);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        int int21 = sum0.sum(208, 2267);
        int int24 = sum0.sum(412, 1178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2475 + "'", int21 == 2475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 795 + "'", int24 == 795);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(0, 242);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        int int30 = sum0.sum(951, 1527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 222 + "'", int27 == 222);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1239 + "'", int30 == 1239);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(0, 143);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 143 + "'", int21 == 143);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        int int27 = sum0.sum(485, 1);
        int int30 = sum0.sum(136, 9);
        int int33 = sum0.sum(354, 500);
        int int36 = sum0.sum(376, 4765);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 145 + "'", int30 == 145);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 427 + "'", int33 == 427);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5141 + "'", int36 == 5141);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(320, 177);
        int int24 = sum0.sum(1050, 3989);
        int int27 = sum0.sum(157, 3542);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 497 + "'", int21 == 497);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5039 + "'", int24 == 5039);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3699 + "'", int27 == 3699);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(1147, 200);
        int int21 = sum0.sum(8335, 209);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1347 + "'", int18 == 1347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8544 + "'", int21 == 8544);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        int int33 = sum0.sum(1438, 1514);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1476 + "'", int33 == 1476);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        int int12 = sum0.sum(529, 363);
        int int15 = sum0.sum(271, 553);
        int int18 = sum0.sum(0, 1326);
        int int21 = sum0.sum(335, 2360);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 892 + "'", int12 == 892);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 412 + "'", int15 == 412);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 663 + "'", int18 == 663);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2695 + "'", int21 == 2695);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        int int24 = sum0.sum(52, 1191);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 338 + "'", int21 == 338);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1243 + "'", int24 == 1243);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(975, 1261);
        int int15 = sum0.sum(1329, 2180);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1118 + "'", int12 == 1118);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3509 + "'", int15 == 3509);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(400, 169);
        int int12 = sum0.sum(0, 381);
        int int15 = sum0.sum(1167, 3966);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 569 + "'", int9 == 569);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 381 + "'", int12 == 381);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5133 + "'", int15 == 5133);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(1413, 407);
        int int21 = sum0.sum(1303, 2129);
        int int24 = sum0.sum(218, 665);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1820 + "'", int18 == 1820);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1716 + "'", int21 == 1716);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 883 + "'", int24 == 883);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(320, 177);
        int int24 = 0; // flaky: sum0.sum(252, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 497 + "'", int21 == 497);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 252 + "'", int24 == 252);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(447, 940);
        int int27 = sum0.sum(692, 779);
        int int30 = sum0.sum(1901, 1645);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1387 + "'", int24 == 1387);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1471 + "'", int27 == 1471);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3546 + "'", int30 == 3546);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(279, 4185);
        int int18 = sum0.sum(0, 1261);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2232 + "'", int15 == 2232);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1261 + "'", int18 == 1261);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(312, 1154);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 733 + "'", int18 == 733);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(335, 110);
        int int24 = sum0.sum(99, 2710);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2809 + "'", int24 == 2809);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(50, 53);
        int int27 = sum0.sum(0, 3903);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3903 + "'", int27 == 3903);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(877, 536);
        int int9 = sum0.sum(1063, 278);
        int int12 = sum0.sum(189, 3349);
        int int15 = sum0.sum(4273, 699);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1413 + "'", int6 == 1413);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1341 + "'", int9 == 1341);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1769 + "'", int12 == 1769);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4972 + "'", int15 == 4972);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        int int15 = sum0.sum(1056, 585);
        int int18 = sum0.sum(1511, 347);
        int int21 = sum0.sum(2373, 1624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1641 + "'", int15 == 1641);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1858 + "'", int18 == 1858);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3997 + "'", int21 == 3997);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(304, (int) (short) 100);
        int int18 = sum0.sum(614, 1667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 404 + "'", int15 == 404);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2281 + "'", int18 == 2281);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = 0; // flaky: sum0.sum(430, (-1));
        int int21 = sum0.sum(997, 431);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 430 + "'", int18 == 430);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1428 + "'", int21 == 1428);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(53, 106);
        int int24 = sum0.sum(668, 129);
        int int27 = sum0.sum(340, 4809);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 797 + "'", int24 == 797);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5149 + "'", int27 == 5149);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(585, 0);
        int int21 = sum0.sum(593, 847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 585 + "'", int18 == 585);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 720 + "'", int21 == 720);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        int int33 = sum0.sum(302, 200);
        int int36 = sum0.sum(1277, 320);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 502 + "'", int33 == 502);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1597 + "'", int36 == 1597);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(49, 304);
        int int18 = sum0.sum(289, 136);
        int int21 = sum0.sum(101, 246);
        int int24 = sum0.sum((int) ' ', 2463);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 353 + "'", int15 == 353);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 425 + "'", int18 == 425);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 347 + "'", int21 == 347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2495 + "'", int24 == 2495);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(109, 205);
        int int27 = sum0.sum(288, 298);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 157 + "'", int24 == 157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 293 + "'", int27 == 293);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(0, 242);
        int int27 = sum0.sum(47, 6327);
        int int30 = sum0.sum(190, 1149);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3187 + "'", int27 == 3187);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1339 + "'", int30 == 1339);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(637, 2975);
        int int24 = sum0.sum(3949, 1333);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1806 + "'", int21 == 1806);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5282 + "'", int24 == 5282);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(392, 1114);
        int int18 = sum0.sum(248, 281);
        int int21 = sum0.sum(332, 1178);
        int int24 = sum0.sum(881, 403);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 753 + "'", int15 == 753);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 529 + "'", int18 == 529);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 755 + "'", int21 == 755);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1284 + "'", int24 == 1284);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(501, 1452);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1953 + "'", int15 == 1953);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(0, 170);
        int int18 = sum0.sum(2757, 5623);
        int int21 = sum0.sum(3467, 871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 85 + "'", int15 == 85);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4190 + "'", int18 == 4190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4338 + "'", int21 == 4338);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(321, 1327);
        int int9 = sum0.sum(4210, 2792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 824 + "'", int6 == 824);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7002 + "'", int9 == 7002);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(1795, 1937);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1866 + "'", int15 == 1866);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        int int36 = sum0.sum(498, 152);
        int int39 = sum0.sum(769, 949);
        int int42 = sum0.sum(4870, 313);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 650 + "'", int36 == 650);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 859 + "'", int39 == 859);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5183 + "'", int42 == 5183);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(1319, 173);
        int int27 = sum0.sum(1389, 344);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1492 + "'", int24 == 1492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1733 + "'", int27 == 1733);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(57, 951);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 504 + "'", int15 == 504);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(741, 877);
        int int15 = sum0.sum(854, 979);
        int int18 = sum0.sum(93, 407);
        int int21 = sum0.sum(567, 2025);
        int int24 = sum0.sum(4972, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 809 + "'", int12 == 809);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1833 + "'", int15 == 1833);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1296 + "'", int21 == 1296);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4972 + "'", int24 == 4972);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(552, 856);
        int int18 = sum0.sum(1077, 135);
        int int21 = sum0.sum(143, 3635);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 704 + "'", int15 == 704);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1212 + "'", int18 == 1212);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1889 + "'", int21 == 1889);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(766, 486);
        int int24 = sum0.sum(4872, 705);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1252 + "'", int21 == 1252);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5577 + "'", int24 == 5577);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        int int15 = sum0.sum(605, 661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 633 + "'", int15 == 633);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(184, 1118);
        int int21 = sum0.sum(561, 497);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 651 + "'", int18 == 651);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1058 + "'", int21 == 1058);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 160 + "'", int15 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 472 + "'", int21 == 472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1239 + "'", int24 == 1239);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1235 + "'", int27 == 1235);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(115, 1293);
        int int24 = sum0.sum(1606, 1035);
        int int27 = sum0.sum(0, 1703);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 704 + "'", int21 == 704);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2641 + "'", int24 == 2641);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1703 + "'", int27 == 1703);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(1418, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1543 + "'", int24 == 1543);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        int int24 = sum0.sum(157, (int) (byte) 100);
        int int27 = sum0.sum(177, 303);
        int int30 = sum0.sum(1706, 753);
        int int33 = sum0.sum(5720, 2309);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 240 + "'", int27 == 240);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2459 + "'", int30 == 2459);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8029 + "'", int33 == 8029);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = 0; // flaky: sum0.sum((-1), 429);
        int int15 = sum0.sum(1020, 2518);
        int int18 = sum0.sum(2440, 802);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 214 + "'", int12 == 214);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1769 + "'", int15 == 1769);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3242 + "'", int18 == 3242);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(110, (int) (byte) 1);
        int int21 = sum0.sum(101, 175);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 138 + "'", int21 == 138);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        int int24 = sum0.sum(1118, 945);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 152 + "'", int21 == 152);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2063 + "'", int24 == 2063);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(419, 536);
        int int21 = sum0.sum(871, 558);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1429 + "'", int21 == 1429);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(552, 856);
        int int18 = sum0.sum(1077, 135);
        int int21 = sum0.sum(143, 3635);
        int int24 = sum0.sum(0, 3585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 704 + "'", int15 == 704);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1212 + "'", int18 == 1212);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1889 + "'", int21 == 1889);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3585 + "'", int24 == 3585);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1025, 215);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1240 + "'", int12 == 1240);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(761, 514);
        int int21 = sum0.sum(2698, 3635);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1275 + "'", int18 == 1275);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6333 + "'", int21 == 6333);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum(368, 160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 528 + "'", int15 == 528);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        int int30 = sum0.sum(2193, 5785);
        int int33 = sum0.sum(273, 2495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282 + "'", int24 == 282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 517 + "'", int27 == 517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3989 + "'", int30 == 3989);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1384 + "'", int33 == 1384);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum((int) ' ', 82);
        int int15 = sum0.sum(800, 1279);
        int int18 = sum0.sum(2583, 2855);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 57 + "'", int12 == 57);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2079 + "'", int15 == 2079);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2719 + "'", int18 == 2719);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(282, 1341);
        int int27 = sum0.sum(246, 1089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1623 + "'", int24 == 1623);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1335 + "'", int27 == 1335);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        int int30 = sum0.sum(940, 321);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1261 + "'", int30 == 1261);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = sum0.sum(405, (int) (short) 1);
        int int24 = sum0.sum(689, 719);
        int int27 = sum0.sum(1561, 443);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 704 + "'", int24 == 704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2004 + "'", int27 == 2004);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = 0; // flaky: sum0.sum((-1), 71);
        int int12 = sum0.sum(905, 847);
        int int15 = sum0.sum(483, 591);
        int int18 = sum0.sum(3061, 189);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1752 + "'", int12 == 1752);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3250 + "'", int18 == 3250);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(953, 373);
        int int27 = sum0.sum(412, 3187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1326 + "'", int24 == 1326);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3599 + "'", int27 == 3599);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(409, 234);
        int int27 = sum0.sum(1159, 1321);
        int int30 = sum0.sum(84, 1252);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 643 + "'", int24 == 643);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1240 + "'", int27 == 1240);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 668 + "'", int30 == 668);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(2705, 94);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2799 + "'", int24 == 2799);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(949, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum((int) (short) 10, 347);
        int int24 = sum0.sum(0, 217);
        int int27 = sum0.sum(183, 85);
        int int30 = sum0.sum(59, 2033);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 268 + "'", int27 == 268);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1046 + "'", int30 == 1046);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(0, 1543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1543 + "'", int15 == 1543);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum((int) (short) 100, 304);
        int int24 = sum0.sum(597, 339);
        int int27 = sum0.sum(498, 743);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 936 + "'", int24 == 936);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1241 + "'", int27 == 1241);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2193 + "'", int27 == 2193);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(0, 1635);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1635 + "'", int12 == 1635);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        int int33 = sum0.sum(50, 471);
        int int36 = sum0.sum(47, 354);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 521 + "'", int33 == 521);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 401 + "'", int36 == 401);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(1005, 806);
        int int21 = sum0.sum(502, 1192);
        int int24 = sum0.sum(3627, 1091);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1811 + "'", int18 == 1811);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 847 + "'", int21 == 847);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4718 + "'", int24 == 4718);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(302, 117);
        int int27 = sum0.sum(1293, 500);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1793 + "'", int27 == 1793);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(2102, 1669);
        int int24 = sum0.sum(1569, 1250);
        int int27 = sum0.sum(1636, 516);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3771 + "'", int21 == 3771);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2819 + "'", int24 == 2819);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2152 + "'", int27 == 2152);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(598, 1357);
        int int18 = sum0.sum(317, 962);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1955 + "'", int15 == 1955);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1279 + "'", int18 == 1279);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        int int36 = sum0.sum(427, 1843);
        int int39 = sum0.sum(266, 1843);
        java.lang.Class<?> wildcardClass40 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1135 + "'", int36 == 1135);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2109 + "'", int39 == 2109);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(320, 107);
        int int21 = sum0.sum(747, 157);
        int int24 = sum0.sum(1048, 2427);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 427 + "'", int18 == 427);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 904 + "'", int21 == 904);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3475 + "'", int24 == 3475);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(135, 82);
        int int24 = sum0.sum(141, 369);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 255 + "'", int24 == 255);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(1005, 1482);
        int int15 = sum0.sum(1199, 1262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2487 + "'", int12 == 2487);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2461 + "'", int15 == 2461);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(168, (int) '4');
        int int15 = sum0.sum(0, 207);
        int int18 = sum0.sum(705, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 705 + "'", int18 == 705);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(959, 1468);
        int int27 = sum0.sum(1597, 257);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2427 + "'", int24 == 2427);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1854 + "'", int27 == 1854);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(1379, 931);
        int int21 = sum0.sum(705, 504);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2310 + "'", int18 == 2310);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1209 + "'", int21 == 1209);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        int int33 = sum0.sum(936, 258);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1194 + "'", int33 == 1194);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(552, 856);
        int int18 = sum0.sum(1077, 135);
        int int21 = sum0.sum(143, 3635);
        int int24 = sum0.sum(2026, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 704 + "'", int15 == 704);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1212 + "'", int18 == 1212);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1889 + "'", int21 == 1889);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2042 + "'", int24 == 2042);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(322, 1549);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1871 + "'", int9 == 1871);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(160, 1840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(741, 877);
        int int15 = sum0.sum(854, 979);
        int int18 = sum0.sum(93, 407);
        int int21 = sum0.sum(567, 2025);
        int int24 = sum0.sum(2095, 1514);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 809 + "'", int12 == 809);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1833 + "'", int15 == 1833);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1296 + "'", int21 == 1296);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3609 + "'", int24 == 3609);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        int int30 = sum0.sum(1111, 1085);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 572 + "'", int27 == 572);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2196 + "'", int30 == 2196);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(84, 475);
        int int18 = sum0.sum(135, 142);
        int int21 = sum0.sum(76, 175);
        int int24 = sum0.sum(803, 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 559 + "'", int15 == 559);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 277 + "'", int18 == 277);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1279 + "'", int24 == 1279);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(279, 3662);
        int int27 = sum0.sum(2101, 2136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3941 + "'", int24 == 3941);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4237 + "'", int27 == 4237);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(99, 94);
        int int24 = sum0.sum(707, 245);
        int int27 = sum0.sum(2356, 2151);
        int int30 = sum0.sum(2301, 28);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 952 + "'", int24 == 952);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4507 + "'", int27 == 4507);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2329 + "'", int30 == 2329);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(592, 821);
        int int21 = sum0.sum(110, 9);
        int int24 = sum0.sum(1721, 361);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1413 + "'", int18 == 1413);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 119 + "'", int21 == 119);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2082 + "'", int24 == 2082);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        int int27 = sum0.sum(485, 1);
        int int30 = sum0.sum(136, 9);
        int int33 = sum0.sum(282, 1443);
        int int36 = sum0.sum(963, 1075);
        int int39 = sum0.sum(238, 1622);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 145 + "'", int30 == 145);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1725 + "'", int33 == 1725);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1019 + "'", int36 == 1019);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 930 + "'", int39 == 930);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(168, (int) '4');
        int int15 = sum0.sum(0, 207);
        int int18 = sum0.sum(241, 1162);
        int int21 = sum0.sum(809, 467);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1403 + "'", int18 == 1403);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1276 + "'", int21 == 1276);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        int int36 = sum0.sum(3065, 1339);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4404 + "'", int36 == 4404);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = sum0.sum(2530, 481);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3011 + "'", int21 == 3011);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(1491, 3175);
        int int9 = sum0.sum(392, 345);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2333 + "'", int6 == 2333);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 737 + "'", int9 == 737);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(189, 536);
        int int18 = sum0.sum(979, 30);
        int int21 = sum0.sum(1646, 884);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 725 + "'", int15 == 725);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1009 + "'", int18 == 1009);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2530 + "'", int21 == 2530);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(0, 174);
        int int21 = sum0.sum(2033, 201);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2234 + "'", int21 == 2234);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        int int36 = sum0.sum(650, 719);
        int int39 = sum0.sum(1261, 1716);
        java.lang.Class<?> wildcardClass40 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1369 + "'", int36 == 1369);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2977 + "'", int39 == 2977);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(135, 63);
        int int12 = sum0.sum(31, (int) ' ');
        int int15 = sum0.sum(444, 215);
        int int18 = sum0.sum(560, 3345);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 198 + "'", int9 == 198);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 659 + "'", int15 == 659);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3905 + "'", int18 == 3905);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(83, 959);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 521 + "'", int15 == 521);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum(733, 4058);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4791 + "'", int21 == 4791);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(1557, 515);
        int int24 = sum0.sum(1206, 481);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2072 + "'", int21 == 2072);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1687 + "'", int24 == 1687);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(139, 665);
        int int27 = sum0.sum(425, 2193);
        int int30 = sum0.sum(1025, 1025);
        int int33 = sum0.sum(0, 181);
        int int36 = sum0.sum(2461, 2789);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 402 + "'", int24 == 402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1309 + "'", int27 == 1309);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1025 + "'", int30 == 1025);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 181 + "'", int33 == 181);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2625 + "'", int36 == 2625);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(45, 100);
        int int18 = sum0.sum(2224, 1339);
        int int21 = sum0.sum(0, 273);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145 + "'", int15 == 145);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3563 + "'", int18 == 3563);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 273 + "'", int21 == 273);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        int int30 = sum0.sum(1757, 195);
        int int33 = sum0.sum(111, 476);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1952 + "'", int30 == 1952);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 587 + "'", int33 == 587);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(1492, 1573);
        int int24 = sum0.sum(2040, 1233);
        int int27 = sum0.sum(761, 641);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3065 + "'", int21 == 3065);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3273 + "'", int24 == 3273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1402 + "'", int27 == 1402);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        int int33 = sum0.sum(240, 1625);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1865 + "'", int33 == 1865);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(516, 1233);
        int int24 = sum0.sum(184, 1322);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 753 + "'", int24 == 753);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(220, 99);
        int int18 = sum0.sum(319, 1735);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 319 + "'", int15 == 319);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1027 + "'", int18 == 1027);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(585, 5976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6561 + "'", int24 == 6561);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum(245, (-1));
        int int15 = sum0.sum(1488, 493);
        int int18 = sum0.sum(899, 909);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1981 + "'", int15 == 1981);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 904 + "'", int18 == 904);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(302, 117);
        int int27 = sum0.sum(1293, 500);
        int int30 = sum0.sum(1339, 2074);
        int int33 = sum0.sum(1452, 2043);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1793 + "'", int27 == 1793);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3413 + "'", int30 == 3413);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3495 + "'", int33 == 3495);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(353, 292);
        int int27 = sum0.sum(618, 981);
        int int30 = sum0.sum(1393, 171);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 645 + "'", int24 == 645);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1599 + "'", int27 == 1599);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1564 + "'", int30 == 1564);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(438, 0);
        int int18 = sum0.sum(1109, 241);
        int int21 = sum0.sum(2530, 1185);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438 + "'", int15 == 438);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1350 + "'", int18 == 1350);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3715 + "'", int21 == 3715);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(76, 345);
        int int12 = sum0.sum(3467, 1868);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 421 + "'", int9 == 421);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5335 + "'", int12 == 5335);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(57, 951);
        int int18 = sum0.sum(1953, 1452);
        int int21 = sum0.sum(3815, 3229);
        int int24 = sum0.sum(1569, 782);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 504 + "'", int15 == 504);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3405 + "'", int18 == 3405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7044 + "'", int21 == 7044);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2351 + "'", int24 == 2351);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(252, 92);
        int int12 = sum0.sum(327, 0);
        int int15 = sum0.sum(725, 973);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 344 + "'", int9 == 344);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 849 + "'", int15 == 849);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(26, 500);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(741, 877);
        int int15 = sum0.sum(854, 979);
        int int18 = sum0.sum(93, 407);
        int int21 = sum0.sum(632, 396);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 809 + "'", int12 == 809);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1833 + "'", int15 == 1833);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1028 + "'", int21 == 1028);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(172, 320);
        int int18 = sum0.sum(1418, 1474);
        int int21 = sum0.sum(1527, 575);
        int int24 = sum0.sum(2719, 1362);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 246 + "'", int15 == 246);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1446 + "'", int18 == 1446);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2102 + "'", int21 == 2102);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4081 + "'", int24 == 4081);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(725, 2276);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3001 + "'", int15 == 3001);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(1569, 0);
        int int27 = sum0.sum(6459, 673);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7132 + "'", int27 == 7132);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(208, 35);
        int int12 = sum0.sum(3589, 6459);
        int int15 = sum0.sum(5636, 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 243 + "'", int9 == 243);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5024 + "'", int12 == 5024);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5785 + "'", int15 == 5785);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(1131, 703);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1834 + "'", int15 == 1834);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(85, 158);
        int int27 = sum0.sum(2026, 141);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 243 + "'", int24 == 243);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2167 + "'", int27 == 2167);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(135, 1613);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 874 + "'", int18 == 874);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(170, 125);
        int int24 = sum0.sum(1179, 1849);
        int int27 = sum0.sum(104, 395);
        int int30 = sum0.sum(3345, 230);
        int int33 = sum0.sum(1735, 142);
        int int36 = sum0.sum(1319, 515);
        int int39 = sum0.sum(129, 623);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1514 + "'", int24 == 1514);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 499 + "'", int27 == 499);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3575 + "'", int30 == 3575);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1877 + "'", int33 == 1877);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1834 + "'", int36 == 1834);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 376 + "'", int39 == 376);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        int int21 = sum0.sum(159, 89);
        int int24 = sum0.sum(140, 691);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 248 + "'", int21 == 248);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 831 + "'", int24 == 831);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(1093, 113);
        int int21 = sum0.sum(2168, 2698);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1206 + "'", int18 == 1206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2433 + "'", int21 == 2433);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(244, 1995);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2239 + "'", int21 == 2239);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(769, 939);
        int int24 = sum0.sum(747, 85);
        int int27 = sum0.sum(5165, 300);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854 + "'", int21 == 854);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 832 + "'", int24 == 832);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5465 + "'", int27 == 5465);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum((int) (short) 1, 89);
        int int21 = sum0.sum(3413, 1667);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5080 + "'", int21 == 5080);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(353, 157);
        int int18 = sum0.sum(5541, 707);
        int int21 = sum0.sum(285, 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 510 + "'", int15 == 510);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6248 + "'", int18 == 6248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 627 + "'", int21 == 627);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(0, 103);
        int int18 = sum0.sum(142, 1103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1245 + "'", int18 == 1245);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = sum0.sum(569, 91);
        int int18 = sum0.sum(340, 2572);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 660 + "'", int15 == 660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1456 + "'", int18 == 1456);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        int int24 = sum0.sum(2019, 809);
        int int27 = sum0.sum(2044, 1535);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2828 + "'", int24 == 2828);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3579 + "'", int27 == 3579);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(84, 475);
        int int18 = sum0.sum(3687, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 559 + "'", int15 == 559);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3687 + "'", int18 == 3687);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        int int12 = sum0.sum(0, 1120);
        int int15 = sum0.sum(0, 1199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 560 + "'", int12 == 560);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1199 + "'", int15 == 1199);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(747, (int) (short) -1);
        int int18 = sum0.sum(1878, 30);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 747 + "'", int15 == 747);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1908 + "'", int18 == 1908);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        int int30 = sum0.sum(149, 63);
        int int33 = sum0.sum(904, 341);
        int int36 = sum0.sum(831, (int) '#');
        int int39 = sum0.sum(397, 142);
        int int42 = sum0.sum(1149, 1833);
        java.lang.Class<?> wildcardClass43 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 400 + "'", int27 == 400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 212 + "'", int30 == 212);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1245 + "'", int33 == 1245);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 866 + "'", int36 == 866);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 539 + "'", int39 == 539);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1491 + "'", int42 == 1491);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(1499, 258);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1757 + "'", int18 == 1757);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(129, 271);
        int int12 = sum0.sum(496, 2398);
        int int15 = sum0.sum(1939, 338);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1447 + "'", int12 == 1447);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2277 + "'", int15 == 2277);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        int int33 = sum0.sum(2647, 1869);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4516 + "'", int33 == 4516);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(306, 1083);
        int int24 = sum0.sum(178, 728);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1389 + "'", int21 == 1389);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        int int21 = sum0.sum(1119, 0);
        int int24 = sum0.sum(438, 998);
        int int27 = sum0.sum(1667, 1261);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1119 + "'", int21 == 1119);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 718 + "'", int24 == 718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2928 + "'", int27 == 2928);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        int int30 = sum0.sum(329, 2344);
        int int33 = sum0.sum(3887, 376);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2673 + "'", int30 == 2673);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4263 + "'", int33 == 4263);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(951, 1178);
        int int21 = sum0.sum(2496, 296);
        int int24 = sum0.sum(944, 648);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2129 + "'", int18 == 2129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2792 + "'", int21 == 2792);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1592 + "'", int24 == 1592);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(1504, 1469);
        int int24 = sum0.sum(6523, 1286);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2973 + "'", int21 == 2973);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7809 + "'", int24 == 7809);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        int int18 = sum0.sum(349, 53);
        int int21 = sum0.sum(421, 1613);
        int int24 = sum0.sum(206, 98);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1668 + "'", int15 == 1668);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1017 + "'", int21 == 1017);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 304 + "'", int24 == 304);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum((int) (short) 100, 304);
        int int24 = sum0.sum(3757, 514);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4271 + "'", int24 == 4271);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(711, 271);
        int int27 = sum0.sum(720, 1553);
        int int30 = sum0.sum(2804, 1047);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 982 + "'", int24 == 982);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2273 + "'", int27 == 2273);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3851 + "'", int30 == 3851);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(84, 93);
        int int21 = sum0.sum(97, 408);
        int int24 = sum0.sum(561, 1721);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 177 + "'", int18 == 177);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 505 + "'", int21 == 505);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1141 + "'", int24 == 1141);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        int int30 = sum0.sum(149, 63);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 212 + "'", int30 == 212);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        int int24 = sum0.sum(5794, 729);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 338 + "'", int21 == 338);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6523 + "'", int24 == 6523);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(355, 1787);
        int int15 = sum0.sum(1588, 349);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1071 + "'", int12 == 1071);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1937 + "'", int15 == 1937);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(130, 1120);
        int int27 = sum0.sum(1283, 2301);
        int int30 = sum0.sum(0, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 625 + "'", int24 == 625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1792 + "'", int27 == 1792);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        int int9 = sum0.sum(1193, 1242);
        int int12 = sum0.sum(281, 6589);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2435 + "'", int9 == 2435);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3435 + "'", int12 == 3435);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 177);
        int int18 = sum0.sum(1669, 559);
        int int21 = sum0.sum(3941, 67);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 498 + "'", int15 == 498);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2228 + "'", int18 == 2228);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4008 + "'", int21 == 4008);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(45, 100);
        int int18 = sum0.sum(2224, 1339);
        int int21 = sum0.sum(336, 2530);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145 + "'", int15 == 145);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3563 + "'", int18 == 3563);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1433 + "'", int21 == 1433);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(1323, 321);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1644 + "'", int21 == 1644);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(719, 295);
        int int24 = sum0.sum(84, 331);
        int int27 = sum0.sum(3575, 821);
        int int30 = sum0.sum(5623, 658);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1014 + "'", int21 == 1014);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 415 + "'", int24 == 415);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4396 + "'", int27 == 4396);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6281 + "'", int30 == 6281);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(414, 591);
        int int24 = sum0.sum(500, 97);
        int int27 = sum0.sum(805, 107);
        int int30 = sum0.sum(856, 218);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1005 + "'", int21 == 1005);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 597 + "'", int24 == 597);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 912 + "'", int27 == 912);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1074 + "'", int30 == 1074);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        int int18 = sum0.sum(606, 93);
        int int21 = sum0.sum(313, 589);
        int int24 = sum0.sum(5595, 1095);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 699 + "'", int18 == 699);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 451 + "'", int21 == 451);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6690 + "'", int24 == 6690);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(172, 320);
        int int18 = sum0.sum(208, 905);
        int int21 = sum0.sum(801, 185);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 246 + "'", int15 == 246);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1113 + "'", int18 == 1113);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 986 + "'", int21 == 986);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(1849, 436);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2285 + "'", int12 == 2285);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(1403, 406);
        int int18 = sum0.sum(572, 1624);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1809 + "'", int15 == 1809);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1098 + "'", int18 == 1098);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(282, 1341);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1623 + "'", int24 == 1623);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(1063, 92);
        int int30 = sum0.sum(1525, 4237);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1155 + "'", int27 == 1155);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2881 + "'", int30 == 2881);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        int int33 = sum0.sum(3099, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3099 + "'", int33 == 3099);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        int int33 = sum0.sum(3474, 4031);
        int int36 = sum0.sum(862, 476);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7505 + "'", int33 == 7505);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1338 + "'", int36 == 1338);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        int int36 = sum0.sum(86, 0);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 86 + "'", int36 == 86);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(320, 321);
        int int27 = sum0.sum(4087, 278);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 641 + "'", int24 == 641);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4365 + "'", int27 == 4365);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(400, 2769);
        int int27 = sum0.sum(472, 800);
        int int30 = sum0.sum(304, 1239);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3169 + "'", int24 == 3169);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 636 + "'", int27 == 636);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1543 + "'", int30 == 1543);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(940, 557);
        int int12 = sum0.sum(4625, 562);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1497 + "'", int9 == 1497);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5187 + "'", int12 == 5187);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        int int12 = sum0.sum(529, 363);
        int int15 = sum0.sum(4293, 1492);
        int int18 = sum0.sum(5512, 769);
        int int21 = sum0.sum(229, 609);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 892 + "'", int12 == 892);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5785 + "'", int15 == 5785);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6281 + "'", int18 == 6281);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 419 + "'", int21 == 419);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(310, 384);
        int int21 = sum0.sum(361, 522);
        int int24 = sum0.sum(1625, 1187);
        int int27 = sum0.sum(1945, 380);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 347 + "'", int18 == 347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 883 + "'", int21 == 883);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2812 + "'", int24 == 2812);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2325 + "'", int27 == 2325);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(359, 228);
        int int18 = sum0.sum(929, 249);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 587 + "'", int15 == 587);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1178 + "'", int18 == 1178);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(77, 443);
        int int9 = sum0.sum(25, 587);
        int int12 = sum0.sum(317, 205);
        int int15 = sum0.sum(584, 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 306 + "'", int9 == 306);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 522 + "'", int12 == 522);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(0, 1327);
        int int30 = sum0.sum(779, 703);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1327 + "'", int27 == 1327);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1482 + "'", int30 == 1482);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(2915, 807);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3722 + "'", int15 == 3722);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(510, 4908);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2709 + "'", int18 == 2709);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(1279, 3546);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4825 + "'", int15 == 4825);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        int int24 = sum0.sum(192, 908);
        int int27 = sum0.sum((int) (byte) 100, 1494);
        int int30 = sum0.sum(2619, 3105);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 338 + "'", int21 == 338);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 550 + "'", int24 == 550);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 797 + "'", int27 == 797);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2862 + "'", int30 == 2862);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(585, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 585 + "'", int18 == 585);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1970, 533);
        int int12 = sum0.sum(3916, 1866);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2503 + "'", int9 == 2503);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5782 + "'", int12 == 5782);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(49, 304);
        int int18 = sum0.sum(289, 136);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 353 + "'", int15 == 353);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 425 + "'", int18 == 425);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(511, 139);
        int int27 = sum0.sum(0, 1291);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1291 + "'", int27 == 1291);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(562, 1216);
        int int18 = sum0.sum(804, 5785);
        int int21 = sum0.sum(1179, 627);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 889 + "'", int15 == 889);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6589 + "'", int18 == 6589);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1806 + "'", int21 == 1806);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(511, 139);
        int int27 = sum0.sum(540, 1553);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 650 + "'", int24 == 650);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2093 + "'", int27 == 2093);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(218, 246);
        int int15 = sum0.sum(0, 908);
        int int18 = sum0.sum(1665, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 454 + "'", int15 == 454);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1742 + "'", int18 == 1742);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        int int18 = sum0.sum(485, 1);
        int int21 = sum0.sum(744, 197);
        int int24 = sum0.sum(728, 185);
        int int27 = sum0.sum(839, 3914);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 486 + "'", int18 == 486);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 941 + "'", int21 == 941);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 913 + "'", int24 == 913);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4753 + "'", int27 == 4753);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(959, 1468);
        int int27 = sum0.sum(413, 47);
        int int30 = sum0.sum(3650, 192);
        int int33 = sum0.sum(704, 103);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2427 + "'", int24 == 2427);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 460 + "'", int27 == 460);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3842 + "'", int30 == 3842);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 807 + "'", int33 == 807);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum(245, (-1));
        int int15 = sum0.sum(2224, 650);
        int int18 = sum0.sum(1622, 100);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2874 + "'", int15 == 2874);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1722 + "'", int18 == 1722);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(0, 49);
        int int24 = sum0.sum(402, 84);
        int int27 = sum0.sum(2167, 1512);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 486 + "'", int24 == 486);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3679 + "'", int27 == 3679);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(516, 1233);
        int int24 = sum0.sum(184, 1322);
        int int27 = sum0.sum(5976, 1350);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 753 + "'", int24 == 753);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7326 + "'", int27 == 7326);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(49, 335);
        int int24 = sum0.sum(1261, 1242);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 192 + "'", int21 == 192);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2503 + "'", int24 == 2503);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        int int12 = sum0.sum(1029, 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1782 + "'", int12 == 1782);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        int int27 = sum0.sum(2028, 1334);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3362 + "'", int27 == 3362);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(304, (int) (short) 100);
        int int18 = sum0.sum(741, 1759);
        int int21 = sum0.sum(464, 826);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 404 + "'", int15 == 404);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1250 + "'", int18 == 1250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 645 + "'", int21 == 645);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(347, 787);
        int int15 = sum0.sum(2613, 4103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3358 + "'", int15 == 3358);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(335, 202);
        int int18 = sum0.sum(275, 1569);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 922 + "'", int18 == 922);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(189, 979);
        int int21 = sum0.sum(1387, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 584 + "'", int18 == 584);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1387 + "'", int21 == 1387);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(421, 4293);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2357 + "'", int15 == 2357);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(719, (int) (byte) 0);
        int int21 = sum0.sum(312, 1133);
        int int24 = sum0.sum(720, 1418);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 719 + "'", int18 == 719);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445 + "'", int21 == 1445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1069 + "'", int24 == 1069);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        int int18 = sum0.sum(155, (int) (byte) 0);
        int int21 = sum0.sum(127, 107);
        int int24 = sum0.sum(541, 3093);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234 + "'", int21 == 234);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1817 + "'", int24 == 1817);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(336, 575);
        int int24 = sum0.sum(3187, 342);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 911 + "'", int21 == 911);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3529 + "'", int24 == 3529);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(645, (int) (short) 0);
        int int15 = sum0.sum(2632, 981);
        int int18 = sum0.sum(193, 1793);
        int int21 = sum0.sum(249, 1229);
        int int24 = sum0.sum(540, 3929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 645 + "'", int12 == 645);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3613 + "'", int15 == 3613);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 993 + "'", int18 == 993);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 739 + "'", int21 == 739);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4469 + "'", int24 == 4469);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(2253, 729);
        int int21 = sum0.sum(2497, 1149);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2982 + "'", int18 == 2982);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3646 + "'", int21 == 3646);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(262, 1474);
        int int27 = sum0.sum(359, 1303);
        int int30 = sum0.sum(1866, 479);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 868 + "'", int24 == 868);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 831 + "'", int27 == 831);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2345 + "'", int30 == 2345);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(497, 219);
        int int15 = sum0.sum(0, 939);
        int int18 = sum0.sum(0, 908);
        int int21 = sum0.sum(3563, 4854);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 716 + "'", int12 == 716);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 939 + "'", int15 == 939);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 454 + "'", int18 == 454);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8417 + "'", int21 == 8417);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(562, 203);
        int int21 = sum0.sum(302, 962);
        int int24 = sum0.sum(528, 273);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 632 + "'", int21 == 632);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 801 + "'", int24 == 801);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(2398, 2367);
        int int27 = sum0.sum(2398, 707);
        int int30 = sum0.sum(801, 1242);
        int int33 = sum0.sum(4432, 414);
        int int36 = sum0.sum(4473, 536);
        int int39 = sum0.sum(1027, 1597);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4765 + "'", int24 == 4765);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3105 + "'", int27 == 3105);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2043 + "'", int30 == 2043);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4846 + "'", int33 == 4846);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5009 + "'", int36 == 5009);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1312 + "'", int39 == 1312);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(76, 345);
        int int12 = sum0.sum(702, 273);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 421 + "'", int9 == 421);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 975 + "'", int12 == 975);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(252, 92);
        int int12 = sum0.sum(327, 0);
        int int15 = sum0.sum(262, 271);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 344 + "'", int9 == 344);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 533 + "'", int15 == 533);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(320, 177);
        int int24 = sum0.sum(1050, 3989);
        int int27 = sum0.sum(1295, 4903);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 497 + "'", int21 == 497);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5039 + "'", int24 == 5039);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3099 + "'", int27 == 3099);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(414, 591);
        int int24 = sum0.sum(500, 97);
        int int27 = sum0.sum(1636, 959);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1005 + "'", int21 == 1005);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 597 + "'", int24 == 597);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2595 + "'", int27 == 2595);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(400, 192);
        int int21 = sum0.sum(572, 1735);
        int int24 = sum0.sum(1981, 789);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2307 + "'", int21 == 2307);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2770 + "'", int24 == 2770);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1970, 533);
        int int12 = sum0.sum(1469, 1641);
        int int15 = sum0.sum(665, 855);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2503 + "'", int9 == 2503);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1555 + "'", int12 == 1555);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 760 + "'", int15 == 760);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(83, 959);
        int int18 = sum0.sum(1018, 369);
        int int21 = sum0.sum(195, 4665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 521 + "'", int15 == 521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1387 + "'", int18 == 1387);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2430 + "'", int21 == 2430);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(427, (int) '4');
        int int18 = sum0.sum(1492, 475);
        int int21 = sum0.sum(1759, 479);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 479 + "'", int15 == 479);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1967 + "'", int18 == 1967);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2238 + "'", int21 == 2238);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(498, 532);
        int int12 = sum0.sum(495, 1167);
        int int15 = sum0.sum(1250, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 515 + "'", int9 == 515);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 831 + "'", int12 == 831);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1250 + "'", int15 == 1250);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(335, 202);
        int int18 = sum0.sum(261, 447);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 354 + "'", int18 == 354);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(1379, 931);
        int int21 = sum0.sum(705, 504);
        int int24 = sum0.sum(1241, 2307);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2310 + "'", int18 == 2310);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1209 + "'", int21 == 1209);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1774 + "'", int24 == 1774);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        int int9 = sum0.sum(1193, 1242);
        int int12 = sum0.sum(1668, 839);
        int int15 = sum0.sum(0, 4875);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2435 + "'", int9 == 2435);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2507 + "'", int12 == 2507);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4875 + "'", int15 == 4875);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum((int) '4', 321);
        int int18 = sum0.sum(615, 1309);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 373 + "'", int15 == 373);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 962 + "'", int18 == 962);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(208, 173);
        int int21 = sum0.sum(2378, 537);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 381 + "'", int18 == 381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2915 + "'", int21 == 2915);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(207, 384);
        int int18 = sum0.sum(2739, 2435);
        int int21 = sum0.sum(212, 1188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 591 + "'", int15 == 591);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5174 + "'", int18 == 5174);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 700 + "'", int21 == 700);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(26, 500);
        int int21 = sum0.sum(986, 883);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1869 + "'", int21 == 1869);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        int int33 = sum0.sum(721, 5623);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3172 + "'", int33 == 3172);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = sum0.sum(891, 591);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1482 + "'", int12 == 1482);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1970, 533);
        int int12 = sum0.sum(343, 3257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2503 + "'", int9 == 2503);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(48, 82);
        int int27 = sum0.sum(2136, 702);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65 + "'", int24 == 65);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2838 + "'", int27 == 2838);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(711, 292);
        int int21 = sum0.sum(210, 1187);
        int int24 = sum0.sum(750, 6327);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1397 + "'", int21 == 1397);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7077 + "'", int24 == 7077);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(618, 183);
        int int21 = sum0.sum(380, 1362);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 801 + "'", int18 == 801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 871 + "'", int21 == 871);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(414, 591);
        int int24 = sum0.sum(500, 97);
        int int27 = sum0.sum(805, 107);
        int int30 = sum0.sum(472, 1042);
        int int33 = sum0.sum(905, 360);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1005 + "'", int21 == 1005);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 597 + "'", int24 == 597);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 912 + "'", int27 == 912);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 757 + "'", int30 == 757);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1265 + "'", int33 == 1265);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(3757, 1326);
        int int12 = sum0.sum(536, 140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5083 + "'", int9 == 5083);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 676 + "'", int12 == 676);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) 'a', 72);
        int int21 = sum0.sum(251, 155);
        int int24 = sum0.sum(99, 1178);
        int int27 = sum0.sum(1780, 1469);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 169 + "'", int18 == 169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1277 + "'", int24 == 1277);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3249 + "'", int27 == 3249);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(184, 1118);
        int int21 = sum0.sum(184, 393);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 651 + "'", int18 == 651);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 577 + "'", int21 == 577);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(48, 479);
        int int15 = sum0.sum(442, 1298);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 527 + "'", int12 == 527);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 870 + "'", int15 == 870);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(115, 1293);
        int int24 = sum0.sum(1606, 1035);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 704 + "'", int21 == 704);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2641 + "'", int24 == 2641);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        int int24 = sum0.sum(2665, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2665 + "'", int24 == 2665);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        int int30 = sum0.sum(1327, 1245);
        int int33 = sum0.sum(4269, 380);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419 + "'", int24 == 419);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1548 + "'", int27 == 1548);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2572 + "'", int30 == 2572);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4649 + "'", int33 == 4649);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(166, 0);
        int int24 = sum0.sum(2276, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 166 + "'", int21 == 166);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2276 + "'", int24 == 2276);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(67, 487);
        int int24 = sum0.sum(1265, 2446);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3711 + "'", int24 == 3711);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(400, 145);
        int int24 = sum0.sum(2267, 145);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 545 + "'", int21 == 545);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2412 + "'", int24 == 2412);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(306, 1083);
        int int24 = sum0.sum(178, 728);
        int int27 = sum0.sum(1044, 4396);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1389 + "'", int21 == 1389);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2720 + "'", int27 == 2720);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        int int21 = sum0.sum(208, 2267);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2475 + "'", int21 == 2475);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(229, 71);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 300 + "'", int15 == 300);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(500, (int) (short) 10);
        int int15 = sum0.sum(479, 637);
        int int18 = sum0.sum(42, 934);
        int int21 = sum0.sum(2135, 1014);
        int int24 = sum0.sum(1193, 71);
        int int27 = sum0.sum(1547, 400);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 510 + "'", int12 == 510);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 558 + "'", int15 == 558);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 488 + "'", int18 == 488);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3149 + "'", int21 == 3149);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1264 + "'", int24 == 1264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1947 + "'", int27 == 1947);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(949, 0);
        int int18 = sum0.sum(245, 1303);
        int int21 = sum0.sum(5595, 3989);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 774 + "'", int18 == 774);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9584 + "'", int21 == 9584);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(195, 117);
        int int30 = sum0.sum(1, 712);
        int int33 = sum0.sum(291, 1343);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 312 + "'", int27 == 312);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 713 + "'", int30 == 713);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 817 + "'", int33 == 817);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(312, (int) (short) 10);
        int int27 = sum0.sum(1911, 1735);
        int int30 = sum0.sum(2003, 3339);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3646 + "'", int27 == 3646);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2671 + "'", int30 == 2671);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1403, 643);
        int int15 = sum0.sum(5976, 709);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2046 + "'", int12 == 2046);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6685 + "'", int15 == 6685);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(2253, 729);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2982 + "'", int18 == 2982);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(240, 726);
        int int24 = sum0.sum(1194, 320);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1514 + "'", int24 == 1514);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 522 + "'", int27 == 522);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = sum0.sum(569, 91);
        int int18 = sum0.sum(0, 136);
        int int21 = sum0.sum(4845, 1885);
        int int24 = sum0.sum(1289, 1469);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 660 + "'", int15 == 660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 68 + "'", int18 == 68);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6730 + "'", int21 == 6730);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = 0; // flaky: sum0.sum(448, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 448 + "'", int12 == 448);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(2196, 448);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2644 + "'", int24 == 2644);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = sum0.sum(231, 510);
        int int15 = sum0.sum(217, 444);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 661 + "'", int15 == 661);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(392, 1114);
        int int18 = sum0.sum(248, 281);
        int int21 = sum0.sum(941, 2757);
        int int24 = sum0.sum(2168, 362);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 753 + "'", int15 == 753);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 529 + "'", int18 == 529);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1849 + "'", int21 == 1849);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2530 + "'", int24 == 2530);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(726, 423);
        int int27 = sum0.sum(0, 113);
        int int30 = sum0.sum((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 689 + "'", int21 == 689);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1149 + "'", int24 == 1149);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 113 + "'", int27 == 113);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        int int36 = sum0.sum(1684, 1119);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2803 + "'", int36 == 2803);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(1393, 1240);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2633 + "'", int18 == 2633);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(177, 929);
        int int15 = sum0.sum(329, 1103);
        int int18 = sum0.sum(446, 956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 553 + "'", int12 == 553);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 716 + "'", int15 == 716);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 701 + "'", int18 == 701);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(1276, 281);
        int int27 = sum0.sum(3040, 447);
        int int30 = sum0.sum(1623, 1093);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1557 + "'", int24 == 1557);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3487 + "'", int27 == 3487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2716 + "'", int30 == 2716);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        int int30 = sum0.sum(430, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 547 + "'", int21 == 547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5512 + "'", int27 == 5512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 493 + "'", int30 == 493);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(2661, 139);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2800 + "'", int24 == 2800);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(952, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 952 + "'", int21 == 952);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(0, 206);
        int int21 = sum0.sum(1063, 86);
        int int24 = sum0.sum(0, 987);
        int int27 = sum0.sum(0, 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1149 + "'", int21 == 1149);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 987 + "'", int24 == 987);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(0, 245);
        int int21 = sum0.sum(633, 657);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 645 + "'", int21 == 645);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        int int30 = sum0.sum(562, 4503);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 231 + "'", int24 == 231);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 119 + "'", int27 == 119);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5065 + "'", int30 == 5065);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(3757, 1326);
        int int12 = sum0.sum(212, 252);
        int int15 = sum0.sum(1682, 1058);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5083 + "'", int9 == 5083);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2740 + "'", int15 == 2740);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(599, 1014);
        int int21 = sum0.sum(2435, 184);
        int int24 = sum0.sum(1151, 630);
        int int27 = sum0.sum(1723, 707);
        int int30 = sum0.sum(113, 1095);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1613 + "'", int18 == 1613);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2619 + "'", int21 == 2619);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1781 + "'", int24 == 1781);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2430 + "'", int27 == 2430);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 604 + "'", int30 == 604);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(549, 0);
        int int27 = sum0.sum(185, 3474);
        int int30 = sum0.sum(998, 737);
        int int33 = sum0.sum(1343, 506);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 549 + "'", int24 == 549);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3659 + "'", int27 == 3659);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1735 + "'", int30 == 1735);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1849 + "'", int33 == 1849);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(190, 178);
        int int27 = sum0.sum(42, 311);
        int int30 = sum0.sum(2452, 362);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 368 + "'", int24 == 368);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 353 + "'", int27 == 353);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2814 + "'", int30 == 2814);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        int int30 = sum0.sum(1126, 2989);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 248 + "'", int27 == 248);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4115 + "'", int30 == 4115);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(400, 145);
        int int24 = sum0.sum(1247, 1561);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 545 + "'", int21 == 545);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1404 + "'", int24 == 1404);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(130, 1120);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 625 + "'", int24 == 625);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(177, 929);
        int int15 = sum0.sum(329, 1103);
        int int18 = sum0.sum(8417, 510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 553 + "'", int12 == 553);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 716 + "'", int15 == 716);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8927 + "'", int18 == 8927);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(2705, 94);
        int int27 = sum0.sum(338, 809);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2799 + "'", int24 == 2799);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1147 + "'", int27 == 1147);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(48, 479);
        int int15 = sum0.sum(725, 988);
        int int18 = sum0.sum(1077, 1889);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 527 + "'", int12 == 527);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1713 + "'", int15 == 1713);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1483 + "'", int18 == 1483);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(1151, 597);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1748 + "'", int21 == 1748);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(306, 1083);
        int int24 = sum0.sum(178, 728);
        int int27 = sum0.sum(1056, 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1389 + "'", int21 == 1389);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1056 + "'", int27 == 1056);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(955, 510);
        int int15 = sum0.sum(1011, (int) 'a');
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1465 + "'", int12 == 1465);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(279, 4185);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2232 + "'", int15 == 2232);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(115, 1293);
        int int24 = sum0.sum(1238, 2515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 704 + "'", int21 == 704);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3753 + "'", int24 == 3753);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(2072, 3250);
        int int24 = sum0.sum(2804, 170);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2661 + "'", int21 == 2661);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2974 + "'", int24 == 2974);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        int int27 = sum0.sum(485, 1);
        int int30 = sum0.sum(136, 9);
        int int33 = sum0.sum(1083, 2241);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 145 + "'", int30 == 145);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1662 + "'", int33 == 1662);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(561, 821);
        int int21 = sum0.sum(430, 47);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 691 + "'", int18 == 691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 477 + "'", int21 == 477);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(3364, 688);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4052 + "'", int15 == 4052);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(261, 164);
        int int18 = sum0.sum(1729, 2505);
        int int21 = sum0.sum(1823, 3997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 425 + "'", int15 == 425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2117 + "'", int18 == 2117);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2910 + "'", int21 == 2910);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        int int18 = sum0.sum(155, (int) (byte) 0);
        int int21 = sum0.sum(1130, 2819);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3949 + "'", int21 == 3949);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(959, 1468);
        int int27 = sum0.sum(413, 47);
        int int30 = sum0.sum(1321, 2505);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2427 + "'", int24 == 2427);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 460 + "'", int27 == 460);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1913 + "'", int30 == 1913);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        int int21 = sum0.sum(2463, 162);
        int int24 = sum0.sum(707, 496);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2625 + "'", int21 == 2625);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1203 + "'", int24 == 1203);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(929, 409);
        int int21 = sum0.sum(687, 1823);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1338 + "'", int18 == 1338);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1255 + "'", int21 == 1255);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(1413, 303);
        int int12 = sum0.sum(775, 246);
        int int15 = sum0.sum(0, 2156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1716 + "'", int9 == 1716);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1021 + "'", int12 == 1021);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1078 + "'", int15 == 1078);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(304, 591);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 895 + "'", int21 == 895);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(384, 809);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1193 + "'", int6 == 1193);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(768, 2047);
        int int18 = sum0.sum(3449, 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2815 + "'", int15 == 2815);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3993 + "'", int18 == 3993);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(498, 207);
        int int21 = sum0.sum(249, 300);
        int int24 = sum0.sum(1644, 189);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 705 + "'", int18 == 705);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 549 + "'", int21 == 549);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1833 + "'", int24 == 1833);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(47, 335);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(702, 677);
        int int21 = sum0.sum(1084, 883);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1379 + "'", int18 == 1379);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1967 + "'", int21 == 1967);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(171, 953);
        int int15 = sum0.sum(522, 677);
        int int18 = sum0.sum(998, 3111);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 562 + "'", int12 == 562);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1199 + "'", int15 == 1199);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4109 + "'", int18 == 4109);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = 0; // flaky: sum0.sum((-1), 429);
        int int15 = sum0.sum(1501, 145);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 214 + "'", int12 == 214);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1646 + "'", int15 == 1646);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(116, 689);
        int int15 = sum0.sum(189, 536);
        int int18 = sum0.sum(4, 241);
        int int21 = sum0.sum(120, 715);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 805 + "'", int12 == 805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 725 + "'", int15 == 725);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 835 + "'", int21 == 835);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');
        int int15 = sum0.sum(358, 415);
        int int18 = sum0.sum(1027, 4063);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 773 + "'", int15 == 773);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2545 + "'", int18 == 2545);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        int int9 = sum0.sum(1576, 757);
        int int12 = sum0.sum(1191, 1393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2333 + "'", int9 == 2333);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1292 + "'", int12 == 1292);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(1063, 92);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1155 + "'", int27 == 1155);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        int int12 = sum0.sum(0, 1120);
        int int15 = sum0.sum((int) (byte) 10, 1090);
        int int18 = sum0.sum(3881, 1501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 560 + "'", int12 == 560);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 550 + "'", int15 == 550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5382 + "'", int18 == 5382);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(400, 2769);
        int int27 = sum0.sum(3989, 2326);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3169 + "'", int24 == 3169);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6315 + "'", int27 == 6315);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(711, 292);
        int int21 = sum0.sum(210, 1187);
        int int24 = sum0.sum(562, 452);
        int int27 = sum0.sum(1385, 3156);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1397 + "'", int21 == 1397);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1014 + "'", int24 == 1014);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4541 + "'", int27 == 4541);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(2759, (int) (short) 1);
        int int21 = sum0.sum(83, 1820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2760 + "'", int18 == 2760);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1903 + "'", int21 == 1903);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        int int30 = sum0.sum(149, 63);
        int int33 = sum0.sum(904, 341);
        int int36 = sum0.sum(831, (int) '#');
        int int39 = sum0.sum(1077, 1293);
        int int42 = sum0.sum(909, 1953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 400 + "'", int27 == 400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 212 + "'", int30 == 212);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1245 + "'", int33 == 1245);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 866 + "'", int36 == 866);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1185 + "'", int39 == 1185);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1431 + "'", int42 == 1431);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(598, 1357);
        int int18 = sum0.sum(317, 962);
        int int21 = sum0.sum(0, 835);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1955 + "'", int15 == 1955);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1279 + "'", int18 == 1279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 835 + "'", int21 == 835);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(0, 206);
        int int21 = sum0.sum(1063, 86);
        int int24 = sum0.sum(0, 987);
        int int27 = sum0.sum(0, 0);
        int int30 = sum0.sum(2515, 6690);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1149 + "'", int21 == 1149);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 987 + "'", int24 == 987);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9205 + "'", int30 == 9205);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(854, 803);
        int int21 = sum0.sum(2013, 1643);
        int int24 = sum0.sum(1723, 769);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1657 + "'", int18 == 1657);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3656 + "'", int21 == 3656);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(195, 117);
        int int30 = sum0.sum(892, 1029);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 312 + "'", int27 == 312);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1921 + "'", int30 == 1921);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(295, 86);
        int int24 = sum0.sum(393, 2452);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381 + "'", int21 == 381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2845 + "'", int24 == 2845);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        int int30 = sum0.sum(0, 3711);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 522 + "'", int27 == 522);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3711 + "'", int30 == 3711);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(171, 191);
        int int24 = sum0.sum(824, 423);
        int int27 = sum0.sum(63, 1254);
        int int30 = sum0.sum(761, 1641);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 181 + "'", int21 == 181);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1247 + "'", int24 == 1247);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1317 + "'", int27 == 1317);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1201 + "'", int30 == 1201);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        int int30 = sum0.sum(1109, (int) (short) 0);
        int int33 = sum0.sum(998, 0);
        int int36 = sum0.sum(7132, 2799);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1787 + "'", int27 == 1787);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1109 + "'", int30 == 1109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 998 + "'", int33 == 998);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9931 + "'", int36 == 9931);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(1442, 1128);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2570 + "'", int24 == 2570);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        int int12 = sum0.sum(529, 363);
        int int15 = sum0.sum(4293, 1492);
        int int18 = sum0.sum(702, 816);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 892 + "'", int12 == 892);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5785 + "'", int15 == 5785);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 759 + "'", int18 == 759);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(1279, 1433);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1356 + "'", int18 == 1356);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(71, (int) (short) 1);
        int int27 = sum0.sum(308, 825);
        int int30 = sum0.sum(1952, 963);
        int int33 = sum0.sum(689, 1487);
        int int36 = sum0.sum(376, 989);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1133 + "'", int27 == 1133);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2915 + "'", int30 == 2915);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1088 + "'", int33 == 1088);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1365 + "'", int36 == 1365);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(1005, 1482);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2487 + "'", int12 == 2487);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        int int33 = sum0.sum(747, 0);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 747 + "'", int33 == 747);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(1989, 1465);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3454 + "'", int24 == 3454);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(63, 4);
        int int21 = sum0.sum(1511, 2145);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1828 + "'", int21 == 1828);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(1569, 0);
        int int27 = sum0.sum(559, 1483);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1021 + "'", int27 == 1021);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(231, 641);
        int int27 = sum0.sum(115, 534);
        int int30 = sum0.sum(340, 318);
        int int33 = sum0.sum(5626, 2453);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 436 + "'", int24 == 436);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 649 + "'", int27 == 649);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 658 + "'", int30 == 658);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8079 + "'", int33 == 8079);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 209 + "'", int24 == 209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 747 + "'", int27 == 747);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(106, 719);
        int int21 = sum0.sum(0, 760);
        int int24 = sum0.sum(85, 262);
        int int27 = sum0.sum(1289, 3753);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 825 + "'", int18 == 825);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 380 + "'", int21 == 380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 347 + "'", int24 == 347);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2521 + "'", int27 == 2521);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        int int33 = sum0.sum(2276, 1928);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4204 + "'", int33 == 4204);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(562, 203);
        int int21 = sum0.sum(397, 106);
        int int24 = sum0.sum(1098, 164);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 503 + "'", int21 == 503);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1262 + "'", int24 == 1262);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        int int15 = sum0.sum(149, 1239);
        int int18 = sum0.sum(1261, 3989);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 694 + "'", int15 == 694);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2625 + "'", int18 == 2625);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(2167, 633);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2800 + "'", int18 == 2800);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(71, 54);
        int int21 = sum0.sum(407, 0);
        int int24 = sum0.sum(1977, 255);
        int int27 = sum0.sum(2224, 975);
        int int30 = sum0.sum(5366, 228);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2232 + "'", int24 == 2232);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3199 + "'", int27 == 3199);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5594 + "'", int30 == 5594);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(170, 125);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        int int24 = sum0.sum(1120, 237);
        int int27 = sum0.sum(1330, 1052);
        int int30 = sum0.sum(0, 2408);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1357 + "'", int24 == 1357);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2382 + "'", int27 == 2382);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1204 + "'", int30 == 1204);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(363, 42);
        int int18 = sum0.sum(623, 1528);
        int int21 = sum0.sum(1268, 200);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 405 + "'", int15 == 405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2151 + "'", int18 == 2151);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1468 + "'", int21 == 1468);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(91, 127);
        int int6 = sum0.sum(182, 160);
        int int9 = sum0.sum(16, 1495);
        int int12 = sum0.sum(1452, 35);
        int int15 = sum0.sum(550, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 342 + "'", int6 == 342);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1511 + "'", int9 == 1511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1487 + "'", int12 == 1487);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 741 + "'", int15 == 741);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        int int21 = sum0.sum(164, 192);
        int int24 = sum0.sum(390, 1093);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 178 + "'", int21 == 178);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1483 + "'", int24 == 1483);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(182, 1953);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2135 + "'", int15 == 2135);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(671, 516);
        int int24 = sum0.sum(5771, 683);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6454 + "'", int24 == 6454);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(0, 0);
        int int15 = sum0.sum(824, 97);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 921 + "'", int15 == 921);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(197, 343);
        int int21 = sum0.sum(412, 1113);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 270 + "'", int18 == 270);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1525 + "'", int21 == 1525);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(0, 206);
        int int21 = sum0.sum(135, 761);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 448 + "'", int21 == 448);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum((int) (short) 10, 347);
        int int24 = sum0.sum(0, 217);
        int int27 = sum0.sum(569, 76);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 645 + "'", int27 == 645);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(3711, 433);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4144 + "'", int12 == 4144);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum((int) ' ', 82);
        int int15 = sum0.sum(800, 1279);
        int int18 = sum0.sum(1759, 2026);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 57 + "'", int12 == 57);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2079 + "'", int15 == 2079);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3785 + "'", int18 == 3785);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(443, 803);
        int int15 = sum0.sum(505, 444);
        int int18 = sum0.sum(2673, 691);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 623 + "'", int12 == 623);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3364 + "'", int18 == 3364);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(598, 1357);
        int int18 = sum0.sum(317, 962);
        int int21 = sum0.sum(3040, 1119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1955 + "'", int15 == 1955);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1279 + "'", int18 == 1279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4159 + "'", int21 == 4159);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(171, 953);
        int int15 = sum0.sum(522, 677);
        int int18 = sum0.sum(479, 264);
        int int21 = sum0.sum(2799, 2315);
        int int24 = sum0.sum(583, 243);
        int int27 = sum0.sum(115, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 562 + "'", int12 == 562);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1199 + "'", int15 == 1199);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 743 + "'", int18 == 743);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5114 + "'", int21 == 5114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 826 + "'", int24 == 826);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115 + "'", int27 == 115);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 251);
        int int18 = sum0.sum(0, 2525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 572 + "'", int15 == 572);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2525 + "'", int18 == 2525);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum((int) 'a', 272);
        int int24 = sum0.sum(777, 1493);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 369 + "'", int21 == 369);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1135 + "'", int24 == 1135);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(139, 665);
        int int27 = sum0.sum(425, 2193);
        int int30 = sum0.sum(1025, 1025);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 402 + "'", int24 == 402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1309 + "'", int27 == 1309);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1025 + "'", int30 == 1025);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(207, 1119);
        int int24 = sum0.sum(1319, 349);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 663 + "'", int21 == 663);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1668 + "'", int24 == 1668);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(1504, 1469);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2973 + "'", int21 == 2973);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        int int21 = sum0.sum(0, (int) (short) 0);
        int int24 = sum0.sum(172, 106);
        int int27 = sum0.sum(743, 1060);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 278 + "'", int24 == 278);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1803 + "'", int27 == 1803);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        int int21 = sum0.sum(912, 362);
        int int24 = sum0.sum(914, 1381);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1274 + "'", int21 == 1274);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2295 + "'", int24 == 2295);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(599, 1339);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 969 + "'", int21 == 969);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(320, 177);
        int int24 = sum0.sum(1050, 3989);
        int int27 = sum0.sum(1295, 4903);
        int int30 = sum0.sum(1613, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 497 + "'", int21 == 497);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5039 + "'", int24 == 5039);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3099 + "'", int27 == 3099);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1613 + "'", int30 == 1613);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        int int18 = sum0.sum(956, 3187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4143 + "'", int18 == 4143);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(67, 487);
        int int24 = sum0.sum(802, 185);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 987 + "'", int24 == 987);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum(585, 806);
        int int15 = sum0.sum(2201, 208);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1391 + "'", int12 == 1391);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2409 + "'", int15 == 2409);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 485 + "'", int21 == 485);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 145 + "'", int24 == 145);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 177 + "'", int27 == 177);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(511, 0);
        int int12 = sum0.sum(1347, 191);
        int int15 = sum0.sum(534, 1911);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 511 + "'", int9 == 511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1538 + "'", int12 == 1538);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2445 + "'", int15 == 2445);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(343, 231);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 574 + "'", int24 == 574);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(139, 665);
        int int27 = sum0.sum(425, 2193);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 279 + "'", 279, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 821 + "'", 821, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 345 + "'", 345, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 402 + "'", 402, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1309 + "'", 1309, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(550, 3481);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 139 + "'", 139, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 85 + "'", 85, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 229 + "'", 229, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 240 + "'", 240, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 407 + "'", 407, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 4031 + "'", 4031, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}
