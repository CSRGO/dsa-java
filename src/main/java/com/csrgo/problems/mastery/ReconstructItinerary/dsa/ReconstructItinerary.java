// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReconstructItinerary.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reconstruct-itinerary/
public class ReconstructItinerary {

    public static String[] solve(String[][] tickets) {
        // TODO: write your logic here
        return new String[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reconstruct Itinerary ====");
        System.out.print("Enter number of tickets n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[][] tickets = new String[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter departure airport for ticket " + (i + 1) + ": ");
            tickets[i][0] = sc.nextLine().trim().toUpperCase();
            System.out.print("Enter arrival airport for ticket " + (i + 1) + ": ");
            tickets[i][1] = sc.nextLine().trim().toUpperCase();
        }

        String[] itinerary = solve(tickets);
        System.out.println("Itinerary: " + Arrays.toString(itinerary));
    }
}
