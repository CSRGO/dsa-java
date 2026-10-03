// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPlatforms.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-platforms/
public class MinimumPlatformsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int[] dep) {
        if (arr == null || dep == null || arr.length <= 1) {
            return 0;
        }

        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;
        int j = 0;
        int currentPlatforms = 0;
        int maxPlatforms = 0;

        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                currentPlatforms = currentPlatforms + 1;
                maxPlatforms = Math.max(maxPlatforms, currentPlatforms);
                i = i + 1;
            } else {
                currentPlatforms = currentPlatforms - 1;
                j = j + 1;
            }
        }

        return maxPlatforms;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Platforms (Debug) ====");
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
