// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringToIntegerAtoi.engineering;

// Problem Link: https://dsa.csrgo.com/problems/string-to-integer-atoi/
public class StringToIntegerAtoiDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int i = 0;

        // Bug 1: Missing whitespace skipping loop; aborts parsing immediately if leading space exists

        int sign = 1;
        if (i < n) {
            char firstChar = s.charAt(i);
            if (firstChar == '+') {
                i++;
            } else if (firstChar == '-') {
                // Bug 2: Increments index but forgets to set sign to -1
                i++;
            }
        }

        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Bug 3: No overflow/underflow protection; arithmetic wraps around silently in 32-bit signed int
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "   -42";
        int result = solve(s);
        System.out.println("Result: " + result);
    }
}
