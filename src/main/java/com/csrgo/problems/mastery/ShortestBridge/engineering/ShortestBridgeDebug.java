// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ShortestBridge.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/shortest-bridge/
public class ShortestBridgeDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        int n = grid.length;
        Queue<int[]> queue = new ArrayDeque<>();

        for (int r = 0; r < n; r = r + 1) {
            for (int c = 0; c < n; c = c + 1) {
                if (grid[r][c] == 1) {
                    dfs(grid, r, c, n, queue);
                }
            }
        }

        int steps = 1;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i = i + 1) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for (int d = 0; d < 4; d = d + 1) {
                    int nr = r + dirs[d][0];
                    int nc = c + dirs[d][1];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                        if (grid[nr][nc] == 1) {
                            return steps;
                        }
                        if (grid[nr][nc] == 0) {
                            grid[nr][nc] = 2;
                            queue.offer(new int[]{nr, nc});
                        }
                    }
                }
            }
            steps = steps + 1;
        }

        return steps;
    }

    private static void dfs(int[][] grid, int r, int c, int n, Queue<int[]> queue) {
        if (r < 0 || r >= n || c < 0 || c >= n || grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 2;
        queue.offer(new int[]{r, c});
        dfs(grid, r - 1, c, n, queue);
        dfs(grid, r + 1, c, n, queue);
        dfs(grid, r, c - 1, n, queue);
        dfs(grid, r, c + 1, n, queue);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Shortest Bridge (DEBUG) ====");
        System.out.print("Enter grid size n: ");
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        System.out.println("Enter grid elements (0 or 1):");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Min Flips: " + result);
        System.out.println("========================");

        sc.close();
    }
}
