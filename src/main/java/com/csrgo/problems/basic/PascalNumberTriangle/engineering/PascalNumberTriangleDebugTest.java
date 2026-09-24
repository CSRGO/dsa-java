// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PascalNumberTriangle.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PascalNumberTriangleDebugTest {

    private static String buildExpected(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long val = 1;
            for (int k = 0; k <= i; k++) {
                sb.append(val);
                val = val * (i - k) / (k + 1);
                if (k < i) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Row Apex", 1, "1\n"),
            new TestCase<>("Two Rows First Pair", 2, "1\n1\t1\n"),
            new TestCase<>("Three Rows Quadratic Addition", 3, "1\n1\t1\n1\t2\t1\n"),
            new TestCase<>("Four Rows Cubic Coefficients", 4, "1\n1\t1\n1\t2\t1\n1\t3\t3\t1\n"),
            new TestCase<>("Five Rows Standard Example", 5, "1\n1\t1\n1\t2\t1\n1\t3\t3\t1\n1\t4\t6\t4\t1\n"),
            new TestCase<>("Six Rows Binomial Symmetric", 6, buildExpected(6)),
            new TestCase<>("Seven Rows Central Maximum", 7, buildExpected(7)),
            new TestCase<>("Ten Rows Scaled", 10, buildExpected(10)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Twenty Rows Boundary Check", 20, buildExpected(20))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Pascal Number Triangle (DEBUG)",
            testCases,
            input -> PascalNumberTriangleDebug.solve(input), 
            false 
        );
    }
}
