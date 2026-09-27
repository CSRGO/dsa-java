// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveDuplicates.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-duplicates/
public class RemoveDuplicatesDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length < 1) {
            return arr;
        }

        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
        }

        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i = i + 1) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        curr = head;
        while (curr != null && curr.next != null && curr.next.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
                curr = curr.next;
            } else {
                curr = curr.next;
            }
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }

        int[] result = new int[count];
        temp = head;
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

        System.out.println("==== Remove Duplicates (Debug) ====");
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
        System.out.println("Result : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
