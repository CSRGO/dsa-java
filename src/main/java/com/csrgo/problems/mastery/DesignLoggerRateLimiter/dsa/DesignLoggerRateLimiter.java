// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignLoggerRateLimiter.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-logger-rate-limiter/
public class DesignLoggerRateLimiter {

    public static boolean[] solve(int[] timestamps, String[] messages) {
        // TODO: write your logic here
        return new boolean[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Logger Rate Limiter ====");
        System.out.print("Enter number of messages: ");
        int n = sc.nextInt();
        int[] timestamps = new int[n];
        String[] messages = new String[n];
        System.out.println("Enter timestamp and message per line:");
        for (int i = 0; i < n; i = i + 1) {
            timestamps[i] = sc.nextInt();
            messages[i] = sc.next();
        }

        boolean[] result = solve(timestamps, messages);

        System.out.println("------------------------");
        System.out.println("Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
