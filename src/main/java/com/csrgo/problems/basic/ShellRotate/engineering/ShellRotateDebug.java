// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ShellRotate.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/shell-rotate/
public class ShellRotateDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] mat, int s, int r) {
        if (mat == null || mat.length == 0) {
            return mat;
        }

        int[] oneD = extractShell(mat, s);
        rotate(oneD, r);
        fillShell(mat, s, oneD);

        return mat;
    }

    private static int[] extractShell(int[][] mat, int s) {
        int n = mat.length;
        int m = mat[0].length;
        int minr = s - 1;
        int minc = s - 1;
        int maxr = n - s;
        int maxc = m - s;

        // Bug 1: Shell size formula misses the subtraction of 4 overlapping corner counts
        int sz = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1);
        int[] oneD = new int[sz];
        int idx = 0;

        for (int i = minr; i <= maxr; i++) oneD[idx++] = mat[i][minc];
        for (int j = minc + 1; j <= maxc; j++) oneD[idx++] = mat[maxr][j];
        for (int i = maxr - 1; i >= minr; i--) oneD[idx++] = mat[i][maxc];
        for (int j = maxc - 1; j >= minc + 1; j--) oneD[idx++] = mat[minr][j];

        return oneD;
    }

    private static void rotate(int[] a, int r) {
        int n = a.length;
        if (n <= 1) return;
        // Bug 2: Fails to normalize negative r, causing negative indices in reverse
        r = r % n;
        // Bug 3: Off-by-one split index (n - r instead of n - 1 - r)
        reverse(a, 0, n - r);
        reverse(a, n - r, n - 1);
        reverse(a, 0, n - 1);
    }

    private static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }
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

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };
        int[][] result = solve(mat, 1, 1);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
