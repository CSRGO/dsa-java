// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintEncodings.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintEncodingsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void encode(String q, String ans, List<String> res) {
        if (q.length() == 0) {
            res.add(ans);
            return;
        }
        if (q.charAt(0) == '0') return;

        int v1 = q.charAt(0) - '0';
        encode(q.substring(1), ans + (char) ('a' + v1 - 1), res);

        if (q.length() >= 2) {
            int v2 = Integer.parseInt(q.substring(0, 2));
            if (v2 <= 26) {
                encode(q.substring(2), ans + (char) ('a' + v2 - 1), res);
            }
        }
    }

    private static List<String> expected(String str) {
        List<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) return res;
        encode(str, "", res);
        return res;
    }

    private static void runTestCase(int testNumber, String str) {
        List<String> expectedResult = expected(str);
        List<String> actualResult;
        try {
            actualResult = PrintEncodingsDebug.solve(str);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + str + "\", encodings=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + str + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PrintEncodingsDebug tests...");

        runTestCase(1, "123");
        runTestCase(2, "103");
        runTestCase(3, "0");
        runTestCase(4, "1");
        runTestCase(5, "11");
        runTestCase(6, "26");
        runTestCase(7, "27");
        runTestCase(8, "1234");
        runTestCase(9, "206");
        runTestCase(10, "");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
