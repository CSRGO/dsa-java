// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DailyTemperaturesVariation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/daily-temperatures-variation/
public class DailyTemperaturesVariation {

    public static int[] solve(int[] temperatures) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Daily Temperatures (Variation) ====");
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i = i + 1) {
            temperatures[i] = sc.nextInt();
        }

        int[] result = solve(temperatures);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(temperatures));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
