// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DailyTemperaturesVariation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/daily-temperatures-variation/
public class DailyTemperaturesVariationDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i = i + 1) {
            int curr = temperatures[i];
            while (!stack.isEmpty() && curr >= temperatures[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Daily Temperatures (Variation) (DEBUG) ====");
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i = i + 1) {
            temperatures[i] = sc.nextInt();
        }

        int[] result = solve(temperatures);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(temperatures));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
