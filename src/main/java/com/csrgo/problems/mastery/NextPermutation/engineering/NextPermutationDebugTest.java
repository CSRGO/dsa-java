// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextPermutation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class NextPermutationDebugTest {

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

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Ascending Three Elements",
                new Input(new int[]{1, 2, 3}),
                new int[]{1, 3, 2}
            ),
            new TestCase<>(
                "Fully Reversed Three Elements Wrap Around",
                new Input(new int[]{3, 2, 1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Array With Duplicate Elements",
                new Input(new int[]{1, 1, 5}),
                new int[]{1, 5, 1}
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{1}),
                new int[]{1}
            ),
            new TestCase<>(
                "Pivot At First Element",
                new Input(new int[]{1, 3, 2}),
                new int[]{2, 1, 3}
            ),
            new TestCase<>(
                "Two Element Swap",
                new Input(new int[]{2, 3, 1}),
                new int[]{3, 1, 2}
            ),
            new TestCase<>(
                "Six Element Complex Sequence",
                new Input(new int[]{5, 4, 7, 5, 3, 2}),
                new int[]{5, 5, 2, 3, 4, 7}
            ),
            new TestCase<>(
                "Duplicates Surrounding Peak",
                new Input(new int[]{1, 5, 1}),
                new int[]{5, 1, 1}
            ),
            new TestCase<>(
                "All Identical Elements",
                new Input(new int[]{2, 2, 2}),
                new int[]{2, 2, 2}
            ),
            new TestCase<>(
                "Four Element Suffix Decreasing",
                new Input(new int[]{1, 4, 3, 2}),
                new int[]{2, 1, 3, 4}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Next Permutation (DEBUG)",
            testCases,
            input -> NextPermutationDebug.solve(input.nums.clone()),
            false
        );
    }
}
