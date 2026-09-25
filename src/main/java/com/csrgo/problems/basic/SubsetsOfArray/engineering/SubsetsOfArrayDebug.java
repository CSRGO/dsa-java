// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SubsetsOfArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subsets-of-array/
public class SubsetsOfArrayDebug {

    // TODO: debug this method to fix it
    public static String solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        int n = arr.length;
        int limit = n * 2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < limit; i++) {
            int temp = i;
            String[] row = new String[n];

            for (int j = 0; j < n; j++) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    row[j] = "";
                } else {
                    row[j] = String.valueOf(arr[j]);
                }
            }

            for (int j = 0; j < n; j++) {
                sb.append(row[j]);
                if (j < n - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Subsets of Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Subsets:");
        System.out.print(result);
        System.out.println("========================");
    }
}
