// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ZeroOneKnapsack.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ZeroOneKnapsackDebugTest {

    static class Input {
        final int[] values;
        final int[] weights;
        final int capacity;

        Input(int[] values, int[] weights, int capacity) {
            this.values = values;
            this.weights = weights;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Three Item Knapsack", new Input(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50), 220),
            new TestCase<>("Four Items Capacity Ten", new Input(new int[]{10, 40, 30, 50}, new int[]{5, 4, 6, 3}, 10), 90),
            new TestCase<>("Zero Capacity Boundary", new Input(new int[]{10, 20}, new int[]{5, 10}, 0), 0),
            new TestCase<>("Single Item Exceeds Capacity", new Input(new int[]{100}, new int[]{10}, 5), 0),
            new TestCase<>("Single Item Fits Exactly", new Input(new int[]{100}, new int[]{10}, 10), 100),
            new TestCase<>("Lightweight High Value Priority", new Input(new int[]{1, 2, 3}, new int[]{4, 5, 1}, 4), 3),
            new TestCase<>("Six Item Mixed Selection", new Input(new int[]{20, 5, 10, 40, 15, 25}, new int[]{1, 2, 3, 8, 7, 4}, 10), 60),
            new TestCase<>("Three Items Combination Split", new Input(new int[]{15, 20, 30}, new int[]{2, 3, 4}, 5), 35),
            new TestCase<>("Uniform Unit Weights Subset", new Input(new int[]{10, 20, 30}, new int[]{1, 1, 1}, 2), 50),
            new TestCase<>("All Items Fit Under Capacity", new Input(new int[]{50, 40, 30, 20, 10}, new int[]{5, 4, 3, 2, 1}, 15), 150)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "0/1 Knapsack (DEBUG)",
            testCases,
            input -> ZeroOneKnapsackDebug.solve(input.values, input.weights, input.capacity),
            false
        );
    }
}
