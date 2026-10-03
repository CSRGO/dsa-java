// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarrayProductLessThanK.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SubarrayProductLessThanKDebugTest {

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
                "Standard Four Elements K Hundred",
                new Input(new int[]{10, 5, 2, 6}, 100),
                8
            ),
            new TestCase<>(
                "K Equals Zero Impossible Product",
                new Input(new int[]{1, 2, 3}, 0),
                0
            ),
            new TestCase<>(
                "All Ones K Equals One Strictly Less",
                new Input(new int[]{1, 1, 1}, 1),
                0
            ),
            new TestCase<>(
                "All Ones K Equals Two All Subarrays Valid",
                new Input(new int[]{1, 1, 1}, 2),
                6
            ),
            new TestCase<>(
                "Sequential Numbers One To Five",
                new Input(new int[]{1, 2, 3, 4, 5}, 15),
                9
            ),
            new TestCase<>(
                "Single Element Product Equals K",
                new Input(new int[]{5}, 5),
                0
            ),
            new TestCase<>(
                "Single Element Product Strictly Less Than K",
                new Input(new int[]{5}, 6),
                1
            ),
            new TestCase<>(
                "Large Elements Exceeding K",
                new Input(new int[]{100, 200, 300}, 50),
                0
            ),
            new TestCase<>(
                "Three Elements All Subarrays Under Limit",
                new Input(new int[]{2, 3, 4}, 25),
                6
            ),
            new TestCase<>(
                "Ten Elements Varying Values",
                new Input(new int[]{10, 9, 10, 4, 3, 8, 3, 3, 6, 2}, 19),
                14
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Subarray Product Less Than K (Debug)",
            testCases,
            input -> SubarrayProductLessThanKDebug.solve(input.nums.clone(), input.k),
            false
        );
    }
}
