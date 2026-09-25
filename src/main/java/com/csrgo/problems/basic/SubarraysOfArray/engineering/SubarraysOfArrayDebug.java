// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SubarraysOfArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subarrays-of-array/
public class SubarraysOfArrayDebug {

    // TODO: debug this method to fix it
    public static String solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k < j; k++) {
                    sb.append(arr[k]);
                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Subarrays of Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input    : " + Arrays.toString(arr));
        System.out.println("Subarrays:");
        System.out.print(result);
        System.out.println("========================");
    }
}
