// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BarChart.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bar-chart/
public class BarChartDebug {

    // TODO: debug this method to fix it
    public static String solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        if (max <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int floor = 1; floor <= max; floor++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > floor) {
                    sb.append("*\t");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Bar Chart (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " non-negative heights:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output :");
        System.out.print(result);
        System.out.println("========================");
    }
}
