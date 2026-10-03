// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumSizeSubarraySum.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumSizeSubarraySumDebugTest {

    static class Input {
        int target;
        int[] nums;

        Input(int target, int[] nums) {
            this.target = target;
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "target=" + target + ", nums=" + Arrays.toString(nums);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Multiple Subarrays Length Two",
                new Input(7, new int[]{2, 3, 1, 2, 4, 3}),
                2
            ),
            new TestCase<>(
                "Single Element Match Length One",
                new Input(4, new int[]{1, 4, 4}),
                1
            ),
            new TestCase<>(
                "Unachievable Target Sum",
                new Input(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}),
                0
            ),
            new TestCase<>(
                "Entire Array Required",
                new Input(15, new int[]{1, 2, 3, 4, 5}),
                5
            ),
            new TestCase<>(
                "Consecutive Elements Match Minimum Two",
                new Input(5, new int[]{2, 3, 1, 1, 1, 1, 1}),
                2
            ),
            new TestCase<>(
                "Large First Element Over Target",
                new Input(6, new int[]{10, 2, 3}),
                1
            ),
            new TestCase<>(
                "Empty Array",
                new Input(100, new int[]{}),
                0
            ),
            new TestCase<>(
                "Pair Exceeds Target",
                new Input(20, new int[]{2, 16, 14, 15}),
                2
            ),
            new TestCase<>(
                "Single Matching Element",
                new Input(5, new int[]{5}),
                1
            ),
            new TestCase<>(
                "Prefix Matching Entire Array",
                new Input(10, new int[]{1, 2, 3, 4}),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Size Subarray Sum (Debug)",
            testCases,
            input -> MinimumSizeSubarraySumDebug.solve(input.target, input.nums.clone()),
            false
        );
    }
}
