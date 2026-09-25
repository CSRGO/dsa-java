// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SumOfTwoArrays.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sum-of-two-arrays/
public class SumOfTwoArraysDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] a1, int[] a2) {
        if (a1 == null || a1.length == 0) {
            return a2 == null ? new int[0] : a2;
        }
        if (a2 == null || a2.length == 0) {
            return a1;
        }

        int n = Math.max(a1.length, a2.length);
        int[] sum = new int[n];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = n - 1;
        int carry = 0;

        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d = d + a1[i];
            }
            if (j >= 0) {
                d = d + a2[j];
            }

            carry = d % 10;
            sum[k] = d / 10;

            i = i - 1;
            j = j - 1;
            k = k - 1;
        }

        return sum;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sum of Two Arrays (DEBUG) ====");
        System.out.print("Enter size of first array n1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter " + n1 + " digits for first array:");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array n2: ");
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
        System.out.println("Sum     : " + Arrays.toString(result));
        System.out.println("========================");
    }
}
