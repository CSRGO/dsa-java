// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.TwoSum.engineering;

import java.util.*;
import com.csrgo.util.*;

public class TwoSumDebugTest {

    static class Input {
        final int[] nums;
        final int target;

        Input(int[] nums, int target) {
            this.nums = nums;
            this.target = target;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", target=" + target;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Two Sum", new Input(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}),
            new TestCase<>("Consecutive Non-Zero", new Input(new int[]{3, 2, 4}, 6), new int[]{1, 2}),
            new TestCase<>("Identical Elements", new Input(new int[]{3, 3}, 6), new int[]{0, 1}),
            new TestCase<>("Negative Numbers", new Input(new int[]{-1, -2, -3, -4, -5}, -8), new int[]{2, 4}),
            new TestCase<>("Zero And Target", new Input(new int[]{0, 4, 3, 0}, 0), new int[]{0, 3}),
            new TestCase<>("Mixed Positives And Negatives", new Input(new int[]{-10, 7, 12, 15, -2}, 5), new int[]{1, 4}),
            new TestCase<>("Far Apart Elements", new Input(new int[]{1, 5, 8, 12, 20, 30, 49}, 50), new int[]{0, 6}),
            new TestCase<>("Two Large Numbers", new Input(new int[]{1000000000, 500, 1000000000}, 2000000000), new int[]{0, 2}),
            new TestCase<>("No Pair Found", new Input(new int[]{1, 2, 3, 4}, 10), new int[]{-1, -1}),
            new TestCase<>("Two Elements Only", new Input(new int[]{5, 25}, 30), new int[]{0, 1})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Two Sum (DEBUG)",
            testCases,
            input -> TwoSumDebug.solve(input.nums, input.target), 
            false 
        );
    }
}
