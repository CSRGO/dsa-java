// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumOfMinimumForEveryWindow.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-of-minimum-for-every-window/
public class MaximumOfMinimumForEveryWindowDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        Arrays.fill(prev, -1);
        Arrays.fill(next, n - 1);

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i = i + 1) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prev[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();
        for (int i = n - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                next[i] = stack.peek();
            }
            stack.push(i);
        }

        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i = i + 1) {
            int len = next[i] - prev[i];
            if (len <= n) {
                ans[len] = Math.max(ans[len], arr[i]);
            }
        }

        for (int i = n - 1; i >= 2; i = i - 1) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            res[i] = ans[i + 1];
        }
        return res;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum of Minimum for Every Window (Debug) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Result    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
