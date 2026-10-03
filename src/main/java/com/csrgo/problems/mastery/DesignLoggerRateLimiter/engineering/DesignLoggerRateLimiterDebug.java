// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignLoggerRateLimiter.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-logger-rate-limiter/
public class DesignLoggerRateLimiterDebug {

    // TODO: debug this method to fix it
    public static boolean[] solve(int[] timestamps, String[] messages) {
        int n = messages.length;
        boolean[] result = new boolean[n];
        Map<String, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < n; i = i + 1) {
            String msg = messages[i];
            int t = timestamps[i];

            if (!lastSeen.containsKey(msg) || t - lastSeen.get(msg) > 10) {
                lastSeen.put(msg, t);
                result[i] = true;
            } else {
                lastSeen.put(msg, t);
                result[i] = false;
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Logger Rate Limiter (DEBUG) ====");
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
