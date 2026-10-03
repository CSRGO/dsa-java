// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.GasStation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/gas-station/
public class GasStation {

    public static int solve(int[] gas, int[] cost) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Gas Station ====");
        System.out.print("Enter number of gas stations n: ");
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter gas at station " + (i + 1) + ": ");
            gas[i] = sc.nextInt();
            System.out.print("Enter cost to station " + (i + 2 > n ? 1 : i + 2) + ": ");
            cost[i] = sc.nextInt();
        }

        int result = solve(gas, cost);

        System.out.println("------------------------");
        System.out.println("Gas Array      : " + Arrays.toString(gas));
        System.out.println("Cost Array     : " + Arrays.toString(cost));
        System.out.println("Starting Index : " + result);
        System.out.println("========================");

        sc.close();
    }
}
