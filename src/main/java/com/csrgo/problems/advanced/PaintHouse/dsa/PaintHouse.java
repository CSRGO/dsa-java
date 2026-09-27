// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PaintHouse.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/paint-house/
public class PaintHouse {

    public static int solve(int[][] costs) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Paint House ====");
        System.out.print("Enter number of houses (n): ");
        int n = sc.nextInt();
        int[][] costs = new int[n][3];
        System.out.println("Enter 3 costs (Red Blue Green) per house:");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                costs[i][j] = sc.nextInt();
            }
        }

        int result = solve(costs);

        System.out.println("------------------------");
        System.out.println("Input  : " + n + " houses");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
