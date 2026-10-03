// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SearchInRotatedSortedArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SearchInRotatedSortedArrayDebugTest {

    static class Input {
        final int[] nums;
        final int target;

        Input(int[] nums, int target) {
            this.nums = nums;
            this.target = target;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", target=" + target;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Rotated Array Target In Right Half",
                new Input(new int[]{4, 5, 6, 7, 0, 1, 2}, 0),
                4
            ),
            new TestCase<>(
                "Target Not Present In Rotated Array",
                new Input(new int[]{4, 5, 6, 7, 0, 1, 2}, 3),
                -1
            ),
            new TestCase<>(
                "Single Element Array Target Present",
                new Input(new int[]{1}, 1),
                0
            ),
            new TestCase<>(
                "Single Element Array Target Absent",
                new Input(new int[]{1}, 0),
                -1
            ),
            new TestCase<>(
                "Two Elements Rotated Search First",
                new Input(new int[]{3, 1}, 3),
                0
            ),
            new TestCase<>(
                "Two Elements Rotated Search Second",
                new Input(new int[]{3, 1}, 1),
                1
            ),
            new TestCase<>(
                "Target At First Pivot Index",
                new Input(new int[]{6, 7, 1, 2, 3, 4, 5}, 6),
                0
            ),
            new TestCase<>(
                "Target At Last Index",
                new Input(new int[]{5, 1, 2, 3, 4}, 4),
                4
            ),
            new TestCase<>(
                "Array With Negative Numbers",
                new Input(new int[]{8, 9, -5, -3, -1, 2, 4}, -3),
                3
            ),
            new TestCase<>(
                "Already Fully Sorted Array Unrotated",
                new Input(new int[]{10, 20, 30, 40, 50, 60}, 40),
                3
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Search in Rotated Sorted Array (DEBUG)",
            testCases,
            input -> SearchInRotatedSortedArrayDebug.solve(input.nums, input.target),
            false
        );
    }
}
