// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SingleNumberII.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SingleNumberIITest {

    static class Input {
        int[] nums;

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
                "Four Elements Single At Index Two",
                new Input(new int[]{2, 2, 3, 2}),
                3
            ),
            new TestCase<>(
                "Seven Elements Single Large Number At End",
                new Input(new int[]{0, 1, 0, 1, 0, 1, 99}),
                99
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{1}),
                1
            ),
            new TestCase<>(
                "Negative Triplet With Positive Single",
                new Input(new int[]{-2, -2, 1, -2}),
                1
            ),
            new TestCase<>(
                "Negative Numbers With Negative Single",
                new Input(new int[]{-4, -4, -4, -10}),
                -10
            ),
            new TestCase<>(
                "Multiple Multiples Of Tens",
                new Input(new int[]{30000, 500, 100, 30000, 100, 30000, 100}),
                500
            ),
            new TestCase<>(
                "Three Zeros And Single Positive Five",
                new Input(new int[]{0, 0, 0, 5}),
                5
            ),
            new TestCase<>(
                "Sevens And Single Three",
                new Input(new int[]{7, 7, 7, 3}),
                3
            ),
            new TestCase<>(
                "Three Minus Ones And Positive Two",
                new Input(new int[]{-1, -1, -1, 2}),
                2
            ),
            new TestCase<>(
                "Seven Elements With Multiples Of Seven",
                new Input(new int[]{14, 14, 14, 28, 28, 28, 42}),
                42
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Single Number II",
            testCases,
            input -> SingleNumberII.solve(input.nums.clone()),
            true
        );
    }
}
