// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ParallelCourses.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ParallelCoursesDebugTest {

    static class Input {
        int n;
        int[][] relations;

        Input(int n, int[][] relations) {
            this.n = n;
            this.relations = relations;
        }

        @Override
        public String toString() {
            return "n=" + n + ", relations=" + Arrays.deepToString(relations);
        }
    }

    private static int[][] copyRelations(int[][] relations) {
        int[][] copy = new int[relations.length][];
        for (int i = 0; i < relations.length; i = i + 1) {
            copy[i] = relations[i].clone();
        }
        return copy;
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Two Independent Prerequisite Branches",
                new Input(3, new int[][]{{1, 3}, {2, 3}}),
                2
            ),
            new TestCase<>(
                "Three Course Circular Dependency",
                new Input(3, new int[][]{{1, 2}, {2, 3}, {3, 1}}),
                -1
            ),
            new TestCase<>(
                "Single Isolated Course",
                new Input(1, new int[][]{}),
                1
            ),
            new TestCase<>(
                "Four Course Linear Prerequisite Chain",
                new Input(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}),
                4
            ),
            new TestCase<>(
                "Diamond Prerequisite Graph",
                new Input(4, new int[][]{{1, 2}, {1, 3}, {2, 4}, {3, 4}}),
                3
            ),
            new TestCase<>(
                "Two Courses Direct Prerequisite",
                new Input(2, new int[][]{{1, 2}}),
                2
            ),
            new TestCase<>(
                "Two Courses Mutual Cycle",
                new Input(2, new int[][]{{1, 2}, {2, 1}}),
                -1
            ),
            new TestCase<>(
                "Disconnected Components Unequal Depths",
                new Input(5, new int[][]{{1, 2}, {2, 3}, {4, 5}}),
                3
            ),
            new TestCase<>(
                "Multiple Independent Courses Without Relations",
                new Input(4, new int[][]{}),
                1
            ),
            new TestCase<>(
                "Cycle Embedded In Larger Graph",
                new Input(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 2}}),
                -1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Parallel Courses (Debug)",
            testCases,
            input -> ParallelCoursesDebug.solve(input.n, copyRelations(input.relations)),
            false
        );
    }
}
