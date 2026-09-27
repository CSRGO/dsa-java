// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Sort01.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sort-0-1/
public class Sort01Debug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int i = 0;
        int j = 0;

        while (j < arr.length - 1) {
            if (arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = i + 1;
            }
            j = j + 1;
        }

        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sort 0 1 (DEBUG) ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements (0 or 1): ");
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
