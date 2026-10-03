// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarraySumEqualsK.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SubarraySumEqualsKDebugTest {

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

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Three Ones Target Two",
                new Input(new int[]{1, 1, 1}, 2),
                2
            ),
            new TestCase<>(
                "One Two Three Target Three",
                new Input(new int[]{1, 2, 3}, 3),
                2
            ),
            new TestCase<>(
                "Array With Negative Numbers",
                new Input(new int[]{1, -1, 0}, 0),
                3
            ),
            new TestCase<>(
                "Single Element Matching K",
                new Input(new int[]{5}, 5),
                1
            ),
            new TestCase<>(
                "Single Element Not Matching K",
                new Input(new int[]{5}, 3),
                0
            ),
            new TestCase<>(
                "Multiple Zeroes Creating Subarrays",
                new Input(new int[]{0, 0, 0}, 0),
                6
            ),
            new TestCase<>(
                "Larger Array Mixed Sign Subarrays",
                new Input(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7),
                4
            ),
            new TestCase<>(
                "Target Sum Zero Non Zero Array",
                new Input(new int[]{2, -2, 2, -2}, 0),
                4
            ),
            new TestCase<>(
                "Target Never Reachable",
                new Input(new int[]{1, 2, 3}, 10),
                0
            ),
            new TestCase<>(
                "All Negative Elements Negative Target",
                new Input(new int[]{-1, -1, -1}, -2),
                2
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Subarray Sum Equals K (DEBUG)",
            testCases,
            input -> SubarraySumEqualsKDebug.solve(input.nums, input.k),
            false
        );
    }
}
