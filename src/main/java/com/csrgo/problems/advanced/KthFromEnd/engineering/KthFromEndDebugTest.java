// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KthFromEnd.engineering;

import java.util.*;
import com.csrgo.util.*;

public class KthFromEndDebugTest {

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

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Five Element Offset Two", new Input(new int[]{10, 20, 30, 40, 50}, 2), 30),
            new TestCase<>("Tail Node Offset Zero", new Input(new int[]{10, 20}, 0), 20),
            new TestCase<>("Head Node Offset Length Minus One", new Input(new int[]{10, 20, 30}, 2), 10),
            new TestCase<>("Single Element List Offset Zero", new Input(new int[]{42}, 0), 42),
            new TestCase<>("Second To Last Offset One", new Input(new int[]{1, 2, 3, 4}, 1), 3),
            new TestCase<>("Negative Integers In List", new Input(new int[]{-10, -20, -30, -40}, 2), -20),
            new TestCase<>("All Identical Elements", new Input(new int[]{7, 7, 7, 7}, 1), 7),
            new TestCase<>("Zero Included At Offset", new Input(new int[]{5, 0, 10}, 1), 0),
            new TestCase<>("Long Sequence Offset Four", new Input(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4), 4),
            new TestCase<>("Two Elements Offset One", new Input(new int[]{100, 200}, 1), 100)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Kth from End (DEBUG)",
            testCases,
            input -> KthFromEndDebug.solve(input.arr, input.k),
            false
        );
    }
}
