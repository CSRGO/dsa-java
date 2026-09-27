// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KReverse.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/k-reverse/
public class KReverseDebug {

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

        Node head = new Node(arr[0]);
        Node currNode = head;
        for (int i = 1; i < arr.length; i = i + 1) {
            currNode.next = new Node(arr[i]);
            currNode = currNode.next;
        }

        class Reverser {
            Node reverseK(Node node, int groupSize) {
                Node check = node;
                for (int i = 0; i <= groupSize; i = i + 1) {
                    if (check == null) {
                        return node;
                    }
                    check = check.next;
                }

                Node prev = null;
                Node curr = node;
                Node next = null;
                for (int i = 0; i < groupSize; i = i + 1) {
                    next = curr.next;
                    curr.next = next;
                    prev = curr;
                    curr = next;
                }

                node.next = reverseK(curr, groupSize);
                return prev;
            }
        }

        Reverser reverser = new Reverser();
        Node newHead = reverser.reverseK(head, k);

        int[] result = new int[arr.length];
        currNode = newHead;
        int idx = 0;
        while (currNode != null) {
            result[idx] = currNode.val;
            idx = idx + 1;
            currNode = currNode.next;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== K Reverse (Debug) ====");
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
        System.out.println("Input  : " + Arrays.toString(arr) + ", k = " + k);
        System.out.println("Result : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
