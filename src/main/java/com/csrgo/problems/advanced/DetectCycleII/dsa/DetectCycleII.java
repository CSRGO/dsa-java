// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DetectCycleII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/detect-cycle-ii/
public class DetectCycleII {

    public static int solve(int[] arr, int pos) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Detect Cycle II ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter cycle position (-1 for none): ");
        int pos = sc.nextInt();

        int result = solve(arr, pos);

        System.out.println("------------------------");
        System.out.println("Input arr       : " + Arrays.toString(arr));
        System.out.println("Position        : " + pos);
        System.out.println("Cycle Node Val  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
