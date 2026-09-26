// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringToIntegerAtoi.engineering;

public class StringToIntegerAtoiDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(String s) {
        if (s == null) return 0;
        int n = s.length(), i = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;
        int sign = 1;
        char c = s.charAt(i);
        if (c == '+') i++;
        else if (c == '-') { sign = -1; i++; }
        int result = 0;
        int maxLimit = Integer.MAX_VALUE / 10;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > maxLimit || (result == maxLimit && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    private static void runTestCase(int testNumber, String s) {
        int expectedResult = expected(s);
        int actualResult;
        try {
            actualResult = StringToIntegerAtoiDebug.solve(s);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running StringToIntegerAtoiDebug tests...");

        runTestCase(1, "42");
        runTestCase(2, "   -42");
        runTestCase(3, "4193 with words");
        runTestCase(4, "words and 987");
        runTestCase(5, "-91283472332");
        runTestCase(6, "+1");
        runTestCase(7, "00000-42a1234");
        runTestCase(8, "  +0 123");
        runTestCase(9, "2147483647");
        runTestCase(10, "-2147483648");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
