// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfEnclaves.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-enclaves/
public class NumberOfEnclavesDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int r = 0; r < m; r = r + 1) {
            if (grid[r][0] == 1) {
                dfs(grid, r, 0, m, n);
            }
        }

        for (int c = 0; c < n; c = c + 1) {
            if (grid[0][c] == 1) {
                dfs(grid, 0, c, m, n);
            }
        }

        int enclaves = 0;
        for (int r = 0; r < m; r = r + 1) {
            for (int c = 0; c < n; c = c + 1) {
                if (grid[r][c] == 0) {
                    enclaves = enclaves + 1;
                }
            }
        }

        return enclaves;
    }

    private static void dfs(int[][] grid, int r, int c, int m, int n) {
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 0;
        dfs(grid, r - 1, c, m, n);
        dfs(grid, r + 1, c, m, n);
        dfs(grid, r, c - 1, m, n);
        dfs(grid, r, c + 1, m, n);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Number of Enclaves (DEBUG) ====");
        System.out.print("Enter rows m: ");
        int m = sc.nextInt();
        System.out.print("Enter cols n: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid elements (0 or 1):");
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Enclaves Count: " + result);
        System.out.println("========================");

        sc.close();
    }
}
