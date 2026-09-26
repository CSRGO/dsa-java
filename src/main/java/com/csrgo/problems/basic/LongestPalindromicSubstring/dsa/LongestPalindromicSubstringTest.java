// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.LongestPalindromicSubstring.dsa;

import java.util.Objects;

public class LongestPalindromicSubstringTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isPalindrome(String s) {
        if (s == null) return false;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    private static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    private static String expected(String s) {
        if (s == null || s.length() <= 1) return s;
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int best = Math.max(len1, len2);
            if (best > maxLen) {
                maxLen = best;
                start = i - (best - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    private static void runTestCase(int testNumber, String s) {
        String expectedResult = expected(s);
        String actualResult = LongestPalindromicSubstring.solve(s);

        boolean passed = actualResult != null &&
                         isPalindrome(actualResult) &&
                         s.contains(actualResult) &&
                         actualResult.length() == expectedResult.length();

        if (passed) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=\"" + actualResult + "\"");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=\"" + expectedResult + "\", actual=\"" + actualResult + "\"");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running LongestPalindromicSubstring tests...");

        runTestCase(1, "babad");
        runTestCase(2, "cbbd");
        runTestCase(3, "a");
        runTestCase(4, "ac");
        runTestCase(5, "racecar");
        runTestCase(6, "noon");
        runTestCase(7, "aaaa");
        runTestCase(8, "abacdfgdcaba");
        runTestCase(9, "12321");
        runTestCase(10, "aacabdkacaa");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
