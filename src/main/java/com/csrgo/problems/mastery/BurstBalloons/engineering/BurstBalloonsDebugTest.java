// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.BurstBalloons.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BurstBalloonsDebugTest {

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
                "Classic Four Balloons",
                new Input(new int[]{3, 1, 5, 8}),
                167
            ),
            new TestCase<>(
                "Two Balloons",
                new Input(new int[]{1, 5}),
                10
            ),
            new TestCase<>(
                "Single Balloon",
                new Input(new int[]{7}),
                7
            ),
            new TestCase<>(
                "Four Balloons High Values",
                new Input(new int[]{9, 76, 64, 21}),
                116718
            ),
            new TestCase<>(
                "Four Balloons Increasing Sequence",
                new Input(new int[]{1, 2, 3, 4}),
                40
            ),
            new TestCase<>(
                "Four Balloons Decreasing Sequence",
                new Input(new int[]{4, 3, 2, 1}),
                40
            ),
            new TestCase<>(
                "Five Balloons Varied Order",
                new Input(new int[]{2, 3, 7, 9, 1}),
                279
            ),
            new TestCase<>(
                "Four Balloons Symmetric Outer High",
                new Input(new int[]{8, 2, 6, 8}),
                552
            ),
            new TestCase<>(
                "Three Identical Balloons",
                new Input(new int[]{5, 5, 5}),
                155
            ),
            new TestCase<>(
                "Four Ones",
                new Input(new int[]{1, 1, 1, 1}),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Burst Balloons Debug",
            testCases,
            input -> BurstBalloonsDebug.solve(input.nums.clone()),
            false
        );
    }
}
