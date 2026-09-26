// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintPermutations.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintPermutationsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void permute(String q, String ans, List<String> res) {
        if (q.length() == 0) {
            res.add(ans);
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            String rem = q.substring(0, i) + q.substring(i + 1);
            permute(rem, ans + ch, res);
        }
    }

    private static List<String> expected(String str) {
        List<String> res = new ArrayList<>();
        if (str == null) return res;
        permute(str, "", res);
        return res;
    }

    private static void runTestCase(int testNumber, String str) {
        List<String> expectedResult = expected(str);
        List<String> actualResult;
        try {
            actualResult = PrintPermutationsDebug.solve(str);
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
        System.out.println("Running PrintPermutationsDebug tests...");

        runTestCase(1, "abc");
        runTestCase(2, "a");
        runTestCase(3, "");
        runTestCase(4, "ab");
        runTestCase(5, "ba");
        runTestCase(6, "xy");
        runTestCase(7, "xyz");
        runTestCase(8, "cba");
        runTestCase(9, "p");
        runTestCase(10, "abcd");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
