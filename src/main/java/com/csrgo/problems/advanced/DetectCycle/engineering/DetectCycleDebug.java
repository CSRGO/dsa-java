// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DetectCycle.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/detect-cycle/
public class DetectCycleDebug {

    // TODO: fix the bugs in this method
    public static boolean solve(int[] arr, int pos) {
        if (arr.length <= 1) {
            return true;
        }

        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
        }

        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i = i + 1) {
            nodes[i] = new Node(arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i = i + 1) {
            nodes[i].next = nodes[i + 1];
        }
        if (pos >= 0 && pos < arr.length) {
            nodes[arr.length - 1].next = nodes[pos];
        }

        Node slow = nodes[0];
        Node fast = nodes[0];

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Detect Cycle (Debug) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter cycle position (-1 for none): ");
        int pos = sc.nextInt();

        boolean result = solve(arr, pos);

        System.out.println("------------------------");
        System.out.println("Input arr  : " + Arrays.toString(arr));
        System.out.println("Position   : " + pos);
        System.out.println("Has Cycle  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
