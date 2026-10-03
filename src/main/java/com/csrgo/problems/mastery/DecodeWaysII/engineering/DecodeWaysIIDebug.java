// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DecodeWaysII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decode-ways-ii/
public class DecodeWaysIIDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        long prev2 = 1L;
        long prev1 = 0L;

        if (s.charAt(0) == '*') {
            prev1 = 9L;
        } else if (s.charAt(0) != '0') {
            prev1 = 1L;
        }

        for (int i = 1; i < s.length(); i = i + 1) {
            char c1 = s.charAt(i - 1);
            char c2 = s.charAt(i);

            long singleWays = 0L;
            if (c2 == '*') {
                singleWays = 9L;
            } else if (c2 != '0') {
                singleWays = 1L;
            }

            long doubleWays = 0L;
            if (c1 == '*') {
                if (c2 == '*') {
                    doubleWays = 9L;
                } else if (c2 <= '6') {
                    doubleWays = 2L;
                } else {
                    doubleWays = 1L;
                }
            } else if (c1 == '1') {
                if (c2 == '*') {
                    doubleWays = 9L;
                } else {
                    doubleWays = 1L;
                }
            } else if (c1 == '2') {
                if (c2 == '*') {
                    doubleWays = 6L;
                } else if (c2 <= '9') {
                    doubleWays = 1L;
                }
            }

            long curr = singleWays * prev1 + doubleWays * prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return (int) prev1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decode Ways II (DEBUG) ====");
        System.out.print("Enter encoded string s (digits and '*'): ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Encoded String : \"" + s + "\"");
        System.out.println("Decoding Ways  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
