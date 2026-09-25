// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DifferenceOfTwoArrays.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DifferenceOfTwoArraysTest {

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
            new TestCase<>("Six and Five Digits", new Input(new int[]{2, 9, 2, 3, 2, 2}, new int[]{9, 3, 4, 6, 8}), new int[]{1, 9, 8, 8, 5, 4}),
            new TestCase<>("Cascading Borrow to Single Digit", new Input(new int[]{1, 0, 0, 0}, new int[]{9, 9, 9}), new int[]{1}),
            new TestCase<>("Both Zero", new Input(new int[]{0}, new int[]{0}), new int[]{0}),
            new TestCase<>("Identical Numbers", new Input(new int[]{9, 9, 9}, new int[]{9, 9, 9}), new int[]{0}),
            new TestCase<>("Thousand Minus One", new Input(new int[]{1, 0, 0, 0}, new int[]{1}), new int[]{9, 9, 9}),
            new TestCase<>("Equal Length No Borrow", new Input(new int[]{5, 7, 9}, new int[]{1, 2, 3}), new int[]{4, 5, 6}),
            new TestCase<>("Ten Minus Five", new Input(new int[]{1, 0}, new int[]{5}), new int[]{5}),
            new TestCase<>("Ten Thousand Minus One", new Input(new int[]{1, 0, 0, 0, 0}, new int[]{1}), new int[]{9, 9, 9, 9}),
            new TestCase<>("Different Lengths with Borrows", new Input(new int[]{1, 5, 0, 1}, new int[]{2, 6, 7}), new int[]{1, 2, 3, 4}),
            new TestCase<>("Large Value Inverse", new Input(new int[]{1, 9, 9, 9, 9, 8}, new int[]{9, 9, 9, 9, 9}), new int[]{9, 9, 9, 9, 9})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Difference of Two Arrays",
            testCases,
            input -> DifferenceOfTwoArrays.solve(input.a1, input.a2), 
            true 
        );
    }
}
