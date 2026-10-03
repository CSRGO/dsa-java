// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FindPeakElement.dsa;

import java.util.*;
import com.csrgo.util.*;

public class FindPeakElementTest {

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
                "Single Peak In Center",
                new Input(new int[]{1, 2, 3, 1}),
                2
            ),
            new TestCase<>(
                "Three Elements Peak In Middle",
                new Input(new int[]{1, 2, 1}),
                1
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{1}),
                0
            ),
            new TestCase<>(
                "Two Elements Ascending",
                new Input(new int[]{1, 2}),
                1
            ),
            new TestCase<>(
                "Two Elements Descending",
                new Input(new int[]{2, 1}),
                0
            ),
            new TestCase<>(
                "Pyramid Shaped Peak",
                new Input(new int[]{1, 3, 5, 4, 2}),
                2
            ),
            new TestCase<>(
                "Strictly Decreasing Array Peak At Start",
                new Input(new int[]{5, 4, 3, 2, 1}),
                0
            ),
            new TestCase<>(
                "Strictly Increasing Array Peak At End",
                new Input(new int[]{1, 2, 3, 4, 5}),
                4
            ),
            new TestCase<>(
                "Multi Peak Array",
                new Input(new int[]{10, 20, 15, 2, 23, 90, 67}),
                5
            ),
            new TestCase<>(
                "Peak Near Left Boundary",
                new Input(new int[]{1, 6, 5, 4, 3, 2}),
                1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Find Peak Element",
            testCases,
            input -> FindPeakElement.solve(input.nums),
            true
        );
    }
}
