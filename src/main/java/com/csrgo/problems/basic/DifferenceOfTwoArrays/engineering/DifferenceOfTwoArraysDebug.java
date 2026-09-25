// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DifferenceOfTwoArrays.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/difference-of-two-arrays/
public class DifferenceOfTwoArraysDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] a1, int[] a2) {
        if (a1 == null || a1.length == 0) {
            return new int[]{0};
        }
        if (a2 == null || a2.length == 0) {
            return a1;
        }

        int n = a1.length;
        int[] diff = new int[n];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = n - 1;
        int borrow = 0;

        while (k >= 0) {
            int d = a1[i] - borrow;
            if (j >= 0) {
                d = d - a2[j];
            }

            if (d < 0) {
                d = d + 10;
                borrow = 1;
            }

            diff[k] = d;

            i = i - 1;
            j = j - 1;
            k = k - 1;
        }

        return diff;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Difference of Two Arrays (DEBUG) ====");
        System.out.print("Enter size of first array n1 (larger): ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter " + n1 + " digits for first array:");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array n2 (smaller): ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter " + n2 + " digits for second array:");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        
        int[] result = solve(a1, a2);
        
        System.out.println("------------------------");
        System.out.println("Input 1 : " + Arrays.toString(a1));
        System.out.println("Input 2 : " + Arrays.toString(a2));
        System.out.println("Diff    : " + Arrays.toString(result));
        System.out.println("========================");
    }
}
