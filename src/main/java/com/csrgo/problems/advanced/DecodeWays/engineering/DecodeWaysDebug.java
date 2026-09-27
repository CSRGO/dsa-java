// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DecodeWays.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decode-ways/
public class DecodeWaysDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int prev2 = 1;
        int prev1 = 1;

        for (int i = 2; i < n; i = i + 1) {
            int current = 0;
            int oneDigit = s.charAt(i - 1) - '0';
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1 && oneDigit <= 9) {
                current = current + prev1;
            }

            if (twoDigits >= 10 && twoDigits <= 27) {
                current = current + prev2;
            }

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decode Ways (DEBUG) ====");
        System.out.print("Enter encoded digits string: ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : s=\"" + s + "\"");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
