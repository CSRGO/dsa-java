// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CoinChangeMinimumCoins.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/coin-change-minimum-coins/
public class CoinChangeMinimumCoins {

    public static int solve(int[] coins, int amount) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Coin Change (Minimum Coins) ====");
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
