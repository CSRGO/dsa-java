// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SmallestRangeCoveringKLists.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SmallestRangeCoveringKListsTest {

    static class Input {
        final int[][] nums;

        Input(int[][] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(nums);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Classic Three Lists Wide Range",
                new Input(new int[][]{{4, 10, 15, 24, 26}, {0, 9, 12, 20}, {5, 18, 22, 30}}),
                new int[]{20, 24}
            ),
            new TestCase<>(
                "Identical Three Lists Range Zero",
                new Input(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}),
                new int[]{1, 1}
            ),
            new TestCase<>(
                "Single Element Per List",
                new Input(new int[][]{{1}, {2}, {3}}),
                new int[]{1, 3}
            ),
            new TestCase<>(
                "Common Point At Ten",
                new Input(new int[][]{{1, 10}, {2, 10}, {3, 10}}),
                new int[]{10, 10}
            ),
            new TestCase<>(
                "Three Lists Staggered",
                new Input(new int[][]{{1, 5, 8}, {4, 12}, {7, 8, 10}}),
                new int[]{4, 7}
            ),
            new TestCase<>(
                "Two Lists Single Elements Adjacent",
                new Input(new int[][]{{10}, {11}}),
                new int[]{10, 11}
            ),
            new TestCase<>(
                "Two Alternating Odd Even Lists",
                new Input(new int[][]{{1, 3, 5}, {2, 4, 6}}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Three Mixed Interleaved Lists",
                new Input(new int[][]{{2, 4, 6}, {1, 5, 7}, {3, 8, 9}}),
                new int[]{1, 3}
            ),
            new TestCase<>(
                "Negative Integers In Range",
                new Input(new int[][]{{-5, -3, -1}, {0, 2}, {1, 3}}),
                new int[]{-1, 1}
            ),
            new TestCase<>(
                "Three Disjoint Pairs",
                new Input(new int[][]{{1, 2}, {3, 4}, {5, 6}}),
                new int[]{2, 5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Smallest Range Covering K Lists",
            testCases,
            input -> SmallestRangeCoveringKLists.solve(deepCopy(input.nums)),
            true
        );
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}
