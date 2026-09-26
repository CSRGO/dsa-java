// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RomanToInteger.dsa;

public class RomanToIntegerTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    private static int expected(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int v = val(s.charAt(i));
            if (i + 1 < s.length() && v < val(s.charAt(i + 1))) {
                total -= v;
            } else {
                total += v;
            }
        }
        return total;
    }

    private static void runTestCase(int testNumber, String s) {
        int expectedResult = expected(s);
        int actualResult = RomanToInteger.solve(s);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running RomanToInteger tests...");

        runTestCase(1, "III");
        runTestCase(2, "IV");
        runTestCase(3, "IX");
        runTestCase(4, "LVIII");
        runTestCase(5, "MCMXCIV");
        runTestCase(6, "I");
        runTestCase(7, "XL");
        runTestCase(8, "XC");
        runTestCase(9, "CD");
        runTestCase(10, "MMMCMXCIX");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
