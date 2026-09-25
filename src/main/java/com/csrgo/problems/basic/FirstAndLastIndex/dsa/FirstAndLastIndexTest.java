// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FirstAndLastIndex.dsa;

import java.util.*;
import com.csrgo.util.*;

public class FirstAndLastIndexTest {

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
            new TestCase<>("Target In Middle With Duplicates", new Input(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4}),
            new TestCase<>("Target Not Found Between", new Input(new int[]{5, 7, 7, 8, 8, 10}, 6), new int[]{-1, -1}),
            new TestCase<>("Empty Array", new Input(new int[]{}, 0), new int[]{-1, -1}),
            new TestCase<>("Single Element Match", new Input(new int[]{1}, 1), new int[]{0, 0}),
            new TestCase<>("Single Element Mismatch", new Input(new int[]{1}, 0), new int[]{-1, -1}),
            new TestCase<>("All Elements Equal Target", new Input(new int[]{2, 2, 2, 2, 2}, 2), new int[]{0, 4}),
            new TestCase<>("Target At Start", new Input(new int[]{3, 3, 4, 5, 6}, 3), new int[]{0, 1}),
            new TestCase<>("Target At End", new Input(new int[]{1, 2, 3, 9, 9, 9}, 9), new int[]{3, 5}),
            new TestCase<>("Target Smaller Than All", new Input(new int[]{10, 20, 30}, 5), new int[]{-1, -1}),
            new TestCase<>("Target Larger Than All", new Input(new int[]{10, 20, 30}, 40), new int[]{-1, -1})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "First and Last Index",
            testCases,
            input -> FirstAndLastIndex.solve(input.nums, input.target), 
            true 
        );
    }
}
