// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumProductSubarray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaximumProductSubarrayDebugTest {

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
                "Standard Mixed Positive And Negative",
                new Input(new int[]{2, 3, -2, 4}),
                6
            ),
            new TestCase<>(
                "Array With Zero Boundary",
                new Input(new int[]{-2, 0, -1}),
                0
            ),
            new TestCase<>(
                "Two Negatives Cancelling Out",
                new Input(new int[]{-2, 3, -4}),
                24
            ),
            new TestCase<>(
                "Single Positive Element",
                new Input(new int[]{5}),
                5
            ),
            new TestCase<>(
                "Single Negative Element",
                new Input(new int[]{-3}),
                -3
            ),
            new TestCase<>(
                "All Negative Elements Even Count",
                new Input(new int[]{-2, -3, -4, -5}),
                120
            ),
            new TestCase<>(
                "All Negative Elements Odd Count",
                new Input(new int[]{-1, -2, -3}),
                6
            ),
            new TestCase<>(
                "Array With Multiple Zero Dividers",
                new Input(new int[]{0, 2, 0, 3, 0}),
                3
            ),
            new TestCase<>(
                "Consecutive Large Numbers",
                new Input(new int[]{2, 4, 3, 2}),
                48
            ),
            new TestCase<>(
                "Alternating Signs Sequence",
                new Input(new int[]{-1, 2, -3, 4, -5}),
                120
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Maximum Product Subarray (DEBUG)",
            testCases,
            input -> MaximumProductSubarrayDebug.solve(input.nums),
            false
        );
    }
}
