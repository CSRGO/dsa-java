// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SpanOfArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/span-of-array/
public class SpanOfArray {

    public static int solve(int[] arr) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Span of Array ====");
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
