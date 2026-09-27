// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.UnboundedKnapsack.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/unbounded-knapsack/
public class UnboundedKnapsackDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] values, int[] weights, int capacity) {
        if (values == null || weights == null || capacity <= 0) {
            return 0;
        }

        int n = values.length;
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < n; i = i + 1) {
            int val = values[i];
            int wt = weights[i];
            for (int w = capacity; w > wt; w = w - 1) {
                int included = val + dp[w - wt];
                if (included > dp[w]) {
                    dp[w] = included;
                }
            }
        }

        return dp[capacity];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unbounded Knapsack (DEBUG) ====");
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        System.out.print("Enter item values: ");
        for (int i = 0; i < n; i = i + 1) {
            values[i] = sc.nextInt();
        }
        System.out.print("Enter item weights: ");
        for (int i = 0; i < n; i = i + 1) {
            weights[i] = sc.nextInt();
        }
        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        int result = solve(values, weights, capacity);

        System.out.println("------------------------");
        System.out.println("Max Value: " + result);
        System.out.println("========================");

        sc.close();
    }
}
