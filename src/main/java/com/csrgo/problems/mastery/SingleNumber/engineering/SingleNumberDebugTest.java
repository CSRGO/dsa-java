// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SingleNumber.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SingleNumberDebugTest {

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
                "Three Elements Single At End",
                new Input(new int[]{2, 2, 1}),
                1
            ),
            new TestCase<>(
                "Five Elements Single At Front",
                new Input(new int[]{4, 1, 2, 1, 2}),
                4
            ),
            new TestCase<>(
                "Single Element Only",
                new Input(new int[]{1}),
                1
            ),
            new TestCase<>(
                "Negative Numbers With Negative Single",
                new Input(new int[]{-1, -1, -2}),
                -2
            ),
            new TestCase<>(
                "Zeros And Positive Single",
                new Input(new int[]{0, 1, 0}),
                1
            ),
            new TestCase<>(
                "Multiple Alternating Pairs Single In First Position",
                new Input(new int[]{7, 3, 5, 4, 5, 3, 4}),
                7
            ),
            new TestCase<>(
                "Mixed Negative And Positive Elements",
                new Input(new int[]{-10, 20, -10, 30, 20}),
                30
            ),
            new TestCase<>(
                "Interleaved Pairs Single At Middle",
                new Input(new int[]{99, 99, 88, 77, 88}),
                77
            ),
            new TestCase<>(
                "Large Positive And Negative Numbers",
                new Input(new int[]{1000000, -1000000, 1000000}),
                -1000000
            ),
            new TestCase<>(
                "Ten Elements Single Number At Start",
                new Input(new int[]{5, 1, 2, 3, 4, 1, 2, 3, 4}),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Single Number (Debug)",
            testCases,
            input -> SingleNumberDebug.solve(input.nums.clone()),
            false
        );
    }
}
