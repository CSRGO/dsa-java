// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MazePaths.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MazePathsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<String> expected(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        if (sr > dr || sc > dc) return new ArrayList<>();

        List<String> hp = expected(sr, sc + 1, dr, dc);
        List<String> vp = expected(sr + 1, sc, dr, dc);

        List<String> res = new ArrayList<>();
        for (String s : hp) res.add("h" + s);
        for (String s : vp) res.add("v" + s);
        return res;
    }

    private static void runTestCase(int testNumber, int sr, int sc, int dr, int dc) {
        List<String> expectedResult = expected(sr, sc, dr, dc);
        List<String> actualResult;
        try {
            actualResult = MazePathsDebug.solve(sr, sc, dr, dc);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: paths=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running MazePathsDebug tests...");

        runTestCase(1, 1, 1, 2, 2);
        runTestCase(2, 1, 1, 1, 1);
        runTestCase(3, 1, 1, 3, 3);
        runTestCase(4, 1, 1, 1, 3);
        runTestCase(5, 1, 1, 3, 1);
        runTestCase(6, 1, 1, 2, 3);
        runTestCase(7, 1, 1, 3, 2);
        runTestCase(8, 2, 2, 4, 4);
        runTestCase(9, 1, 1, 4, 2);
        runTestCase(10, 1, 1, 2, 4);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
