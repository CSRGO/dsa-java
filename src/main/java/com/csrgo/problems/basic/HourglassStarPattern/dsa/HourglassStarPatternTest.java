// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.HourglassStarPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class HourglassStarPatternTest {

    private static String buildExpected(int n) {
        if (n <= 0 || n % 2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    sb.append("*");
                    if (j < n) {
                        sb.append("\t");
                    }
                }
            } else if (i < mid) {
                for (int sp = 1; sp <= i - 1; sp++) {
                    sb.append("\t");
                }
                sb.append("*");
                int gap = n - 2 * i + 1;
                for (int sp = 1; sp <= gap; sp++) {
                    sb.append("\t");
                }
                sb.append("*");
            } else if (i == mid) {
                for (int sp = 1; sp <= mid - 1; sp++) {
                    sb.append("\t");
                }
                sb.append("*");
            } else {
                for (int sp = 1; sp <= n - i; sp++) {
                    sb.append("\t");
                }
                int stars = 2 * (i - mid) + 1;
                for (int st = 1; st <= stars; st++) {
                    sb.append("*");
                    if (st < stars) {
                        sb.append("\t");
                    }
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Base Case", 1, "*\n"),
            new TestCase<>("Three Rows Miniature Hourglass", 3, "*\t*\t*\n\t*\n*\t*\t*\n"),
            new TestCase<>("Five Rows Standard Hourglass", 5, "*\t*\t*\t*\t*\n\t*\t\t*\n\t\t*\n\t*\t*\t*\n*\t*\t*\t*\t*\n"),
            new TestCase<>("Seven Rows Image Example", 7, "*\t*\t*\t*\t*\t*\t*\n\t*\t\t\t\t*\n\t\t*\t\t*\n\t\t\t*\n\t\t*\t*\t*\n\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\n"),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Wide", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Expanded", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Hourglass Star Pattern",
            testCases,
            input -> HourglassStarPattern.solve(input), 
            true 
        );
    }
}
