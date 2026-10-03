// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.HouseRobber.engineering;

import java.util.*;
import com.csrgo.util.*;

public class HouseRobberDebugTest {

    static class Input {
        final int[] nums;

        Input(int[] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return Arrays.toString(nums);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Four Houses",
                new Input(new int[]{1, 2, 3, 1}),
                4
            ),
            new TestCase<>(
                "Five Houses With Alternating Peaks",
                new Input(new int[]{2, 7, 9, 3, 1}),
                12
            ),
            new TestCase<>(
                "Single House",
                new Input(new int[]{5}),
                5
            ),
            new TestCase<>(
                "Two Houses Ascending",
                new Input(new int[]{2, 3}),
                3
            ),
            new TestCase<>(
                "Two Houses Descending",
                new Input(new int[]{10, 5}),
                10
            ),
            new TestCase<>(
                "All Houses Equal Amount",
                new Input(new int[]{4, 4, 4, 4, 4}),
                12
            ),
            new TestCase<>(
                "Strictly Increasing Values",
                new Input(new int[]{1, 3, 5, 7, 9}),
                15
            ),
            new TestCase<>(
                "Strictly Decreasing Values",
                new Input(new int[]{10, 8, 6, 4, 2}),
                18
            ),
            new TestCase<>(
                "Alternating Zeros And Large Values",
                new Input(new int[]{0, 5, 0, 8, 0, 10}),
                23
            ),
            new TestCase<>(
                "Two Gap Jump Optimization",
                new Input(new int[]{2, 1, 1, 2}),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "House Robber Debug",
            testCases,
            input -> HouseRobberDebug.solve(input.nums.clone()),
            false
        );
    }
}
