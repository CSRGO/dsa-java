// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UniquePathsII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/unique-paths-ii/
public class UniquePathsII {

    public static int solve(int[][] obstacleGrid) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unique Paths II ====");
        System.out.print("Enter number of rows m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of columns n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[][] obstacleGrid = new int[m][n];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter space-separated values for row " + (i + 1) + " (0 for empty, 1 for obstacle): ");
            String[] tokens = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j = j + 1) {
                obstacleGrid[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int paths = solve(obstacleGrid);
        System.out.println("Total Unique Paths: " + paths);
    }
}
