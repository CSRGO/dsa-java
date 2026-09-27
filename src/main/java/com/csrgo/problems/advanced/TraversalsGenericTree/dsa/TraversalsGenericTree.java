// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TraversalsGenericTree.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/traversals-generic-tree/
public class TraversalsGenericTree {

    public static int[][] solve(int[] arr) {
        // TODO: write your logic here
        return new int[2][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Traversals (Generic Tree) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[][] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr  : " + Arrays.toString(arr));
        System.out.println("Pre-order  : " + Arrays.toString(result[0]));
        System.out.println("Post-order : " + Arrays.toString(result[1]));
        System.out.println("========================");

        sc.close();
    }
}
