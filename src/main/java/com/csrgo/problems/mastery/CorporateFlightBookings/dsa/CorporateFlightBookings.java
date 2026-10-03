// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CorporateFlightBookings.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/corporate-flight-bookings/
public class CorporateFlightBookings {

    public static int[] solve(int[][] bookings, int n) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bookings: ");
        int m = sc.nextInt();
        int[][] bookings = new int[m][3];
        System.out.println("Enter bookings (first last seats):");
        for (int i = 0; i < m; i = i + 1) {
            bookings[i][0] = sc.nextInt();
            bookings[i][1] = sc.nextInt();
            bookings[i][2] = sc.nextInt();
        }
        System.out.print("Enter number of flights n: ");
        int n = sc.nextInt();

        int[] result = solve(bookings, n);
        System.out.println("Reserved Seats: " + Arrays.toString(result));
        sc.close();
    }
}
