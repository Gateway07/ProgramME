package tests;

import org.junit.Test;

public class Revers {


    Node mergeResult(Node node1, Node node2) {
        // Your code here
        Node start1 = node1;
        Node end1 = start1 == null ? null : new Node(start1.data);
        if (start1 != null)
            while (start1.next != null) {
                start1 = start1.next;

                var next = new Node(start1.data);
                next.next = end1;
                end1 = next;
            }

        Node start2 = node2;
        Node end2 = start2 == null ? null : new Node(start2.data);
        if (start2 != null)
            while (start2.next != null) {
                start2 = start2.next;

                var next = new Node(start2.data);
                next.next = end2;
                end2 = next;
            }

        if (end2 == null)
            return end1;
        if (end1 == null)
            return end2;

        Node root = null;
        if (end1.data < end2.data) {
            root = new Node(end2.data);
            end2 = end2.next;
        } else {
            root = new Node(end1.data);
            end1 = end1.next;
        }

        Node start = root;
        while (end1 != null && end2 != null) {
            if (end1.data < end2.data) {
                start.next = end2;
                end2 = end2.next;
            } else {
                start.next = end1;
                end1 = end1.next;
            }
            start = start.next;
        }
        if (end1 != null)
            start.next = end1;
        if (end2 != null)
            start.next = end2;

        return root;
    }

    @Test
    public void test() {
        Node[] ns1 = new Node[]{new Node(1), new Node(4), new Node(5), new Node(20)};
        Node[] ns2 = new Node[]{new Node(0), new Node(4), new Node(10)};

        for (int i = 0; i < ns1.length - 1; i++) {
            ns1[i].next = ns1[i + 1];
        }
        for (int i = 0; i < ns2.length - 1; i++) {
            ns2[i].next = ns2[i + 1];
        }

        Node start = mergeResult(ns1[0], ns2[0]);
        assert start.data == 40;
        assert start.next.data == 20;
        assert start.next.next.data == 15;
        assert start.next.next.next.data == 10;
        assert start.next.next.next.next.data == 5;
        assert start.next.next.next.next.next.data == 3;
        assert start.next.next.next.next.next.next.data == 2;
        assert start.next.next.next.next.next.next.next == null;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
