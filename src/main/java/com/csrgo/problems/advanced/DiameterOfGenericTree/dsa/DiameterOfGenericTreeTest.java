// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DiameterOfGenericTree.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class DiameterOfGenericTreeTest {

    static class TestCase {
        final int[] input;
        final int expected;
        final String description;

        TestCase(int[] input, int expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        int[] standardTree = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        List<TestCase> tests = Arrays.asList(
            new TestCase(standardTree, 5, "Standard tree diameter between 50 and 110 has 5 edges"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, 2, "Root with two children has diameter 2"),
            new TestCase(new int[]{}, 0, "Empty tree has diameter 0"),
            new TestCase(new int[]{10, -1}, 0, "Single node tree has diameter 0"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, 2, "Linear chain of 3 nodes has diameter 2"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, 2, "Root with 3 leaves has diameter 2"),
            new TestCase(new int[]{100, 200, -1, -1}, 1, "Parent and single child has diameter 1"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, 4, "Two branches each depth 2 gives diameter 4"),
            new TestCase(new int[]{5, 10, 15, 20, -1, -1, -1, -1}, 3, "Four nodes linear chain diameter 3"),
            new TestCase(new int[]{10, 20, 50, -1, -1, 30, -1, 40, 60, -1, -1, -1}, 4, "Two depth-2 branches gives diameter 4")
        );

        TestRunner.runTests(
            tests,
            t -> DiameterOfGenericTree.solve(t.input),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
