// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.LongestConsecutiveSequence.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LongestConsecutiveSequenceDebugTest {

    static class Input {
        final int[] nums;

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
            new TestCase<>("Unsorted Classic Six", new Input(new int[]{100, 4, 200, 1, 3, 2}), 4),
            new TestCase<>("Ten Elements With Duplicates", new Input(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), 9),
            new TestCase<>("Empty Array", new Input(new int[]{}), 0),
            new TestCase<>("Single Element", new Input(new int[]{10}), 1),
            new TestCase<>("Two Consecutive Elements", new Input(new int[]{2, 1}), 2),
            new TestCase<>("Two Non Consecutive Elements", new Input(new int[]{10, 20}), 1),
            new TestCase<>("All Identical Elements", new Input(new int[]{5, 5, 5, 5}), 1),
            new TestCase<>("Negative Consecutive Sequence", new Input(new int[]{-3, -1, -2, -4, 10}), 4),
            new TestCase<>("Mixed Negative Zero Positive", new Input(new int[]{-2, -1, 0, 1, 2}), 5),
            new TestCase<>("Disjoint Dispersed Sequences", new Input(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -2, 6}), 7)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Consecutive Sequence [DEBUG]",
            testCases,
            input -> LongestConsecutiveSequenceDebug.solve(input.nums), 
            false 
        );
    }
}
