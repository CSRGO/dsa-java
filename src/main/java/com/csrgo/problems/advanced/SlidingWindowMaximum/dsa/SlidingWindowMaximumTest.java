// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SlidingWindowMaximum.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SlidingWindowMaximumTest {

    static class Input {
        final int[] nums;
        final int k;

        Input(int[] nums, int k) {
            this.nums = nums;
            this.k = k;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Mixed Window", new Input(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), new int[]{3, 3, 5, 5, 6, 7}),
            new TestCase<>("Single Element Window 1", new Input(new int[]{1}, 1), new int[]{1}),
            new TestCase<>("Window Equals Array Size", new Input(new int[]{1, -1}, 2), new int[]{1}),
            new TestCase<>("Strictly Decreasing Numbers", new Input(new int[]{9, 8, 7, 6, 5, 4}, 3), new int[]{9, 8, 7, 6}),
            new TestCase<>("Strictly Increasing Numbers", new Input(new int[]{1, 2, 3, 4, 5, 6}, 3), new int[]{3, 4, 5, 6}),
            new TestCase<>("All Identical Elements", new Input(new int[]{5, 5, 5, 5, 5}, 2), new int[]{5, 5, 5, 5}),
            new TestCase<>("Window Size One", new Input(new int[]{4, 2, 7, 1}, 1), new int[]{4, 2, 7, 1}),
            new TestCase<>("Negative Numbers Window", new Input(new int[]{-7, -8, -7, 5, 7, 1, 6, 0}, 4), new int[]{5, 7, 7, 7, 7}),
            new TestCase<>("Two Elements Window Size 1", new Input(new int[]{10, 20}, 1), new int[]{10, 20}),
            new TestCase<>("Alternating Peaks Window 2", new Input(new int[]{1, 3, 1, 2, 0, 5}, 2), new int[]{3, 3, 2, 2, 5})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Sliding Window Maximum",
            testCases,
            input -> SlidingWindowMaximum.solve(input.nums, input.k),
            true
        );
    }
}
