// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.FloodFill.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FloodFillDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void ff(int[][] maze, int r, int c, String psf, boolean[][] vis, List<String> res) {
        int n = maze.length, m = maze[0].length;
        if (r < 0 || c < 0 || r >= n || c >= m || maze[r][c] == 1 || vis[r][c]) return;
        if (r == n - 1 && c == m - 1) {
            res.add(psf);
            return;
        }
        vis[r][c] = true;
        ff(maze, r - 1, c, psf + "t", vis, res);
        ff(maze, r, c - 1, psf + "l", vis, res);
        ff(maze, r + 1, c, psf + "d", vis, res);
        ff(maze, r, c + 1, psf + "r", vis, res);
        vis[r][c] = false;
    }

    private static List<String> expected(int[][] maze) {
        List<String> res = new ArrayList<>();
        if (maze == null || maze.length == 0 || maze[0].length == 0 || maze[0][0] == 1) return res;
        boolean[][] vis = new boolean[maze.length][maze[0].length];
        ff(maze, 0, 0, "", vis, res);
        return res;
    }

    private static void runTestCase(int testNumber, int[][] maze) {
        List<String> expectedResult = expected(maze);
        List<String> actualResult;
        try {
            actualResult = FloodFillDebug.solve(maze);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: paths=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running FloodFillDebug tests...");

        runTestCase(1, new int[][]{
            {0, 0, 0},
            {1, 0, 1},
            {0, 0, 0}
        });
        runTestCase(2, new int[][]{
            {0, 1},
            {1, 0}
        });
        runTestCase(3, new int[][]{
            {0}
        });
        runTestCase(4, new int[][]{
            {1}
        });
        runTestCase(5, new int[][]{
            {0, 0},
            {0, 0}
        });
        runTestCase(6, new int[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        });
        runTestCase(7, new int[][]{
            {0, 1, 0},
            {0, 1, 0},
            {0, 0, 0}
        });
        runTestCase(8, new int[][]{
            {0, 0, 1},
            {1, 0, 0},
            {0, 1, 0}
        });
        runTestCase(9, new int[][]{
            {0, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        });
        runTestCase(10, new int[][]{
            {0, 0},
            {1, 0}
        });

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
