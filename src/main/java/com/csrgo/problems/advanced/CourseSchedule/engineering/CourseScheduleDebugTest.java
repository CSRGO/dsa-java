// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseSchedule.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class CourseScheduleDebugTest {

    static class Input {
        int numCourses;
        int[][] prerequisites;

        Input(int numCourses, int[][] prerequisites) {
            this.numCourses = numCourses;
            this.prerequisites = prerequisites;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Simple Prerequisite Chain",
                new Input(2, new int[][]{{1, 0}}),
                true
            ),
            new TestCase<>(
                "Direct Two-Node Cycle",
                new Input(2, new int[][]{{1, 0}, {0, 1}}),
                false
            ),
            new TestCase<>(
                "Single Course No Prerequisites",
                new Input(1, new int[][]{}),
                true
            ),
            new TestCase<>(
                "Directed Acyclic Graph",
                new Input(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}),
                true
            ),
            new TestCase<>(
                "Three-Node Cycle",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}),
                false
            ),
            new TestCase<>(
                "Diamond DAG",
                new Input(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}),
                true
            ),
            new TestCase<>(
                "Cycle Within Subcomponent",
                new Input(4, new int[][]{{1, 0}, {2, 1}, {3, 2}, {1, 3}}),
                false
            ),
            new TestCase<>(
                "Multiple Independent Courses",
                new Input(5, new int[][]{}),
                true
            ),
            new TestCase<>(
                "Two Disconnected DAG Components",
                new Input(4, new int[][]{{0, 1}, {2, 3}}),
                true
            ),
            new TestCase<>(
                "Self Loop",
                new Input(4, new int[][]{{0, 0}}),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();
        runner.runTests(
            "Course Schedule (DEBUG)",
            testCases,
            input -> CourseScheduleDebug.solve(input.numCourses, input.prerequisites),
            false
        );
    }
}
