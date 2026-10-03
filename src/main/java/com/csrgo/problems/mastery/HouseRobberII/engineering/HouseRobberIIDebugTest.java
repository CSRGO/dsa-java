// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.HouseRobberII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class HouseRobberIIDebugTest {

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
                "Standard Circular Three Houses",
                new Input(new int[]{2, 3, 2}),
                3
            ),
            new TestCase<>(
                "Circular Four Houses With Middle Optimal",
                new Input(new int[]{1, 2, 3, 1}),
                4
            ),
            new TestCase<>(
                "Circular Three Houses Ascending",
                new Input(new int[]{1, 2, 3}),
                3
            ),
            new TestCase<>(
                "Single House",
                new Input(new int[]{7}),
                7
            ),
            new TestCase<>(
                "Two Houses Ascending",
                new Input(new int[]{1, 2}),
                2
            ),
            new TestCase<>(
                "High First and Last Values",
                new Input(new int[]{10, 1, 1, 10}),
                11
            ),
            new TestCase<>(
                "Five Identical Houses in Circle",
                new Input(new int[]{5, 5, 5, 5, 5}),
                10
            ),
            new TestCase<>(
                "Dominant Single Middle House",
                new Input(new int[]{1, 100, 1}),
                100
            ),
            new TestCase<>(
                "Five Houses With Outlier At End",
                new Input(new int[]{1, 3, 1, 3, 100}),
                103
            ),
            new TestCase<>(
                "Six Houses Two Equal Symmetrical Peaks",
                new Input(new int[]{20, 1, 1, 20, 1, 1}),
                40
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "House Robber II Debug",
            testCases,
            input -> HouseRobberIIDebug.solve(input.nums.clone()),
            false
        );
    }
}
