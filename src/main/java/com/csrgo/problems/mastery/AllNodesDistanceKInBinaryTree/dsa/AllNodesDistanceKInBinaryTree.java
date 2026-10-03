// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AllNodesDistanceKInBinaryTree.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/all-nodes-distance-k-in-binary-tree/
public class AllNodesDistanceKInBinaryTree {

    public static int[] solve(int[] arr, int target, int k) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== All Nodes Distance K in Binary Tree ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " (-1 for null): ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target node value: ");
        int target = sc.nextInt();

        System.out.print("Enter distance k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, target, k);

        System.out.println("------------------------");
        System.out.println("Tree Preorder    : " + Arrays.toString(arr));
        System.out.println("Target           : " + target);
        System.out.println("Distance K       : " + k);
        System.out.println("Nodes at dist K  : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
