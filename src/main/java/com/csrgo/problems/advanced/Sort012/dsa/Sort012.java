// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Sort012.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sort-0-1-2/
public class Sort012 {

    public static int[] solve(int[] arr) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sort 0 1 2 ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements (0, 1, or 2): ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Sorted Array: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
