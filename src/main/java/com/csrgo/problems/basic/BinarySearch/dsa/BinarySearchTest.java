// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BinarySearch.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BinarySearchTest {

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

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Target Present Middle", new Input(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4),
            new TestCase<>("Target Absent", new Input(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1),
            new TestCase<>("Single Element Match", new Input(new int[]{5}, 5), 0),
            new TestCase<>("Single Element Mismatch", new Input(new int[]{5}, -5), -1),
            new TestCase<>("First Element Match", new Input(new int[]{1, 3, 5, 7, 9, 11}, 1), 0),
            new TestCase<>("Last Element Match", new Input(new int[]{1, 3, 5, 7, 9, 11}, 11), 5),
            new TestCase<>("Absent In Middle", new Input(new int[]{2, 4, 6, 8, 10, 12}, 7), -1),
            new TestCase<>("Match With Zero", new Input(new int[]{-50, -30, -10, 0, 10, 30, 50}, 0), 3),
            new TestCase<>("Two Elements Right", new Input(new int[]{10, 20}, 20), 1),
            new TestCase<>("Boundary Integers", new Input(new int[]{-2147483648, 0, 2147483647}, 2147483647), 2)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Binary Search",
            testCases,
            input -> BinarySearch.solve(input.nums, input.target), 
            true 
        );
    }
}
