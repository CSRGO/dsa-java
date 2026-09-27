// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PalindromeLinkedList.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class PalindromeLinkedListDebugTest {

    static class TestCase {
        final int[] input;
        final boolean expected;
        final String description;

        TestCase(int[] input, boolean expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{1, 2, 2, 1}, true, "Even length symmetric palindrome"),
            new TestCase(new int[]{1, 2}, false, "Two elements asymmetric"),
            new TestCase(new int[]{1}, true, "Single element list is palindrome"),
            new TestCase(new int[]{1, 2, 3, 2, 1}, true, "Odd length symmetric palindrome"),
            new TestCase(new int[]{1, 2, 3, 4, 5}, false, "Ascending distinct elements"),
            new TestCase(new int[]{0, 0}, true, "Two identical zeros"),
            new TestCase(new int[]{1, 1, 1, 1, 1}, true, "All identical elements"),
            new TestCase(new int[]{1, 2, 3, 3, 2, 2}, false, "Even length almost palindrome with mismatch at tail"),
            new TestCase(new int[]{7, 8, 9, 9, 8, 7}, true, "Six elements palindrome with larger numbers"),
            new TestCase(new int[]{1, 2, 3, 4, 3, 2, 2}, false, "Odd length palindrome candidate with single mismatch")
        );

        TestRunner.runTests(
            tests,
            t -> PalindromeLinkedListDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
