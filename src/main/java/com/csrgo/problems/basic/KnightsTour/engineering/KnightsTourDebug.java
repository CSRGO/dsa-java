// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.KnightsTour.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/knights-tour/
public class KnightsTourDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int n, int r, int c) {
        if (n <= 0 || r < 0 || c < 0 || r >= n || c >= n) {
            return new int[0][0];
        }

        int[][] chess = new int[n][n];
        if (findTour(chess, r, c, 1)) {
            return chess;
        }

        return new int[0][0];
    }

    // Bug 1: Incomplete offset vectors of only 4 moves instead of all 8 standard knight jumps
    private static final int[] DR = {-2, -1, 1, 2};
    private static final int[] DC = {1, 2, 2, 1};

    private static boolean findTour(int[][] chess, int r, int c, int move) {
        int n = chess.length;
        // Bug 2: Omits recording chess[r][c] = move on the base move, leaving initial cell 0
        if (move == n * n) {
            return true;
        }

        chess[r][c] = move;

        for (int i = 0; i < DR.length; i++) {
            int nr = r + DR[i];
            int nc = c + DC[i];

            if (nr >= 0 && nc >= 0 && nr < n && nc < n && chess[nr][nc] == 0) {
                if (findTour(chess, nr, nc, move + 1)) {
                    return true;
                }
            }
        }

        // Bug 3: Missing chess[r][c] = 0 backtracking unmark, causing failed paths to permanently block squares
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 5, r = 0, c = 0;
        int[][] result = solve(n, r, c);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
