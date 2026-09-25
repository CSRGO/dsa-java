// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FindElementInArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-element-in-array/
public class FindElementInArrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int d) {
        if (arr == null) {
            return -1;
        }

        int foundIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == d) {
                foundIndex = i;
            }
        }

        if (foundIndex == -1) {
            return 0;
        }

        return foundIndex;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Find Element in Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element d: ");
        int d = sc.nextInt();
        
        int result = solve(arr, d);
        
        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", d=" + d);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
