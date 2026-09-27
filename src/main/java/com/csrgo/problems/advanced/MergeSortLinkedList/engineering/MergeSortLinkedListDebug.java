// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeSortLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-sort-linked-list/
public class MergeSortLinkedListDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length <= 0) {
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

        class Sorter {
            Node merge(Node l1, Node l2) {
                Node dummy = new Node(0);
                Node tail = dummy;
                while (l1 != null && l2 != null) {
                    if (l1.val > l2.val) {
                        tail.next = l1;
                        l1 = l1.next;
                    } else {
                        tail.next = l2;
                        l2 = l2.next;
                    }
                    tail = tail.next;
                }
                if (l1 != null) {
                    tail.next = l1;
                } else {
                    tail.next = l2;
                }
                return dummy.next;
            }

            Node sort(Node node) {
                if (node == null || node.next == null) {
                    return node;
                }
                Node prev = null;
                Node slow = node;
                Node fast = node;
                while (fast != null && fast.next != null) {
                    prev = slow;
                    slow = slow.next;
                    fast = fast.next;
                }
                prev.next = null;
                Node left = sort(node);
                Node right = sort(slow);
                return merge(left, right);
            }
        }

        Sorter sorter = new Sorter();
        Node sortedHead = sorter.sort(head);

        int[] result = new int[arr.length];
        curr = sortedHead;
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

        System.out.println("==== Merge Sort Linked List (Debug) ====");
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
        System.out.println("Sorted : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
