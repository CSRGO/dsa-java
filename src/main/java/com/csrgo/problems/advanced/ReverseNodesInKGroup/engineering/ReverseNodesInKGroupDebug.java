// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ReverseNodesInKGroup.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reverse-nodes-in-k-group/
public class ReverseNodesInKGroupDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int k) {
        if (arr.length <= 1 || k < 1) {
            return arr;
        }

        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
        }

        Node dummy = new Node(0);
        Node tail = dummy;
        for (int i = 0; i < arr.length; i = i + 1) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }

        int count = arr.length;
        Node prevGroupEnd = dummy;

        while (count >= k) {
            Node curr = prevGroupEnd.next;
            Node next = curr.next;
            for (int i = 1; i < k; i = i + 1) {
                curr.next = next.next;
                next.next = curr;
                prevGroupEnd.next = next;
                next = curr.next;
            }
            prevGroupEnd = next;
            count = count - k;
        }

        int[] result = new int[arr.length];
        Node temp = dummy.next;
        int idx = 0;
        while (temp != null) {
            result[idx] = temp.val;
            idx = idx + 1;
            temp = temp.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reverse Nodes in K Group (Debug) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Input arr  : " + Arrays.toString(arr) + ", k = " + k);
        System.out.println("Result     : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
