// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LevelOrderGenericTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class LevelOrderGenericTreeDebugTest {

    static class TestCase {
        final int[] input;
        final int[] expected;
        final String description;

        TestCase(int[] input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, new int[]{10, 20, 30}, "Root with two children"),
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1}, new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120}, "Standard 12 nodes 4 levels generic tree"),
            new TestCase(new int[]{}, new int[]{}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[]{10}, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[]{10, 20, 30}, "Linear chain tree"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, 5, -1, -1}, new int[]{1, 2, 3, 4, 5}, "Root with 4 leaf children"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[]{100, 200}, "Parent and single child"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[]{1, 2, 3, 4, 5}, "Two symmetric branches level by level"),
            new TestCase(new int[]{5, 10, 15, 20, -1, -1, -1, -1}, new int[]{5, 10, 15, 20}, "Single vertical chain"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, -1}, new int[]{10, 20, 30, 40}, "Subtree with multiple siblings")
        );

        TestRunner.runTests(
            tests,
            t -> LevelOrderGenericTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
