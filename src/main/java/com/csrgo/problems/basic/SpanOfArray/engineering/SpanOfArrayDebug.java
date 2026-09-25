// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SpanOfArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/span-of-array/
public class SpanOfArrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min - max;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Span of Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
