// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KLevelsDown.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class KLevelsDownDebugTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
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
        int[] standardTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(standardTree, 1), new int[]{25, 75}, "Level 1 nodes of balanced tree"),
            new TestCase(new Input(standardTree, 2), new int[]{12, 37, 62, 87}, "Level 2 leaf nodes of balanced tree"),
            new TestCase(new Input(standardTree, 0), new int[]{50}, "Level 0 returns root node"),
            new TestCase(new Input(standardTree, 3), new int[]{}, "Level 3 out of bounds returns empty"),
            new TestCase(new Input(new int[]{}, 1), new int[]{}, "Empty tree returns empty"),
            new TestCase(new Input(new int[]{10, -1, -1}, 0), new int[]{10}, "Single node tree at level 0"),
            new TestCase(new Input(new int[]{10, 20, 30, -1, -1, -1, -1}, 2), new int[]{30}, "Left skewed tree level 2"),
            new TestCase(new Input(new int[]{10, -1, 20, -1, 30, -1, -1}, 1), new int[]{20}, "Right skewed tree level 1"),
            new TestCase(new Input(new int[]{1, 2, -1, -1, 3, -1, -1}, 1), new int[]{2, 3}, "Two children at level 1"),
            new TestCase(new Input(standardTree, 5), new int[]{}, "Depth greater than height returns empty")
        );

        TestRunner.runTests(
            tests,
            t -> KLevelsDownDebug.solve(t.input.arr, t.input.k),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
