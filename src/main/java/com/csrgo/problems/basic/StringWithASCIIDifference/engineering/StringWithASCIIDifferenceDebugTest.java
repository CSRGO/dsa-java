// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringWithASCIIDifference.engineering;

import java.util.Objects;

public class StringWithASCIIDifferenceDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static String expected(String s) {
        if (s == null || s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            sb.append(curr - prev);
            sb.append(curr);
        }
        return sb.toString();
    }

    private static void runTestCase(int testNumber, String s) {
        String expectedResult = expected(s);
        String actualResult = null;
        try {
            actualResult = StringWithASCIIDifferenceDebug.solve(s);
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
        System.out.println("Running StringWithASCIIDifferenceDebug tests...");

        runTestCase(1, "abecd");
        runTestCase(2, "pep");
        runTestCase(3, "a");
        runTestCase(4, "ab");
        runTestCase(5, "ba");
        runTestCase(6, "aaa");
        runTestCase(7, "aA");
        runTestCase(8, "Aa");
        runTestCase(9, "xyz");
        runTestCase(10, "zyx");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
