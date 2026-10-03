// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UnionFindImplementation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/union-find-implementation/
public class UnionFindImplementationDebug {

    private static int find(int[] parent, int i) {
        int root = i;
        while (root != parent[root]) {
            root = parent[root];
        }
        return root;
    }

    // TODO: debug this method to fix it
    public static boolean[] solve(int n, int[][] operations) {
        if (n <= 0 || operations == null || operations.length == 0) {
            return new boolean[0];
        }

        int[] parent = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            parent[i] = i;
        }

        boolean[] results = new boolean[operations.length];
        int resultIndex = 0;

        for (int i = 0; i < operations.length; i = i + 1) {
            int type = operations[i][0];
            int u = operations[i][1];
            int v = operations[i][2];

            if (type == 1) {
                parent[u] = v;
            } else if (type == 2) {
                results[resultIndex] = (parent[u] == parent[v]);
                resultIndex = resultIndex + 1;
            }
        }

        return results;
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
