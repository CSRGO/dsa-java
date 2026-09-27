// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddTwoLinkedLists.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class AddTwoLinkedListsTest {

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
            new TestCase(new Input(new int[]{2, 4, 3}, new int[]{5, 6, 4}), new int[]{7, 0, 8}, "Standard addition 342 + 465 = 807"),
            new TestCase(new Input(new int[]{0}, new int[]{0}), new int[]{0}, "Zero plus zero"),
            new TestCase(new Input(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}), new int[]{8, 9, 9, 9, 0, 0, 0, 1}, "Different lengths with rolling carry cascade"),
            new TestCase(new Input(new int[]{5}, new int[]{5}), new int[]{0, 1}, "Single digits producing carry 5 + 5 = 10"),
            new TestCase(new Input(new int[]{1, 8}, new int[]{0}), new int[]{1, 8}, "Addition with zero"),
            new TestCase(new Input(new int[]{9}, new int[]{1, 9, 9}), new int[]{0, 0, 0, 1}, "Single digit plus multi-digit cascading carry"),
            new TestCase(new Input(new int[]{2, 4}, new int[]{5, 6, 4}), new int[]{7, 0, 5}, "First list shorter than second list"),
            new TestCase(new Input(new int[]{1, 0, 0, 0, 1}, new int[]{9, 9}), new int[]{0, 0, 1, 0, 1}, "Carry absorbed in middle digit"),
            new TestCase(new Input(new int[]{1}, new int[]{9, 9}), new int[]{0, 0, 1}, "1 plus 99 equals 100"),
            new TestCase(new Input(new int[]{3, 7}, new int[]{9, 2}), new int[]{2, 0, 1}, "Equal two-digit length with final carry 73 + 29 = 102")
        );

        TestRunner.runTests(
            tests,
            t -> AddTwoLinkedLists.solve(t.input.l1, t.input.l2),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
