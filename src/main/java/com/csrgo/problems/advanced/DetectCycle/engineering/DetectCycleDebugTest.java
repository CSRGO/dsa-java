// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DetectCycle.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class DetectCycleDebugTest {

    static class Input {
        final int[] arr;
        final int pos;

        Input(int[] arr, int pos) {
            this.arr = arr;
            this.pos = pos;
        }
    }

    static class TestCase {
        final Input input;
        final boolean expected;
        final String description;

        TestCase(Input input, boolean expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(new int[]{3, 2, 0, -4}, 1), true, "Cycle connecting tail to node index 1"),
            new TestCase(new Input(new int[]{1, 2}, 0), true, "Cycle connecting 2-element tail to head"),
            new TestCase(new Input(new int[]{1}, -1), false, "Single element with no cycle"),
            new TestCase(new Input(new int[]{}, -1), false, "Empty list with no cycle"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, -1), false, "Five elements linear list without cycle"),
            new TestCase(new Input(new int[]{10, 20, 30, 40}, 3), true, "Self-loop where tail connects to itself"),
            new TestCase(new Input(new int[]{5, 10, 15, 20, 25}, 2), true, "Cycle connecting tail to middle node index 2"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6}, 0), true, "Complete cyclic loop connecting tail to head"),
            new TestCase(new Input(new int[]{-1, -2, -3}, -1), false, "Negative numbers linear list"),
            new TestCase(new Input(new int[]{7, 8, 9, 10}, 4), false, "Invalid out-of-bounds pos resulting in no cycle")
        );

        TestRunner.runTests(
            tests,
            t -> DetectCycleDebug.solve(t.input.arr, t.input.pos),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
