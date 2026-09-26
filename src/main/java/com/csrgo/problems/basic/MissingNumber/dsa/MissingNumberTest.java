// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MissingNumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MissingNumberTest {

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
            new TestCase<>("Three Elements Missing Two", new Input(new int[]{3, 0, 1}), 2),
            new TestCase<>("Nine Elements Missing Eight", new Input(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), 8),
            new TestCase<>("Missing Last Number", new Input(new int[]{0, 1}), 2),
            new TestCase<>("Missing Zero", new Input(new int[]{1}), 0),
            new TestCase<>("Single Element Missing One", new Input(new int[]{0}), 1),
            new TestCase<>("Two Elements Missing One", new Input(new int[]{0, 2}), 1),
            new TestCase<>("Five Elements Missing Zero", new Input(new int[]{1, 2, 3, 4, 5}), 0),
            new TestCase<>("Reversed Sequence Missing Four", new Input(new int[]{5, 3, 2, 1, 0}), 4),
            new TestCase<>("Ten Elements Missing Seven", new Input(new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9, 10}), 7),
            new TestCase<>("Two Elements Missing Zero", new Input(new int[]{2, 1}), 0)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Missing Number",
            testCases,
            input -> MissingNumber.solve(input.nums), 
            true 
        );
    }
}
