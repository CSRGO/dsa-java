// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestSubarrayWithAtLeastKFrequency.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LongestSubarrayWithAtLeastKFrequencyTest {

    static class Input {
        int[] nums;
        int k;

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
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Entire Array Satisfies Min Frequency Two",
                new Input(new int[]{1, 2, 3, 1, 2, 3}, 2),
                6
            ),
            new TestCase<>(
                "Element Separating Subarrays Below K",
                new Input(new int[]{1, 2, 3, 1, 2, 1}, 2),
                0
            ),
            new TestCase<>(
                "Four Identical Elements",
                new Input(new int[]{5, 5, 5, 5}, 2),
                4
            ),
            new TestCase<>(
                "Single Element K Equals One",
                new Input(new int[]{1}, 1),
                1
            ),
            new TestCase<>(
                "Two Elements Below Frequency K Two",
                new Input(new int[]{1, 2}, 2),
                0
            ),
            new TestCase<>(
                "Two Distinct Values Both Meeting Frequency Two",
                new Input(new int[]{1, 1, 2, 2, 2}, 2),
                5
            ),
            new TestCase<>(
                "Three Distinct Groups Meeting K Three",
                new Input(new int[]{1, 1, 1, 2, 2, 3, 3, 3}, 3),
                3
            ),
            new TestCase<>(
                "Empty Array Base Case",
                new Input(new int[]{}, 2),
                0
            ),
            new TestCase<>(
                "Frequency Four Not Met Anywhere",
                new Input(new int[]{4, 4, 1, 4, 4}, 4),
                0
            ),
            new TestCase<>(
                "Longest Valid Subarray Left Of Divider",
                new Input(new int[]{1, 2, 2, 1, 4, 3, 3, 3}, 2),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Subarray with At Least K Frequency",
            testCases,
            input -> LongestSubarrayWithAtLeastKFrequency.solve(input.nums.clone(), input.k),
            true
        );
    }
}
