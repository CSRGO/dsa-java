// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FibonacciNumberTriangle.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FibonacciNumberTriangleDebugTest {

    private static String buildExpected(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        long a = 0;
        long b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(a);
                long next = a + b;
                a = b;
                b = next;
                if (j < i) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Row Root Zero", 1, "0\n"),
            new TestCase<>("Two Rows First Terminals", 2, "0\n1\t1\n"),
            new TestCase<>("Three Rows Fibonacci Branch", 3, "0\n1\t1\n2\t3\t5\n"),
            new TestCase<>("Four Rows Standard Example", 4, "0\n1\t1\n2\t3\t5\n8\t13\t21\t34\n"),
            new TestCase<>("Five Rows Double Digits", 5, buildExpected(5)),
            new TestCase<>("Six Rows Expanded", 6, buildExpected(6)),
            new TestCase<>("Seven Rows Scaling", 7, buildExpected(7)),
            new TestCase<>("Eight Rows Mid Size", 8, buildExpected(8)),
            new TestCase<>("Nine Rows High Orders", 9, buildExpected(9)),
            new TestCase<>("Ten Rows Max Constraint", 10, buildExpected(10))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Fibonacci Number Triangle (DEBUG)",
            testCases,
            input -> FibonacciNumberTriangleDebug.solve(input), 
            false 
        );
    }
}
