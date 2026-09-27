// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CopyListWithRandomPointer.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/copy-list-with-random-pointer/
public class CopyListWithRandomPointerDebug {

    // TODO: fix the bugs in this method
    public static int[][] solve(int[][] arr) {
        if (arr.length == 0) {
            return new int[0][0];
        }

        class Node {
            int val;
            Node next;
            Node random;
            Node(int val) {
                this.val = val;
            }
        }

        int n = arr.length;
        Node[] originalNodes = new Node[n];
        for (int i = 0; i < n; i = i + 1) {
            originalNodes[i] = new Node(arr[i][0]);
        }
        for (int i = 0; i < n - 1; i = i + 1) {
            originalNodes[i].next = originalNodes[i + 1];
        }
        for (int i = 0; i < n; i = i + 1) {
            int rIdx = arr[i][1];
            if (rIdx >= 0 && rIdx < n) {
                originalNodes[i].random = originalNodes[rIdx];
            }
        }

        Node curr = originalNodes[0];
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = originalNodes[0];
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random;
            }
            curr = curr.next;
        }

        Node headCopy = originalNodes[0].next;
        curr = originalNodes[0];
        Node currCopy = headCopy;
        while (curr != null) {
            curr.next = curr.next.next;
            if (currCopy.next != null) {
                currCopy.next = currCopy.next;
            }
            curr = curr.next;
            currCopy = currCopy.next;
        }

        Node[] clonedNodes = new Node[n];
        curr = headCopy;
        for (int i = 0; i < n; i = i + 1) {
            clonedNodes[i] = curr;
            curr = curr.next;
        }

        int[][] result = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            result[i][0] = clonedNodes[i].val;
            int rIdx = -1;
            if (clonedNodes[i].random != null) {
                for (int j = 0; j < n; j = j + 1) {
                    if (clonedNodes[j] == clonedNodes[i].random) {
                        rIdx = j;
                        break;
                    }
                }
            }
            result[i][1] = rIdx;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Copy List with Random Pointer (Debug) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter val and random index for node " + i + ": ");
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.deepToString(arr));
        System.out.println("Output : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}
