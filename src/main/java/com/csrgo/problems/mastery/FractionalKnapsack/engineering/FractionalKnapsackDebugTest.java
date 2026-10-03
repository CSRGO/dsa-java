// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FractionalKnapsack.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FractionalKnapsackDebugTest {

    static class Input {
        final int[] val;
        final int[] wt;
        final int capacity;

        Input(int[] val, int[] wt, int capacity) {
            this.val = val;
            this.wt = wt;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "val=" + Arrays.toString(val) + ", wt=" + Arrays.toString(wt) + ", capacity=" + capacity;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Double>> testCases = List.of(
            new TestCase<>(
                "Three Items Standard Partial Fit",
                new Input(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50),
                240.0
            ),
            new TestCase<>(
                "Capacity Exceeds Total Weight",
                new Input(new int[]{60, 100}, new int[]{10, 20}, 50),
                160.0
            ),
            new TestCase<>(
                "Zero Capacity Knapsack",
                new Input(new int[]{10, 20, 30}, new int[]{5, 10, 15}, 0),
                0.0
            ),
            new TestCase<>(
                "Single Item Fits Completely",
                new Input(new int[]{50}, new int[]{10}, 20),
                50.0
            ),
            new TestCase<>(
                "Single Item Fractional Fifty Percent",
                new Input(new int[]{50}, new int[]{10}, 5),
                25.0
            ),
            new TestCase<>(
                "Exact Total Capacity Match",
                new Input(new int[]{10, 20, 30}, new int[]{10, 20, 30}, 60),
                60.0
            ),
            new TestCase<>(
                "Four Items Sorted By Decreasing Ratio",
                new Input(new int[]{280, 100, 120, 120}, new int[]{40, 10, 20, 24}, 60),
                440.0
            ),
            new TestCase<>(
                "All Items Uniform Ratio",
                new Input(new int[]{10, 20, 30}, new int[]{1, 2, 3}, 4),
                40.0
            ),
            new TestCase<>(
                "Two Items Fractional Second Item",
                new Input(new int[]{50, 40}, new int[]{5, 10}, 8),
                62.0
            ),
            new TestCase<>(
                "Four Items Multi Pick Exact Decimals",
                new Input(new int[]{100, 280, 120, 120}, new int[]{20, 40, 24, 30}, 70),
                430.0
            )
        );

        TestRunner<Input, Double> runner = new TestRunner<>();

        runner.runTests(
            "Fractional Knapsack (Debug)",
            testCases,
            input -> FractionalKnapsackDebug.solve(input.val.clone(), input.wt.clone(), input.capacity),
            false
        );
    }
}
