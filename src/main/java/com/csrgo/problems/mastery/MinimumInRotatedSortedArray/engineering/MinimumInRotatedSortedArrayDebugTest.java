// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumInRotatedSortedArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumInRotatedSortedArrayDebugTest {

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
                "Standard Three Times Rotated",
                new Input(new int[]{3, 4, 5, 1, 2}),
                1
            ),
            new TestCase<>(
                "Standard Four Times Rotated",
                new Input(new int[]{4, 5, 6, 7, 0, 1, 2}),
                0
            ),
            new TestCase<>(
                "Rotated At End Full Rotation",
                new Input(new int[]{11, 13, 15, 17}),
                11
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{42}),
                42
            ),
            new TestCase<>(
                "Two Elements Rotated",
                new Input(new int[]{2, 1}),
                1
            ),
            new TestCase<>(
                "Two Elements Already Sorted",
                new Input(new int[]{1, 2}),
                1
            ),
            new TestCase<>(
                "Array With Negative Numbers Rotated",
                new Input(new int[]{3, 4, 5, -10, -5, 0, 1}),
                -10
            ),
            new TestCase<>(
                "Minimum At Last Position",
                new Input(new int[]{2, 3, 4, 5, 1}),
                1
            ),
            new TestCase<>(
                "Large Rotated Range",
                new Input(new int[]{100, 200, 300, 400, 5, 10, 20, 50}),
                5
            ),
            new TestCase<>(
                "Three Elements Minimum In Middle",
                new Input(new int[]{3, 1, 2}),
                1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum in Rotated Sorted Array (DEBUG)",
            testCases,
            input -> MinimumInRotatedSortedArrayDebug.solve(input.nums),
            false
        );
    }
}
