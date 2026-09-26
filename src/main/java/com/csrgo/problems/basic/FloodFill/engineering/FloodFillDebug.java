// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.FloodFill.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/flood-fill/
public class FloodFillDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int[][] maze) {
        List<String> result = new ArrayList<>();
        if (maze == null || maze.length == 0 || maze[0].length == 0 || maze[0][0] == 1) {
            return result;
        }

        int n = maze.length;
        int m = maze[0].length;
        boolean[][] visited = new boolean[n][m];

        floodfill(maze, 0, 0, "", visited, result);
        return result;
    }

    private static void floodfill(int[][] maze, int r, int c, String psf, boolean[][] visited, List<String> result) {
        int n = maze.length;
        int m = maze[0].length;

        // Bug 1: Off-by-one boundary check 'r > n' causes ArrayIndexOutOfBoundsException on maze[r][c]
        if (r < 0 || c < 0 || r > n || c >= m || maze[r][c] == 1 || visited[r][c]) {
            return;
        }

        if (r == n - 1 && c == m - 1) {
            result.add(psf);
            return;
        }

        visited[r][c] = true;

        floodfill(maze, r - 1, c, psf + "t", visited, result);
        // Bug 2: Mutates row instead of column for left traversal (r - 1 instead of c - 1)
        floodfill(maze, r - 1, c, psf + "l", visited, result);
        floodfill(maze, r + 1, c, psf + "d", visited, result);
        floodfill(maze, r, c + 1, psf + "r", visited, result);

        // Bug 3: Omits visited[r][c] = false backtracking reset, permanently marking cells visited across branches
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        List<String> result = solve(maze);
        System.out.println("Result: " + result);
    }
}
