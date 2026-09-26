// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ImplementStrstr.engineering;

public class ImplementStrstrDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null || haystack.length() < needle.length()) return -1;
        return haystack.indexOf(needle);
    }

    private static void runTestCase(int testNumber, String haystack, String needle) {
        int expectedResult = expected(haystack, needle);
        int actualResult;
        try {
            actualResult = ImplementStrstrDebug.solve(haystack, needle);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: haystack=\"" + haystack + "\", needle=\"" + needle + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: haystack=\"" + haystack + "\", needle=\"" + needle + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ImplementStrstrDebug tests...");

        runTestCase(1, "hello", "ll");
        runTestCase(2, "aaaaa", "bba");
        runTestCase(3, "hello", "");
        runTestCase(4, "a", "a");
        runTestCase(5, "mississippi", "issip");
        runTestCase(6, "mississippi", "issipi");
        runTestCase(7, "abcde", "cde");
        runTestCase(8, "abcde", "abcde");
        runTestCase(9, "short", "longerneedle");
        runTestCase(10, "communityservice", "service");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
