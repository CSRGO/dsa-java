// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CorporateFlightBookings.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/corporate-flight-bookings/
public class CorporateFlightBookingsDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] bookings, int n) {
        if (n <= 0) {
            return null;
        }

        int[] res = new int[n];
        if (bookings == null || bookings.length == 0) {
            return res;
        }

        for (int i = 0; i < bookings.length; i = i + 1) {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];

            if (first < n) {
                res[first] = res[first] + seats;
            }
            if (last - 1 < n) {
                res[last - 1] = res[last - 1] - seats;
            }
        }

        for (int i = 1; i < n; i = i + 1) {
            res[i] = res[i] + res[i - 1];
        }

        return res;
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
