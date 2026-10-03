// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RottingOranges.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotting-oranges/
public class RottingOranges {

    public static int solve(int[][] grid) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotting Oranges ====");
        System.out.print("Enter rows m: ");
        int m = sc.nextInt();
        System.out.print("Enter cols n: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid values (0, 1, 2):");
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Elapsed Minutes: " + result);
        System.out.println("========================");

        sc.close();
    }
}
