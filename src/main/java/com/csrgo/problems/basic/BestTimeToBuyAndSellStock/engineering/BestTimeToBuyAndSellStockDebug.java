// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BestTimeToBuyAndSellStock.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStockDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        if (prices.length == 1) {
            return prices[0];
        }

        int minPrice = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else if (minPrice - currentPrice > maxProfit) {
                maxProfit = minPrice - currentPrice;
            }
        }

        return maxProfit;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Best Time to Buy and Sell Stock (DEBUG) ====");
        System.out.print("Enter number of days n: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter " + n + " prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = solve(prices);

        System.out.println("------------------------");
        System.out.println("Input     : prices=" + Arrays.toString(prices));
        System.out.println("Max Profit: " + result);
        System.out.println("========================");
    }
}
