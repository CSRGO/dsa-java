// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SumOfSubarrayMinimums.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sum-of-subarray-minimums/
public class SumOfSubarrayMinimumsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i = i + 1) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = i;
            } else {
                left[i] = i - stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }
            stack.push(i);
        }

        int total = 0;
        for (int i = 0; i < n; i = i + 1) {
            int contribution = arr[i] * left[i] * right[i];
            total = total + contribution;
        }

        return total % mod;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sum of Subarray Minimums (DEBUG) ====");
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
