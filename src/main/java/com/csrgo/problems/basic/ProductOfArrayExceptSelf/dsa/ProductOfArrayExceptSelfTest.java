// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ProductOfArrayExceptSelf.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ProductOfArrayExceptSelfTest {

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

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Standard Positive Sequence", new Input(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6}),
            new TestCase<>("Array With Single Zero", new Input(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0}),
            new TestCase<>("Array With Multiple Zeros", new Input(new int[]{0, 4, 0}), new int[]{0, 0, 0}),
            new TestCase<>("Two Elements Simple", new Input(new int[]{2, 3}), new int[]{3, 2}),
            new TestCase<>("Two Elements With Zero", new Input(new int[]{0, 5}), new int[]{5, 0}),
            new TestCase<>("All Ones", new Input(new int[]{1, 1, 1, 1}), new int[]{1, 1, 1, 1}),
            new TestCase<>("Alternating Signs", new Input(new int[]{-2, 2, -2, 2}), new int[]{-8, 8, -8, 8}),
            new TestCase<>("Three Elements", new Input(new int[]{4, 5, 2}), new int[]{10, 8, 20}),
            new TestCase<>("Negative Numbers No Zero", new Input(new int[]{-1, -2, -3, -4}), new int[]{-24, -12, -8, -6}),
            new TestCase<>("All Negative Ones", new Input(new int[]{-1, -1, -1}), new int[]{1, 1, 1})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Product of Array Except Self",
            testCases,
            input -> ProductOfArrayExceptSelf.solve(input.nums), 
            true 
        );
    }
}
