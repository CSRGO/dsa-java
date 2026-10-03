// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CandyDistribution.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/candy-distribution/
public class CandyDistributionDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] ratings) {
        if (ratings == null || ratings.length <= 1) {
            return 0;
        }

        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i = i + 1) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i > 0; i = i - 1) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        int total = 0;
        for (int i = 0; i < n; i = i + 1) {
            total = total + candies[i];
        }

        return total;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Candy Distribution (Debug) ====");
        System.out.print("Enter number of children n: ");
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter rating for child " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
        }

        int result = solve(ratings);

        System.out.println("------------------------");
        System.out.println("Ratings         : " + Arrays.toString(ratings));
        System.out.println("Minimum Candies : " + result);
        System.out.println("========================");

        sc.close();
    }
}
