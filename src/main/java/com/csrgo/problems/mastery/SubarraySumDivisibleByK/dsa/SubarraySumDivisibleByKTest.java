// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarraySumDivisibleByK.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SubarraySumDivisibleByKTest {

    static class Input {
        int[] nums;
        int k;

        Input(int[] nums, int k) {
            this.nums = nums;
            this.k = k;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", k=" + k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Mixed Positive And Negative Remainder Five",
                new Input(new int[]{4, 5, 0, -2, -3, 1}, 5),
                7
            ),
            new TestCase<>(
                "Single Element Not Divisible",
                new Input(new int[]{5}, 9),
                0
            ),
            new TestCase<>(
                "Negative Starting Prefix Divisible By Two",
                new Input(new int[]{-1, 2, 9}, 2),
                2
            ),
            new TestCase<>(
                "Alternating Values Divisible By Six",
                new Input(new int[]{2, -2, 2, -4}, 6),
                2
            ),
            new TestCase<>(
                "All Zeros Modulo Three",
                new Input(new int[]{0, 0, 0}, 3),
                6
            ),
            new TestCase<>(
                "All Multiples Of Modulo Seven",
                new Input(new int[]{7, 7, 7, 7}, 7),
                10
            ),
            new TestCase<>(
                "Small Consecutive Sequence Divisible By Three",
                new Input(new int[]{1, 2, 3}, 3),
                3
            ),
            new TestCase<>(
                "Empty Array",
                new Input(new int[]{}, 5),
                0
            ),
            new TestCase<>(
                "Single Negative Multiple",
                new Input(new int[]{-5}, 5),
                1
            ),
            new TestCase<>(
                "Even And Odd Parity Alternating",
                new Input(new int[]{1, -1, 1, -1}, 2),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Subarray Sum Divisible by K",
            testCases,
            input -> SubarraySumDivisibleByK.solve(input.nums.clone(), input.k),
            true
        );
    }
}
