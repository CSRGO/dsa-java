// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddLast.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AddLastTest {

    static class Input {
        final int[] arr;
        final int val;

        Input(int[] arr, int val) {
            this.arr = arr;
            this.val = val;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", val=" + val;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Three Element Append", new Input(new int[]{10, 20, 30}, 40), new int[]{10, 20, 30, 40}),
            new TestCase<>("Empty List Append Single Element", new Input(new int[]{}, 5), new int[]{5}),
            new TestCase<>("Append To Single Element", new Input(new int[]{50}, 100), new int[]{50, 100}),
            new TestCase<>("Negative Value Append", new Input(new int[]{1, 2, 3}, -10), new int[]{1, 2, 3, -10}),
            new TestCase<>("Zero Append", new Input(new int[]{5, 6, 7}, 0), new int[]{5, 6, 7, 0}),
            new TestCase<>("Append Duplicate Value", new Input(new int[]{10, 20}, 20), new int[]{10, 20, 20}),
            new TestCase<>("Longer Initial Chain", new Input(new int[]{2, 4, 6, 8, 10}, 12), new int[]{2, 4, 6, 8, 10, 12}),
            new TestCase<>("Append To All Identical Array", new Input(new int[]{7, 7, 7}, 7), new int[]{7, 7, 7, 7}),
            new TestCase<>("Append Large Magnitude Integer", new Input(new int[]{100, 200}, 1000000), new int[]{100, 200, 1000000}),
            new TestCase<>("Append To Two Element List", new Input(new int[]{30, 40}, 50), new int[]{30, 40, 50})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Add Last",
            testCases,
            input -> AddLast.solve(input.arr, input.val),
            true
        );
    }
}
