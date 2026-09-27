// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KthSmallestInBST.engineering;

import java.util.*;
import com.csrgo.util.*;

public class KthSmallestInBSTDebugTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        int[] fourNode = {3, 1, -1, 2, -1, -1, 4, -1, -1};
        int[] sixNode = {5, 3, 2, 1, -1, -1, -1, 4, -1, -1, 6, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("First Smallest in Four Node Tree", new Input(fourNode, 1), 1),
            new TestCase<>("Second Smallest in Four Node Tree", new Input(fourNode, 2), 2),
            new TestCase<>("Third Smallest in Four Node Tree", new Input(fourNode, 3), 3),
            new TestCase<>("Fourth Smallest Largest in Four Node Tree", new Input(fourNode, 4), 4),
            new TestCase<>("Median Value in Six Node Tree", new Input(sixNode, 3), 3),
            new TestCase<>("Maximum Element in Six Node Tree", new Input(sixNode, 6), 6),
            new TestCase<>("Single Node Tree K Equals One", new Input(singleNode, 1), 10),
            new TestCase<>("Left Skewed Minimum Element", new Input(leftSkewed, 1), 10),
            new TestCase<>("Left Skewed Maximum Element", new Input(leftSkewed, 3), 30),
            new TestCase<>("Right Skewed Intermediate Element", new Input(rightSkewed, 2), 20)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Kth Smallest in BST (DEBUG)",
            testCases,
            input -> KthSmallestInBSTDebug.solve(input.arr, input.k),
            false
        );
    }
}
