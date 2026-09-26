// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ToggleCase.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/toggle-case/
public class ToggleCaseDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Bug 1: Using independent if instead of else-if causes converted uppercase to be re-processed
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                // Bug 2: Subtracts 32 instead of adding 32 when converting uppercase to lowercase
                char lower = (char) (ch - 32);
                sb.append(lower);
            }
            // Bug 3: Missing fallback else branch completely drops spaces, digits, and punctuation
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "pepCODing";
        String result = solve(s);
        System.out.println("Result: " + result);
    }
}
