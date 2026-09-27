// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NextGreaterElement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/next-greater-element/
public class NextGreaterElementDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek();
            }
            if (arr[i] > 0) {
                stack.push(arr[i]);
            }
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Next Greater Element (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
