// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeKSortedLists.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MergeKSortedListsDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[][], int[]>> testCases = List.of(
            new TestCase<>("Classic Three Sorted Lists",
                new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}},
                new int[]{1, 1, 2, 3, 4, 4, 5, 6}),
            new TestCase<>("Empty List Alongside Non-Empty List",
                new int[][]{{}, {1}},
                new int[]{1}),
            new TestCase<>("All Empty Lists",
                new int[][]{{}, {}, {}},
                new int[]{}),
            new TestCase<>("Single List Input",
                new int[][]{{2, 5, 8, 11}},
                new int[]{2, 5, 8, 11}),
            new TestCase<>("Two Lists Disjoint Value Ranges",
                new int[][]{{1, 2, 3}, {4, 5, 6}},
                new int[]{1, 2, 3, 4, 5, 6}),
            new TestCase<>("Negative Integers Included Across Lists",
                new int[][]{{-10, -5, 0}, {-8, -2, 3}},
                new int[]{-10, -8, -5, -2, 0, 3}),
            new TestCase<>("Single Element Lists Interleaved",
                new int[][]{{9}, {2}, {7}, {1}, {5}},
                new int[]{1, 2, 5, 7, 9}),
            new TestCase<>("Lists With High Multiplicity Identical Values",
                new int[][]{{4, 4}, {4, 4, 4}, {4}},
                new int[]{4, 4, 4, 4, 4, 4}),
            new TestCase<>("Unequal Length Lists Combination",
                new int[][]{{10}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {11, 12}},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}),
            new TestCase<>("Zero Elements Present Across Lists",
                new int[][]{{0, 0}, {-1, 0, 1}},
                new int[]{-1, 0, 0, 0, 1})
        );

        TestRunner<int[][], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Merge K Sorted Lists (DEBUG)",
            testCases,
            input -> MergeKSortedListsDebug.solve(input),
            false
        );
    }
}
