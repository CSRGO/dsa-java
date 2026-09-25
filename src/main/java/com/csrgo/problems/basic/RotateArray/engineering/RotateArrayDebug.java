// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotate-array/
public class RotateArrayDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - k);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotate Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation k: ");
        int k = sc.nextInt();
        
        int[] result = solve(arr, k);
        
        System.out.println("------------------------");
        System.out.println("Input  : k=" + k);
        System.out.println("Rotated: " + Arrays.toString(result));
        System.out.println("========================");
    }
}
