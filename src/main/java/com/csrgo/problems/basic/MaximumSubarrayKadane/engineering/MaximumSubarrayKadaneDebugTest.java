// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MaximumSubarrayKadane.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaximumSubarrayKadaneDebugTest {

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
            new TestCase<>("Standard Kadane Mixed", new Input(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6),
            new TestCase<>("Single Element Positive", new Input(new int[]{1}), 1),
            new TestCase<>("Single Element Negative", new Input(new int[]{-5}), -5),
            new TestCase<>("All Negative Elements", new Input(new int[]{-3, -2, -5, -1, -4}), -1),
            new TestCase<>("All Positive Elements", new Input(new int[]{5, 4, -1, 7, 8}), 23),
            new TestCase<>("Two Alternating Elements", new Input(new int[]{-2, 3}), 3),
            new TestCase<>("Zeros And Positives", new Input(new int[]{0, 0, 3, -1, 4}), 6),
            new TestCase<>("Subarray At Prefix", new Input(new int[]{10, 20, -50, 5, 5}), 30),
            new TestCase<>("Subarray At Suffix", new Input(new int[]{-10, -5, 20, 30}), 50),
            new TestCase<>("Alternating Flips", new Input(new int[]{1, -1, 1, -1, 1}), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Maximum Subarray (Kadane) [DEBUG]",
            testCases,
            input -> MaximumSubarrayKadaneDebug.solve(input.nums), 
            false 
        );
    }
}
