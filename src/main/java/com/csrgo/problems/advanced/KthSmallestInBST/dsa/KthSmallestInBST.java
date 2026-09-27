// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KthSmallestInBST.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/kth-smallest-in-bst/
public class KthSmallestInBST {

    public static int solve(int[] arr, int k) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Kth Smallest in BST ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Input arr    : " + Arrays.toString(arr));
        System.out.println("k            : " + k);
        System.out.println("Kth Smallest : " + result);
        System.out.println("========================");

        sc.close();
    }
}
