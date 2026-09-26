// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ShellRotate.engineering;

import java.util.Arrays;

public class ShellRotateDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[][] deepClone(int[][] mat) {
        if (mat == null) return null;
        int[][] copy = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            copy[i] = mat[i].clone();
        }
        return copy;
    }

    private static int[] extractShell(int[][] mat, int s) {
        int n = mat.length;
        int m = mat[0].length;
        int minr = s - 1;
        int minc = s - 1;
        int maxr = n - s;
        int maxc = m - s;

        int sz = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;
        int[] oneD = new int[sz];
        int idx = 0;

        for (int i = minr; i <= maxr; i++) oneD[idx++] = mat[i][minc];
        for (int j = minc + 1; j <= maxc; j++) oneD[idx++] = mat[maxr][j];
        for (int i = maxr - 1; i >= minr; i--) oneD[idx++] = mat[i][maxc];
        for (int j = maxc - 1; j >= minc + 1; j--) oneD[idx++] = mat[minr][j];

        return oneD;
    }

    private static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }
    }

    private static void rotate(int[] a, int r) {
        int n = a.length;
        if (n <= 1) return;
        r = ((r % n) + n) % n;
        reverse(a, 0, n - 1 - r);
        reverse(a, n - r, n - 1);
        reverse(a, 0, n - 1);
    }

    private static void fillShell(int[][] mat, int s, int[] oneD) {
        int n = mat.length;
        int m = mat[0].length;
        int minr = s - 1;
        int minc = s - 1;
        int maxr = n - s;
        int maxc = m - s;

        int idx = 0;
        for (int i = minr; i <= maxr; i++) mat[i][minc] = oneD[idx++];
        for (int j = minc + 1; j <= maxc; j++) mat[maxr][j] = oneD[idx++];
        for (int i = maxr - 1; i >= minr; i--) mat[i][maxc] = oneD[idx++];
        for (int j = maxc - 1; j >= minc + 1; j--) mat[minr][j] = oneD[idx++];
    }

    private static int[][] expected(int[][] original, int s, int r) {
        if (original == null || original.length == 0) return original;
        int[][] mat = deepClone(original);
        int[] oneD = extractShell(mat, s);
        rotate(oneD, r);
        fillShell(mat, s, oneD);
        return mat;
    }

    private static void runTestCase(int testNumber, int[][] mat, int s, int r) {
        int[][] expectedResult = expected(mat, s, r);
        int[][] actualResult = null;
        try {
            actualResult = ShellRotateDebug.solve(deepClone(mat), s, r);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: s=" + s + ", r=" + r);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: s=" + s + ", r=" + r + ", expected=" + Arrays.deepToString(expectedResult) + ", actual=" + Arrays.deepToString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ShellRotateDebug tests...");

        int[][] m4x4 = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };

        runTestCase(1, m4x4, 1, 1);
        runTestCase(2, m4x4, 2, 1);
        runTestCase(3, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1, 2);
        runTestCase(4, m4x4, 1, 0);
        runTestCase(5, m4x4, 1, 12);
        runTestCase(6, m4x4, 1, -1);
        runTestCase(7, m4x4, 1, 13);
        runTestCase(8, new int[][]{
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        }, 1, 3);
        runTestCase(9, new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        }, 2, 2);
        runTestCase(10, m4x4, 1, -5);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
