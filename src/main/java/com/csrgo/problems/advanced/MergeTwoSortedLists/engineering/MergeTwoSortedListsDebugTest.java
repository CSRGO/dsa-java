// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeTwoSortedLists.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class MergeTwoSortedListsDebugTest {

    static class Input {
        final int[] l1;
        final int[] l2;

        Input(int[] l1, int[] l2) {
            this.l1 = l1;
            this.l2 = l2;
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
            new TestCase(new Input(new int[]{1, 2, 4}, new int[]{1, 3, 4}), new int[]{1, 1, 2, 3, 4, 4}, "Standard lists with overlapping elements"),
            new TestCase(new Input(new int[]{}, new int[]{0}), new int[]{0}, "First list empty and second list single zero"),
            new TestCase(new Input(new int[]{}, new int[]{}), new int[]{}, "Both lists empty"),
            new TestCase(new Input(new int[]{}, new int[]{1, 5, 9}), new int[]{1, 5, 9}, "First list empty and second list multi-element"),
            new TestCase(new Input(new int[]{2, 4, 6}, new int[]{}), new int[]{2, 4, 6}, "Second list empty and first list multi-element"),
            new TestCase(new Input(new int[]{1, 2, 3}, new int[]{4, 5, 6}), new int[]{1, 2, 3, 4, 5, 6}, "Disjoint ranges where all elements of first list precede second"),
            new TestCase(new Input(new int[]{2, 2, 3}, new int[]{1, 2, 5}), new int[]{1, 2, 2, 2, 3, 5}, "Lists containing duplicate numbers"),
            new TestCase(new Input(new int[]{-10, -5, 0}, new int[]{-7, -3, 2}), new int[]{-10, -7, -5, -3, 0, 2}, "Negative and positive numbers mixed"),
            new TestCase(new Input(new int[]{1}, new int[]{2, 3, 4, 5}), new int[]{1, 2, 3, 4, 5}, "Unbalanced list lengths with single element first list"),
            new TestCase(new Input(new int[]{5}, new int[]{3}), new int[]{3, 5}, "Both single element lists")
        );

        TestRunner.runTests(
            tests,
            t -> MergeTwoSortedListsDebug.solve(t.input.l1, t.input.l2),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
