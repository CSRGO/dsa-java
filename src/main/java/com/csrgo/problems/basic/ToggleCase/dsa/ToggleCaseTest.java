// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ToggleCase.dsa;

import java.util.Objects;

public class ToggleCaseTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static String expected(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 'a' + 'A'));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch - 'A' + 'a'));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static void runTestCase(int testNumber, String s) {
        String expectedResult = expected(s);
        String actualResult = ToggleCase.solve(s);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=\"" + actualResult + "\"");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=\"" + expectedResult + "\", actual=\"" + actualResult + "\"");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ToggleCase tests...");

        runTestCase(1, "pepCODing");
        runTestCase(2, "Hello World!");
        runTestCase(3, "abc");
        runTestCase(4, "ABC");
        runTestCase(5, "x");
        runTestCase(6, "Y");
        runTestCase(7, "123!@#");
        runTestCase(8, "LeetCode 2026");
        runTestCase(9, "aBaBaB");
        runTestCase(10, "  Tab\tTest  ");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
