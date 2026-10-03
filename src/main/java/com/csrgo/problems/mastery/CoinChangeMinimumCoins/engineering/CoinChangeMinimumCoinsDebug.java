// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CoinChangeMinimumCoins.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/coin-change-minimum-coins/
public class CoinChangeMinimumCoinsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return -1;
        }

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < amount; i = i + 1) {
            for (int j = 0; j < coins.length; j = j + 1) {
                int coin = coins[j];
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Coin Change (Minimum Coins) Debug ====");
        System.out.print("Enter number of coin denominations n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] coins = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter coin denomination " + (i + 1) + ": ");
            coins[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.print("Enter amount: ");
        int amount = Integer.parseInt(sc.nextLine().trim());

        int result = solve(coins, amount);
        System.out.println("Minimum Coins: " + result);
    }
}
