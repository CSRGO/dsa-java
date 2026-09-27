// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KthFromEnd.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/kth-from-end/
public class KthFromEndDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int k) {
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

        Node slow = head != null ? head.next : null;
        Node fast = head;
        for (int i = 0; i <= k && fast != null; i = i + 1) {
            fast = fast.next;
        }

        while (fast != null) {
            if (slow != null) {
                slow = slow.next;
            }
            fast = fast.next;
        }

        return slow != null ? slow.data : -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Kth from End (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter offset k: ");
        int k = sc.nextInt();

        int result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", k=" + k);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
