// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FoldLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fold-linked-list/
public class FoldLinkedListDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length < 2) {
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

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node prev = null;
        Node current = second;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node first = head;
        second = prev;
        while (second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = second;
            first = temp1;
            second = temp2;
        }

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

        System.out.println("==== Fold Linked List (Debug) ====");
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
        System.out.println("Folded : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
