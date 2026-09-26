// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MajorityElement.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MajorityElementTest {

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
            new TestCase<>("Three Elements Majority", new Input(new int[]{3, 2, 3}), 3),
            new TestCase<>("Seven Elements Majority", new Input(new int[]{2, 2, 1, 1, 1, 2, 2}), 2),
            new TestCase<>("Single Element", new Input(new int[]{1}), 1),
            new TestCase<>("Two Identical Elements", new Input(new int[]{5, 5}), 5),
            new TestCase<>("Negative Numbers Majority", new Input(new int[]{-1, -1, 2, -1, 3}), -1),
            new TestCase<>("All Same Elements", new Input(new int[]{4, 4, 4, 4}), 4),
            new TestCase<>("Majority At Start", new Input(new int[]{8, 8, 8, 1, 2}), 8),
            new TestCase<>("Majority At End", new Input(new int[]{1, 2, 9, 9, 9}), 9),
            new TestCase<>("Large Integers", new Input(new int[]{1000000000, 1000000000, -1000000000}), 1000000000),
            new TestCase<>("Zero Majority", new Input(new int[]{0, 1, 0, 2, 0}), 0)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Majority Element",
            testCases,
            input -> MajorityElement.solve(input.nums), 
            true 
        );
    }
}
