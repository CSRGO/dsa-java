// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IntersectionPoint.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/intersection-point/
public class IntersectionPoint {

    public static int solve(int[] l1, int[] l2, int skip1, int skip2) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Intersection Point ====");
        System.out.print("Enter size of list 1: ");
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            l1[i] = sc.nextInt();
        }

        System.out.print("Enter size of list 2: ");
        int m = sc.nextInt();
        int[] l2 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            l2[i] = sc.nextInt();
        }

        System.out.print("Enter skip1: ");
        int skip1 = sc.nextInt();

        System.out.print("Enter skip2: ");
        int skip2 = sc.nextInt();

        int result = solve(l1, l2, skip1, skip2);

        System.out.println("------------------------");
        System.out.println("Intersection Val : " + result);
        System.out.println("========================");

        sc.close();
    }
}
