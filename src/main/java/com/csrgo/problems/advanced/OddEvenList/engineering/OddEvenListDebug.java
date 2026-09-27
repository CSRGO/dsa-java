// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.OddEvenList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/odd-even-list/
public class OddEvenListDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length <= 2) {
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

        Node odd = head;
        Node even = head;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = even;

        int[] result = new int[arr.length];
        curr = head;
        int idx = 0;
        while (curr != null) {
            result[idx] = curr.val;
            idx = idx + 1;
            curr = curr.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Odd Even List (Debug) ====");
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
