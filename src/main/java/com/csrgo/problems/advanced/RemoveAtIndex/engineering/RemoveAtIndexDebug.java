// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveAtIndex.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-at-index/
public class RemoveAtIndexDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int idx) {
        class Node {
            int data;
            Node next;
            Node(int d) {
                this.data = d;
            }
        }

        Node head = null;
        Node tail = null;
        for (int i = 0; i < arr.length; i = i + 1) {
            Node node = new Node(arr[i]);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        if (idx == 0) {
            if (head != null) {
                head.next = head.next != null ? head.next.next : null;
            }
        } else {
            Node curr = head;
            for (int i = 0; i < idx && curr != null; i = i + 1) {
                curr = curr.next;
            }
            if (curr != null && curr.next != null) {
                curr.next = curr.next.next;
            }
        }

        int[] result = new int[arr.length];
        Node curr = head;
        int k = 0;
        while (curr != null && k < result.length) {
            result[k] = curr.data;
            k = k + 1;
            curr = curr.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove at Index (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();

        int[] result = solve(arr, idx);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", idx=" + idx);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
