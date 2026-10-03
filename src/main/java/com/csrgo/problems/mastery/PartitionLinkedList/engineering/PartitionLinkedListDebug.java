// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PartitionLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/partition-linked-list/
public class PartitionLinkedListDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int x) {
        int n = arr.length;
        int[] res = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i = i + 1) {
            if (arr[i] <= x) {
                res[idx] = arr[i];
                idx = idx + 1;
            }
        }

        for (int i = n - 1; i >= 0; i = i - 1) {
            if (arr[i] > x) {
                res[idx] = arr[i];
                idx = idx + 1;
            }
        }

        return res;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Partition Linked List (DEBUG) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter node " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter partition threshold x: ");
        int x = sc.nextInt();

        int[] result = solve(arr, x);

        System.out.println("------------------------");
        System.out.println("Original List    : " + Arrays.toString(arr));
        System.out.println("Partition x      : " + x);
        System.out.println("Partitioned List : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
