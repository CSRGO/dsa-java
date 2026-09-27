// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.QuickSelect.dsa;

import java.util.*;
import com.csrgo.util.*;

public class QuickSelectTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Six Element Array K Three", new Input(new int[]{7, 10, 4, 3, 20, 15}, 3), 7),
            new TestCase<>("Five Element Array K Two", new Input(new int[]{12, 3, 5, 7, 19}, 2), 5),
            new TestCase<>("Single Element Array K One", new Input(new int[]{42}, 1), 42),
            new TestCase<>("K Equals One Find Smallest", new Input(new int[]{9, 14, 2, 7, 1}, 1), 1),
            new TestCase<>("K Equals Length Find Largest", new Input(new int[]{9, 14, 2, 7, 1}, 5), 14),
            new TestCase<>("Array With Negative Numbers", new Input(new int[]{-5, -2, -10, 0, 4}, 2), -5),
            new TestCase<>("Array With Duplicates", new Input(new int[]{8, 2, 8, 3, 2, 1}, 4), 3),
            new TestCase<>("All Identical Elements", new Input(new int[]{6, 6, 6, 6}, 2), 6),
            new TestCase<>("Already Sorted Array", new Input(new int[]{10, 20, 30, 40, 50}, 3), 30),
            new TestCase<>("Reverse Sorted Array", new Input(new int[]{50, 40, 30, 20, 10}, 4), 40)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Quick Select",
            testCases,
            input -> QuickSelect.solve(input.arr, input.k),
            true
        );
    }
}
