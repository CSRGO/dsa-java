// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NumberOfIslands.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-islands/
public class NumberOfIslandsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 1;
        }

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 1; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count = count + 1;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return;
        }
        if (grid[r][c] == 0 || visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        dfs(grid, r - 1, c, visited);
        dfs(grid, r + 1, c, visited);
        dfs(grid, r, c - 1, visited);
        dfs(grid, r, c + 1, visited);
        dfs(grid, r + 1, c + 1, visited);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Number of Islands (DEBUG) ====");
        System.out.print("Enter grid rows: ");
        int m = sc.nextInt();
        System.out.print("Enter grid columns: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid rows (0 for water, 1 for land):");
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
