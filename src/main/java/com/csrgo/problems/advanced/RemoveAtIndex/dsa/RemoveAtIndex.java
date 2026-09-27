// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveAtIndex.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-at-index/
public class RemoveAtIndex {

    public static int[] solve(int[] arr, int idx) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove at Index ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();

        int[] result = solve(arr, idx);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", idx=" + idx);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
