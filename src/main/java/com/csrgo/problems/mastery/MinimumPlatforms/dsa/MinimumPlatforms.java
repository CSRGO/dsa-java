// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPlatforms.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-platforms/
public class MinimumPlatforms {

    public static int solve(int[] arr, int[] dep) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Platforms ====");
        System.out.print("Enter number of trains n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter arrival time for train " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            System.out.print("Enter departure time for train " + (i + 1) + ": ");
            dep[i] = sc.nextInt();
        }

        int result = solve(arr, dep);

        System.out.println("------------------------");
        System.out.println("Arrivals           : " + Arrays.toString(arr));
        System.out.println("Departures         : " + Arrays.toString(dep));
        System.out.println("Platforms Required : " + result);
        System.out.println("========================");

        sc.close();
    }
}
