// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Sort012.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sort-0-1-2/
public class Sort012Debug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid < high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low = low + 1;
                mid = mid + 1;
            } else if (arr[mid] == 1) {
                mid = mid + 1;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high = high - 1;
                mid = mid + 1;
            }
        }

        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sort 0 1 2 (DEBUG) ====");
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
