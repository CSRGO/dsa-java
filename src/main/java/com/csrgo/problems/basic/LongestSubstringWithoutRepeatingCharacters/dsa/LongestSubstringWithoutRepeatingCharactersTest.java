// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.LongestSubstringWithoutRepeatingCharacters.dsa;

import java.util.Arrays;
import java.util.Objects;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }
            lastIndex[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    private static void runTestCase(int testNumber, String s) {
        int expectedResult = expected(s);
        int actualResult = LongestSubstringWithoutRepeatingCharacters.solve(s);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running LongestSubstringWithoutRepeatingCharacters tests...");

        runTestCase(1, "abcabcbb");
        runTestCase(2, "bbbbb");
        runTestCase(3, "pwwkew");
        runTestCase(4, "");
        runTestCase(5, "a");
        runTestCase(6, "abcdef");
        runTestCase(7, "a b c a");
        runTestCase(8, "1231234");
        runTestCase(9, "dvdf");
        runTestCase(10, "abba");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
