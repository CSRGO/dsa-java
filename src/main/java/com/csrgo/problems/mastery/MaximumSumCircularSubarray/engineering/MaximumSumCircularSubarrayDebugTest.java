// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumSumCircularSubarray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaximumSumCircularSubarrayDebugTest {

    static class Input {
        final int[] nums;

        Input(int[] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Non Wrapping Optimal Subarray",
                new Input(new int[]{1, -2, 3, -2}),
                3
            ),
            new TestCase<>(
                "Standard Wrapping Optimal Subarray",
                new Input(new int[]{5, -3, 5}),
                10
            ),
            new TestCase<>(
                "Entire Array Negative",
                new Input(new int[]{-3, -2, -3}),
                -2
            ),
            new TestCase<>(
                "Single Element Array Positive",
                new Input(new int[]{7}),
                7
            ),
            new TestCase<>(
                "Single Element Array Negative",
                new Input(new int[]{-5}),
                -5
            ),
            new TestCase<>(
                "All Elements Positive Circular Sum Equals Total Sum",
                new Input(new int[]{3, 1, 3, 2, 6}),
                15
            ),
            new TestCase<>(
                "Alternating Positive Negative With Wrap",
                new Input(new int[]{3, -1, 2, -1}),
                4
            ),
            new TestCase<>(
                "Negative Core With Large Positive Boundaries",
                new Input(new int[]{10, -20, 10}),
                20
            ),
            new TestCase<>(
                "Large Array Mixed Values",
                new Input(new int[]{2, -1, 5, -2, 4, -3, 1}),
                9
            ),
            new TestCase<>(
                "Two Element Inverted Order",
                new Input(new int[]{-2, 4}),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Maximum Sum Circular Subarray (DEBUG)",
            testCases,
            input -> MaximumSumCircularSubarrayDebug.solve(input.nums),
            false
        );
    }
}
