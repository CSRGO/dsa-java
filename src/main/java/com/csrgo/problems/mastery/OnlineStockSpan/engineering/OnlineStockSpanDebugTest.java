// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.OnlineStockSpan.engineering;

import java.util.*;
import com.csrgo.util.*;

public class OnlineStockSpanDebugTest {

    static class Input {
        final int[] prices;

        Input(int[] prices) {
            this.prices = prices;
        }

        @Override
        public String toString() {
            return Arrays.toString(prices);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Fluctuation Seven Days",
                new Input(new int[]{100, 80, 60, 70, 60, 75, 85}),
                new int[]{1, 1, 1, 2, 1, 4, 6}
            ),
            new TestCase<>(
                "Strictly Increasing Five Days",
                new Input(new int[]{10, 20, 30, 40, 50}),
                new int[]{1, 2, 3, 4, 5}
            ),
            new TestCase<>(
                "Strictly Decreasing Five Days",
                new Input(new int[]{50, 40, 30, 20, 10}),
                new int[]{1, 1, 1, 1, 1}
            ),
            new TestCase<>(
                "Single Day Price",
                new Input(new int[]{100}),
                new int[]{1}
            ),
            new TestCase<>(
                "Identical Prices Every Day",
                new Input(new int[]{30, 30, 30, 30}),
                new int[]{1, 2, 3, 4}
            ),
            new TestCase<>(
                "Dip And Recovery",
                new Input(new int[]{50, 20, 10, 30, 60}),
                new int[]{1, 1, 1, 3, 5}
            ),
            new TestCase<>(
                "Alternating High Low Peaks",
                new Input(new int[]{40, 30, 40, 30, 40}),
                new int[]{1, 1, 3, 1, 5}
            ),
            new TestCase<>(
                "Two Days Price Jump",
                new Input(new int[]{15, 25}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Two Days Price Drop",
                new Input(new int[]{25, 15}),
                new int[]{1, 1}
            ),
            new TestCase<>(
                "Wave Pattern Eight Days",
                new Input(new int[]{31, 41, 48, 59, 79, 60, 70, 80}),
                new int[]{1, 2, 3, 4, 5, 1, 2, 8}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Online Stock Span (Debug)",
            testCases,
            input -> OnlineStockSpanDebug.solve(input.prices.clone()),
            false
        );
    }
}
