// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PathToLeaf.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/path-to-leaf/
public class PathToLeaf {

    public static String[] solve(int[] arr, int low, int high) {
        // TODO: write your logic here
        return new String[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Path to Leaf ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter low bound: ");
        int low = sc.nextInt();

        System.out.print("Enter high bound: ");
        int high = sc.nextInt();

        String[] result = solve(arr, low, high);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Range     : [" + low + ", " + high + "]");
        System.out.println("Paths     : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
