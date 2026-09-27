// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddFirst.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AddFirstTest {

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
            new TestCase<>("Classic Three Element Prepend", new Input(new int[]{10, 20, 30}, 5), new int[]{5, 10, 20, 30}),
            new TestCase<>("Empty List Prepend Single Element", new Input(new int[]{}, 1), new int[]{1}),
            new TestCase<>("Prepend To Single Element", new Input(new int[]{50}, 25), new int[]{25, 50}),
            new TestCase<>("Negative Value Prepend", new Input(new int[]{1, 2, 3}, -10), new int[]{-10, 1, 2, 3}),
            new TestCase<>("Zero Prepend", new Input(new int[]{5, 6, 7}, 0), new int[]{0, 5, 6, 7}),
            new TestCase<>("Prepend Duplicate Value", new Input(new int[]{10, 20}, 10), new int[]{10, 10, 20}),
            new TestCase<>("Longer Initial Chain", new Input(new int[]{2, 4, 6, 8, 10}, 0), new int[]{0, 2, 4, 6, 8, 10}),
            new TestCase<>("Prepend To All Identical Array", new Input(new int[]{7, 7, 7}, 9), new int[]{9, 7, 7, 7}),
            new TestCase<>("Prepend Large Magnitude Integer", new Input(new int[]{100, 200}, 1000000), new int[]{1000000, 100, 200}),
            new TestCase<>("Prepend To Large Two Element List", new Input(new int[]{30, 40}, 20), new int[]{20, 30, 40})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Add First",
            testCases,
            input -> AddFirst.solve(input.arr, input.val),
            true
        );
    }
}
