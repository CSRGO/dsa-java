// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RotateLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotate-linked-list/
public class RotateLinkedListDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int k) {
        int n = arr.length;

        int[] res = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            int newIdx = (i - k + n) % n;
            res[newIdx] = arr[i];
        }

        return res;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotate Linked List (DEBUG) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter node " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation steps k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Original List : " + Arrays.toString(arr));
        System.out.println("Rotation k    : " + k);
        System.out.println("Rotated List  : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
