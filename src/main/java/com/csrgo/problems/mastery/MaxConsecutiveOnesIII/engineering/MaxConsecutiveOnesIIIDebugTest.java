// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaxConsecutiveOnesIII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaxConsecutiveOnesIIIDebugTest {

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
                "Standard Medium Array Two Flips",
                new Input(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2),
                6
            ),
            new TestCase<>(
                "Long Array Three Flips",
                new Input(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3),
                10
            ),
            new TestCase<>(
                "All Zeros Zero Flips",
                new Input(new int[]{0, 0, 0, 0}, 0),
                0
            ),
            new TestCase<>(
                "All Ones Zero Flips",
                new Input(new int[]{1, 1, 1, 1}, 0),
                4
            ),
            new TestCase<>(
                "All Zeros Partial Flips",
                new Input(new int[]{0, 0, 0, 0}, 2),
                2
            ),
            new TestCase<>(
                "Single One Single Flip",
                new Input(new int[]{1}, 1),
                1
            ),
            new TestCase<>(
                "Single Zero Single Flip",
                new Input(new int[]{0}, 1),
                1
            ),
            new TestCase<>(
                "Alternating Elements One Flip",
                new Input(new int[]{1, 0, 1, 0, 1, 0, 1}, 1),
                3
            ),
            new TestCase<>(
                "Empty Array",
                new Input(new int[]{}, 5),
                0
            ),
            new TestCase<>(
                "Multiple Zeros Two Flips Optimal Window",
                new Input(new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 2),
                8
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Max Consecutive Ones III (Debug)",
            testCases,
            input -> MaxConsecutiveOnesIIIDebug.solve(input.nums.clone(), input.k),
            false
        );
    }
}
