// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NumberOfProvinces.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-provinces/
public class NumberOfProvinces {

    private static void dfs(int curr, int[][] isConnected, boolean[] visited, int n) {
        visited[curr] = true;
        for (int j = 0; j < n; j++) {
            if (isConnected[curr][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited, n);
            }
        }
    }

    public static int solve(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, isConnected, visited, n);
            }
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Number of Provinces ====");
        System.out.print("Enter number of cities n: ");
        int n = scanner.nextInt();
        int[][] isConnected = new int[n][n];
        System.out.println("Enter adjacency matrix isConnected (" + n + " x " + n + ", 1 for connected, 0 for not):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                isConnected[i][j] = scanner.nextInt();
            }
        }

        int result = solve(isConnected);

        System.out.println("------------------------");
        System.out.println("Total Provinces: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
