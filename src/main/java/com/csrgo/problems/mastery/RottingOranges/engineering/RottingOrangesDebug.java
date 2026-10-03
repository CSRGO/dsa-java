// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RottingOranges.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotting-oranges/
public class RottingOrangesDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0;

        for (int r = 0; r < m; r = r + 1) {
            for (int c = 0; c < n; c = c + 1) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else {
                    fresh = fresh + 1;
                }
            }
        }

        int minutes = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            minutes = minutes + 1;
            for (int i = 0; i < size; i = i + 1) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for (int d = 0; d < 4; d = d + 1) {
                    int nr = r + dirs[d][0];
                    int nc = c + dirs[d][1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        return minutes;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotting Oranges (DEBUG) ====");
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
