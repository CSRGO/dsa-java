// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.IpoProblem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/ipo-problem/
public class IpoProblem {

    public static int solve(int k, int w, int[] profits, int[] capital) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== IPO Problem ====");
        System.out.print("Enter number of projects n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter max projects k: ");
        int k = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter initial capital w: ");
        int w = Integer.parseInt(sc.nextLine().trim());

        int[] profits = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter profit for project " + (i + 1) + ": ");
            profits[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int[] capital = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter capital required for project " + (i + 1) + ": ");
            capital[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int finalCapital = solve(k, w, profits, capital);
        System.out.println("Maximized Final Capital: " + finalCapital);
    }
}
