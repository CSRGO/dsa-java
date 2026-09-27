// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DetectCycleII.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class DetectCycleIIDebugTest {

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
        final int expected;
        final String description;

        TestCase(Input input, int expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(new int[]{3, 2, 0, -4}, 1), 2, "Cycle connects tail to node with value 2 at index 1"),
            new TestCase(new Input(new int[]{1, 2}, 0), 1, "Cycle connects back to head with value 1"),
            new TestCase(new Input(new int[]{1}, -1), -1, "Single element with no cycle"),
            new TestCase(new Input(new int[]{}, -1), -1, "Empty list"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, -1), -1, "Five elements linear list without cycle"),
            new TestCase(new Input(new int[]{10, 20, 30, 40}, 3), 40, "Self-loop returning value 40 of node at index 3"),
            new TestCase(new Input(new int[]{5, 10, 15, 20, 25}, 2), 15, "Cycle connecting to middle node index 2 with value 15"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6}, 0), 1, "Full loop returning head node value 1"),
            new TestCase(new Input(new int[]{100, 200, 300}, -1), -1, "Three elements linear list"),
            new TestCase(new Input(new int[]{7, 8, 9, 10}, 4), -1, "Out-of-bounds pos resulting in no cycle")
        );

        TestRunner.runTests(
            tests,
            t -> DetectCycleIIDebug.solve(t.input.arr, t.input.pos),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
