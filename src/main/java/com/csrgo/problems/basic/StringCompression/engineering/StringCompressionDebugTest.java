// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringCompression.engineering;

import java.util.Objects;

public class StringCompressionDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static String expected(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            int j = i;
            while (j < n && s.charAt(j) == ch) {
                j++;
            }
            int count = j - i;
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
            i = j;
        }
        return sb.toString();
    }

    private static void runTestCase(int testNumber, String s) {
        String expectedResult = expected(s);
        String actualResult = null;
        try {
            actualResult = StringCompressionDebug.solve(s);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=\"" + actualResult + "\"");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=\"" + expectedResult + "\", actual=\"" + actualResult + "\"");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running StringCompressionDebug tests...");

        runTestCase(1, "aaabbccdee");
        runTestCase(2, "abc");
        runTestCase(3, "a");
        runTestCase(4, "aaaaa");
        runTestCase(5, "abab");
        runTestCase(6, "aabbcc");
        runTestCase(7, "abbbbbbbbbbbb");
        runTestCase(8, "aAAAbb");
        runTestCase(9, "111223");
        runTestCase(10, "aaab");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
