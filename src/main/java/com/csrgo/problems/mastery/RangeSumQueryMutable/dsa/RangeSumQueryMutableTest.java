// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryMutable.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RangeSumQueryMutableTest {

    static class Input {
        int[] nums;
        int[][] operations;

        Input(int[] nums, int[][] operations) {
            this.nums = nums;
            this.operations = operations;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", operations=" + Arrays.deepToString(operations);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Interleaved Point Update And Range Query",
                new Input(new int[]{1, 3, 5}, new int[][]{{2, 0, 2}, {1, 1, 2}, {2, 0, 2}}),
                new int[]{9, 8}
            ),
            new TestCase<>(
                "Negative Values Dynamic Updates",
                new Input(new int[]{9, -8}, new int[][]{{1, 0, 3}, {2, 0, 1}, {1, 1, -3}, {2, 0, 1}}),
                new int[]{-5, 0}
            ),
            new TestCase<>(
                "Single Element Updates And Sum",
                new Input(new int[]{5}, new int[][]{{2, 0, 0}, {1, 0, 10}, {2, 0, 0}}),
                new int[]{5, 10}
            ),
            new TestCase<>(
                "All Elements Updated Prior To Full Query",
                new Input(new int[]{1, 2, 3, 4}, new int[][]{{1, 0, 5}, {1, 1, 6}, {1, 2, 7}, {1, 3, 8}, {2, 0, 3}}),
                new int[]{26}
            ),
            new TestCase<>(
                "Pure Query Sequence Without Modification",
                new Input(new int[]{1, 2, 3, 4, 5}, new int[][]{{2, 1, 3}, {2, 0, 4}}),
                new int[]{9, 15}
            ),
            new TestCase<>(
                "Initial Zeros Populated By Updates",
                new Input(new int[]{0, 0, 0}, new int[][]{{1, 1, 5}, {2, 0, 2}, {1, 0, 2}, {2, 0, 1}}),
                new int[]{5, 7}
            ),
            new TestCase<>(
                "Mixed Signs Single Point Overwrite",
                new Input(new int[]{-5, 10, -15, 20}, new int[][]{{2, 0, 3}, {1, 2, 5}, {2, 0, 3}}),
                new int[]{10, 30}
            ),
            new TestCase<>(
                "Empty Array And Empty Operations",
                new Input(new int[]{}, new int[][]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Point Queries Individual Elements",
                new Input(new int[]{4, 5, 6}, new int[][]{{2, 0, 0}, {2, 1, 1}, {2, 2, 2}}),
                new int[]{4, 5, 6}
            ),
            new TestCase<>(
                "Two Elements Successive Adjustments",
                new Input(new int[]{100, 200}, new int[][]{{1, 0, 150}, {2, 0, 1}, {1, 1, 250}, {2, 0, 1}}),
                new int[]{350, 400}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Range Sum Query (Mutable)",
            testCases,
            input -> RangeSumQueryMutable.solve(input.nums.clone(), input.operations),
            true
        );
    }
}
