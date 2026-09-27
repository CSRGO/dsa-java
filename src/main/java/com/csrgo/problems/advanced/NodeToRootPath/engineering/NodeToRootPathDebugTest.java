// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NodeToRootPath.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class NodeToRootPathDebugTest {

    static class Input {
        final int[] arr;
        final int data;

        Input(int[] arr, int data) {
            this.arr = arr;
            this.data = data;
        }
    }

    static class TestCase {
        final Input input;
        final int[] expected;
        final String description;

        TestCase(Input input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1}, 110), new int[]{110, 80, 30, 10}, "Deep leaf node path"),
            new TestCase(new Input(new int[]{10, 20, -1, 30, -1, -1}, 30), new int[]{30, 10}, "Direct child of root"),
            new TestCase(new Input(new int[]{10, 20, -1, 30, -1, -1}, 10), new int[]{10}, "Target is root node itself"),
            new TestCase(new Input(new int[]{10, 20, -1, 30, -1, -1}, 999), new int[]{}, "Target not found in tree"),
            new TestCase(new Input(new int[]{}, 10), new int[]{}, "Empty tree"),
            new TestCase(new Input(new int[]{10, -1}, 10), new int[]{10}, "Single node tree finding root"),
            new TestCase(new Input(new int[]{10, 20, 30, -1, -1, -1}, 30), new int[]{30, 20, 10}, "Linear chain deepest node"),
            new TestCase(new Input(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, 4), new int[]{4, 1}, "Rightmost child path to root"),
            new TestCase(new Input(new int[]{10, 20, 50, -1, 60, -1, -1, 30, -1, -1}, 60), new int[]{60, 20, 10}, "Intermediate subtree leaf path"),
            new TestCase(new Input(new int[]{10, 20, 30, 40, 50, -1, -1, -1, -1, -1}, 50), new int[]{50, 40, 30, 20, 10}, "Five-level deep linear chain")
        );

        TestRunner.runTests(
            tests,
            t -> NodeToRootPathDebug.solve(t.input.arr, t.input.data),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
