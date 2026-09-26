// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.KthLargestElement.engineering;

import java.util.*;
import com.csrgo.util.*;

public class KthLargestElementDebugTest {

    static class Input {
        final int[] nums;
        final int k;

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
            new TestCase<>("Classic Six Elements", new Input(new int[]{3, 2, 1, 5, 6, 4}, 2), 5),
            new TestCase<>("Duplicates Sequence", new Input(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), 4),
            new TestCase<>("K Equals One", new Input(new int[]{10, 5, 20, 8}, 1), 20),
            new TestCase<>("K Equals Length", new Input(new int[]{7, 10, 4, 3, 20, 15}, 6), 3),
            new TestCase<>("Single Element", new Input(new int[]{42}, 1), 42),
            new TestCase<>("All Identical Elements", new Input(new int[]{7, 7, 7, 7}, 2), 7),
            new TestCase<>("Negative Numbers", new Input(new int[]{-5, -2, -9, -1, -4}, 2), -2),
            new TestCase<>("Two Elements First Largest", new Input(new int[]{1, 2}, 1), 2),
            new TestCase<>("Two Elements Second Largest", new Input(new int[]{1, 2}, 2), 1),
            new TestCase<>("Mixed Positives And Negatives", new Input(new int[]{-10, 50, 0, -20, 30}, 3), 0)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Kth Largest Element [DEBUG]",
            testCases,
            input -> KthLargestElementDebug.solve(input.nums, input.k), 
            false 
        );
    }
}
