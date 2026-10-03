// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ShortestPathInBinaryMatrix.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/shortest-path-in-binary-matrix/
public class ShortestPathInBinaryMatrixDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        int n = grid.length;
        if (grid[n - 1][n - 1] != 0) {
            return -1;
        }

        if (n == 1 && grid[0][0] == 0) {
            return 1;
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 1});
        grid[0][0] = 1;

        int[][] dirs = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];

            if (r == n - 1 && c == n - 1) {
                return dist - 1;
            }

            for (int i = 0; i < dirs.length; i = i + 1) {
                int nr = r + dirs[i][0];
                int nc = c + dirs[i][1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0) {
                    grid[nr][nc] = 1;
                    queue.add(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grid size n: ");
        int n = sc.nextInt();

        int[][] grid = new int[n][n];
        System.out.println("Enter binary matrix row by row (0 or 1):");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);
        System.out.println("Shortest Clear Path Length (Debug): " + result);
        sc.close();
    }
}
