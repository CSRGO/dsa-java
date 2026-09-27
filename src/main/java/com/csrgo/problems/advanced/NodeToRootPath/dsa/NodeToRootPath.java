// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NodeToRootPath.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/node-to-root-path/
public class NodeToRootPath {

    public static int[] solve(int[] arr, int data) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Node to Root Path ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target node data: ");
        int data = sc.nextInt();

        int[] result = solve(arr, data);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Target    : " + data);
        System.out.println("Path      : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
