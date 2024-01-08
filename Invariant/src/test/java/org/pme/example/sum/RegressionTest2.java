package org.pme.example.sum;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(665, 704);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1369 + "'", int15 == 1369);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(295, 86);
        int int24 = sum0.sum(1095, 1809);
        int int27 = sum0.sum(855, 1225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381 + "'", int21 == 381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1452 + "'", int24 == 1452);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1040 + "'", int27 == 1040);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(1413, 407);
        int int21 = sum0.sum(528, 1644);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1820 + "'", int18 == 1820);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1086 + "'", int21 == 1086);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(49, 335);
        int int24 = sum0.sum(1261, 1242);
        int int27 = sum0.sum(517, 1735);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 192 + "'", int21 == 192);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2503 + "'", int24 == 2503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1126 + "'", int27 == 1126);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(269, 263);
        int int24 = sum0.sum(3475, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 532 + "'", int21 == 532);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3542 + "'", int24 == 3542);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum(905, 198);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1103 + "'", int15 == 1103);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((-1), 9);
        int int15 = sum0.sum(10, 534);
        int int18 = sum0.sum(313, 1117);
        int int21 = sum0.sum(1553, 442);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 272 + "'", int15 == 272);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 715 + "'", int18 == 715);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995 + "'", int21 == 1995);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(145, 67);
        int int21 = sum0.sum(1311, 412);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 212 + "'", int18 == 212);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1723 + "'", int21 == 1723);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(77, 443);
        int int9 = sum0.sum(25, 587);
        int int12 = sum0.sum(317, 205);
        int int15 = sum0.sum(500, 488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 306 + "'", int9 == 306);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 522 + "'", int12 == 522);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 988 + "'", int15 == 988);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(65, 438);
        int int27 = sum0.sum(381, 0);
        int int30 = sum0.sum(1013, 104);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 381 + "'", int27 == 381);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1117 + "'", int30 == 1117);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        int int21 = sum0.sum(677, 2505);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1591 + "'", int21 == 1591);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(54, 129);
        int int24 = sum0.sum(168, 704);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 183 + "'", int21 == 183);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 436 + "'", int24 == 436);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        int int33 = sum0.sum(547, 1014);
        int int36 = sum0.sum(521, 1369);
        int int39 = sum0.sum(724, 1309);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1561 + "'", int33 == 1561);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 945 + "'", int36 == 945);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2033 + "'", int39 == 2033);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        int int12 = sum0.sum(497, 255);
        int int15 = sum0.sum(219, 8335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 752 + "'", int12 == 752);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4277 + "'", int15 == 4277);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(392, 1114);
        int int18 = sum0.sum(248, 281);
        int int21 = sum0.sum(332, 1178);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 753 + "'", int15 == 753);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 529 + "'", int18 == 529);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 755 + "'", int21 == 755);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(359, 36);
        int int15 = sum0.sum(534, 139);
        int int18 = sum0.sum(594, 3699);
        int int21 = sum0.sum(353, 145);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 395 + "'", int12 == 395);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 673 + "'", int15 == 673);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4293 + "'", int18 == 4293);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(719, 295);
        int int24 = sum0.sum(84, 331);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1014 + "'", int21 == 1014);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 415 + "'", int24 == 415);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(217, 392);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 176 + "'", int6 == 176);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 609 + "'", int9 == 609);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(260, 689);
        int int24 = sum0.sum(1793, 48);
        int int27 = sum0.sum(245, 1276);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 949 + "'", int21 == 949);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1841 + "'", int24 == 1841);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1521 + "'", int27 == 1521);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(877, 536);
        int int9 = sum0.sum(847, 936);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1413 + "'", int6 == 1413);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1783 + "'", int9 == 1783);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        int int24 = sum0.sum(711, 275);
        int int27 = sum0.sum(801, 877);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 986 + "'", int24 == 986);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 839 + "'", int27 == 839);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1514 + "'", int24 == 1514);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 499 + "'", int27 == 499);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(3757, 1326);
        int int12 = sum0.sum(1486, 202);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5083 + "'", int9 == 5083);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(304, (int) (short) 100);
        int int18 = sum0.sum(741, 1759);
        int int21 = sum0.sum(476, 408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 404 + "'", int15 == 404);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1250 + "'", int18 == 1250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 884 + "'", int21 == 884);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(4611, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4611 + "'", int6 == 4611);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum(0, 793);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 793 + "'", int15 == 793);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(49, 673);
        int int21 = sum0.sum(553, 2333);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 361 + "'", int18 == 361);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1443 + "'", int21 == 1443);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        int int36 = sum0.sum(2129, 569);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2698 + "'", int36 == 2698);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum(0, 111);
        int int15 = sum0.sum(4190, 733);
        int int18 = sum0.sum(175, 4835);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 111 + "'", int12 == 111);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4923 + "'", int15 == 4923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2505 + "'", int18 == 2505);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(1413, 407);
        int int21 = sum0.sum(1385, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1820 + "'", int18 == 1820);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1385 + "'", int21 == 1385);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(1286, 615);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1901 + "'", int18 == 1901);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(320, 107);
        int int21 = sum0.sum(747, 157);
        int int24 = sum0.sum(1048, 2427);
        int int27 = sum0.sum(1261, 856);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 427 + "'", int18 == 427);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 904 + "'", int21 == 904);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3475 + "'", int24 == 3475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2117 + "'", int27 == 2117);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(113, 671);
        int int21 = sum0.sum(304, 35);
        int int24 = sum0.sum(1268, 438);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 339 + "'", int21 == 339);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1706 + "'", int24 == 1706);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        int int21 = sum0.sum(384, 156);
        int int24 = sum0.sum(149, 514);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 540 + "'", int21 == 540);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 663 + "'", int24 == 663);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(825, 522);
        int int21 = sum0.sum(1212, 628);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1347 + "'", int18 == 1347);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1840 + "'", int21 == 1840);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(2398, 234);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2632 + "'", int18 == 2632);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(113, 443);
        int int24 = sum0.sum(1622, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 278 + "'", int21 == 278);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1719 + "'", int24 == 1719);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(110, 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 235 + "'", int15 == 235);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(235, 514);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 749 + "'", int24 == 749);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(42, 1247);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289 + "'", int21 == 1289);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(240, 726);
        int int24 = sum0.sum(671, 545);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1216 + "'", int24 == 1216);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(320, 177);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 497 + "'", int21 == 497);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        int int18 = sum0.sum(4923, 1269);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6192 + "'", int18 == 6192);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(975, 1261);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1118 + "'", int12 == 1118);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(500, 207);
        int int21 = sum0.sum(2440, 797);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 707 + "'", int18 == 707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3237 + "'", int21 == 3237);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(392, 1114);
        int int18 = sum0.sum(212, 1131);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 753 + "'", int15 == 753);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1343 + "'", int18 == 1343);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        int int18 = sum0.sum(592, (int) (byte) 0);
        int int21 = sum0.sum(1623, 1239);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2862 + "'", int21 == 2862);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(500, (int) (short) 10);
        int int15 = sum0.sum(479, 637);
        int int18 = sum0.sum(892, 4100);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 510 + "'", int12 == 510);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 558 + "'", int15 == 558);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2496 + "'", int18 == 2496);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(109, 438);
        int int24 = sum0.sum(427, 26);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 547 + "'", int21 == 547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(306, 1083);
        int int24 = sum0.sum(178, 728);
        int int27 = sum0.sum(3585, 42);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1389 + "'", int21 == 1389);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3627 + "'", int27 == 3627);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(643, 238);
        int int9 = sum0.sum(322, 336);
        int int12 = sum0.sum(529, 869);
        int int15 = sum0.sum(170, 825);
        int int18 = sum0.sum(1278, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 881 + "'", int6 == 881);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 329 + "'", int9 == 329);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 699 + "'", int12 == 699);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 995 + "'", int15 == 995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1730 + "'", int18 == 1730);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(143, 1126);
        int int27 = sum0.sum(481, 221);
        int int30 = sum0.sum(3065, 52);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1269 + "'", int24 == 1269);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 702 + "'", int27 == 702);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3117 + "'", int30 == 3117);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 312);
        int int21 = sum0.sum(419, 142);
        int int24 = sum0.sum(2463, 258);
        int int27 = sum0.sum(953, 514);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 156 + "'", int18 == 156);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 561 + "'", int21 == 561);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2721 + "'", int24 == 2721);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1467 + "'", int27 == 1467);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(57, 661);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 359 + "'", int18 == 359);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 574 + "'", int24 == 574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 346 + "'", int27 == 346);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(191, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 201 + "'", int24 == 201);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(951, 282);
        int int15 = sum0.sum(1645, 2645);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1233 + "'", int12 == 1233);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2145 + "'", int15 == 2145);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(719, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 719 + "'", int18 == 719);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');
        int int15 = sum0.sum(358, 415);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 773 + "'", int15 == 773);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(304, 591);
        int int24 = sum0.sum(59, 3111);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 895 + "'", int21 == 895);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1585 + "'", int24 == 1585);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        int int30 = sum0.sum(2359, 400);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 277 + "'", int24 == 277);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1267 + "'", int27 == 1267);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2759 + "'", int30 == 2759);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(443, 803);
        int int15 = sum0.sum(222, 2344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 623 + "'", int12 == 623);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1283 + "'", int15 == 1283);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 183 + "'", int21 == 183);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2003 + "'", int24 == 2003);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2307 + "'", int27 == 2307);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(2082, 623);
        int int27 = sum0.sum(556, 417);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2705 + "'", int24 == 2705);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 973 + "'", int27 == 973);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(597, 594);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1191 + "'", int9 == 1191);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(113, 4);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 117 + "'", int24 == 117);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(552, 856);
        int int18 = sum0.sum(1077, 135);
        int int21 = sum0.sum(750, 292);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 704 + "'", int15 == 704);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1212 + "'", int18 == 1212);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042 + "'", int21 == 1042);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        int int39 = sum0.sum(766, 1159);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 548 + "'", int33 == 548);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 650 + "'", int36 == 650);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1925 + "'", int39 == 1925);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int36 = sum0.sum(1444, 493);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1937 + "'", int36 == 1937);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(52, 150);
        int int21 = sum0.sum(2563, 694);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3257 + "'", int21 == 3257);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(583, 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 583 + "'", int9 == 583);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        int int18 = sum0.sum(485, 1);
        int int21 = sum0.sum(744, 197);
        int int24 = sum0.sum(1401, 1576);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 486 + "'", int18 == 486);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 941 + "'", int21 == 941);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2977 + "'", int24 == 2977);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        int int15 = sum0.sum(1056, 585);
        int int18 = sum0.sum(1868, 373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1641 + "'", int15 == 1641);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2241 + "'", int18 == 2241);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum((int) (short) 100, 304);
        int int24 = sum0.sum(597, 339);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 936 + "'", int24 == 936);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(136, 136);
        int int21 = sum0.sum(453, 176);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 629 + "'", int21 == 629);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(101, 175);
        int int27 = sum0.sum(346, 1557);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 138 + "'", int24 == 138);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1903 + "'", int27 == 1903);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        int int12 = sum0.sum(1483, 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2238 + "'", int12 == 2238);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(67, 825);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 446 + "'", int18 == 446);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(113, 585);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 349 + "'", int9 == 349);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(953, 9);
        int int12 = sum0.sum(1525, 801);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 962 + "'", int9 == 962);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2326 + "'", int12 == 2326);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(575, 139);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 714 + "'", int27 == 714);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(0, 549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 549 + "'", int12 == 549);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(136, 136);
        int int21 = sum0.sum(453, 176);
        int int24 = sum0.sum(228, 765);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 629 + "'", int21 == 629);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 993 + "'", int24 == 993);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = sum0.sum(466, 3771);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4237 + "'", int12 == 4237);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(713, 405);
        int int15 = sum0.sum(2033, 390);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1118 + "'", int12 == 1118);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2423 + "'", int15 == 2423);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(65, 438);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(955, 510);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1465 + "'", int12 == 1465);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(198, 472);
        int int30 = sum0.sum(119, 369);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 335 + "'", int27 == 335);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 244 + "'", int30 == 244);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        int int30 = sum0.sum(258, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1446 + "'", int27 == 1446);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 258 + "'", int30 == 258);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(369, 598);
        int int30 = sum0.sum(2710, 3487);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 967 + "'", int27 == 967);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6197 + "'", int30 == 6197);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        int int24 = sum0.sum(188, 215);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 152 + "'", int21 == 152);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 403 + "'", int24 == 403);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(217, 192);
        int int18 = sum0.sum(42, 1475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 409 + "'", int15 == 409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1517 + "'", int18 == 1517);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(1569, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(2102, 1669);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3771 + "'", int21 == 3771);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        int int18 = sum0.sum(1050, 129);
        int int21 = sum0.sum(2201, 715);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1179 + "'", int18 == 1179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2916 + "'", int21 == 2916);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        int int33 = sum0.sum(3345, 924);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4269 + "'", int33 == 4269);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(561, 821);
        int int21 = sum0.sum(2410, 707);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 691 + "'", int18 == 691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3117 + "'", int21 == 3117);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(391, 3757);
        int int15 = sum0.sum(2262, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2074 + "'", int12 == 2074);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2373 + "'", int15 == 2373);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(189, 979);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 584 + "'", int18 == 584);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(2804, 0);
        int int12 = sum0.sum(1749, 611);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2804 + "'", int9 == 2804);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2360 + "'", int12 == 2360);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum(815, 1955);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1385 + "'", int21 == 1385);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(419, 368);
        int int18 = sum0.sum(1495, 2792);
        int int21 = sum0.sum(1389, 432);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 787 + "'", int15 == 787);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4287 + "'", int18 == 4287);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1821 + "'", int21 == 1821);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(400, 192);
        int int21 = sum0.sum(572, 1735);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2307 + "'", int21 == 2307);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        int int18 = sum0.sum(2525, 1192);
        int int21 = sum0.sum(1178, 673);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3717 + "'", int18 == 3717);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1851 + "'", int21 == 1851);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(671, 447);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1118 + "'", int24 == 1118);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        int int18 = sum0.sum(1050, 129);
        int int21 = sum0.sum(1514, 4233);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1179 + "'", int18 == 1179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5747 + "'", int21 == 5747);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(801, 436);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1237 + "'", int27 == 1237);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(371, 544);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 915 + "'", int18 == 915);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(63, 308);
        int int21 = sum0.sum(856, 1716);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 371 + "'", int18 == 371);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1286 + "'", int21 == 1286);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        int int21 = sum0.sum(321, 36);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        int int12 = sum0.sum(497, 255);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 752 + "'", int12 == 752);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(48, 1118);
        int int21 = sum0.sum(4103, 1476);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 583 + "'", int18 == 583);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5579 + "'", int21 == 5579);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(286, 2044);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1165 + "'", int21 == 1165);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum(728, 1277);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2005 + "'", int21 == 2005);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(877, 536);
        int int9 = sum0.sum(1063, 278);
        int int12 = sum0.sum(189, 3349);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1413 + "'", int6 == 1413);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1341 + "'", int9 == 1341);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1769 + "'", int12 == 1769);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        int int30 = sum0.sum(1275, 1315);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282 + "'", int24 == 282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 517 + "'", int27 == 517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1295 + "'", int30 == 1295);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(155, 162);
        int int24 = sum0.sum(597, 174);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 317 + "'", int21 == 317);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 771 + "'", int24 == 771);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        int int33 = sum0.sum(232, 743);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 975 + "'", int33 == 975);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = sum0.sum(318, 677);
        int int21 = sum0.sum(3481, 1885);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 995 + "'", int18 == 995);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5366 + "'", int21 == 5366);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(266, 1063);
        int int30 = sum0.sum(692, 2367);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1329 + "'", int27 == 1329);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3059 + "'", int30 == 3059);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 721 + "'", int24 == 721);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 152 + "'", int27 == 152);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(805, 291);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1096 + "'", int12 == 1096);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(651, 218);
        int int21 = sum0.sum(856, 969);
        int int24 = sum0.sum(87, 454);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 869 + "'", int18 == 869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1825 + "'", int21 == 1825);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 541 + "'", int24 == 541);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        int int30 = sum0.sum(2152, 1193);
        int int33 = sum0.sum(953, 0);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1557 + "'", int24 == 1557);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3487 + "'", int27 == 3487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3345 + "'", int30 == 3345);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 953 + "'", int33 == 953);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(347, 787);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        int int33 = sum0.sum(1185, 466);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1651 + "'", int33 == 1651);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(0, 445);
        int int21 = sum0.sum(246, 1327);
        int int24 = sum0.sum(376, 168);
        int int27 = sum0.sum(3757, 159);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 445 + "'", int18 == 445);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1573 + "'", int21 == 1573);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 544 + "'", int24 == 544);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3916 + "'", int27 == 3916);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(218, 246);
        int int15 = sum0.sum(0, 908);
        int int18 = sum0.sum(2033, 3027);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 454 + "'", int15 == 454);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2530 + "'", int18 == 2530);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(452, 905);
        int int24 = sum0.sum(1278, 1749);
        int int27 = sum0.sum(2082, 1385);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357 + "'", int21 == 1357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3027 + "'", int24 == 3027);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3467 + "'", int27 == 3467);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(877, 363);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1240 + "'", int18 == 1240);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(368, 63);
        int int21 = sum0.sum(430, 892);
        int int24 = sum0.sum(922, 94);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 431 + "'", int18 == 431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 661 + "'", int21 == 661);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1016 + "'", int24 == 1016);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(1795, 615);
        int int18 = sum0.sum(1315, 166);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2410 + "'", int15 == 2410);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1481 + "'", int18 == 1481);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1233, 185);
        int int15 = sum0.sum(295, 282);
        int int18 = sum0.sum(1322, 3487);
        int int21 = sum0.sum(2356, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1418 + "'", int12 == 1418);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 577 + "'", int15 == 577);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4809 + "'", int18 == 4809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2408 + "'", int21 == 2408);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(261, 164);
        int int18 = sum0.sum(231, 1034);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 425 + "'", int15 == 425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1265 + "'", int18 == 1265);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        int int24 = sum0.sum(433, 1089);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 761 + "'", int24 == 761);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(240, 726);
        int int24 = sum0.sum(395, 273);
        int int27 = sum0.sum(2446, 949);
        int int30 = sum0.sum(496, 951);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 668 + "'", int24 == 668);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3395 + "'", int27 == 3395);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1447 + "'", int30 == 1447);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(48, 479);
        int int15 = sum0.sum(725, 988);
        int int18 = sum0.sum(1329, 329);
        int int21 = sum0.sum(3413, 1252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 527 + "'", int12 == 527);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1713 + "'", int15 == 1713);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1658 + "'", int18 == 1658);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4665 + "'", int21 == 4665);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(42, 1247);
        int int24 = sum0.sum(801, 521);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289 + "'", int21 == 1289);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1322 + "'", int24 == 1322);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(660, 668);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 664 + "'", int24 == 664);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(4287, 2413);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6700 + "'", int15 == 6700);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(353, 292);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 645 + "'", int24 == 645);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(702, 677);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1379 + "'", int18 == 1379);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(67, 487);
        int int24 = sum0.sum(1179, 935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2114 + "'", int24 == 2114);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        int int18 = sum0.sum(63, 308);
        int int21 = sum0.sum(28, 3175);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 371 + "'", int18 == 371);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3203 + "'", int21 == 3203);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(353, 203);
        int int24 = sum0.sum(1268, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 556 + "'", int21 == 556);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1268 + "'", int24 == 1268);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(744, 72);
        int int21 = sum0.sum(391, 111);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 816 + "'", int18 == 816);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 502 + "'", int21 == 502);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(260, 689);
        int int24 = sum0.sum(1793, 48);
        int int27 = sum0.sum(245, 208);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 949 + "'", int21 == 949);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1841 + "'", int24 == 1841);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 453 + "'", int27 == 453);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int30 = sum0.sum(0, 559);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 268 + "'", int27 == 268);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 559 + "'", int30 == 559);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(166, 0);
        int int24 = sum0.sum(83, 1194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 166 + "'", int21 == 166);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1277 + "'", int24 == 1277);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(2828, 2505);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5333 + "'", int21 == 5333);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(1309, 92);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1401 + "'", int18 == 1401);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        int int30 = sum0.sum(614, 479);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234 + "'", int21 == 234);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 951 + "'", int24 == 951);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2665 + "'", int27 == 2665);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1093 + "'", int30 == 1093);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(353, 157);
        int int18 = sum0.sum(606, 8669);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 510 + "'", int15 == 510);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9275 + "'", int18 == 9275);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        int int30 = sum0.sum(4271, 574);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 402 + "'", int24 == 402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1309 + "'", int27 == 1309);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4845 + "'", int30 == 4845);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(540, 689);
        int int15 = sum0.sum(3329, 1103);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1229 + "'", int12 == 1229);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4432 + "'", int15 == 4432);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(71, 54);
        int int21 = sum0.sum(407, 0);
        int int24 = sum0.sum(1977, 255);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2232 + "'", int24 == 2232);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(82, (int) (short) 100);
        int int15 = sum0.sum(2359, 288);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2647 + "'", int15 == 2647);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(140, 72);
        int int18 = sum0.sum(1347, 5579);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 212 + "'", int15 == 212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3463 + "'", int18 == 3463);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');
        int int15 = sum0.sum(1118, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1128 + "'", int15 == 1128);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1095, 373);
        int int12 = sum0.sum(775, 1265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1468 + "'", int9 == 1468);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1020 + "'", int12 == 1020);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(503, 336);
        int int27 = sum0.sum(729, 1187);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 839 + "'", int24 == 839);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 958 + "'", int27 == 958);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(260, 689);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 949 + "'", int21 == 949);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum((int) 'a', 272);
        int int24 = sum0.sum(536, 1483);
        int int27 = sum0.sum(939, 728);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 369 + "'", int21 == 369);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2019 + "'", int24 == 2019);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1667 + "'", int27 == 1667);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(406, 485);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891 + "'", int21 == 891);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Class<?> wildcardClass40 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        int int33 = sum0.sum(2359, 1665);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4024 + "'", int33 == 4024);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(2819, 716);
        int int24 = sum0.sum(793, 2423);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3535 + "'", int21 == 3535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1608 + "'", int24 == 1608);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        int int30 = sum0.sum(2152, 1193);
        int int33 = sum0.sum(953, 0);
        int int36 = sum0.sum(703, 936);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1557 + "'", int24 == 1557);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3487 + "'", int27 == 3487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3345 + "'", int30 == 3345);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 953 + "'", int33 == 953);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1639 + "'", int36 == 1639);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(379, 405);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 392 + "'", int9 == 392);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(1283, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1283 + "'", int12 == 1283);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(643, 238);
        int int9 = sum0.sum(322, 336);
        int int12 = sum0.sum(529, 869);
        int int15 = sum0.sum(170, 825);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 881 + "'", int6 == 881);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 329 + "'", int9 == 329);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 699 + "'", int12 == 699);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 995 + "'", int15 == 995);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        int int21 = sum0.sum(1017, 704);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1721 + "'", int21 == 1721);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(443, 803);
        int int15 = sum0.sum(505, 444);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 623 + "'", int12 == 623);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 949 + "'", int15 == 949);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        int int30 = sum0.sum(313, 1557);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234 + "'", int21 == 234);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 951 + "'", int24 == 951);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2665 + "'", int27 == 2665);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 935 + "'", int30 == 935);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(599, 1014);
        int int21 = sum0.sum(2435, 184);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1613 + "'", int18 == 1613);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2619 + "'", int21 == 2619);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        int int12 = sum0.sum(347, 787);
        int int15 = sum0.sum(1167, 711);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1878 + "'", int15 == 1878);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(198, 472);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 335 + "'", int27 == 335);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(246, (int) '4');
        int int24 = sum0.sum(302, 140);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 298 + "'", int21 == 298);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 442 + "'", int24 == 442);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(404, 207);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 611 + "'", int15 == 611);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(218, 205);
        int int24 = sum0.sum(2563, 1403);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 423 + "'", int21 == 423);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3966 + "'", int24 == 3966);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(2632, 1438);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4070 + "'", int24 == 4070);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        int int18 = sum0.sum(485, 1);
        int int21 = sum0.sum(744, 197);
        int int24 = sum0.sum(739, 5366);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 486 + "'", int18 == 486);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 941 + "'", int21 == 941);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6105 + "'", int24 == 6105);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(1403, 643);
        int int15 = sum0.sum(0, 959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2046 + "'", int12 == 2046);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        int int30 = sum0.sum(4768, 397);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5165 + "'", int30 == 5165);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        int int24 = sum0.sum((int) (short) 0, 815);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 815 + "'", int24 == 815);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(369, 598);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 967 + "'", int27 == 967);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum((int) '#', 121);
        int int27 = sum0.sum(1514, 793);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 78 + "'", int24 == 78);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2307 + "'", int27 == 2307);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(475, 251);
        int int9 = sum0.sum(1970, 533);
        int int12 = sum0.sum(396, 1543);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 726 + "'", int6 == 726);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2503 + "'", int9 == 2503);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1939 + "'", int12 == 1939);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        int int36 = sum0.sum(2106, 1128);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3234 + "'", int36 == 3234);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        int int30 = sum0.sum(2769, 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452 + "'", int24 == 452);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2201 + "'", int27 == 2201);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2989 + "'", int30 == 2989);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(711, 194);
        int int18 = sum0.sum(45, 2013);
        int int21 = sum0.sum(1277, 175);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 905 + "'", int15 == 905);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1029 + "'", int18 == 1029);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1452 + "'", int21 == 1452);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        int int27 = sum0.sum(4293, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4293 + "'", int27 == 4293);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(498, 207);
        int int21 = sum0.sum(801, 282);
        int int24 = sum0.sum(442, 2367);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 705 + "'", int18 == 705);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1083 + "'", int21 == 1083);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2809 + "'", int24 == 2809);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(320, 321);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 641 + "'", int24 == 641);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(16, 245);
        int int27 = sum0.sum(200, 3887);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4087 + "'", int27 == 4087);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        int int24 = sum0.sum(2019, 809);
        int int27 = sum0.sum(0, 390);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2828 + "'", int24 == 2828);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 195 + "'", int27 == 195);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(272, 1393);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1665 + "'", int24 == 1665);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 877);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(951, 1178);
        int int21 = sum0.sum(2496, 296);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2129 + "'", int18 == 2129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2792 + "'", int21 == 2792);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = 0; // flaky: sum0.sum((-1), 71);
        int int12 = sum0.sum(905, 847);
        int int15 = sum0.sum(483, 591);
        int int18 = sum0.sum(3061, 189);
        int int21 = sum0.sum(747, 1475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1752 + "'", int12 == 1752);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3250 + "'", int18 == 3250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1111 + "'", int21 == 1111);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(0, 260);
        int int24 = sum0.sum(156, 152);
        int int27 = sum0.sum(1265, 323);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 308 + "'", int24 == 308);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1588 + "'", int27 == 1588);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(2799, 1643);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4442 + "'", int15 == 4442);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (byte) 10, 443);
        int int12 = sum0.sum(534, 321);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 453 + "'", int9 == 453);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 855 + "'", int12 == 855);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(278, 645);
        int int24 = sum0.sum(264, 835);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 923 + "'", int21 == 923);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        int int12 = sum0.sum(4233, 1548);
        int int15 = sum0.sum(1452, 248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5781 + "'", int12 == 5781);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700 + "'", int15 == 1700);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(550, (int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 560 + "'", int12 == 560);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(0, 354);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 177 + "'", int15 == 177);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(71, 54);
        int int21 = sum0.sum(177, 802);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 979 + "'", int21 == 979);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        int int18 = sum0.sum(57, 1369);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 713 + "'", int18 == 713);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(500, 207);
        int int21 = sum0.sum(0, 643);
        int int24 = sum0.sum(1840, 347);
        int int27 = sum0.sum(1549, 2496);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 707 + "'", int18 == 707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 643 + "'", int21 == 643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2187 + "'", int24 == 2187);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4045 + "'", int27 == 4045);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(514, 987);
        int int24 = sum0.sum(1569, 0);
        int int27 = sum0.sum(1293, 3105);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2199 + "'", int27 == 2199);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(36, 219);
        int int24 = sum0.sum(113, 574);
        int int27 = sum0.sum(716, 228);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255 + "'", int21 == 255);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 687 + "'", int24 == 687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 944 + "'", int27 == 944);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(234, 304);
        int int21 = sum0.sum(550, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 550 + "'", int21 == 550);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(321, 1357);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 839 + "'", int12 == 839);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(741, 953);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 847 + "'", int24 == 847);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(799, 1190);
        int int24 = sum0.sum(1622, 2193);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1989 + "'", int21 == 1989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3815 + "'", int24 == 3815);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(49, 304);
        int int18 = sum0.sum(289, 136);
        int int21 = sum0.sum(101, 246);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 353 + "'", int15 == 353);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 425 + "'", int18 == 425);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 347 + "'", int21 == 347);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(269, 445);
        int int27 = sum0.sum(1494, 719);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 357 + "'", int24 == 357);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2213 + "'", int27 == 2213);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(951, 548);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1499 + "'", int15 == 1499);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(1279, 814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2093 + "'", int12 == 2093);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(533, 402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 935 + "'", int15 == 935);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        int int24 = sum0.sum(227, 997);
        int int27 = sum0.sum(2994, 641);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 612 + "'", int24 == 612);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3635 + "'", int27 == 3635);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(323, 109);
        int int21 = sum0.sum(1052, 209);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 432 + "'", int18 == 432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1261 + "'", int21 == 1261);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(3481, 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4210 + "'", int21 == 4210);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        int int30 = sum0.sum(248, 1128);
        int int33 = sum0.sum(445, 618);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 345 + "'", int24 == 345);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1911 + "'", int27 == 1911);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 688 + "'", int30 == 688);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1063 + "'", int33 == 1063);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        int int36 = sum0.sum(4719, 135);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4854 + "'", int36 == 4854);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(1391, 234);
        int int27 = sum0.sum(774, 8335);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1625 + "'", int24 == 1625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9109 + "'", int27 == 9109);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        int int33 = sum0.sum(0, 2647);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2647 + "'", int33 == 2647);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        int int21 = sum0.sum(392, 297);
        int int24 = sum0.sum(243, 174);
        int int27 = sum0.sum(261, 662);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 689 + "'", int21 == 689);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 417 + "'", int24 == 417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 923 + "'", int27 == 923);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(3509, 1385);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4894 + "'", int24 == 4894);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(16, 245);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(142, 1636);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 889 + "'", int27 == 889);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(84, 475);
        int int18 = sum0.sum(135, 142);
        int int21 = sum0.sum(76, 175);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 559 + "'", int15 == 559);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 277 + "'", int18 == 277);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        int int30 = sum0.sum(1742, 1229);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 671 + "'", int27 == 671);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2971 + "'", int30 == 2971);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(252, 92);
        int int12 = sum0.sum(327, 0);
        int int15 = sum0.sum(262, 271);
        int int18 = sum0.sum(355, 150);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 344 + "'", int9 == 344);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 533 + "'", int15 == 533);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 505 + "'", int18 == 505);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        int int24 = sum0.sum(291, 0);
        int int27 = sum0.sum(230, 2145);
        int int30 = sum0.sum(628, 610);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2375 + "'", int27 == 2375);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1238 + "'", int30 == 1238);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(322, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(92, 65);
        int int21 = sum0.sum(1841, 2994);
        int int24 = sum0.sum(2463, 2409);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 157 + "'", int18 == 157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4835 + "'", int21 == 4835);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4872 + "'", int24 == 4872);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(0, 354);
        int int18 = sum0.sum(1757, 1871);
        int int21 = sum0.sum(1149, 1517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 177 + "'", int15 == 177);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1814 + "'", int18 == 1814);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1333 + "'", int21 == 1333);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(592, 821);
        int int21 = 0; // flaky: sum0.sum(415, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1413 + "'", int18 == 1413);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 415 + "'", int21 == 415);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        int int21 = sum0.sum(766, 486);
        int int24 = sum0.sum(475, 448);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1252 + "'", int21 == 1252);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 923 + "'", int24 == 923);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(1858, 2106);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1982 + "'", int18 == 1982);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(24, 332);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 178 + "'", int9 == 178);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(113, 443);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 278 + "'", int21 == 278);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(185, 354);
        int int24 = sum0.sum(757, 362);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 539 + "'", int21 == 539);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1119 + "'", int24 == 1119);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(769, 99);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        int int18 = sum0.sum(10, 181);
        int int21 = sum0.sum(537, 641);
        int int24 = sum0.sum(2315, 934);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 589 + "'", int21 == 589);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3249 + "'", int24 == 3249);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(1330, 2151);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3481 + "'", int18 == 3481);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        int int24 = sum0.sum(550, 3481);
        int int27 = sum0.sum(9109, 3273);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4031 + "'", int24 == 4031);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12382 + "'", int27 == 12382);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(409, 363);
        int int18 = sum0.sum(117, 304);
        int int21 = sum0.sum(1641, 877);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 772 + "'", int15 == 772);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421 + "'", int18 == 421);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2518 + "'", int21 == 2518);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum((int) (short) 1, 89);
        int int21 = sum0.sum(36, 198);
        int int24 = sum0.sum(1133, 184);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 117 + "'", int21 == 117);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1317 + "'", int24 == 1317);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(218, 246);
        int int15 = sum0.sum(1553, 3757);
        int int18 = sum0.sum(48, 327);
        int int21 = sum0.sum(587, 1235);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2655 + "'", int15 == 2655);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 375 + "'", int18 == 375);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 911 + "'", int21 == 911);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        int int36 = sum0.sum(4894, 949);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5843 + "'", int36 == 5843);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        int int30 = sum0.sum(1397, 115);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1512 + "'", int30 == 1512);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(419, 368);
        int int18 = sum0.sum(1152, 109);
        int int21 = sum0.sum(184, 156);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 787 + "'", int15 == 787);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1261 + "'", int18 == 1261);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 340 + "'", int21 == 340);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        int int21 = sum0.sum(516, 1233);
        int int24 = sum0.sum(76, 534);
        int int27 = sum0.sum(111, 577);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 305 + "'", int24 == 305);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 344 + "'", int27 == 344);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        int int24 = sum0.sum(711, 275);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 986 + "'", int24 == 986);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        int int36 = sum0.sum(302, 291);
        int int39 = sum0.sum(870, 1391);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 593 + "'", int36 == 593);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2261 + "'", int39 == 2261);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(139, 0);
        int int18 = sum0.sum(643, 447);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1090 + "'", int18 == 1090);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        int int30 = sum0.sum(657, 4190);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 643 + "'", int27 == 643);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(2804, 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2804 + "'", int9 == 2804);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(0, 219);
        int int27 = sum0.sum(84, 539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 219 + "'", int24 == 219);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 623 + "'", int27 == 623);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(805, 955);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 880 + "'", int12 == 880);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(63, 868);
        int int21 = sum0.sum(210, 35);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 931 + "'", int18 == 931);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 245 + "'", int21 == 245);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        int int18 = sum0.sum(344, 585);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929 + "'", int18 == 929);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(381, 572);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 953 + "'", int18 == 953);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum((int) (short) 100, 385);
        int int24 = sum0.sum(25, 120);
        int int27 = sum0.sum(637, 302);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 485 + "'", int21 == 485);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 145 + "'", int24 == 145);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 939 + "'", int27 == 939);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(769, 939);
        int int24 = sum0.sum(747, 85);
        int int27 = sum0.sum(11, 503);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854 + "'", int21 == 854);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 832 + "'", int24 == 832);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 257 + "'", int27 == 257);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');
        int int15 = sum0.sum((int) (short) 10, 0);
        int int18 = sum0.sum(856, 2356);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1606 + "'", int18 == 1606);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(234, 304);
        int int21 = sum0.sum(5785, 2884);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8669 + "'", int21 == 8669);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(799, 1190);
        int int24 = sum0.sum(1622, 2193);
        int int27 = sum0.sum(1651, 485);
        int int30 = sum0.sum(1995, 181);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1989 + "'", int21 == 1989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3815 + "'", int24 == 3815);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2136 + "'", int27 == 2136);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2176 + "'", int30 == 2176);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(409, 205);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 614 + "'", int24 == 614);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        int int33 = sum0.sum(1369, 987);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2356 + "'", int33 == 2356);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(0, 260);
        int int24 = sum0.sum(156, 152);
        int int27 = sum0.sum(1809, 219);
        int int30 = sum0.sum(5335, 5747);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 308 + "'", int24 == 308);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2028 + "'", int27 == 2028);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5541 + "'", int30 == 5541);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        int int27 = sum0.sum(198, 472);
        int int30 = sum0.sum(924, 2525);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 335 + "'", int27 == 335);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3449 + "'", int30 == 3449);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(208, 173);
        int int21 = sum0.sum(191, 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 381 + "'", int18 == 381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 334 + "'", int21 == 334);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(9, 3842);
        int int27 = sum0.sum(1807, 4652);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3851 + "'", int24 == 3851);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6459 + "'", int27 == 6459);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(2799, 1643);
        int int18 = 0; // flaky: sum0.sum(1120, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4442 + "'", int15 == 4442);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1120 + "'", int18 == 1120);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = 0; // flaky: sum0.sum((int) (short) -1, 86);
        int int24 = sum0.sum(2344, 1130);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 85 + "'", int21 == 85);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3474 + "'", int24 == 3474);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        int int24 = sum0.sum(2705, 94);
        int int27 = sum0.sum(839, 1757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2799 + "'", int24 == 2799);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1298 + "'", int27 == 1298);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(500, 10);
        int int27 = sum0.sum(266, 1063);
        int int30 = sum0.sum(692, 2367);
        int int33 = sum0.sum(4109, 1492);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 510 + "'", int24 == 510);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1329 + "'", int27 == 1329);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3059 + "'", int30 == 3059);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5601 + "'", int33 == 5601);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(540, 689);
        int int15 = sum0.sum(1155, 6105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1229 + "'", int12 == 1229);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3630 + "'", int15 == 3630);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(0, 445);
        int int21 = sum0.sum(1118, 5601);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 445 + "'", int18 == 445);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6719 + "'", int21 == 6719);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        int int33 = sum0.sum((int) (short) 100, 255);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 355 + "'", int33 == 355);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(353, (int) (short) 10);
        int int24 = sum0.sum(143, 1126);
        int int27 = sum0.sum(481, 221);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1269 + "'", int24 == 1269);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 702 + "'", int27 == 702);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1109 + "'", int21 == 1109);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1486 + "'", int24 == 1486);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2460 + "'", int27 == 2460);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 533 + "'", int27 == 533);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        int int18 = sum0.sum(606, 93);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 699 + "'", int18 == 699);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(297, 483);
        int int27 = 0; // flaky: sum0.sum((int) (byte) -1, 379);
        int int30 = sum0.sum(63, 562);
        int int33 = sum0.sum(302, 228);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 390 + "'", int24 == 390);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 189 + "'", int27 == 189);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 625 + "'", int30 == 625);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 530 + "'", int33 == 530);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(26, 1225);
        java.lang.Class<?> wildcardClass4 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1251 + "'", int3 == 1251);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(91, 127);
        int int6 = sum0.sum(182, 160);
        int int9 = sum0.sum(16, 1495);
        int int12 = sum0.sum(4070, 3237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 342 + "'", int6 == 342);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1511 + "'", int9 == 1511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7307 + "'", int12 == 7307);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        int int33 = sum0.sum(0, 1487);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1487 + "'", int33 == 1487);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(438, 0);
        int int18 = sum0.sum(1109, 241);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438 + "'", int15 == 438);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1350 + "'", int18 == 1350);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        int int18 = sum0.sum(349, 53);
        int int21 = sum0.sum(1479, 1730);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1668 + "'", int15 == 1668);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3209 + "'", int21 == 3209);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 645 + "'", int24 == 645);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1599 + "'", int27 == 1599);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(0, 242);
        int int27 = sum0.sum(1162, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1162 + "'", int27 == 1162);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        int int36 = sum0.sum(2106, 1128);
        int int39 = sum0.sum(346, 2378);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3234 + "'", int36 == 3234);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1362 + "'", int39 == 1362);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(5068, 2028);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7096 + "'", int15 == 7096);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(97, 206);
        int int24 = sum0.sum(787, 823);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 303 + "'", int21 == 303);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 805 + "'", int24 == 805);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        int int30 = sum0.sum(487, 10);
        int int33 = sum0.sum(701, 1811);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 497 + "'", int30 == 497);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1256 + "'", int33 == 1256);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(185, 354);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 539 + "'", int21 == 539);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(208, 35);
        int int12 = sum0.sum(157, 174);
        int int15 = sum0.sum(559, 4344);
        int int18 = sum0.sum(0, 230);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 243 + "'", int9 == 243);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 331 + "'", int12 == 331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4903 + "'", int15 == 4903);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115 + "'", int18 == 115);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(218, 246);
        int int15 = sum0.sum(1553, 3757);
        int int18 = sum0.sum(48, 327);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2655 + "'", int15 == 2655);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 375 + "'", int18 == 375);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(30, 59);
        int int12 = sum0.sum(1418, 110);
        int int15 = sum0.sum(574, 3650);
        int int18 = sum0.sum(4765, 734);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 89 + "'", int9 == 89);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1528 + "'", int12 == 1528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2112 + "'", int15 == 2112);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5499 + "'", int18 == 5499);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(143, (int) 'a');
        int int18 = sum0.sum(500, 207);
        int int21 = sum0.sum(86, 2082);
        int int24 = sum0.sum(409, 1613);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 240 + "'", int15 == 240);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 707 + "'", int18 == 707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1084 + "'", int21 == 1084);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1011 + "'", int24 == 1011);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(48, 82);
        int int27 = sum0.sum(1319, 728);
        int int30 = sum0.sum(1071, 433);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65 + "'", int24 == 65);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2047 + "'", int27 == 2047);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1504 + "'", int30 == 1504);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(52, 31);
        int int18 = sum0.sum(1114, 856);
        int int21 = sum0.sum(1341, 1803);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1572 + "'", int21 == 1572);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(235, 514);
        int int27 = sum0.sum(6192, 3349);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 749 + "'", int24 == 749);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9541 + "'", int27 == 9541);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        int int27 = sum0.sum(343, 1120);
        int int30 = sum0.sum(1083, 251);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1463 + "'", int27 == 1463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1334 + "'", int30 == 1334);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(575, 199);
        int int18 = sum0.sum(419, 1021);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 774 + "'", int15 == 774);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 720 + "'", int18 == 720);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        int int15 = sum0.sum(302, 136);
        int int18 = sum0.sum(106, 1444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438 + "'", int15 == 438);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 775 + "'", int18 == 775);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(45, 48);
        int int12 = sum0.sum(203, 83);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 93 + "'", int9 == 93);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 286 + "'", int12 == 286);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(1492, 1573);
        int int24 = sum0.sum(2040, 1233);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3065 + "'", int21 == 3065);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3273 + "'", int24 == 3273);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum(699, 986);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1685 + "'", int15 == 1685);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((-1), 9);
        int int15 = sum0.sum(10, 534);
        int int18 = sum0.sum(313, 1117);
        int int21 = sum0.sum(1553, 442);
        int int24 = sum0.sum(106, 549);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 272 + "'", int15 == 272);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 715 + "'", int18 == 715);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995 + "'", int21 == 1995);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 655 + "'", int24 == 655);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int33 = sum0.sum(923, (int) (short) 1);
        int int36 = sum0.sum(663, 496);
        int int39 = sum0.sum(176, 704);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 924 + "'", int33 == 924);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1159 + "'", int36 == 1159);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 440 + "'", int39 == 440);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(113, 671);
        int int21 = sum0.sum(178, 831);
        int int24 = sum0.sum(173, 2591);
        int int27 = sum0.sum(1606, 1623);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 392 + "'", int18 == 392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1009 + "'", int21 == 1009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1382 + "'", int24 == 1382);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3229 + "'", int27 == 3229);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(342, 273);
        int int18 = sum0.sum(3481, 2326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 615 + "'", int15 == 615);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5807 + "'", int18 == 5807);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (int) (short) 100);
        int int27 = sum0.sum(934, 409);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1343 + "'", int27 == 1343);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(353, 292);
        int int27 = sum0.sum(1903, 1401);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 645 + "'", int24 == 645);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3304 + "'", int27 == 3304);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        int int24 = sum0.sum(150, 444);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 297 + "'", int24 == 297);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(107, 245);
        int int9 = sum0.sum(471, 1043);
        int int12 = sum0.sum(1823, 1333);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 176 + "'", int6 == 176);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 757 + "'", int9 == 757);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3156 + "'", int12 == 3156);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        int int21 = sum0.sum(54, 129);
        int int24 = sum0.sum(854, 1149);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 183 + "'", int21 == 183);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2003 + "'", int24 == 2003);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(0, 170);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 85 + "'", int15 == 85);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        int int36 = sum0.sum(2862, 2046);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4908 + "'", int36 == 4908);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        int int30 = 0; // flaky: sum0.sum((-1), 2151);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501 + "'", int21 == 1501);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569 + "'", int24 == 1569);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1021 + "'", int27 == 1021);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1075 + "'", int30 == 1075);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(365, 1103);
        int int18 = sum0.sum(229, 705);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 734 + "'", int15 == 734);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 467 + "'", int18 == 467);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        int int15 = sum0.sum(784, 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1188 + "'", int15 == 1188);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        int int36 = sum0.sum(589, 3474);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4063 + "'", int36 == 4063);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(136, 42);
        int int18 = sum0.sum((int) (short) 100, 282);
        int int21 = sum0.sum(320, 824);
        int int24 = sum0.sum(4293, 1814);
        int int27 = sum0.sum(0, 1240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 178 + "'", int15 == 178);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 572 + "'", int21 == 572);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6107 + "'", int24 == 6107);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 620 + "'", int27 == 620);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        int int33 = sum0.sum(353, 1885);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1119 + "'", int33 == 1119);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(111, 138);
        int int12 = sum0.sum(1225, 5366);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 249 + "'", int9 == 249);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6591 + "'", int12 == 6591);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(50, 549);
        int int9 = sum0.sum(2819, 1684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 599 + "'", int6 == 599);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4503 + "'", int9 == 4503);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(702, 465);
        int int12 = sum0.sum(556, 663);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1167 + "'", int9 == 1167);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1219 + "'", int12 == 1219);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        int int15 = sum0.sum(1056, 585);
        int int18 = sum0.sum(1511, 347);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1641 + "'", int15 == 1641);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1858 + "'", int18 == 1858);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(203, 3941);
        int int21 = sum0.sum(1585, 444);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2072 + "'", int18 == 2072);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2029 + "'", int21 == 2029);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(4, 320);
        int int27 = sum0.sum(83, 1511);
        int int30 = sum0.sum(4503, 483);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 162 + "'", int24 == 162);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 797 + "'", int27 == 797);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4986 + "'", int30 == 4986);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(719, 295);
        int int24 = sum0.sum(331, 2673);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1014 + "'", int21 == 1014);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1502 + "'", int24 == 1502);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(1557, 515);
        int int24 = sum0.sum(261, 384);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2072 + "'", int21 == 2072);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 645 + "'", int24 == 645);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(71, 93);
        int int12 = sum0.sum(982, 113);
        int int15 = sum0.sum(362, 1362);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 82 + "'", int9 == 82);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1095 + "'", int12 == 1095);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 862 + "'", int15 == 862);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        int int15 = sum0.sum(552, 856);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 704 + "'", int15 == 704);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(1479, 89);
        int int15 = sum0.sum(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(323, 3011);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1667 + "'", int24 == 1667);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 47);
        int int24 = sum0.sum(2975, 2093);
        int int27 = sum0.sum(1178, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5068 + "'", int24 == 5068);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1178 + "'", int27 == 1178);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(4070, 1525);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5595 + "'", int18 == 5595);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(142, 1636);
        int int30 = sum0.sum(3405, 1107);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 889 + "'", int27 == 889);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4512 + "'", int30 == 4512);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(208, 414);
        int int15 = sum0.sum(4765, 1823);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6588 + "'", int15 == 6588);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(142, 1636);
        int int30 = sum0.sum(3575, 1295);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 889 + "'", int27 == 889);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4870 + "'", int30 == 4870);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        int int18 = sum0.sum(7480, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7676 + "'", int18 == 7676);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        int int12 = sum0.sum(278, 1467);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1745 + "'", int12 == 1745);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(419, 536);
        int int21 = sum0.sum(365, 1476);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1841 + "'", int21 == 1841);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        int int21 = sum0.sum(4293, 729);
        int int24 = sum0.sum(291, 210);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5022 + "'", int21 == 5022);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 501 + "'", int24 == 501);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(952, 0);
        int int24 = sum0.sum(3471, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 952 + "'", int21 == 952);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3471 + "'", int24 == 3471);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(549, 0);
        int int27 = sum0.sum(6591, 774);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 549 + "'", int24 == 549);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7365 + "'", int27 == 7365);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        int int33 = sum0.sum(415, 191);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 606 + "'", int33 == 606);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 436 + "'", int24 == 436);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 649 + "'", int27 == 649);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(562, (int) (byte) 10);
        int int12 = sum0.sum(823, 1155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 572 + "'", int9 == 572);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 989 + "'", int12 == 989);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        int int24 = sum0.sum(3349, 924);
        int int27 = sum0.sum(829, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 152 + "'", int21 == 152);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4273 + "'", int24 == 4273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 829 + "'", int27 == 829);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        int int18 = sum0.sum(1050, 129);
        int int21 = sum0.sum(2398, 1783);
        int int24 = sum0.sum(747, 1706);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1179 + "'", int18 == 1179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4181 + "'", int21 == 4181);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2453 + "'", int24 == 2453);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(511, 0);
        int int12 = sum0.sum(753, 1225);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 511 + "'", int9 == 511);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 989 + "'", int12 == 989);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        int int30 = sum0.sum(2427, 1476);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 953 + "'", int27 == 953);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3903 + "'", int30 == 3903);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(175, 379);
        int int27 = sum0.sum(0, 337);
        int int30 = sum0.sum(1669, (int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 277 + "'", int24 == 277);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 337 + "'", int27 == 337);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1670 + "'", int30 == 1670);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(375, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 391 + "'", int15 == 391);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(677, 443);
        int int27 = sum0.sum(185, 1745);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1120 + "'", int24 == 1120);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 965 + "'", int27 == 965);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(218, 246);
        int int15 = sum0.sum(1553, 3757);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2655 + "'", int15 == 2655);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(650, 1953);
        int int21 = sum0.sum(230, 3637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2603 + "'", int18 == 2603);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3867 + "'", int21 == 3867);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) '4', 444);
        int int21 = sum0.sum(278, 831);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1109 + "'", int21 == 1109);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        int int33 = sum0.sum(572, 1159);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1731 + "'", int33 == 1731);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(106, 54);
        int int18 = sum0.sum(92, 48);
        int int21 = sum0.sum(369, 103);
        int int24 = sum0.sum(138, 1101);
        int int27 = sum0.sum(494, 1601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 160 + "'", int15 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 472 + "'", int21 == 472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1239 + "'", int24 == 1239);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2095 + "'", int27 == 2095);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(4181, 4);
        int int27 = sum0.sum(1240, 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4185 + "'", int24 == 4185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1240 + "'", int27 == 1240);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(2408, 175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2583 + "'", int15 == 2583);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(172, 219);
        int int21 = sum0.sum(779, 881);
        int int24 = sum0.sum((int) (short) 0, 815);
        int int27 = sum0.sum(1622, 553);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 815 + "'", int24 == 815);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2175 + "'", int27 == 2175);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        int int30 = sum0.sum(305, 1495);
        int int33 = sum0.sum(2710, 1763);
        int int36 = sum0.sum(1833, 2475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 522 + "'", int27 == 522);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 900 + "'", int30 == 900);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4473 + "'", int33 == 4473);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2154 + "'", int36 == 2154);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(951, 528);
        int int21 = sum0.sum(1939, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1479 + "'", int18 == 1479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1939 + "'", int21 == 1939);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(0, 170);
        int int18 = sum0.sum(2757, 5623);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 85 + "'", int15 == 85);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4190 + "'", int18 == 4190);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(496, 3520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2008 + "'", int21 == 2008);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(645, (int) (short) 0);
        int int15 = sum0.sum(2632, 981);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 645 + "'", int12 == 645);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3613 + "'", int15 == 3613);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(953, 9);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 962 + "'", int9 == 962);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1233, 185);
        int int15 = sum0.sum(295, 282);
        int int18 = sum0.sum(1322, 3487);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1418 + "'", int12 == 1418);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 577 + "'", int15 == 577);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4809 + "'", int18 == 4809);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(1330, 2151);
        int int21 = sum0.sum(208, 403);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3481 + "'", int18 == 3481);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 611 + "'", int21 == 611);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(136, 42);
        int int18 = sum0.sum((int) (short) 100, 282);
        int int21 = sum0.sum(320, 824);
        int int24 = sum0.sum(802, 1251);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 178 + "'", int15 == 178);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 572 + "'", int21 == 572);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2053 + "'", int24 == 2053);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(444, 1225);
        int int18 = sum0.sum(7480, 329);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1669 + "'", int15 == 1669);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7809 + "'", int18 == 7809);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(76, 407);
        int int18 = sum0.sum(4986, 939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 483 + "'", int15 == 483);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5925 + "'", int18 == 5925);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = 0; // flaky: sum0.sum(48, (-1));
        int int18 = 0; // flaky: sum0.sum(208, (int) (short) -1);
        int int21 = sum0.sum(1327, 1549);
        int int24 = sum0.sum(245, 207);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1438 + "'", int21 == 1438);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452 + "'", int24 == 452);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(0, 260);
        int int24 = sum0.sum(156, 152);
        int int27 = sum0.sum(181, 1159);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 308 + "'", int24 == 308);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 670 + "'", int27 == 670);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(2804, 0);
        int int12 = sum0.sum(2515, 1469);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2804 + "'", int9 == 2804);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3984 + "'", int12 == 3984);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(1003, 159);
        int int24 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int27 = sum0.sum(396, 2916);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1162 + "'", int21 == 1162);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1656 + "'", int27 == 1656);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(1446, 2241);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3687 + "'", int18 == 3687);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(251, 485);
        int int21 = sum0.sum(156, 229);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 385 + "'", int21 == 385);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1081 + "'", int21 == 1081);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1533 + "'", int24 == 1533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1452 + "'", int27 == 1452);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(368, 2028);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1198 + "'", int15 == 1198);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(143, 52);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 195 + "'", int21 == 195);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        int int36 = sum0.sum(302, 291);
        int int39 = sum0.sum(241, 747);
        int int42 = sum0.sum(1090, 2025);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 593 + "'", int36 == 593);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 494 + "'", int39 == 494);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3115 + "'", int42 == 3115);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(1261, (int) '4');
        int int24 = sum0.sum(806, 2333);
        int int27 = sum0.sum(498, 376);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1313 + "'", int21 == 1313);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3139 + "'", int24 == 3139);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 874 + "'", int27 == 874);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum((int) (short) 100, 385);
        int int24 = sum0.sum(25, 120);
        int int27 = sum0.sum(1572, 1468);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 485 + "'", int21 == 485);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 145 + "'", int24 == 145);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3040 + "'", int27 == 3040);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        int int36 = sum0.sum(779, 177);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 956 + "'", int36 == 956);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(65, 438);
        int int27 = sum0.sum(963, 779);
        int int30 = sum0.sum(1569, 1468);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1742 + "'", int27 == 1742);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3037 + "'", int30 == 3037);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        int int36 = sum0.sum(1240, 688);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1928 + "'", int36 == 1928);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(52, 31);
        int int18 = sum0.sum(320, 1233);
        int int21 = sum0.sum(877, 688);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1553 + "'", int18 == 1553);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1565 + "'", int21 == 1565);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(52, 31);
        int int18 = sum0.sum(766, 2563);
        int int21 = sum0.sum(164, 1121);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3329 + "'", int18 == 3329);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1285 + "'", int21 == 1285);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        int int18 = sum0.sum(182, 288);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 235 + "'", int18 == 235);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum(97, 172);
        int int24 = sum0.sum(1005, 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 269 + "'", int21 == 269);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1284 + "'", int24 == 1284);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(1319, 173);
        int int27 = sum0.sum(1362, 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1492 + "'", int24 == 1492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1362 + "'", int27 == 1362);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 868 + "'", int24 == 868);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 831 + "'", int27 == 831);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum(917, 1268);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2185 + "'", int27 == 2185);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(42, 677);
        int int18 = sum0.sum(599, 1014);
        int int21 = sum0.sum(2435, 184);
        int int24 = sum0.sum(1151, 630);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 719 + "'", int15 == 719);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1613 + "'", int18 == 1613);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2619 + "'", int21 == 2619);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1781 + "'", int24 == 1781);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(72, 145);
        int int27 = sum0.sum(1858, 545);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2403 + "'", int27 == 2403);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        int int36 = sum0.sum(0, 917);
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
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(143, 202);
        int int24 = sum0.sum(2398, 2367);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4765 + "'", int24 == 4765);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(391, 757);
        int int15 = sum0.sum(911, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 574 + "'", int12 == 574);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1003 + "'", int15 == 1003);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        int int15 = sum0.sum(310, 206);
        int int18 = sum0.sum(2525, 1192);
        int int21 = sum0.sum(1178, 673);
        int int24 = sum0.sum(541, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 516 + "'", int15 == 516);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3717 + "'", int18 == 3717);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1851 + "'", int21 == 1851);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 666 + "'", int24 == 666);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        int int24 = sum0.sum(245, 71);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 316 + "'", int24 == 316);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(257, 1270);
        int int18 = sum0.sum(951, 1178);
        int int21 = sum0.sum(2496, 296);
        int int24 = sum0.sum(821, 907);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527 + "'", int15 == 1527);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2129 + "'", int18 == 2129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2792 + "'", int21 == 2792);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 864 + "'", int24 == 864);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        int int30 = sum0.sum(316, 1020);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058 + "'", int27 == 1058);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 668 + "'", int30 == 668);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(814, 136);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 950 + "'", int18 == 950);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        int int18 = sum0.sum(719, (int) (byte) 0);
        int int21 = sum0.sum(152, 340);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 719 + "'", int18 == 719);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 246 + "'", int21 == 246);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(1528, 884);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2412 + "'", int12 == 2412);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        int int21 = sum0.sum(208, 2267);
        int int24 = sum0.sum(408, 275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2475 + "'", int21 == 2475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 683 + "'", int24 == 683);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(0, 354);
        int int18 = sum0.sum(1757, 1871);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 177 + "'", int15 == 177);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1814 + "'", int18 == 1814);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(92, 65);
        int int21 = sum0.sum(100, 59);
        int int24 = sum0.sum(2412, 1502);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 157 + "'", int18 == 157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3914 + "'", int24 == 3914);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(505, 1547);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1026 + "'", int21 == 1026);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        int int21 = sum0.sum(2273, 1389);
        int int24 = sum0.sum(0, 248);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3662 + "'", int21 == 3662);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 124 + "'", int24 == 124);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int30 = sum0.sum(5083, 711);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 998 + "'", int27 == 998);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5794 + "'", int30 == 5794);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(0, 417);
        int int21 = sum0.sum(67, 4611);
        int int24 = sum0.sum(1107, 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 417 + "'", int18 == 417);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2339 + "'", int21 == 2339);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1281 + "'", int24 == 1281);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(0, 115);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115 + "'", int21 == 115);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 391 + "'", int18 == 391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 830 + "'", int21 == 830);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 815 + "'", int24 == 815);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1729 + "'", int27 == 1729);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(42, 1247);
        int int24 = sum0.sum((int) (short) 1, 361);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289 + "'", int21 == 1289);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 181 + "'", int24 == 181);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(10, 116);
        int int24 = sum0.sum(0, 1289);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 63 + "'", int21 == 63);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1289 + "'", int24 == 1289);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(427, (int) '4');
        int int18 = sum0.sum(86, 877);
        int int21 = sum0.sum(342, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 479 + "'", int15 == 479);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 963 + "'", int18 == 963);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 384 + "'", int21 == 384);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(335, 202);
        int int18 = sum0.sum(261, 447);
        int int21 = sum0.sum(2783, 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 354 + "'", int18 == 354);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3042 + "'", int21 == 3042);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(304, 591);
        int int24 = sum0.sum(1707, 3329);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 895 + "'", int21 == 895);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2518 + "'", int24 == 2518);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        int int27 = sum0.sum(343, 1120);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1463 + "'", int27 == 1463);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        int int12 = sum0.sum(176, 1120);
        int int15 = sum0.sum(63, 557);
        int int18 = sum0.sum(892, 504);
        int int21 = sum0.sum(397, 295);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 648 + "'", int12 == 648);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 310 + "'", int15 == 310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1396 + "'", int18 == 1396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 692 + "'", int21 == 692);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(363, 42);
        int int18 = sum0.sum(623, 1528);
        int int21 = sum0.sum(1268, 200);
        int int24 = sum0.sum(0, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 405 + "'", int15 == 405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2151 + "'", int18 == 2151);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1468 + "'", int21 == 1468);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(171, 191);
        int int24 = sum0.sum(661, 614);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 181 + "'", int21 == 181);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1275 + "'", int24 == 1275);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(1397, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1397 + "'", int24 == 1397);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        int int33 = sum0.sum(856, 1749);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2605 + "'", int33 == 2605);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        int int24 = sum0.sum(291, 0);
        int int27 = sum0.sum(230, 2145);
        int int30 = sum0.sum(1622, 170);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2375 + "'", int27 == 2375);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1792 + "'", int30 == 1792);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(562, 203);
        int int21 = sum0.sum(397, 106);
        int int24 = sum0.sum(729, 734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 503 + "'", int21 == 503);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1463 + "'", int24 == 1463);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(533, 1568);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2101 + "'", int15 == 2101);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(438, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438 + "'", int15 == 438);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 268 + "'", int27 == 268);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(68, 355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 423 + "'", int12 == 423);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum((int) '#', 249);
        int int18 = sum0.sum(0, 48);
        int int21 = sum0.sum(2224, 1475);
        int int24 = sum0.sum(559, 1809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3699 + "'", int21 == 3699);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1184 + "'", int24 == 1184);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        int int30 = sum0.sum(305, 1495);
        int int33 = sum0.sum(2710, 1763);
        java.lang.Class<?> wildcardClass34 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 814 + "'", int24 == 814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 522 + "'", int27 == 522);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 900 + "'", int30 == 900);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4473 + "'", int33 == 4473);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(2475, 271);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2746 + "'", int21 == 2746);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        int int30 = sum0.sum(289, 354);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1787 + "'", int27 == 1787);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 643 + "'", int30 == 643);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(360, 747);
        int int12 = sum0.sum(1465, 1539);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1107 + "'", int9 == 1107);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1502 + "'", int12 == 1502);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(497, 219);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 716 + "'", int12 == 716);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(72, 145);
        int int27 = sum0.sum(78, 1565);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1643 + "'", int27 == 1643);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(172, 320);
        int int18 = sum0.sum(1418, 1474);
        int int21 = sum0.sum(1009, 832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 246 + "'", int15 == 246);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1446 + "'", int18 == 1446);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1841 + "'", int21 == 1841);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        int int33 = sum0.sum(4870, 2273);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7143 + "'", int33 == 7143);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1233, 185);
        int int15 = sum0.sum(158, 174);
        int int18 = sum0.sum(2367, 9);
        int int21 = sum0.sum(3717, 212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1418 + "'", int12 == 1418);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 166 + "'", int15 == 166);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2376 + "'", int18 == 2376);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3929 + "'", int21 == 3929);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(592, 208);
        int int24 = sum0.sum(191, 701);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 800 + "'", int21 == 800);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 446 + "'", int24 == 446);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(3630, 804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4434 + "'", int12 == 4434);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(203, 76);
        int int12 = sum0.sum(471, 157);
        int int15 = sum0.sum(76, 407);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 279 + "'", int9 == 279);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 628 + "'", int12 == 628);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 483 + "'", int15 == 483);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(417, 111);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 528 + "'", int24 == 528);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        int int33 = sum0.sum(259, 757);
        int int36 = sum0.sum(304, 465);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 508 + "'", int33 == 508);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 769 + "'", int36 == 769);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(140, 1403);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1543 + "'", int18 == 1543);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        int int6 = sum0.sum(385, 547);
        int int9 = sum0.sum(3757, 1326);
        int int12 = sum0.sum(212, 252);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 466 + "'", int6 == 466);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5083 + "'", int9 == 5083);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232 + "'", int12 == 232);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(572, 297);
        int int18 = sum0.sum(953, 2804);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 869 + "'", int15 == 869);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3757 + "'", int18 == 3757);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = 0; // flaky: sum0.sum((-1), 71);
        int int12 = sum0.sum(905, 847);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1752 + "'", int12 == 1752);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        int int36 = sum0.sum(979, 1091);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1035 + "'", int36 == 1035);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(335, 202);
        int int18 = sum0.sum(365, 175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 540 + "'", int18 == 540);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        int int18 = sum0.sum(1050, 129);
        int int21 = sum0.sum(2398, 1783);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1179 + "'", int18 == 1179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4181 + "'", int21 == 4181);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((-1), 9);
        int int15 = sum0.sum(10, 534);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 272 + "'", int15 == 272);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(208, 210);
        int int27 = sum0.sum(847, 343);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 209 + "'", int24 == 209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1190 + "'", int27 == 1190);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(63, 868);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 931 + "'", int18 == 931);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        int int18 = sum0.sum(0, 552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 276 + "'", int18 == 276);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(71, 93);
        int int12 = sum0.sum(369, 52);
        int int15 = sum0.sum(1591, 1381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 82 + "'", int9 == 82);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 421 + "'", int12 == 421);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2972 + "'", int15 == 2972);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(190, 157);
        int int18 = sum0.sum(485, 1);
        int int21 = sum0.sum(744, 197);
        int int24 = sum0.sum(728, 185);
        int int27 = sum0.sum(725, 25);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 347 + "'", int15 == 347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 486 + "'", int18 == 486);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 941 + "'", int21 == 941);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 913 + "'", int24 == 913);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 750 + "'", int27 == 750);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(155, 103);
        int int24 = sum0.sum(5747, 12382);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 258 + "'", int21 == 258);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18129 + "'", int24 == 18129);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum((int) '#', 0);
        int int12 = sum0.sum(0, 1120);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 560 + "'", int12 == 560);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(711, 240);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 951 + "'", int21 == 951);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        int int30 = sum0.sum(1011, 769);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1749 + "'", int21 == 1749);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 305 + "'", int24 == 305);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 433 + "'", int27 == 433);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1780 + "'", int30 == 1780);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(0, (int) (byte) 100);
        int int21 = sum0.sum(663, 94);
        int int24 = sum0.sum(496, 534);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 757 + "'", int21 == 757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 515 + "'", int24 == 515);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(304, 591);
        int int24 = sum0.sum(1167, 1622);
        int int27 = sum0.sum(188, 692);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 895 + "'", int21 == 895);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2789 + "'", int24 == 2789);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 440 + "'", int27 == 440);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        int int18 = sum0.sum(417, 414);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 831 + "'", int18 == 831);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(140, 160);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 150 + "'", int15 == 150);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(65, 400);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 465 + "'", int18 == 465);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        int int33 = sum0.sum(547, 1014);
        int int36 = sum0.sum(521, 1369);
        java.lang.Class<?> wildcardClass37 = sum0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1561 + "'", int33 == 1561);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 945 + "'", int36 == 945);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(1267, 1514);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2781 + "'", int6 == 2781);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(321, 1327);
        int int9 = sum0.sum(302, 218);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 824 + "'", 824, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 520 + "'", 520, int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum(30, (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(711, 271);
        int int27 = sum0.sum(720, 1553);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 65 + "'", 65, int9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        Assert.assertEquals("'" + int15 + "' != '" + 92 + "'", 92, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 120 + "'", 120, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 475 + "'", 475, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 982 + "'", 982, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 2273 + "'", 2273, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}
