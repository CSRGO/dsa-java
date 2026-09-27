// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.UnboundedKnapsack.dsa;

import java.util.*;
import com.csrgo.util.*;

public class UnboundedKnapsackTest {

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
            new TestCase<>("Classic Four Item Knapsack", new Input(new int[]{10, 40, 50, 70}, new int[]{1, 3, 4, 5}, 8), 110),
            new TestCase<>("Unit Weight Dominant Repetitions", new Input(new int[]{6, 10, 12}, new int[]{1, 2, 3}, 5), 30),
            new TestCase<>("Zero Capacity Boundary", new Input(new int[]{10, 20}, new int[]{5, 10}, 0), 0),
            new TestCase<>("Single Item Exceeds Capacity", new Input(new int[]{100}, new int[]{10}, 5), 0),
            new TestCase<>("Single Item Full Capacity Multiples", new Input(new int[]{10}, new int[]{2}, 6), 30),
            new TestCase<>("Four Items Diverse Densities", new Input(new int[]{1, 4, 5, 7}, new int[]{1, 3, 4, 5}, 8), 11),
            new TestCase<>("Four Items Heavy Value Scaling", new Input(new int[]{15, 50, 60, 90}, new int[]{1, 3, 4, 5}, 8), 140),
            new TestCase<>("Two Items Mixed Multiples", new Input(new int[]{20, 30}, new int[]{2, 3}, 7), 70),
            new TestCase<>("Multiple Equal Density Candidates", new Input(new int[]{10, 30, 20}, new int[]{5, 10, 15}, 10), 30),
            new TestCase<>("Single Unit Weight Scaling", new Input(new int[]{100}, new int[]{1}, 5), 500)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Unbounded Knapsack",
            testCases,
            input -> UnboundedKnapsack.solve(input.values, input.weights, input.capacity),
            true
        );
    }
}
