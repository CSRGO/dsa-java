// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CopyListWithRandomPointer.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/copy-list-with-random-pointer/
public class CopyListWithRandomPointer {

    public static int[][] solve(int[][] arr) {
        // TODO: write your logic here
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Copy List with Random Pointer ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter val and random index for node " + i + ": ");
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.deepToString(arr));
        System.out.println("Output : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}
