// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintPalindromicSubstrings.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintPalindromicSubstringsTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isPalindrome(String sub) {
        int left = 0;
        int right = sub.length() - 1;
        while (left < right) {
            if (sub.charAt(left++) != sub.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private static List<String> expected(String s) {
        List<String> list = new ArrayList<>();
        if (s == null || s.length() == 0) return list;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    list.add(sub);
                }
            }
        }
        return list;
    }

    private static void runTestCase(int testNumber, String s) {
        List<String> expectedResult = expected(s);
        List<String> actualResult = PrintPalindromicSubstrings.solve(s);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PrintPalindromicSubstrings tests...");

        runTestCase(1, "aba");
        runTestCase(2, "aaa");
        runTestCase(3, "z");
        runTestCase(4, "ab");
        runTestCase(5, "abccbc");
        runTestCase(6, "racecar");
        runTestCase(7, "noon");
        runTestCase(8, "abcba");
        runTestCase(9, "aab");
        runTestCase(10, "abba");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
