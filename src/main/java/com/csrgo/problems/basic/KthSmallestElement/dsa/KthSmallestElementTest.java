// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.KthSmallestElement.dsa;

import java.util.*;
import com.csrgo.util.*;

public class KthSmallestElementTest {

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
            new TestCase<>("Classic Six Elements", new Input(new int[]{7, 10, 4, 3, 20, 15}, 3), 7),
            new TestCase<>("Five Elements K Four", new Input(new int[]{7, 10, 4, 20, 15}, 4), 15),
            new TestCase<>("K Equals One", new Input(new int[]{10, 5, 20, 8}, 1), 5),
            new TestCase<>("K Equals Length", new Input(new int[]{7, 10, 4, 3, 20, 15}, 6), 20),
            new TestCase<>("Single Element", new Input(new int[]{99}, 1), 99),
            new TestCase<>("All Identical Elements", new Input(new int[]{4, 4, 4, 4}, 2), 4),
            new TestCase<>("Negative Numbers", new Input(new int[]{-5, -2, -9, -1, -4}, 2), -5),
            new TestCase<>("Two Elements First Smallest", new Input(new int[]{10, 20}, 1), 10),
            new TestCase<>("Two Elements Second Smallest", new Input(new int[]{10, 20}, 2), 20),
            new TestCase<>("Mixed Positives And Negatives", new Input(new int[]{-10, 50, 0, -20, 30}, 3), 0)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Kth Smallest Element",
            testCases,
            input -> KthSmallestElement.solve(input.nums, input.k), 
            true 
        );
    }
}
