package org.pme.example.test.sum;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);

// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum((int) (short) 0, (int) '#');

// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum((int) (byte) 100, 35);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        int int24 = sum0.sum(30, (int) 'a');
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        int int18 = sum0.sum(155, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum((int) (short) 100, 304);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(59, 238);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 297 + "'", int18 == 297);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum((int) (short) 1, 89);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(82, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(53, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(50, 0);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(10, 116);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 63 + "'", int21 == 63);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(71, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(49, 304);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 353 + "'", int15 == 353);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(71, 93);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 82 + "'", int9 == 82);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(335, 110);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(136, 136);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(59, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(196, 9);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(139, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(0, 49);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(98, 84);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 182 + "'", int9 == 182);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(0, (int) (short) 1);
        int int15 = sum0.sum(162, 87);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum((int) 'a', 272);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 369 + "'", int21 == 369);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(208, 84);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(45, 100);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145 + "'", int15 == 145);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(369, 249);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 618 + "'", int18 == 618);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(36, 145);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 181 + "'", int18 == 181);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(207, 384);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 591 + "'", int15 == 591);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = 0; // flaky: sum0.sum(71, (int) (short) -1);
        int int18 = sum0.sum(142, (int) '4');
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(252, 219);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 471 + "'", int21 == 471);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum((int) (short) 100, 385);
        int int24 = sum0.sum(25, 120);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 485 + "'", int21 == 485);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 145 + "'", int24 == 145);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(53, 106);
        int int24 = sum0.sum(0, 72);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 48);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(368, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 488 + "'", int15 == 488);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(42, (int) '#');
        int int15 = sum0.sum(335, 202);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 537 + "'", int15 == 537);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum((int) (short) 1, 197);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(42, 97);
        int int18 = sum0.sum(155, (int) (byte) 0);
        int int21 = sum0.sum(127, 107);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 139 + "'", int15 == 139);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234 + "'", int21 == 234);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(106, 54);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 160 + "'", int15 == 160);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(45, 48);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 93 + "'", int9 == 93);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(197, 343);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 270 + "'", int18 == 270);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(155, 162);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 317 + "'", int21 == 317);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(208, 263);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 471 + "'", int9 == 471);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(475, 175);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 650 + "'", int18 == 650);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(92, 65);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 157 + "'", int18 == 157);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(53, 106);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(84, 93);
        int int21 = sum0.sum(0, (int) '4');
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 177 + "'", int18 == 177);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(141, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(331, 136);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 467 + "'", int18 == 467);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(71, 93);
        int int12 = sum0.sum(369, 52);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 82 + "'", int9 == 82);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 421 + "'", int12 == 421);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = sum0.sum(269, 145);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, 50);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = 0; // flaky: sum0.sum(84, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(140, 50);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(87, 99);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(140, (int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 141 + "'", int15 == 141);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(0, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(72, 145);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 217 + "'", int24 == 217);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(143, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 143 + "'", int9 == 143);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(111, 471);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 291 + "'", int18 == 291);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(100, 49);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 149 + "'", int12 == 149);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(363, 42);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 405 + "'", int15 == 405);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(218, 205);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 423 + "'", int21 == 423);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(252, 92);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 344 + "'", int9 == 344);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(0, 50);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(4, 320);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 162 + "'", int24 == 162);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(485, 72);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 557 + "'", int21 == 557);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 336 + "'", int27 == 336);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(100, 49);
        int int15 = sum0.sum(500, 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 149 + "'", int12 == 149);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 703 + "'", int15 == 703);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(292, 26);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 318 + "'", int12 == 318);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(139, 11);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(419, 368);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 787 + "'", int15 == 787);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = 0; // flaky: sum0.sum((int) (short) -1, (int) (byte) -1);
        int int18 = sum0.sum(10, 181);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(127, 45);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 172 + "'", int15 == 172);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(196, 67);
        int int21 = sum0.sum(169, 181);
        int int24 = sum0.sum(395, 405);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(677, 443);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1120 + "'", int24 == 1120);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(409, 363);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 772 + "'", int15 == 772);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(245, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(140, 72);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 212 + "'", int15 == 212);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((-1), 9);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(30, 59);
        int int12 = sum0.sum(164, 292);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 89 + "'", int9 == 89);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(208, 35);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 243 + "'", int9 == 243);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(719, 295);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1014 + "'", int21 == 1014);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(135, 82);
        int int24 = sum0.sum(87, 671);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 379 + "'", int24 == 379);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(269, 263);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 532 + "'", int21 == 532);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(97, 98);
        int int12 = sum0.sum(443, 803);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 623 + "'", int12 == 623);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(30, 59);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 89 + "'", int9 == 89);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273 + "'", int24 == 273);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(136, 42);
        int int18 = sum0.sum((int) (short) 100, 282);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 178 + "'", int15 == 178);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(220, (int) (short) 100);
        int int18 = 0; // flaky: sum0.sum((int) (short) -1, 0);
        int int21 = sum0.sum(295, 86);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 320 + "'", int15 == 320);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381 + "'", int21 == 381);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        int int18 = sum0.sum(0, 312);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 156 + "'", int18 == 156);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(52, 31);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum(431, 271);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 702 + "'", int12 == 702);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum((int) (short) 10, 103);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 113 + "'", int12 == 113);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum((int) (byte) 100, 343);
        int int21 = sum0.sum(311, 10);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 443 + "'", int18 == 443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 321 + "'", int21 == 321);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(140, 50);
        int int27 = sum0.sum(4, 197);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 201 + "'", int27 == 201);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(50, 0);
        int int9 = sum0.sum(1233, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(157, 171);
        int int12 = sum0.sum(176, 414);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 164 + "'", int9 == 164);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 295 + "'", int12 == 295);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int15 = sum0.sum(238, 192);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 430 + "'", int15 == 430);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(953, 317);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1270 + "'", int24 == 1270);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(158, 304);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 231 + "'", int24 == 231);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum((int) 'a', 327);
        int int24 = sum0.sum(243, 447);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 212 + "'", int21 == 212);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 345 + "'", int24 == 345);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(311, 353);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 332 + "'", int24 == 332);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 643 + "'", int27 == 643);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(951, 282);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1233 + "'", int12 == 1233);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(651, 218);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 869 + "'", int18 == 869);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 381 + "'", int27 == 381);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        int int12 = sum0.sum(48, 479);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 527 + "'", int12 == 527);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        int int21 = sum0.sum(197, 92);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 289 + "'", int21 == 289);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(206, 505);
        int int21 = sum0.sum(202, 207);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 409 + "'", int21 == 409);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(1003, 159);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1162 + "'", int21 == 1162);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        int int18 = sum0.sum(0, 245);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(67, 101);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 84 + "'", int6 == 84);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(677, 650);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1327 + "'", int9 == 1327);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(77, 443);
        int int9 = sum0.sum(25, 587);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 306 + "'", int9 == 306);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(400, 169);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 569 + "'", int9 == 569);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(1120, 99);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1219 + "'", int21 == 1219);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(136, 136);
        int int21 = sum0.sum((int) (short) 1, 331);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 166 + "'", int21 == 166);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 671 + "'", int27 == 671);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(31, 142);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(175, 35);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 210 + "'", int12 == 210);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(49, 335);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 192 + "'", int21 == 192);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        int int21 = sum0.sum((int) '#', 353);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 194 + "'", int21 == 194);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(320, 185);
        int int18 = sum0.sum(106, 719);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 825 + "'", int18 == 825);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(643, 238);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 881 + "'", int6 == 881);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = 0; // flaky: sum0.sum((-1), 10);
        int int15 = sum0.sum(711, 92);
        int int18 = sum0.sum(84, 157);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 803 + "'", int15 == 803);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 241 + "'", int18 == 241);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum((int) (byte) 0, 487);
        int int24 = sum0.sum(953, 373);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1326 + "'", int24 == 1326);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(48, 82);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65 + "'", int24 == 65);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(0, 0);
        int int15 = sum0.sum(677, 373);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1050 + "'", int15 == 1050);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 429 + "'", int12 == 429);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(739, 138);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(400, 145);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 545 + "'", int21 == 545);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(109, 205);
        int int27 = sum0.sum(257, 162);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 157 + "'", int24 == 157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 419 + "'", int27 == 419);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(295, 241);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 536 + "'", int24 == 536);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(185, 53);
        int int12 = sum0.sum(231, 510);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(182, 120);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 302 + "'", int21 == 302);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(359, 228);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 587 + "'", int15 == 587);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(208, 263);
        int int12 = sum0.sum(1081, 288);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 471 + "'", int9 == 471);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1369 + "'", int12 == 1369);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(241, 335);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 288 + "'", int18 == 288);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(84, 475);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 559 + "'", int15 == 559);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(53, 227);
        int int21 = sum0.sum(385, (int) ' ');
        int int24 = sum0.sum(409, 234);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 417 + "'", int21 == 417);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 643 + "'", int24 == 643);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(445, 0);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 445 + "'", int15 == 445);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(209, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 281 + "'", int9 == 281);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        int int12 = sum0.sum(302, 194);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 496 + "'", int12 == 496);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) (short) 0, 99);
        int int21 = sum0.sum(10, 207);
        int int24 = sum0.sum(711, 443);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1154 + "'", int24 == 1154);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        int int30 = sum0.sum(86, 85);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 127 + "'", int24 == 127);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 486 + "'", int27 == 486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 171 + "'", int30 == 171);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(143, 31);
        int int24 = sum0.sum(445, 206);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 651 + "'", int24 == 651);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(856, 258);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1114 + "'", int18 == 1114);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum(103, 139);
        int int15 = sum0.sum(218, 127);
        int int18 = 0; // flaky: sum0.sum(138, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 345 + "'", int15 == 345);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 138 + "'", int18 == 138);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 585 + "'", int27 == 585);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(739, 138);
        int int21 = sum0.sum(379, 702);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 877 + "'", int18 == 877);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1081 + "'", int21 == 1081);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(86, 143);
        int int18 = sum0.sum(145, 335);
        int int21 = sum0.sum(304, 103);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 407 + "'", int21 == 407);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(158, 353);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 511 + "'", int21 == 511);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum((int) (short) 10, 50);
        int int12 = sum0.sum(1233, 185);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1418 + "'", int12 == 1418);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(208, 84);
        int int27 = sum0.sum(120, 0);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 120 + "'", int27 == 120);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(175, 779);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 477 + "'", int12 == 477);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(208, 414);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        int int21 = sum0.sum(65, 11);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 76 + "'", int21 == 76);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = 0; // flaky: sum0.sum(11, (int) (byte) -1);
        int int18 = sum0.sum(599, 63);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 662 + "'", int18 == 662);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(97, (int) (byte) 100);
        int int12 = sum0.sum((int) 'a', 109);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 197 + "'", int9 == 197);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(444, 1225);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1669 + "'", int15 == 1669);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(500, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 510 + "'", int12 == 510);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(87, 49);
        int int12 = sum0.sum(207, 0);
        int int15 = sum0.sum(106, 54);
        int int18 = sum0.sum(92, 48);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 136 + "'", int9 == 136);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 160 + "'", int15 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 140 + "'", int18 == 140);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(409, 363);
        int int18 = sum0.sum(117, 304);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 772 + "'", int15 == 772);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421 + "'", int18 == 421);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(368, 63);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 431 + "'", int18 == 431);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(135, 82);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 217 + "'", int21 == 217);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(136, 42);
        int int18 = sum0.sum(2082, 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 178 + "'", int15 == 178);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2224 + "'", int18 == 2224);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(0, 445);
        int int21 = sum0.sum(246, 1327);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 445 + "'", int18 == 445);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1573 + "'", int21 == 1573);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 86 + "'", int30 == 86);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum(0, 111);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 111 + "'", int12 == 111);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(292, 47);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 339 + "'", int9 == 339);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(103, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum((int) (short) 10, 347);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 357 + "'", int21 == 357);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(168, (int) '4');
        int int15 = sum0.sum(0, 207);
        int int18 = sum0.sum(241, 1162);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1403 + "'", int18 == 1403);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(135, 35);
        int int18 = sum0.sum(35, 345);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 190 + "'", int18 == 190);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(77, 443);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 177);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 498 + "'", int15 == 498);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(427, (int) '4');
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 479 + "'", int15 == 479);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum((int) '#', 249);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        int int18 = sum0.sum(110, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(52, 42);
        int int9 = sum0.sum(291, 85);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 376 + "'", int9 == 376);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(0, 343);
        int int15 = sum0.sum(677, 548);
        int int18 = sum0.sum(271, 142);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1225 + "'", int15 == 1225);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 413 + "'", int18 == 413);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(181, 537);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 359 + "'", int21 == 359);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(87, 0);
        int int18 = sum0.sum(99, 270);
        int int21 = sum0.sum(182, 120);
        int int24 = sum0.sum(772, 317);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 369 + "'", int18 == 369);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 302 + "'", int21 == 302);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1089 + "'", int24 == 1089);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(169, 0);
        int int15 = sum0.sum(209, 176);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = 0; // flaky: sum0.sum((-1), 429);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 214 + "'", int12 == 214);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(609, 193);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 802 + "'", int21 == 802);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(139, 45);
        int int18 = sum0.sum(52, 150);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 184 + "'", int15 == 184);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = sum0.sum(84, 174);
        int int21 = sum0.sum(109, 438);
        int int24 = sum0.sum(486, 296);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 129 + "'", int18 == 129);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 547 + "'", int21 == 547);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(487, 136);
        int int24 = sum0.sum(109, 205);
        int int27 = sum0.sum(158, 171);
        int int30 = sum0.sum(89, 150);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 157 + "'", int24 == 157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 329 + "'", int27 == 329);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 239 + "'", int30 == 239);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        int int30 = sum0.sum(275, 472);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 111 + "'", int27 == 111);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 747 + "'", int30 == 747);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(201, (int) (byte) 1);
        int int21 = sum0.sum(430, 291);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 721 + "'", int21 == 721);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(207, 97);
        int int15 = sum0.sum(107, 252);
        int int18 = sum0.sum(208, 173);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 304 + "'", int12 == 304);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 359 + "'", int15 == 359);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 381 + "'", int18 == 381);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(304, 248);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 552 + "'", int21 == 552);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(249, 252);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 501 + "'", int15 == 501);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(335, 0);
        int int15 = sum0.sum(1162, 141);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1303 + "'", int15 == 1303);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(384, 336);
        java.lang.Class<?> wildcardClass4 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 720 + "'", int3 == 720);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(116, 208);
        int int21 = sum0.sum(99, 89);
        int int24 = sum0.sum(260, 31);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 188 + "'", int21 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 291 + "'", int24 == 291);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(76, 345);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 421 + "'", int9 == 421);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum((int) (byte) 0, (int) (byte) 100);
        int int9 = sum0.sum(116, 320);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 218 + "'", int9 == 218);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum(219, 373);
        java.lang.Class<?> wildcardClass4 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum((int) (short) 100, 405);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 505 + "'", int15 == 505);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(42, 101);
        int int15 = sum0.sum(339, 193);
        int int18 = sum0.sum(0, 559);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 532 + "'", int15 == 532);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(168, (int) '4');
        int int15 = sum0.sum(0, 207);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        int int30 = sum0.sum(141, 662);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 190 + "'", int24 == 190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 803 + "'", int30 == 803);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(72, 1403);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1475 + "'", int24 == 1475);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 229 + "'", int15 == 229);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 240 + "'", int18 == 240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 641 + "'", int24 == 641);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 529 + "'", int27 == 529);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(4, 93);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, 238);
        int int24 = sum0.sum(63, 174);
        int int27 = sum0.sum(641, 963);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 802 + "'", int27 == 802);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(77, 443);
        int int9 = sum0.sum(25, 587);
        int int12 = sum0.sum(317, 205);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 306 + "'", int9 == 306);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 522 + "'", int12 == 522);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(721, 380);
        int int18 = sum0.sum(1050, 129);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1101 + "'", int15 == 1101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1179 + "'", int18 == 1179);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(142, 140);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282 + "'", int24 == 282);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(0, 207);
        int int15 = sum0.sum(569, 91);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 207 + "'", int12 == 207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 660 + "'", int15 == 660);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(1153, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1153 + "'", int12 == 1153);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(30, (int) '#');
        int int21 = sum0.sum(599, 341);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 940 + "'", int21 == 940);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(4, 320);
        int int9 = sum0.sum(30, 59);
        int int12 = sum0.sum(1418, 110);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 162 + "'", int6 == 162);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 89 + "'", int9 == 89);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1528 + "'", int12 == 1528);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 251);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 572 + "'", int15 == 572);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 271 + "'", int18 == 271);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2378 + "'", int21 == 2378);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(498, 207);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 705 + "'", int18 == 705);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(50, 549);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 599 + "'", int6 == 599);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(321, 177);
        int int18 = sum0.sum(48, 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 498 + "'", int15 == 498);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 329 + "'", int18 == 329);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(145, 107);
        int int21 = sum0.sum(208, (int) '#');
        int int24 = sum0.sum(1270, 1499);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 252 + "'", int18 == 252);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 243 + "'", int21 == 243);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2769 + "'", int24 == 2769);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = sum0.sum(405, (int) (short) 1);
        int int24 = sum0.sum(689, 719);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 704 + "'", int24 == 704);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 711 + "'", int18 == 711);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 193 + "'", int21 == 193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 444 + "'", int27 == 444);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum((int) '#', (int) ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(208, 84);
        int int27 = sum0.sum(120, 0);
        int int30 = sum0.sum(514, 246);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 120 + "'", int27 == 120);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 760 + "'", int30 == 760);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (int) (short) 0);
        int int18 = sum0.sum(110, 135);
        int int21 = sum0.sum(77, 87);
        int int24 = sum0.sum(1081, 71);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152 + "'", int24 == 1152);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 203 + "'", int24 == 203);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058 + "'", int27 == 1058);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1133 + "'", int27 == 1133);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(143, (int) (short) 0);
        int int15 = sum0.sum(169, 100);
        int int18 = sum0.sum(194, 765);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 143 + "'", int12 == 143);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269 + "'", int15 == 269);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 959 + "'", int18 == 959);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(97, 101);
        int int18 = sum0.sum(368, 63);
        int int21 = sum0.sum(332, 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 431 + "'", int18 == 431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 332 + "'", int21 == 332);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = 0; // flaky: sum0.sum((-1), 71);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = 0; // flaky: sum0.sum((-1), 71);
        int int12 = sum0.sum(190, 549);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 739 + "'", int12 == 739);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(93, 711);
        int int21 = sum0.sum(405, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 402 + "'", int18 == 402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(239, 320);
        int int21 = sum0.sum(329, 9);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 559 + "'", int18 == 559);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 338 + "'", int21 == 338);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(136, 191);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 327 + "'", int12 == 327);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum((int) (byte) 10, 35);
        int int12 = sum0.sum(207, 856);
        int int15 = sum0.sum(237, 101);
        int int18 = sum0.sum(562, 203);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1063 + "'", int12 == 1063);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 338 + "'", int15 == 338);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(295, 241);
        int int27 = sum0.sum((int) 'a', 172);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 536 + "'", int24 == 536);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 269 + "'", int27 == 269);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(940, 557);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1497 + "'", int9 == 1497);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = sum0.sum(1268, 368);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) (short) 0, 11);
        int int12 = sum0.sum(703, 227);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 930 + "'", int12 == 930);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        int int30 = sum0.sum(427, 342);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 243 + "'", int24 == 243);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 769 + "'", int30 == 769);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(245, 0);
        int int15 = sum0.sum(145, 641);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 393 + "'", int15 == 393);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1952 + "'", int30 == 1952);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(0, 220);
        int int12 = sum0.sum(296, 57);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 353 + "'", int12 == 353);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum((int) (short) 1, (int) (byte) 100);
        int int18 = sum0.sum(48, 0);
        int int21 = sum0.sum(257, 349);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 303 + "'", int21 == 303);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(405, 869);
        int int21 = sum0.sum(139, 181);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 637 + "'", int18 == 637);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 160 + "'", int21 == 160);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(48, 11);
        int int18 = sum0.sum(162, 220);
        int int21 = sum0.sum(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 191 + "'", int18 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        int int24 = sum0.sum(289, 245);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 534 + "'", int24 == 534);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(50, 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 609 + "'", int9 == 609);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(814, 337);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1151 + "'", int21 == 1151);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = 0; // flaky: sum0.sum((int) (short) -1, 100);
        int int12 = sum0.sum(45, 127);
        int int15 = sum0.sum(162, 45);
        int int18 = sum0.sum(106, 139);
        int int21 = sum0.sum(164, 177);
        int int24 = sum0.sum(219, 0);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 207 + "'", int15 == 207);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 341 + "'", int21 == 341);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 219 + "'", int24 == 219);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(261, 76);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 337 + "'", int21 == 337);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82 + "'", int21 == 82);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 243 + "'", int24 == 243);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(245, 135);
        int int18 = sum0.sum(711, 292);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 380 + "'", int15 == 380);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 220 + "'", int21 == 220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 237 + "'", int24 == 237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 111 + "'", int27 == 111);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum((int) '#', (int) (byte) 1);
        int int18 = sum0.sum(92, 65);
        int int21 = sum0.sum(100, 59);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 157 + "'", int18 == 157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 159 + "'", int21 == 159);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) 'a', (int) (short) 100);
        int int9 = sum0.sum(67, 269);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 168 + "'", int9 == 168);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = 0; // flaky: sum0.sum((int) (byte) -1, 208);
        int int24 = sum0.sum(142, 821);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 963 + "'", int24 == 963);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, (int) (short) 1);
        int int12 = sum0.sum((int) (byte) 100, 77);
        int int15 = 0; // flaky: sum0.sum(16, (-1));
        int int18 = sum0.sum(59, 0);
        int int21 = sum0.sum(273, 241);
        int int24 = sum0.sum(517, 339);
        int int27 = sum0.sum(1109, 214);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 514 + "'", int21 == 514);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 856 + "'", int24 == 856);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1323 + "'", int27 == 1323);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(63, 486);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 549 + "'", int9 == 549);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 345 + "'", int21 == 345);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 503 + "'", int24 == 503);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1742 + "'", int27 == 1742);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(106, 891);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 997 + "'", int21 == 997);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(35, 197);
        int int9 = sum0.sum(71, 35);
        int int12 = sum0.sum(0, 227);
        int int15 = sum0.sum(92, 50);
        int int18 = 0; // flaky: sum0.sum(485, (int) (byte) -1);
        int int21 = sum0.sum(67, 487);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 227 + "'", int12 == 227);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 485 + "'", int18 == 485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257 + "'", int24 == 257);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1254 + "'", int27 == 1254);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(97, 1);
        int int18 = sum0.sum(197, (int) (byte) 0);
        int int21 = sum0.sum(486, (int) (byte) 1);
        int int24 = sum0.sum(363, 10);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 487 + "'", int21 == 487);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 373 + "'", int24 == 373);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        int int30 = sum0.sum(720, 365);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 263 + "'", int18 == 263);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 175 + "'", int21 == 175);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 400 + "'", int24 == 400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1787 + "'", int27 == 1787);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1085 + "'", int30 == 1085);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(238, 291);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 529 + "'", int12 == 529);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(380, (int) (short) 0);
        int int21 = sum0.sum(91, 702);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380 + "'", int18 == 380);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 793 + "'", int21 == 793);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(304, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 404 + "'", int15 == 404);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(227, 72);
        int int18 = sum0.sum(35, 0);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 299 + "'", int15 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(0, 155);
        int int15 = sum0.sum(205, (int) (byte) 0);
        int int18 = sum0.sum(479, 0);
        int int21 = sum0.sum(0, 260);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 205 + "'", int15 == 205);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 479 + "'", int18 == 479);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(197, 30);
        int int12 = sum0.sum(52, 227);
        int int15 = sum0.sum(71, 155);
        int int18 = sum0.sum(201, 111);
        int int21 = sum0.sum(252, 219);
        int int24 = sum0.sum(488, 278);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 227 + "'", int9 == 227);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 279 + "'", int12 == 279);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 113 + "'", int15 == 113);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 312 + "'", int18 == 312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 471 + "'", int21 == 471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 766 + "'", int24 == 766);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 174 + "'", int21 == 174);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 261 + "'", int24 == 261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 832 + "'", int27 == 832);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 221 + "'", int30 == 221);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum(169, 4);
        int int15 = sum0.sum(409, 363);
        int int18 = sum0.sum(117, 304);
        int int21 = sum0.sum(295, 331);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 173 + "'", int12 == 173);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 772 + "'", int15 == 772);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421 + "'", int18 == 421);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 313 + "'", int21 == 313);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 272 + "'", int12 == 272);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(98, 245);
        int int15 = sum0.sum((int) (byte) 1, 110);
        int int18 = sum0.sum(0, 206);
        int int21 = sum0.sum(1063, 86);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 343 + "'", int12 == 343);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1149 + "'", int21 == 1149);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(643, 238);
        int int9 = sum0.sum(322, 336);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 881 + "'", int6 == 881);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 329 + "'", int9 == 329);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum((int) 'a', 72);
        int int21 = sum0.sum(251, 155);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 169 + "'", int18 == 169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 406 + "'", int21 == 406);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1327 + "'", int27 == 1327);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(295, 241);
        int int27 = sum0.sum(1063, 561);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 536 + "'", int24 == 536);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1624 + "'", int27 == 1624);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(53, 0);
        int int18 = sum0.sum(101, (int) (byte) 100);
        int int21 = sum0.sum(500, 650);
        int int24 = sum0.sum(625, 53);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 575 + "'", int21 == 575);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 678 + "'", int24 == 678);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(71, 93);
        int int12 = sum0.sum(218, 229);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 82 + "'", int9 == 82);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 447 + "'", int12 == 447);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(229, 1270);
        int int15 = sum0.sum(373, 138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1499 + "'", int12 == 1499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 511 + "'", int15 == 511);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(1319, 173);
        int int27 = sum0.sum(1289, 93);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1492 + "'", int24 == 1492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1382 + "'", int27 == 1382);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (int) (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(101, 175);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 169 + "'", int12 == 169);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 384 + "'", int18 == 384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 207 + "'", int21 == 207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 138 + "'", int24 == 138);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(42, (int) (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(82, 113);
        int int15 = sum0.sum(302, 136);
        int int18 = sum0.sum(1151, 332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 195 + "'", int12 == 195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438 + "'", int15 == 438);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1483 + "'", int18 == 1483);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(0, 255);
        int int12 = sum0.sum(173, 381);
        int int15 = sum0.sum(409, 557);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 277 + "'", int12 == 277);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 483 + "'", int15 == 483);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(143, 48);
        int int15 = sum0.sum(45, 998);
        int int18 = sum0.sum(196, 1151);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 191 + "'", int12 == 191);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043 + "'", int15 == 1043);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1347 + "'", int18 == 1347);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        int int30 = sum0.sum(1133, 143);
        java.lang.Class<?> wildcardClass31 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1327 + "'", int27 == 1327);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1276 + "'", int30 == 1276);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = sum0.sum((int) '4', 162);
        int int15 = sum0.sum(106, 113);
        int int18 = sum0.sum(136, 136);
        int int21 = sum0.sum((int) (short) 1, 331);
        int int24 = sum0.sum(1121, 856);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 219 + "'", int15 == 219);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136 + "'", int18 == 136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 166 + "'", int21 == 166);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1977 + "'", int24 == 1977);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(498, 207);
        int int21 = sum0.sum(801, 282);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 705 + "'", int18 == 705);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1083 + "'", int21 == 1083);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(359, 36);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 395 + "'", int12 == 395);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(97, 111);
        int int15 = sum0.sum((int) '4', 321);
        int int18 = sum0.sum(218, 585);
        int int21 = sum0.sum(1474, 157);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 363 + "'", int6 == 363);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 237 + "'", int9 == 237);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 373 + "'", int15 == 373);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 803 + "'", int18 == 803);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1631 + "'", int21 == 1631);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) (byte) 1, (int) 'a');
        int int15 = sum0.sum(0, (int) ' ');
        int int18 = sum0.sum(145, 295);
        int int21 = sum0.sum(171, 191);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 181 + "'", int21 == 181);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(0, 240);
        int int21 = sum0.sum(178, 297);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120 + "'", int18 == 120);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 475 + "'", int21 == 475);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(30, (int) (byte) 100);
        int int12 = 0; // flaky: sum0.sum((int) (byte) 10, (int) (byte) -1);
        int int15 = sum0.sum(76, 16);
        int int18 = sum0.sum(207, (int) (short) 1);
        int int21 = sum0.sum((int) ' ', 109);
        int int24 = sum0.sum(317, 203);
        int int27 = sum0.sum(552, 76);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208 + "'", int18 == 208);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141 + "'", int21 == 141);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520 + "'", int24 == 520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 628 + "'", int27 == 628);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(10, (int) '4');
        int int9 = sum0.sum(10, 0);
        int int12 = sum0.sum(97, 238);
        int int15 = sum0.sum(217, 192);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 335 + "'", int12 == 335);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 409 + "'", int15 == 409);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 0, (int) 'a');
        int int6 = sum0.sum(145, (int) (byte) 10);
        int int9 = sum0.sum(109, 1492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 155 + "'", int6 == 155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1601 + "'", int9 == 1601);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(42, 49);
        int int24 = sum0.sum(368, 856);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 612 + "'", int24 == 612);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 821 + "'", int18 == 821);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 152 + "'", int21 == 152);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum(135, 50);
        int int12 = 0; // flaky: sum0.sum(363, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 185 + "'", int9 == 185);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363 + "'", int12 == 363);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(50, (int) '#');
        int int15 = sum0.sum(0, (int) (short) 1);
        int int18 = sum0.sum(0, 72);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(110, 52);
        int int15 = sum0.sum(16, 162);
        int int18 = sum0.sum(106, 100);
        int int21 = sum0.sum(202, (int) (short) 1);
        int int24 = sum0.sum(191, 207);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 162 + "'", int12 == 162);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 203 + "'", int21 == 203);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 199 + "'", int24 == 199);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum((int) (short) 10, 197);
        int int12 = sum0.sum((int) (short) 1, 52);
        int int15 = sum0.sum(1233, 241);
        int int18 = sum0.sum(336, 140);
        int int21 = sum0.sum(207, 1119);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 207 + "'", int9 == 207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1474 + "'", int15 == 1474);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 476 + "'", int18 == 476);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 663 + "'", int21 == 663);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(141, 409);
        int int12 = sum0.sum(279, 341);
        int int15 = sum0.sum(192, 59);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 275 + "'", int9 == 275);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 251 + "'", int15 == 251);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 212 + "'", int30 == 212);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1561 + "'", int33 == 1561);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 150 + "'", int21 == 150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 390 + "'", int24 == 390);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 189 + "'", int27 == 189);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(1120, 99);
        int int24 = sum0.sum(346, 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1219 + "'", int21 == 1219);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 346 + "'", int24 == 346);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(99, 160);
        int int18 = sum0.sum(529, 1952);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 259 + "'", int15 == 259);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2481 + "'", int18 == 2481);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = 0; // flaky: sum0.sum(245, (-1));
        int int15 = sum0.sum(2224, 650);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 245 + "'", int12 == 245);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2874 + "'", int15 == 2874);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(145, 150);
        int int21 = sum0.sum(671, 516);
        java.lang.Class<?> wildcardClass22 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 295 + "'", int18 == 295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(1438, 405);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1843 + "'", int15 == 1843);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(116, 42);
        int int9 = sum0.sum(110, 35);
        int int12 = sum0.sum(218, 174);
        int int15 = sum0.sum(327, 173);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 145 + "'", int9 == 145);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 392 + "'", int12 == 392);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(100, (int) (byte) 10);
        int int12 = sum0.sum(31, 155);
        int int15 = sum0.sum(87, 113);
        int int18 = sum0.sum(0, 321);
        int int21 = sum0.sum(1120, 99);
        int int24 = sum0.sum(1014, 156);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 93 + "'", int12 == 93);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1219 + "'", int21 == 1219);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1170 + "'", int24 == 1170);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum((int) ' ', (int) (byte) 10);
        int int15 = sum0.sum(158, 234);
        int int18 = sum0.sum(84, 93);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 177 + "'", int18 == 177);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) (byte) 100, (int) (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(71, 207);
        int int12 = sum0.sum(357, 320);
        int int15 = sum0.sum(0, 392);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 677 + "'", int12 == 677);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        int int15 = sum0.sum(392, 1114);
        int int18 = sum0.sum(248, 281);
        int int21 = sum0.sum(239, 611);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 753 + "'", int15 == 753);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 529 + "'", int18 == 529);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 425 + "'", int21 == 425);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(35, (int) (byte) 1);
        int int21 = sum0.sum(320, 145);
        int int24 = sum0.sum(953, 317);
        int int27 = sum0.sum(184, 25);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 279 + "'", int15 == 279);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 465 + "'", int21 == 465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1270 + "'", int24 == 1270);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 209 + "'", int27 == 209);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((int) '4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (int) (byte) 100);
        int int12 = sum0.sum(177, 929);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 71 + "'", int9 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 553 + "'", int12 == 553);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum(197, 76);
        int int9 = sum0.sum(417, 181);
        int int12 = sum0.sum(471, 57);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 273 + "'", int6 == 273);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 598 + "'", int9 == 598);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 528 + "'", int12 == 528);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) (short) 1, (int) (byte) 10);
        int int9 = sum0.sum(0, (int) (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(140, 245);
        int int18 = sum0.sum(11, 92);
        int int21 = sum0.sum(218, 0);
        int int24 = sum0.sum(231, 641);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 385 + "'", int15 == 385);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 218 + "'", int21 == 218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 436 + "'", int24 == 436);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((int) '#', 52);
        int int9 = sum0.sum((int) 'a', 0);
        int int12 = sum0.sum(198, 231);
        int int15 = sum0.sum(143, 169);
        int int18 = sum0.sum(49, 430);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 87 + "'", int6 == 87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        Assert.assertEquals("'" + int12 + "' != '" + 429 + "'", 429, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 156 + "'", 156, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 479 + "'", 479, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = sum0.sum('a', 0);
        int int12 = sum0.sum(238, 291);
        int int15 = sum0.sum(1479, 189);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 97 + "'", 97, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 529 + "'", 529, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1668 + "'", 1668, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 71 + "'", 71, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 49 + "'", 49, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 169 + "'", 169, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 94 + "'", 94, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 384 + "'", 384, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 207 + "'", 207, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 273 + "'", 273, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 400 + "'", 400, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum('#', 52);
        int int9 = 0; // flaky: sum0.sum((-1), 142);
        int int12 = sum0.sum(227, 45);
        int int15 = sum0.sum(72, 158);
        int int18 = sum0.sum(48, 1118);
        java.lang.Class<?> wildcardClass19 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 87 + "'", 87, int6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 141 + "'", int9 == 141);
        Assert.assertEquals("'" + int12 + "' != '" + 272 + "'", 272, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 115 + "'", 115, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 583 + "'", 583, int18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum(52, 48);
        int int15 = sum0.sum(94, 185);
        int int18 = sum0.sum(486, 335);
        int int21 = sum0.sum(77, 227);
        int int24 = sum0.sum(188, 215);
        int int27 = sum0.sum(824, 510);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 100 + "'", 100, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 279 + "'", 279, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 821 + "'", 821, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 152 + "'", 152, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 403 + "'", 403, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 1334 + "'", 1334, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = 0; // flaky: sum0.sum((-1), (int) (short) 1);
        int int15 = sum0.sum(87, (short) 0);
        int int18 = sum0.sum('#', ' ');
        int int21 = sum0.sum(150, 0);
        int int24 = sum0.sum(297, 483);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 0 + "'", 0, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 87 + "'", 87, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 67 + "'", 67, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 150 + "'", 150, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 390 + "'", 390, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(10, 49);
        int int9 = sum0.sum(42, (byte) 100);
        int int12 = sum0.sum(136, 191);
        int int15 = sum0.sum(689, 1573);
        java.lang.Class<?> wildcardClass16 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 59 + "'", 59, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 71 + "'", 71, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 327 + "'", 327, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 1131 + "'", 1131, int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(143, 220);
        int int9 = sum0.sum(0, 237);
        int int12 = sum0.sum(553, 72);
        java.lang.Class<?> wildcardClass13 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 363 + "'", 363, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 237 + "'", 237, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 625 + "'", 625, int12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum((byte) 100, (byte) 0);
        int int6 = sum0.sum(11, 49);
        int int9 = sum0.sum(430, 561);
        java.lang.Class<?> wildcardClass10 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 100 + "'", 100, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 30 + "'", 30, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 991 + "'", 991, int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = 0; // flaky: sum0.sum((int) (short) -1, (int) 'a');
        int int6 = sum0.sum((short) 1, (byte) 10);
        int int9 = sum0.sum(0, (byte) 1);
        int int12 = sum0.sum((byte) 1, 'a');
        int int15 = sum0.sum(0, ' ');
        int int18 = sum0.sum(25, 517);
        int int21 = sum0.sum(1497, 881);
        int int24 = sum0.sum(1120, 237);
        java.lang.Class<?> wildcardClass25 = sum0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        Assert.assertEquals("'" + int6 + "' != '" + 11 + "'", 11, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 1 + "'", 1, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 49 + "'", 49, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 16 + "'", 16, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 271 + "'", 271, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 2378 + "'", 2378, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 1357 + "'", 1357, int24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.pme.example.Sum sum0 = new org.pme.example.Sum();
        int int3 = sum0.sum('4', 0);
        int int6 = sum0.sum(42, (byte) 100);
        int int9 = sum0.sum(0, 98);
        int int12 = sum0.sum(59, 279);
        int int15 = sum0.sum(94, (short) 0);
        int int18 = sum0.sum(229, 155);
        int int21 = sum0.sum(0, 414);
        int int24 = sum0.sum(71, 202);
        int int27 = sum0.sum(720, 278);
        java.lang.Class<?> wildcardClass28 = sum0.getClass();
        Assert.assertEquals("'" + int3 + "' != '" + 52 + "'", 52, int3);
        Assert.assertEquals("'" + int6 + "' != '" + 71 + "'", 71, int6);
        Assert.assertEquals("'" + int9 + "' != '" + 49 + "'", 49, int9);
        Assert.assertEquals("'" + int12 + "' != '" + 169 + "'", 169, int12);
        Assert.assertEquals("'" + int15 + "' != '" + 94 + "'", 94, int15);
        Assert.assertEquals("'" + int18 + "' != '" + 384 + "'", 384, int18);
        Assert.assertEquals("'" + int21 + "' != '" + 207 + "'", 207, int21);
        Assert.assertEquals("'" + int24 + "' != '" + 273 + "'", 273, int24);
        Assert.assertEquals("'" + int27 + "' != '" + 998 + "'", 998, int27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}
