// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MazePathsWithJumps.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MazePathsWithJumpsTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<String> expected(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> b = new ArrayList<>();
            b.add("");
            return b;
        }

        List<String> paths = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            List<String> hp = expected(sr, sc + ms, dr, dc);
            for (String s : hp) paths.add("h" + ms + s);
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            List<String> vp = expected(sr + ms, sc, dr, dc);
            for (String s : vp) paths.add("v" + ms + s);
        }

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            List<String> dp = expected(sr + ms, sc + ms, dr, dc);
            for (String s : dp) paths.add("d" + ms + s);
        }

        return paths;
    }

    private static void runTestCase(int testNumber, int sr, int sc, int dr, int dc) {
        List<String> expectedResult = expected(sr, sc, dr, dc);
        List<String> actualResult = MazePathsWithJumps.solve(sr, sc, dr, dc);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: paths=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running MazePathsWithJumps tests...");

        runTestCase(1, 1, 1, 2, 2);
        runTestCase(2, 1, 1, 1, 1);
        runTestCase(3, 1, 1, 3, 3);
        runTestCase(4, 1, 1, 1, 3);
        runTestCase(5, 1, 1, 3, 1);
        runTestCase(6, 1, 1, 2, 3);
        runTestCase(7, 1, 1, 3, 2);
        runTestCase(8, 2, 2, 3, 3);
        runTestCase(9, 1, 1, 4, 2);
        runTestCase(10, 1, 1, 2, 4);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
