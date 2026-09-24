// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalNumberTriangle.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DecimalNumberTriangleTest {

    private static String buildExpected(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int current = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(current);
                current++;
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
            new TestCase<>("Single Number Base Case", 1, "1\n"),
            new TestCase<>("Two Rows Smallest Triangle", 2, "1\n2\t3\n"),
            new TestCase<>("Three Rows Sequential", 3, "1\n2\t3\n4\t5\t6\n"),
            new TestCase<>("Four Rows Standard Example", 4, "1\n2\t3\n4\t5\t6\n7\t8\t9\t10\n"),
            new TestCase<>("Five Rows Double Digit Transition", 5, "1\n2\t3\n4\t5\t6\n7\t8\t9\t10\n11\t12\t13\t14\t15\n"),
            new TestCase<>("Six Rows Stepped", 6, buildExpected(6)),
            new TestCase<>("Seven Rows Mid Size", 7, buildExpected(7)),
            new TestCase<>("Ten Rows Scaled", 10, buildExpected(10)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Twenty Rows Boundary Check", 20, buildExpected(20))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Decimal Number Triangle",
            testCases,
            input -> DecimalNumberTriangle.solve(input), 
            true 
        );
    }
}
