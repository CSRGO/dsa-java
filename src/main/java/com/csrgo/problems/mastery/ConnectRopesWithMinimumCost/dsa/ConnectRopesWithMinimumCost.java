// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConnectRopesWithMinimumCost.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/connect-ropes-with-minimum-cost/
public class ConnectRopesWithMinimumCost {

    public static int solve(int[] arr) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Connect Ropes with Minimum Cost ====");
        System.out.print("Enter number of ropes n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter rope length " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Ropes        : " + Arrays.toString(arr));
        System.out.println("Minimum Cost : " + result);
        System.out.println("========================");

        sc.close();
    }
}
