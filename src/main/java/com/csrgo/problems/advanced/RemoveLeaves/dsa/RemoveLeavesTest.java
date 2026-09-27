// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveLeaves.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class RemoveLeavesTest {

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
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, -1, 40, -1, -1}, new int[]{10, 20, 30}, "Pruning leaves leaves root and internal nodes"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, new int[]{10}, "Root with two leaf children leaves only root"),
            new TestCase(new int[]{}, new int[]{}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[]{}, "Single node is a leaf and is removed"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[]{10, 20}, "Single branch tree removes deepest leaf 30"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, new int[]{1}, "Root with 3 direct leaves retains only root"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[]{100}, "Parent and single leaf child"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[]{1, 2, 3}, "Two symmetric branches with leaves removed"),
            new TestCase(new int[]{5, 10, 15, 20, -1, -1, -1, -1}, new int[]{5, 10, 15}, "Four nodes chain with leaf 20 removed"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, 50, -1, -1}, new int[]{10, 20}, "Mixed internal and leaf children pruned")
        );

        TestRunner.runTests(
            tests,
            t -> RemoveLeaves.solve(t.input),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
