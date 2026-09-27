// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.StockSpan.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/stock-span/
public class StockSpanDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i = i + 1) {
            while (!stack.isEmpty() && prices[stack.peek()] < prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i;
            } else {
                span[i] = i - stack.peek();
            }
            if (i > 0 && prices[i] == prices[i - 1]) {
                continue;
            }
            stack.push(i);
        }
        return span;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Stock Span (DEBUG) ====");
        System.out.print("Enter number of days n: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter price for day " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        int[] result = solve(prices);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(prices));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
