// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveAtIndex.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RemoveAtIndexDebugTest {

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

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Remove Middle Element Index Two", new Input(new int[]{10, 20, 30, 40}, 2), new int[]{10, 20, 40}),
            new TestCase<>("Remove Head Index Zero", new Input(new int[]{5, 10}, 0), new int[]{10}),
            new TestCase<>("Remove Tail Index N Minus One", new Input(new int[]{10, 20, 30}, 2), new int[]{10, 20}),
            new TestCase<>("Single Element Removal Leaves Empty", new Input(new int[]{100}, 0), new int[]{}),
            new TestCase<>("Remove Second Element Index One", new Input(new int[]{1, 2, 3, 4}, 1), new int[]{1, 3, 4}),
            new TestCase<>("Remove Negative Value", new Input(new int[]{1, -2, 3}, 1), new int[]{1, 3}),
            new TestCase<>("Remove From All Identical Elements", new Input(new int[]{7, 7, 7, 7}, 1), new int[]{7, 7, 7}),
            new TestCase<>("Remove Zero Element", new Input(new int[]{10, 0, 20}, 1), new int[]{10, 20}),
            new TestCase<>("Long Sequence Middle Removal", new Input(new int[]{1, 2, 3, 4, 5, 6}, 3), new int[]{1, 2, 3, 5, 6}),
            new TestCase<>("Two Element List Remove Tail", new Input(new int[]{42, 99}, 1), new int[]{42})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Remove at Index (DEBUG)",
            testCases,
            input -> RemoveAtIndexDebug.solve(input.arr, input.idx),
            false
        );
    }
}
