// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ArrowStarPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ArrowStarPatternTest {

    private static String buildExpected(int n) {
        if (n <= 0 || n % 2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            if (i == mid) {
                for (int st = 1; st <= n; st++) {
                    sb.append("*");
                    if (st < n) {
                        sb.append("\t");
                    }
                }
            } else {
                for (int sp = 1; sp <= mid - 1; sp++) {
                    sb.append("\t");
                }
                int k = (i < mid) ? i : (n - i + 1);
                for (int st = 1; st <= k; st++) {
                    sb.append("*");
                    if (st < k) {
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
            new TestCase<>("Three Rows Small Arrow", 3, "\t*\n*\t*\t*\n\t*\n"),
            new TestCase<>("Five Rows Standard Example", 5, "\t\t*\n\t\t*\t*\n*\t*\t*\t*\t*\n\t\t*\t*\n\t\t*\n"),
            new TestCase<>("Seven Rows Expanded Arrow", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Wide", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Scaled Up", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Arrow Star Pattern",
            testCases,
            input -> ArrowStarPattern.solve(input), 
            true 
        );
    }
}
