// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ValidateBST.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/validate-bst/
public class ValidateBST {

    public static boolean solve(int[] arr) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Validate BST ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr    : " + Arrays.toString(arr));
        System.out.println("Is Valid BST : " + result);
        System.out.println("========================");

        sc.close();
    }
}
