// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetCommonElementsII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/get-common-elements-ii/
public class GetCommonElementsII {

    public static int[] solve(int[] a1, int[] a2) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Get Common Elements II ====");
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n1; i = i + 1) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < n2; i = i + 1) {
            a2[i] = sc.nextInt();
        }

        int[] result = solve(a1, a2);

        System.out.println("------------------------");
        System.out.println("Common Elements: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
