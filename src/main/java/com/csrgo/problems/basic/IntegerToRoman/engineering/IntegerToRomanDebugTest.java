// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.IntegerToRoman.engineering;

public class IntegerToRomanDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static String expected(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }

    private static void runTestCase(int testNumber, int num) {
        String expectedResult = expected(num);
        String actualResult;
        try {
            actualResult = IntegerToRomanDebug.solve(num);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: num=" + num + ", result=\"" + actualResult + "\"");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: num=" + num + ", expected=\"" + expectedResult + "\", actual=\"" + actualResult + "\"");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running IntegerToRomanDebug tests...");

        runTestCase(1, 3);
        runTestCase(2, 4);
        runTestCase(3, 9);
        runTestCase(4, 58);
        runTestCase(5, 1994);
        runTestCase(6, 1);
        runTestCase(7, 40);
        runTestCase(8, 90);
        runTestCase(9, 400);
        runTestCase(10, 3999);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
