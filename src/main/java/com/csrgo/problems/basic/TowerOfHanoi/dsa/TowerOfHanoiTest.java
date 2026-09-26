// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.TowerOfHanoi.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TowerOfHanoiTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void toh(int n, int src, int dest, int helper, List<String> res) {
        if (n == 0) return;
        toh(n - 1, src, helper, dest, res);
        res.add(n + "[" + src + " -> " + dest + "]");
        toh(n - 1, helper, dest, src, res);
    }

    private static List<String> expected(int n, int src, int dest, int helper) {
        List<String> res = new ArrayList<>();
        toh(n, src, dest, helper, res);
        return res;
    }

    private static void runTestCase(int testNumber, int n, int src, int dest, int helper) {
        List<String> expectedResult = expected(n, src, dest, helper);
        List<String> actualResult = TowerOfHanoi.solve(n, src, dest, helper);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", moves=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running TowerOfHanoi tests...");

        runTestCase(1, 1, 1, 2, 3);
        runTestCase(2, 2, 1, 2, 3);
        runTestCase(3, 3, 10, 11, 12);
        runTestCase(4, 4, 1, 3, 2);
        runTestCase(5, 5, 10, 20, 30);
        runTestCase(6, 2, 2, 3, 1);
        runTestCase(7, 3, 3, 1, 2);
        runTestCase(8, 4, 10, 11, 12);
        runTestCase(9, 1, 100, 200, 300);
        runTestCase(10, 6, 1, 2, 3);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
