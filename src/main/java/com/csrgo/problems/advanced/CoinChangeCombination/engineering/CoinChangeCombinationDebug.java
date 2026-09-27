// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CoinChangeCombination.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/coin-change-combination/
public class CoinChangeCombinationDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i = i + 1) {
            int c = coins[i];
            for (int j = c; j < amount; j = j + 1) {
                dp[j] = dp[j] + 1;
            }
        }

        return dp[amount];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Coin Change Combination (DEBUG) ====");
        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.print("Enter coin denominations: ");
        for (int i = 0; i < n; i = i + 1) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter target amount: ");
        int amount = sc.nextInt();

        int result = solve(coins, amount);

        System.out.println("------------------------");
        System.out.println("Input  : coins=" + Arrays.toString(coins) + ", amount=" + amount);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
