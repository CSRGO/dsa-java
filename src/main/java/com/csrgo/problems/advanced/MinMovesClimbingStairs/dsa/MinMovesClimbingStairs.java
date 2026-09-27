// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinMovesClimbingStairs.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-moves-climbing-stairs/
public class MinMovesClimbingStairs {

    public static int solve(int[] arr) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Min Moves Climbing Stairs ====");
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter max jump for each stair: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
