// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumDifferenceBetweenElements.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaximumDifferenceBetweenElementsDebugTest {

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
                "Standard Four Elements Difference Four",
                new Input(new int[]{7, 1, 5, 4}),
                4
            ),
            new TestCase<>(
                "Strictly Decreasing No Valid Pair",
                new Input(new int[]{9, 4, 3, 2}),
                -1
            ),
            new TestCase<>(
                "Multiple Increases Maximum Difference Nine",
                new Input(new int[]{1, 5, 2, 10}),
                9
            ),
            new TestCase<>(
                "All Elements Identical No Valid Pair",
                new Input(new int[]{2, 2, 2}),
                -1
            ),
            new TestCase<>(
                "Two Elements Ascending Difference One",
                new Input(new int[]{1, 2}),
                1
            ),
            new TestCase<>(
                "Two Elements Descending",
                new Input(new int[]{2, 1}),
                -1
            ),
            new TestCase<>(
                "Low Value Followed By Peak",
                new Input(new int[]{8, 1, 2, 4, 10, 3}),
                9
            ),
            new TestCase<>(
                "Monotonically Decreasing Larger Array",
                new Input(new int[]{100, 20, 10, 5, 1}),
                -1
            ),
            new TestCase<>(
                "Large Magnitude Difference",
                new Input(new int[]{1, 1000000000}),
                999999999
            ),
            new TestCase<>(
                "Middle Peak Sequence",
                new Input(new int[]{3, 8, 2, 6}),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Maximum Difference Between Elements (DEBUG)",
            testCases,
            input -> MaximumDifferenceBetweenElementsDebug.solve(input.nums),
            false
        );
    }
}
