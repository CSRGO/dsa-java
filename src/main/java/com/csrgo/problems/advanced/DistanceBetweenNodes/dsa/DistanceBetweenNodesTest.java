// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DistanceBetweenNodes.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class DistanceBetweenNodesTest {

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
            new TestCase(new Input(standardTree, 110, 120), 2, "Siblings under common parent 80 distance is 2"),
            new TestCase(new Input(standardTree, 70, 110), 3, "Nodes in different branches under node 30 distance is 3"),
            new TestCase(new Input(standardTree, 110, 80), 1, "Parent and child distance is 1"),
            new TestCase(new Input(standardTree, 50, 100), 4, "Distance across two distinct top-level branches"),
            new TestCase(new Input(standardTree, 10, 10), 0, "Distance from node to itself is 0"),
            new TestCase(new Input(new int[]{10, 20, -1, 30, -1, -1}, 20, 30), 2, "Two siblings connected via root distance is 2"),
            new TestCase(new Input(new int[]{10, 20, 30, -1, -1, -1}, 10, 30), 2, "Linear chain end to end distance is 2"),
            new TestCase(new Input(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, 2, 4), 2, "Two leaves under root distance is 2"),
            new TestCase(new Input(standardTree, 50, 60), 2, "Two sibling leaves under node 20 distance is 2"),
            new TestCase(new Input(new int[]{100, 200, -1, -1}, 100, 200), 1, "Direct edge between parent and child")
        );

        TestRunner.runTests(
            tests,
            t -> DistanceBetweenNodes.solve(t.input.arr, t.input.d1, t.input.d2),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
