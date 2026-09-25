// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SumOfTwoArrays.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SumOfTwoArraysTest {

    static class Input {
        final int[] a1;
        final int[] a2;

        Input(int[] a1, int[] a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        @Override
        public String toString() {
            return "a1=" + Arrays.toString(a1) + ", a2=" + Arrays.toString(a2);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Five and Six Digits", new Input(new int[]{9, 3, 4, 6, 8}, new int[]{1, 9, 8, 8, 5, 4}), new int[]{2, 9, 2, 3, 2, 2}),
            new TestCase<>("Rippling Carry New Digit", new Input(new int[]{9, 9, 9}, new int[]{1}), new int[]{1, 0, 0, 0}),
            new TestCase<>("Both Zero", new Input(new int[]{0}, new int[]{0}), new int[]{0}),
            new TestCase<>("Equal Length No Carry", new Input(new int[]{1, 2, 3}, new int[]{4, 5, 6}), new int[]{5, 7, 9}),
            new TestCase<>("Single Digits Carry", new Input(new int[]{5}, new int[]{5}), new int[]{1, 0}),
            new TestCase<>("Short and Long With Carry", new Input(new int[]{1}, new int[]{9, 9, 9, 9}), new int[]{1, 0, 0, 0, 0}),
            new TestCase<>("All Nines Sum", new Input(new int[]{8, 5, 2}, new int[]{1, 4, 7}), new int[]{9, 9, 9}),
            new TestCase<>("Different Lengths No Carry", new Input(new int[]{2, 6, 7}, new int[]{1, 2, 3, 4}), new int[]{1, 5, 0, 1}),
            new TestCase<>("Max Digits Double", new Input(new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}), new int[]{1, 9, 9, 9, 9, 8}),
            new TestCase<>("Trailing Zeros Leading Carry", new Input(new int[]{7, 0, 0, 0}, new int[]{3, 0, 0, 0}), new int[]{1, 0, 0, 0, 0})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Sum of Two Arrays",
            testCases,
            input -> SumOfTwoArrays.solve(input.a1, input.a2), 
            true 
        );
    }
}
