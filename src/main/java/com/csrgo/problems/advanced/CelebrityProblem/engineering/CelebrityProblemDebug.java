// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CelebrityProblem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/celebrity-problem/
public class CelebrityProblemDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] mat) {
        int n = mat.length;
        if (n <= 1) {
            return -1;
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (mat[j][i] == 1) {
                j = j - 1;
            } else {
                i = i + 1;
            }
        }
        int candidate = i;
        for (int k = 0; k < n; k = k + 1) {
            if (k != candidate) {
                if (mat[candidate][k] == 1) {
                    return -1;
                }
            }
        }
        return candidate;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Celebrity Problem (DEBUG) ====");
        System.out.print("Enter number of people n: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                System.out.print("Enter relation mat[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        int result = solve(mat);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.deepToString(mat));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
