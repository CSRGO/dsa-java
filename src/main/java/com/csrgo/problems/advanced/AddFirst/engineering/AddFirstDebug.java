// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddFirst.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-first/
public class AddFirstDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int val) {
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

        Node newNode = new Node(val);
        if (head != null) {
            head.next = newNode;
        } else {
            head = newNode;
        }

        int[] result = new int[arr.length];
        Node curr = head;
        int idx = 0;
        while (curr != null && idx < result.length) {
            result[idx] = curr.data;
            idx = idx + 1;
            curr = curr.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add First (DEBUG) ====");
        System.out.print("Enter number of initial elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to add first: ");
        int val = sc.nextInt();

        int[] result = solve(arr, val);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", val=" + val);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
