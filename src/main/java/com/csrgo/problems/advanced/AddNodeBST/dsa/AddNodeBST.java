// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddNodeBST.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-node-bst/
public class AddNodeBST {

    public static int[] solve(int[] arr, int val) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add Node (BST) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        int[] result = solve(arr, val);

        System.out.println("------------------------");
        System.out.println("Input arr     : " + Arrays.toString(arr));
        System.out.println("Inserted val  : " + val);
        System.out.println("Resulting BST : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
