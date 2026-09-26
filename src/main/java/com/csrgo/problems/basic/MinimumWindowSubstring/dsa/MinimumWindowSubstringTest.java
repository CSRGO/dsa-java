// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MinimumWindowSubstring.dsa;

import java.util.Objects;

public class MinimumWindowSubstringTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static String expected(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int[] targetCount = new int[128];
        for (char c : t.toCharArray()) {
            targetCount[c]++;
        }
        int required = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (targetCount[c] > 0) {
                required--;
            }
            targetCount[c]--;

            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                targetCount[leftChar]++;
                if (targetCount[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    private static void runTestCase(int testNumber, String s, String t) {
        String expectedResult = expected(s, t);
        String actualResult = MinimumWindowSubstring.solve(s, t);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=\"" + actualResult + "\"");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=\"" + expectedResult + "\", actual=\"" + actualResult + "\"");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running MinimumWindowSubstring tests...");

        runTestCase(1, "ADOBECODEBANC", "ABC");
        runTestCase(2, "a", "a");
        runTestCase(3, "a", "aa");
        runTestCase(4, "aab", "aab");
        runTestCase(5, "ab", "abc");
        runTestCase(6, "abcdef", "abc");
        runTestCase(7, "defabc", "abc");
        runTestCase(8, "aaflslflfda", "aaa");
        runTestCase(9, "cba", "abc");
        runTestCase(10, "a", "b");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
