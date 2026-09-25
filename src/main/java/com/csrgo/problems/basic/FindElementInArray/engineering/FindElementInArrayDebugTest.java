// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FindElementInArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FindElementInArrayDebugTest {

    static class Input {
        final int[] arr;
        final int d;

        Input(int[] arr, int d) {
            this.arr = arr;
            this.d = d;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Middle Element", new Input(new int[]{15, 30, 40, 4, 11, 9}, 40), 2),
            new TestCase<>("Element Absent", new Input(new int[]{10, 20, 30, 40, 50}, 60), -1),
            new TestCase<>("Single Element Present", new Input(new int[]{99}, 99), 0),
            new TestCase<>("Single Element Absent", new Input(new int[]{99}, 100), -1),
            new TestCase<>("First Element", new Input(new int[]{5, 10, 15, 20, 25}, 5), 0),
            new TestCase<>("Last Element", new Input(new int[]{5, 10, 15, 20, 25}, 25), 4),
            new TestCase<>("Multiple Duplicates", new Input(new int[]{7, 7, 7, 7, 7}, 7), 0),
            new TestCase<>("Negative Number", new Input(new int[]{-10, -20, 0, 20, 10}, -20), 1),
            new TestCase<>("Absent in Odd List", new Input(new int[]{1, 3, 5, 7, 9, 11, 13}, 8), -1),
            new TestCase<>("Integer Minimum Boundary", new Input(new int[]{2147483647, -2147483648}, -2147483648), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Find Element in Array (DEBUG)",
            testCases,
            input -> FindElementInArrayDebug.solve(input.arr, input.d), 
            false 
        );
    }
}
