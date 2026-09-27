// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CelebrityProblem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/celebrity-problem/
public class CelebrityProblem {

    public static int solve(int[][] mat) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Celebrity Problem ====");
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
