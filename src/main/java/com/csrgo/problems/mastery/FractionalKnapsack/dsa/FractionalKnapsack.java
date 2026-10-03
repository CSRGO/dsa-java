// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FractionalKnapsack.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fractional-knapsack/
public class FractionalKnapsack {

    public static double solve(int[] val, int[] wt, int capacity) {
        // TODO: write your logic here
        return 0.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Fractional Knapsack ====");
        System.out.print("Enter number of items n: ");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter value and weight for item " + (i + 1) + ": ");
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        double result = solve(val, wt, capacity);

        System.out.println("------------------------");
        System.out.println("Values    : " + Arrays.toString(val));
        System.out.println("Weights   : " + Arrays.toString(wt));
        System.out.println("Capacity  : " + capacity);
        System.out.println("Max Value : " + result);
        System.out.println("========================");

        sc.close();
    }
}
