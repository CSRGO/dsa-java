// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.DisplayArray.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DisplayArrayDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<Integer> expected(int[] arr) {
        List<Integer> res = new ArrayList<>();
        if (arr == null) return res;
        for (int val : arr) {
            res.add(val);
        }
        return res;
    }

    private static void runTestCase(int testNumber, int[] arr) {
        List<Integer> expectedResult = expected(arr);
        List<Integer> actualResult;
        try {
            actualResult = DisplayArrayDebug.solve(arr);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: size=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running DisplayArrayDebug tests...");

        runTestCase(1, new int[]{10, 20, 30, 40, 50});
        runTestCase(2, new int[]{7});
        runTestCase(3, new int[]{});
        runTestCase(4, new int[]{1, 2, 3});
        runTestCase(5, new int[]{-5, -4, -3, -2, -1});
        runTestCase(6, new int[]{100, 200});
        runTestCase(7, new int[]{0, 0, 0});
        runTestCase(8, new int[]{42});
        runTestCase(9, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        runTestCase(10, new int[]{15, 25, 35, 45});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
