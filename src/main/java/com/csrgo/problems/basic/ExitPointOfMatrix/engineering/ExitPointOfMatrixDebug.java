// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ExitPointOfMatrix.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/exit-point-of-matrix/
public class ExitPointOfMatrixDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[]{0, 0};
        }

        int r = mat.length;
        int c = mat[0].length;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {
            if (mat[i][j] == 1) {
                // Bug 1: Rotates counter-clockwise instead of clockwise
                dir = (dir + 3) % 4;
                // Bug 2: Missing mat[i][j] = 0 resetting logic
            }

            int nextI = i + dr[dir];
            int nextJ = j + dc[dir];

            if (nextI < 0 || nextI >= r || nextJ < 0 || nextJ >= c) {
                // Bug 3: Returns out-of-bounds coordinates nextI, nextJ instead of current valid cell i, j
                return new int[]{nextI, nextJ};
            }

            i = nextI;
            j = nextJ;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 0, 1, 0}
        };
        int[] result = solve(mat);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
