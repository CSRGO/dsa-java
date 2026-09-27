// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddAtIndex.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AddAtIndexTest {

    static class Input {
        final int[] arr;
        final int idx;
        final int val;

        Input(int[] arr, int idx, int val) {
            this.arr = arr;
            this.idx = idx;
            this.val = val;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", idx=" + idx + ", val=" + val;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Insert In Middle Of List", new Input(new int[]{10, 20, 30, 40}, 2, 25), new int[]{10, 20, 25, 30, 40}),
            new TestCase<>("Insert At Head Index Zero", new Input(new int[]{10, 20}, 0, 5), new int[]{5, 10, 20}),
            new TestCase<>("Insert At Tail Index Equals Length", new Input(new int[]{10, 20}, 2, 30), new int[]{10, 20, 30}),
            new TestCase<>("Insert Into Empty List", new Input(new int[]{}, 0, 100), new int[]{100}),
            new TestCase<>("Insert At Index One", new Input(new int[]{1, 3}, 1, 2), new int[]{1, 2, 3}),
            new TestCase<>("Insert Into Single Element At Head", new Input(new int[]{50}, 0, 25), new int[]{25, 50}),
            new TestCase<>("Insert Into Single Element At Tail", new Input(new int[]{50}, 1, 75), new int[]{50, 75}),
            new TestCase<>("Insert Negative Number", new Input(new int[]{1, 2, 4, 5}, 2, -3), new int[]{1, 2, -3, 4, 5}),
            new TestCase<>("Insert Duplicate Number", new Input(new int[]{10, 20, 30}, 1, 20), new int[]{10, 20, 20, 30}),
            new TestCase<>("Insert Near End Of Large List", new Input(new int[]{2, 4, 6, 8, 12}, 4, 10), new int[]{2, 4, 6, 8, 10, 12})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Add at Index",
            testCases,
            input -> AddAtIndex.solve(input.arr, input.idx, input.val),
            true
        );
    }
}
