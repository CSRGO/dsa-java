// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LCAGenericTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class LCAGenericTreeDebugTest {

    static class Input {
        final int[] arr;
        final int d1;
        final int d2;

        Input(int[] arr, int d1, int d2) {
            this.arr = arr;
            this.d1 = d1;
            this.d2 = d2;
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
        int[] standardTree = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(standardTree, 110, 120), 80, "Siblings under common parent 80"),
            new TestCase(new Input(standardTree, 70, 100), 10, "Nodes in different subtrees have LCA root 10"),
            new TestCase(new Input(standardTree, 110, 80), 80, "One node is ancestor of the other"),
            new TestCase(new Input(standardTree, 50, 60), 20, "Direct children of node 20"),
            new TestCase(new Input(standardTree, 10, 10), 10, "Same root node"),
            new TestCase(new Input(new int[]{10, 20, -1, 30, -1, -1}, 20, 30), 10, "Two siblings with LCA 10"),
            new TestCase(new Input(new int[]{10, 20, 30, -1, -1, -1}, 20, 30), 20, "Linear chain LCA is the higher node"),
            new TestCase(new Input(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, 2, 4), 1, "First and last child of root"),
            new TestCase(new Input(standardTree, 120, 90), 30, "Different branches under node 30"),
            new TestCase(new Input(new int[]{100, 200, -1, -1}, 100, 200), 100, "Parent and child LCA is parent")
        );

        TestRunner.runTests(
            tests,
            t -> LCAGenericTreeDebug.solve(t.input.arr, t.input.d1, t.input.d2),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
