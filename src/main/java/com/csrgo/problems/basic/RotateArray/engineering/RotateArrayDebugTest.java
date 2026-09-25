// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RotateArrayDebugTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Right Rotation By 2", new Input(new int[]{1, 2, 3, 4, 5}, 2), new int[]{4, 5, 1, 2, 3}),
            new TestCase<>("Seven Elements By 3", new Input(new int[]{1, 2, 3, 4, 5, 6, 7}, 3), new int[]{5, 6, 7, 1, 2, 3, 4}),
            new TestCase<>("Negative Rotation Left", new Input(new int[]{1, 2, 3, 4, 5}, -2), new int[]{3, 4, 5, 1, 2}),
            new TestCase<>("Zero Rotation Identity", new Input(new int[]{1, 2, 3, 4, 5}, 0), new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Full Cycle Rotation", new Input(new int[]{1, 2, 3, 4, 5}, 5), new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Large Positive K", new Input(new int[]{1, 2, 3, 4, 5}, 12), new int[]{4, 5, 1, 2, 3}),
            new TestCase<>("Large Negative K", new Input(new int[]{1, 2, 3, 4, 5}, -11), new int[]{5, 1, 2, 3, 4}),
            new TestCase<>("Single Element", new Input(new int[]{42}, 100), new int[]{42}),
            new TestCase<>("Empty Array", new Input(new int[]{}, 3), new int[]{}),
            new TestCase<>("Two Elements Swap", new Input(new int[]{10, 20}, 1), new int[]{20, 10})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Rotate Array (DEBUG)",
            testCases,
            input -> RotateArrayDebug.solve(input.arr.clone(), input.k), 
            false 
        );
    }
}
