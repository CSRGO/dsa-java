// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FindPivotIndex.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FindPivotIndexDebugTest {

    static class Input {
        int[] nums;

        Input(int[] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Array Pivot At Three",
                new Input(new int[]{1, 7, 3, 6, 5, 6}),
                3
            ),
            new TestCase<>(
                "Strictly Increasing No Pivot",
                new Input(new int[]{1, 2, 3}),
                -1
            ),
            new TestCase<>(
                "Leftmost Pivot At Index Zero",
                new Input(new int[]{2, 1, -1}),
                0
            ),
            new TestCase<>(
                "All Negative Elements With Pivot",
                new Input(new int[]{-1, -1, -1, -1, -1, 0}),
                2
            ),
            new TestCase<>(
                "All Zeros First Pivot At Zero",
                new Input(new int[]{0, 0, 0, 0}),
                0
            ),
            new TestCase<>(
                "Single Element Array Always Zero",
                new Input(new int[]{10}),
                0
            ),
            new TestCase<>(
                "Empty Array No Pivot Exists",
                new Input(new int[]{}),
                -1
            ),
            new TestCase<>(
                "Pivot At Last Element",
                new Input(new int[]{-1, -1, 0, 1, 1, 0}),
                5
            ),
            new TestCase<>(
                "Canceling Prefix Pivot At End",
                new Input(new int[]{1, -1, 2}),
                2
            ),
            new TestCase<>(
                "Duplicate Values Pivot At Middle",
                new Input(new int[]{2, 3, 5, 5}),
                2
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Find Pivot Index (Debug)",
            testCases,
            input -> FindPivotIndexDebug.solve(input.nums.clone()),
            false
        );
    }
}
