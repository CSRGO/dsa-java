// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.StockSpan.dsa;

import java.util.*;
import com.csrgo.util.*;

public class StockSpanTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Fluctuating Trend", new int[]{100, 80, 60, 70, 60, 75, 85}, new int[]{1, 1, 1, 2, 1, 4, 6}),
            new TestCase<>("Steep Surge Sequence", new int[]{10, 4, 5, 90, 120, 80}, new int[]{1, 1, 2, 4, 5, 1}),
            new TestCase<>("Single Day Price", new int[]{50}, new int[]{1}),
            new TestCase<>("Strictly Decreasing Prices", new int[]{100, 90, 80, 70, 60}, new int[]{1, 1, 1, 1, 1}),
            new TestCase<>("Strictly Increasing Prices", new int[]{10, 20, 30, 40, 50}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Flat Constant Stock Prices", new int[]{50, 50, 50, 50}, new int[]{1, 2, 3, 4}),
            new TestCase<>("Alternating High Low Valley", new int[]{40, 20, 40, 20, 40}, new int[]{1, 1, 3, 1, 5}),
            new TestCase<>("Sharp Drop Then Recovery", new int[]{100, 20, 30, 40, 100}, new int[]{1, 1, 2, 3, 5}),
            new TestCase<>("Two Consecutive Days Rising", new int[]{30, 45}, new int[]{1, 2}),
            new TestCase<>("Two Consecutive Days Falling", new int[]{45, 30}, new int[]{1, 1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Stock Span",
            testCases,
            input -> StockSpan.solve(input),
            true
        );
    }
}
