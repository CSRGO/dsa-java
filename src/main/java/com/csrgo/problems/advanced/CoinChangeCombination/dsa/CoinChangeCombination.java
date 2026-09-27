// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CoinChangeCombination.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/coin-change-combination/
public class CoinChangeCombination {

    public static int solve(int[] coins, int amount) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Coin Change Combination ====");
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
