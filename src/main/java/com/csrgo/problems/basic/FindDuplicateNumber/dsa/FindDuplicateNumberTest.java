// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FindDuplicateNumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class FindDuplicateNumberTest {

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
            new TestCase<>("Classic Five Elements", new Input(new int[]{1, 3, 4, 2, 2}), 2),
            new TestCase<>("Duplicate At First And Middle", new Input(new int[]{3, 1, 3, 4, 2}), 3),
            new TestCase<>("Duplicate Appears Three Times", new Input(new int[]{3, 3, 3, 3, 3}), 3),
            new TestCase<>("Smallest Two Elements", new Input(new int[]{1, 1}), 1),
            new TestCase<>("Three Elements Duplicate One", new Input(new int[]{1, 2, 1}), 1),
            new TestCase<>("Three Elements Duplicate Two", new Input(new int[]{2, 2, 2}), 2),
            new TestCase<>("Duplicate At Boundary", new Input(new int[]{1, 2, 3, 4, 4}), 4),
            new TestCase<>("Duplicate As Value Nine", new Input(new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1}), 9),
            new TestCase<>("Sequence With Gap", new Input(new int[]{1, 4, 4, 2, 4}), 4),
            new TestCase<>("Six Elements Duplicate Five", new Input(new int[]{5, 1, 2, 3, 4, 5}), 5)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Find Duplicate Number",
            testCases,
            input -> FindDuplicateNumber.solve(input.nums), 
            true 
        );
    }
}
