// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.XorOfAllSubarrays.dsa;

import java.util.*;
import com.csrgo.util.*;

public class XorOfAllSubarraysTest {

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
                "Three Elements One Two Three",
                new Input(new int[]{1, 2, 3}),
                2
            ),
            new TestCase<>(
                "Five Elements Mixed",
                new Input(new int[]{3, 5, 2, 4, 6}),
                7
            ),
            new TestCase<>(
                "Two Elements Even Length",
                new Input(new int[]{1, 2}),
                0
            ),
            new TestCase<>(
                "Single Element Four",
                new Input(new int[]{4}),
                4
            ),
            new TestCase<>(
                "Four Elements Even Length",
                new Input(new int[]{1, 2, 3, 4}),
                0
            ),
            new TestCase<>(
                "Three Elements Seven Eight Nine",
                new Input(new int[]{7, 8, 9}),
                14
            ),
            new TestCase<>(
                "Single Element Zero",
                new Input(new int[]{0}),
                0
            ),
            new TestCase<>(
                "Five Elements Multiples Of Ten",
                new Input(new int[]{10, 20, 30, 40, 50}),
                38
            ),
            new TestCase<>(
                "Four Identical Elements Even Length",
                new Input(new int[]{5, 5, 5, 5}),
                0
            ),
            new TestCase<>(
                "Three Large Multiples Of Hundred",
                new Input(new int[]{100, 200, 300}),
                328
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "XOR of All Subarrays",
            testCases,
            input -> XorOfAllSubarrays.solve(input.nums.clone()),
            true
        );
    }
}
