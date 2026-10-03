// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.OnlineStockSpan.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/online-stock-span/
public class OnlineStockSpan {

    public static int[] solve(int[] prices) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Online Stock Span ====");
        System.out.print("Enter number of price days n: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter price for day " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        int[] result = solve(prices);

        System.out.println("------------------------");
        System.out.println("Prices : " + Arrays.toString(prices));
        System.out.println("Spans  : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
