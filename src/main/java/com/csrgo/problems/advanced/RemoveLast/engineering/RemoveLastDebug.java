// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveLast.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-last/
public class RemoveLastDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
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

        if (head != null && head.next != null) {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }

        int[] result = new int[arr.length];
        Node temp = head;
        int idx = 0;
        while (temp != null && idx < result.length) {
            result[idx] = temp.data;
            idx = idx + 1;
            temp = temp.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove Last (DEBUG) ====");
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
