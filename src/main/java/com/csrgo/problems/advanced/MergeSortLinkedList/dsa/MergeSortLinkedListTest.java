// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeSortLinkedList.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class MergeSortLinkedListTest {

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
            new TestCase(new int[]{4, 2, 1, 3}, new int[]{1, 2, 3, 4}, "Small unsorted array"),
            new TestCase(new int[]{-1, 5, 3, 4, 0}, new int[]{-1, 0, 3, 4, 5}, "Array with negative numbers and zero"),
            new TestCase(new int[]{}, new int[]{}, "Empty array"),
            new TestCase(new int[]{1}, new int[]{1}, "Single element array"),
            new TestCase(new int[]{2, 1}, new int[]{1, 2}, "Two inverted elements"),
            new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, "Already sorted array"),
            new TestCase(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}, "Reverse sorted array"),
            new TestCase(new int[]{3, 3, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 3, 3}, "Array with duplicate values"),
            new TestCase(new int[]{10, -10, 20, -20, 0}, new int[]{-20, -10, 0, 10, 20}, "Symmetric negative and positive values"),
            new TestCase(new int[]{99, 45, 12, 67, 34, 89, 23}, new int[]{12, 23, 34, 45, 67, 89, 99}, "Seven randomly ordered elements")
        );

        TestRunner.runTests(
            tests,
            t -> MergeSortLinkedList.solve(t.input),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
