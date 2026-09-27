// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LCAGenericTree.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/lca-generic-tree/
public class LCAGenericTree {

    public static int solve(int[] arr, int d1, int d2) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== LCA (Generic Tree) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d1: ");
        int d1 = sc.nextInt();

        System.out.print("Enter d2: ");
        int d2 = sc.nextInt();

        int result = solve(arr, d1, d2);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("d1, d2    : " + d1 + ", " + d2);
        System.out.println("LCA       : " + result);
        System.out.println("========================");

        sc.close();
    }
}
