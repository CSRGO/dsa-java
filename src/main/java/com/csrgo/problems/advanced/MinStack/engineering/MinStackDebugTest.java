// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinStack.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinStackDebugTest {

    public static void main(String[] args) {

        List<TestCase<String[], List<Integer>>> testCases = List.of(
            new TestCase<>("Classic LeetCode Sequence", new String[]{"push -2", "push 0", "push -3", "getMin", "pop", "top", "getMin"}, Arrays.asList(null, null, null, -3, null, 0, -2)),
            new TestCase<>("Duplicate Minimums Pushed", new String[]{"push 2", "push 0", "push 3", "push 0", "getMin", "pop", "getMin", "pop", "getMin"}, Arrays.asList(null, null, null, null, 0, null, 0, null, 2)),
            new TestCase<>("Strictly Decreasing Elements", new String[]{"push 5", "push 4", "push 3", "getMin", "pop", "getMin"}, Arrays.asList(null, null, null, 3, null, 4)),
            new TestCase<>("Strictly Increasing Elements", new String[]{"push 1", "push 2", "push 3", "getMin", "top", "pop", "getMin"}, Arrays.asList(null, null, null, 1, 3, null, 1)),
            new TestCase<>("Single Element Push And GetMin", new String[]{"push 42", "getMin", "top"}, Arrays.asList(null, 42, 42)),
            new TestCase<>("Negative Large Numbers", new String[]{"push -100", "push -200", "getMin", "pop", "getMin"}, Arrays.asList(null, null, -200, null, -100)),
            new TestCase<>("Alternating Push And Pop", new String[]{"push 10", "getMin", "pop", "push 20", "getMin"}, Arrays.asList(null, 10, null, null, 20)),
            new TestCase<>("Multiple Equal Elements", new String[]{"push 7", "push 7", "push 7", "getMin", "pop", "getMin"}, Arrays.asList(null, null, null, 7, null, 7)),
            new TestCase<>("Interleaved Query Top And Min", new String[]{"push 8", "push 5", "top", "getMin", "pop", "top", "getMin"}, Arrays.asList(null, null, 5, 5, null, 8, 8)),
            new TestCase<>("Deep Push Stack", new String[]{"push 15", "push 12", "push 18", "push 10", "getMin", "pop", "getMin"}, Arrays.asList(null, null, null, null, 10, null, 12))
        );

        TestRunner<String[], List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Min Stack (DEBUG)",
            testCases,
            input -> MinStackDebug.solve(input),
            false
        );
    }
}
