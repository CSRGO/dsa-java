// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.GetSubsequence.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GetSubsequenceDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<String> expected(String str) {
        if (str == null) return new ArrayList<>();
        if (str.length() == 0) {
            List<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);
        List<String> rres = expected(rem);
        List<String> myres = new ArrayList<>();
        for (String s : rres) myres.add("" + s);
        for (String s : rres) myres.add(ch + s);
        return myres;
    }

    private static void runTestCase(int testNumber, String str) {
        List<String> expectedResult = expected(str);
        List<String> actualResult;
        try {
            actualResult = GetSubsequenceDebug.solve(str);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + str + "\", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + str + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running GetSubsequenceDebug tests...");

        runTestCase(1, "abc");
        runTestCase(2, "");
        runTestCase(3, "a");
        runTestCase(4, "ab");
        runTestCase(5, "y");
        runTestCase(6, "xyz");
        runTestCase(7, "abcd");
        runTestCase(8, "aa");
        runTestCase(9, "xy");
        runTestCase(10, "pq");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
