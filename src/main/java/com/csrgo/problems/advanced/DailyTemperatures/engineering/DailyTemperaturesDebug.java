// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DailyTemperatures.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/daily-temperatures/
public class DailyTemperaturesDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i = i + 1) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[i] = i - prevIndex;
            }
            if (temperatures[i] > 0) {
                stack.push(i);
            }
        }
        return answer;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Daily Temperatures (DEBUG) ====");
        System.out.print("Enter number of days n: ");
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
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
