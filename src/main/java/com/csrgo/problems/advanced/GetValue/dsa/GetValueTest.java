// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetValue.dsa;

import java.util.*;
import com.csrgo.util.*;

public class GetValueTest {

    static class Input {
        final int[] arr;
        final int idx;

        Input(int[] arr, int idx) {
            this.arr = arr;
            this.idx = idx;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", idx=" + idx;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Retrieve Middle Index Two", new Input(new int[]{10, 20, 30, 40}, 2), 30),
            new TestCase<>("Retrieve Head Index Zero", new Input(new int[]{50}, 0), 50),
            new TestCase<>("Retrieve Tail Index N Minus One", new Input(new int[]{10, 20, 30}, 2), 30),
            new TestCase<>("Retrieve From Two Element List Head", new Input(new int[]{100, 200}, 0), 100),
            new TestCase<>("Retrieve From Two Element List Tail", new Input(new int[]{100, 200}, 1), 200),
            new TestCase<>("Retrieve Negative Value", new Input(new int[]{1, -25, 3}, 1), -25),
            new TestCase<>("Retrieve Zero Value", new Input(new int[]{10, 0, 30}, 1), 0),
            new TestCase<>("Long Ascending Sequence Index Four", new Input(new int[]{2, 4, 6, 8, 10, 12}, 4), 10),
            new TestCase<>("All Identical Elements", new Input(new int[]{7, 7, 7, 7}, 3), 7),
            new TestCase<>("Large Magnitude Integer", new Input(new int[]{1, 1000000, 3}, 1), 1000000)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Get Value",
            testCases,
            input -> GetValue.solve(input.arr, input.idx),
            true
        );
    }
}
