// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MirrorTree.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class MirrorTreeTest {

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
            new TestCase(new int[]{10, 20, -1, 30, -1, 40, -1, -1}, new int[]{10, 40, 30, 20}, "Root with 3 children reversed"),
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, -1, 40, -1, -1}, new int[]{10, 40, 30, 20, 60, 50}, "Two-level tree mirrored at all depths"),
            new TestCase(new int[]{}, new int[]{}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[]{10}, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[]{10, 20, 30}, "Single vertical chain invariant under mirroring"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, 5, -1, -1}, new int[]{1, 5, 4, 3, 2}, "Root with 4 leaf children reversed"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[]{100, 200}, "Parent with single child"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[]{1, 3, 2, 5, 4}, "Two branches mirrored"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, 50, -1, -1}, new int[]{10, 50, 20, 40, 30}, "Multi-child hierarchy mirrored at each branch"),
            new TestCase(new int[]{5, 10, 20, -1, -1, 15, 25, -1, -1, -1}, new int[]{5, 15, 10, 25, 20}, "Symmetric tree mirrored")
        );

        TestRunner.runTests(
            tests,
            t -> MirrorTree.solve(t.input),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
