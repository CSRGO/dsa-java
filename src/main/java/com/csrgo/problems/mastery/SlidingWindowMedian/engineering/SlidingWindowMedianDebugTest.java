// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SlidingWindowMedian.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SlidingWindowMedianDebugTest {

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

        List<TestCase<Input, double[]>> testCases = List.of(
            new TestCase<>(
                "Standard Classic Window Size Three",
                new Input(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3),
                new double[]{1.0, -1.0, -1.0, 3.0, 5.0, 6.0}
            ),
            new TestCase<>(
                "Nine Elements With Duplicates",
                new Input(new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2}, 3),
                new double[]{2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0}
            ),
            new TestCase<>(
                "Single Element Window One",
                new Input(new int[]{1}, 1),
                new double[]{1.0}
            ),
            new TestCase<>(
                "Window Equal Array Size Even",
                new Input(new int[]{1, 4, 2, 3}, 4),
                new double[]{2.5}
            ),
            new TestCase<>(
                "All Identical Elements Even Window",
                new Input(new int[]{2, 2, 2, 2}, 2),
                new double[]{2.0, 2.0, 2.0}
            ),
            new TestCase<>(
                "Two Elements Window One",
                new Input(new int[]{1, 2}, 1),
                new double[]{1.0, 2.0}
            ),
            new TestCase<>(
                "Five Elements Window Two",
                new Input(new int[]{5, 2, 7, 1, 8}, 2),
                new double[]{3.5, 4.5, 4.0, 4.5}
            ),
            new TestCase<>(
                "Three Ascending Elements Full Window",
                new Input(new int[]{10, 20, 30}, 3),
                new double[]{20.0}
            ),
            new TestCase<>(
                "Descending Sequence Window Three",
                new Input(new int[]{9, 8, 7, 6, 5}, 3),
                new double[]{8.0, 7.0, 6.0}
            ),
            new TestCase<>(
                "Odd Increments Window Two",
                new Input(new int[]{1, 3, 5, 7}, 2),
                new double[]{2.0, 4.0, 6.0}
            )
        );

        TestRunner<Input, double[]> runner = new TestRunner<>();

        runner.runTests(
            "Sliding Window Median Debug",
            testCases,
            input -> SlidingWindowMedianDebug.solve(input.nums.clone(), input.k),
            false
        );
    }
}
