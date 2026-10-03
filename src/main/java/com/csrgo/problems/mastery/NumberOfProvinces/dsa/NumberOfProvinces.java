// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfProvinces.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-provinces-union-find/
public class NumberOfProvinces {

    public static int solve(int[][] isConnected) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities n: ");
        int n = sc.nextInt();
        int[][] isConnected = new int[n][n];
        System.out.println("Enter adjacency matrix (" + n + " x " + n + "):");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                isConnected[i][j] = sc.nextInt();
            }
        }

        int result = solve(isConnected);
        System.out.println("Number of Provinces: " + result);
        sc.close();
    }
}
