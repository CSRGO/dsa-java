// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ReverseDataIterative.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reverse-data-iterative/
public class ReverseDataIterativeDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr == null ? new int[0] : arr;
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

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            Node nodeL = head;
            for (int i = 0; i < left; i = i + 1) {
                nodeL = nodeL.next;
            }

            Node nodeR = nodeL;
            for (int i = left; i < right; i = i + 1) {
                nodeR = nodeR.next;
            }

            nodeL.data = nodeR.data;
            nodeR.data = nodeL.data;

            left = left + 1;
            right = right - 1;
        }

        int[] result = new int[arr.length];
        Node curr = head;
        int idx = 0;
        while (curr != null) {
            result[idx] = curr.data;
            idx = idx + 1;
            curr = curr.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reverse Data Iterative (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
