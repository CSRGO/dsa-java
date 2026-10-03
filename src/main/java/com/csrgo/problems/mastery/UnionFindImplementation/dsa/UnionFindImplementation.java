// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UnionFindImplementation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/union-find-implementation/
public class UnionFindImplementation {

    public static boolean[] solve(int n, int[][] operations) {
        // TODO: write your logic here
        return new boolean[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of operations: ");
        int m = sc.nextInt();
        int[][] operations = new int[m][3];
        System.out.println("Enter operations (type u v):");
        for (int i = 0; i < m; i = i + 1) {
            operations[i][0] = sc.nextInt();
            operations[i][1] = sc.nextInt();
            operations[i][2] = sc.nextInt();
        }

        boolean[] result = solve(n, operations);
        System.out.println("Query Results: " + Arrays.toString(result));
        sc.close();
    }
}
