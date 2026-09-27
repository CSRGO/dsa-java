// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddAtIndex.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-at-index/
public class AddAtIndex {

    public static int[] solve(int[] arr, int idx, int val) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add at Index ====");
        System.out.print("Enter number of initial elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        System.out.print("Enter value to add: ");
        int val = sc.nextInt();

        int[] result = solve(arr, idx, val);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", idx=" + idx + ", val=" + val);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
