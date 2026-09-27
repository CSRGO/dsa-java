// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinimumCostPath.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-cost-path/
public class MinimumCostPath {

    public static int solve(int[][] grid) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Cost Path ====");
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid elements row by row:");
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Input  : " + m + "x" + n + " grid");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
