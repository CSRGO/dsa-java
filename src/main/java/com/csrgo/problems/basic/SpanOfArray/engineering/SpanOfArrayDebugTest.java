// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SpanOfArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SpanOfArrayDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Mixed Elements", new int[]{15, 30, 40, 4, 11, 9}, 36),
            new TestCase<>("All Identical Elements", new int[]{6, 6, 6, 6}, 0),
            new TestCase<>("Single Element", new int[]{42}, 0),
            new TestCase<>("Strictly Increasing", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9),
            new TestCase<>("Strictly Decreasing", new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 9),
            new TestCase<>("All Negative Numbers", new int[]{-10, -20, -5, -30, -2}, 28),
            new TestCase<>("Mixed Signs with Zero", new int[]{-50, 0, 50}, 100),
            new TestCase<>("Thousands Range", new int[]{1000, 2000, 500, 3000, 1500}, 2500),
            new TestCase<>("All Zeros", new int[]{0, 0, 0, 0, 0}, 0),
            new TestCase<>("Max Integer Boundary", new int[]{2147483647, 0}, 2147483647)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Span of Array (DEBUG)",
            testCases,
            input -> SpanOfArrayDebug.solve(input), 
            false 
        );
    }
}
