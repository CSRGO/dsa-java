// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PalindromeLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/palindrome-linked-list/
public class PalindromeLinkedListDebug {

    // TODO: fix the bugs in this method
    public static boolean solve(int[] arr) {
        if (arr.length <= 1) {
            return false;
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
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node prev = null;
        Node current = slow.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node firstHalf = head;
        Node secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val == secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Palindrome Linked List (Debug) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input        : " + Arrays.toString(arr));
        System.out.println("Is Palindrome: " + result);
        System.out.println("========================");

        sc.close();
    }
}
