// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ZeroOneKnapsack.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/0-1-knapsack/
public class ZeroOneKnapsack {

    public static int solve(int[] values, int[] weights, int capacity) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 0/1 Knapsack ====");
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
