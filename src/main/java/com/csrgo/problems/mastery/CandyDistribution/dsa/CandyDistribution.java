// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CandyDistribution.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/candy-distribution/
public class CandyDistribution {

    public static int solve(int[] ratings) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Candy Distribution ====");
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
