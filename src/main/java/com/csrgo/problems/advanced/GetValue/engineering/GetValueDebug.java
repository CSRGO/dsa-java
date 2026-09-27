// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetValue.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/get-value/
public class GetValueDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int idx) {
        if (arr == null || idx < 0 || idx > arr.length) {
            return -1;
        }

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

        Node curr = head != null ? head.next : null;
        for (int i = 0; i < idx && curr != null; i = i + 1) {
            curr = curr.next;
        }

        return curr != null ? curr.data : -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Get Value (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to retrieve: ");
        int idx = sc.nextInt();

        int result = solve(arr, idx);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", idx=" + idx);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
