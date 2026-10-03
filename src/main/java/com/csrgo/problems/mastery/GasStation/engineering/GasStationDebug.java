// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.GasStation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/gas-station/
public class GasStationDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length <= 1) {
            return -1;
        }

        int totalGas = 0;
        int totalCost = 0;
        int currentTank = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i = i + 1) {
            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];
            currentTank = currentTank + gas[i] - cost[i];

            if (currentTank < 0) {
                startIndex = i;
                currentTank = 0;
            }
        }

        if (totalGas <= totalCost) {
            return -1;
        }

        return startIndex;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Gas Station (Debug) ====");
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
