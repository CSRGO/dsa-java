// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetValue.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/get-value/
public class GetValue {

    public static int solve(int[] arr, int idx) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Get Value ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to retrieve: ");
        int idx = sc.nextInt();

        int result = solve(arr, idx);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", idx=" + idx);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
