// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IntersectionPoint.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/intersection-point/
public class IntersectionPointDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] l1, int[] l2, int skip1, int skip2) {
        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
        }

        Node commonHead = null;
        Node commonTail = null;
        if (skip1 < l1.length && skip2 < l2.length) {
            commonHead = new Node(l1[skip1]);
            commonTail = commonHead;
            for (int i = skip1 + 1; i < l1.length; i = i + 1) {
                commonTail.next = new Node(l1[i]);
                commonTail = commonTail.next;
            }
        }

        Node headA = null;
        Node tailA = null;
        for (int i = 0; i < skip1; i = i + 1) {
            Node node = new Node(l1[i]);
            if (headA == null) {
                headA = node;
                tailA = node;
            } else {
                tailA.next = node;
                tailA = node;
            }
        }
        if (headA == null) {
            headA = commonHead;
        } else {
            tailA.next = commonHead;
        }

        Node headB = null;
        Node tailB = null;
        for (int i = 0; i < skip2; i = i + 1) {
            Node node = new Node(l2[i]);
            if (headB == null) {
                headB = node;
                tailB = node;
            } else {
                tailB.next = node;
                tailB = node;
            }
        }
        if (headB == null) {
            headB = commonHead;
        } else {
            tailB.next = commonHead;
        }

        if (headA == null || headB == null) {
            return -1;
        }

        Node pA = headA;
        Node pB = headB;

        while (pA == pB) {
            if (pA == null) {
                pA = headA;
            } else {
                pA = pA.next;
            }

            if (pB == null) {
                pB = headB;
            } else {
                pB = pB.next;
            }
        }

        if (pA != null) {
            return pA.val;
        }
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Intersection Point (Debug) ====");
        System.out.print("Enter size of list 1: ");
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            l1[i] = sc.nextInt();
        }

        System.out.print("Enter size of list 2: ");
        int m = sc.nextInt();
        int[] l2 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            l2[i] = sc.nextInt();
        }

        System.out.print("Enter skip1: ");
        int skip1 = sc.nextInt();

        System.out.print("Enter skip2: ");
        int skip2 = sc.nextInt();

        int result = solve(l1, l2, skip1, skip2);

        System.out.println("------------------------");
        System.out.println("Intersection Val : " + result);
        System.out.println("========================");

        sc.close();
    }
}
