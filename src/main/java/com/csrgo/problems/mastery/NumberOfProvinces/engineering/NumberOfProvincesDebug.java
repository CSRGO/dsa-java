// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfProvinces.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-provinces-union-find/
public class NumberOfProvincesDebug {

    private static int find(int[] parent, int i) {
        int root = i;
        while (root != parent[root]) {
            root = parent[root];
        }
        return root;
    }

    // TODO: debug this method to fix it
    public static int solve(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) {
            return -1;
        }

        int n = isConnected.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            parent[i] = i;
        }

        int count = n;

        for (int i = 0; i < n; i = i + 1) {
            for (int j = i; j < n; j = j + 1) {
                if (isConnected[i][j] == 1) {
                    int rootI = find(parent, i);
                    int rootJ = find(parent, j);
                    parent[rootI] = rootJ;
                    count = count - 1;
                }
            }
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities n: ");
        int n = sc.nextInt();
        int[][] isConnected = new int[n][n];
        System.out.println("Enter adjacency matrix (" + n + " x " + n + "):");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                isConnected[i][j] = sc.nextInt();
            }
        }

        int result = solve(isConnected);
        System.out.println("Number of Provinces: " + result);
        sc.close();
    }
}
