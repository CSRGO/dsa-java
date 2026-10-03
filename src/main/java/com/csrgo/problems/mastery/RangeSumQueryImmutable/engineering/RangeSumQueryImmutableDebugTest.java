// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryImmutable.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RangeSumQueryImmutableDebugTest {

    static class Input {
        int[] nums;
        int[][] queries;

        Input(int[] nums, int[][] queries) {
            this.nums = nums;
            this.queries = queries;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", queries=" + Arrays.deepToString(queries);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Multiple Queries Negative And Positive",
                new Input(new int[]{-2, 0, 3, -5, 2, -1}, new int[][]{{0, 2}, {2, 5}, {0, 5}}),
                new int[]{1, -1, -3}
            ),
            new TestCase<>(
                "Consecutive Natural Numbers",
                new Input(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}, {2, 2}}),
                new int[]{9, 15, 3}
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{10}, new int[][]{{0, 0}}),
                new int[]{10}
            ),
            new TestCase<>(
                "Alternating Signs Canceling Queries",
                new Input(new int[]{1, -1, 1, -1}, new int[][]{{0, 1}, {1, 2}, {0, 3}}),
                new int[]{0, 0, 0}
            ),
            new TestCase<>(
                "Constant Elements Point Queries",
                new Input(new int[]{5, 5, 5, 5}, new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 3}}),
                new int[]{5, 5, 5, 5}
            ),
            new TestCase<>(
                "All Zeros Full Range",
                new Input(new int[]{0, 0, 0}, new int[][]{{0, 2}}),
                new int[]{0}
            ),
            new TestCase<>(
                "Mixed Magnitudes Multiple Ranges",
                new Input(new int[]{100, -50, 25, -10}, new int[][]{{0, 1}, {1, 3}, {0, 3}}),
                new int[]{50, -35, 65}
            ),
            new TestCase<>(
                "Empty Array And Queries",
                new Input(new int[]{}, new int[][]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Three Positive Numbers Adjacent Pairs",
                new Input(new int[]{7, 8, 9}, new int[][]{{0, 1}, {1, 2}}),
                new int[]{15, 17}
            ),
            new TestCase<>(
                "All Negative Elements",
                new Input(new int[]{-1, -2, -3, -4}, new int[][]{{0, 3}, {1, 2}}),
                new int[]{-10, -5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Range Sum Query (Immutable) (Debug)",
            testCases,
            input -> RangeSumQueryImmutableDebug.solve(input.nums.clone(), input.queries),
            false
        );
    }
}
