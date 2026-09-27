// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseScheduleII.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class CourseScheduleIITest {

    static class Input {
        int numCourses;
        int[][] prerequisites;

        Input(int numCourses, int[][] prerequisites) {
            this.numCourses = numCourses;
            this.prerequisites = prerequisites;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Simple Chain",
                new Input(2, new int[][]{{1, 0}}),
                new int[]{0, 1}
            ),
            new TestCase<>(
                "Diamond Dependency",
                new Input(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}),
                new int[]{0, 1, 2, 3}
            ),
            new TestCase<>(
                "Single Course",
                new Input(1, new int[][]{}),
                new int[]{0}
            ),
            new TestCase<>(
                "Two-Node Cycle",
                new Input(2, new int[][]{{0, 1}, {1, 0}}),
                new int[]{}
            ),
            new TestCase<>(
                "Linear Chain",
                new Input(3, new int[][]{{1, 0}, {2, 1}}),
                new int[]{0, 1, 2}
            ),
            new TestCase<>(
                "Three-Node Cycle",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}),
                new int[]{}
            ),
            new TestCase<>(
                "Independent Courses",
                new Input(3, new int[][]{}),
                new int[]{0, 1, 2}
            ),
            new TestCase<>(
                "Multiple Prerequisites Inverted Input Order",
                new Input(4, new int[][]{{2, 0}, {1, 0}, {3, 1}, {3, 2}}),
                new int[]{0, 1, 2, 3}
            ),
            new TestCase<>(
                "Sub-Cycle In Disconnected Graph",
                new Input(4, new int[][]{{3, 0}, {0, 1}, {1, 3}}),
                new int[]{}
            ),
            new TestCase<>(
                "Multi-Stage Branching DAG",
                new Input(5, new int[][]{{1, 0}, {2, 0}, {3, 1}, {4, 2}}),
                new int[]{0, 1, 2, 3, 4}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();
        runner.runTests(
            "Course Schedule II",
            testCases,
            input -> CourseScheduleII.solve(input.numCourses, input.prerequisites),
            true
        );
    }
}
