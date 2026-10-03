// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.OnlineStockSpan.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/online-stock-span/
public class OnlineStockSpanDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] prices) {
        if (prices == null || prices.length == 0) {
            return new int[0];
        }

        int n = prices.length;
        int[] spans = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 1; i < n; i = i + 1) {
            int span = 0;
            while (!stack.isEmpty() && stack.peek()[0] < prices[i]) {
                int[] top = stack.pop();
                span = span + top[1];
            }
            stack.push(new int[]{prices[i], span});
            spans[i] = span;
        }

        return spans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Online Stock Span (Debug) ====");
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
