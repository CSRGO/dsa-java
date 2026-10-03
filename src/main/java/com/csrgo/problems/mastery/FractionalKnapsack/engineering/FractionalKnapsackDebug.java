// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FractionalKnapsack.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fractional-knapsack/
public class FractionalKnapsackDebug {

    static class Item {
        int val;
        int wt;
        double ratio;

        Item(int val, int wt) {
            this.val = val;
            this.wt = wt;
            this.ratio = (double) (val / wt);
        }
    }

    // TODO: debug this method to fix it
    public static double solve(int[] val, int[] wt, int capacity) {
        if (val == null || wt == null || val.length <= 1 || capacity <= 0) {
            return 0.0;
        }

        int n = val.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i = i + 1) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a, b) -> Double.compare(a.ratio, b.ratio));

        double totalVal = 0.0;
        double remCap = capacity;

        for (int i = 0; i < n; i = i + 1) {
            if (remCap <= 0.0) {
                break;
            }

            if (items[i].wt <= remCap) {
                totalVal = totalVal + items[i].val;
                remCap = remCap - items[i].wt;
            } else {
                totalVal = totalVal + items[i].val * (remCap / items[i].wt);
                remCap = 0.0;
                break;
            }
        }

        return totalVal;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Fractional Knapsack (Debug) ====");
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
