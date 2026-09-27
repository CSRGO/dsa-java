// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IntersectionPoint.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class IntersectionPointDebugTest {

    static class Input {
        final int[] l1;
        final int[] l2;
        final int skip1;
        final int skip2;

        Input(int[] l1, int[] l2, int skip1, int skip2) {
            this.l1 = l1;
            this.l2 = l2;
            this.skip1 = skip1;
            this.skip2 = skip2;
        }
    }

    static class TestCase {
        final Input input;
        final int expected;
        final String description;

        TestCase(Input input, int expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(new int[]{4, 1, 8, 4, 5}, new int[]{5, 6, 1, 8, 4, 5}, 2, 3), 8, "Standard intersection at node 8"),
            new TestCase(new Input(new int[]{2, 6, 4}, new int[]{1, 5}, 3, 2), -1, "No intersection with disparate lists"),
            new TestCase(new Input(new int[]{1, 9, 1, 2, 4}, new int[]{3, 2, 4}, 3, 1), 2, "Intersection at node 2 with different prefixes"),
            new TestCase(new Input(new int[]{10}, new int[]{10}, 0, 0), 10, "Intersection at head of single element lists"),
            new TestCase(new Input(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 3, 3), -1, "Lists of equal lengths without intersection"),
            new TestCase(new Input(new int[]{7, 14, 21, 28}, new int[]{28}, 3, 0), 28, "Second list intersects at its head with tail of first list"),
            new TestCase(new Input(new int[]{100, 200}, new int[]{300, 400, 100, 200}, 0, 2), 100, "First list entirely contained in second list as intersection"),
            new TestCase(new Input(new int[]{5, 10, 15}, new int[]{20, 25, 30}, 3, 3), -1, "Completely disjoint lists"),
            new TestCase(new Input(new int[]{11, 22, 77, 88}, new int[]{33, 44, 77, 88}, 2, 2), 77, "Positive values intersecting at common suffix node 77"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6}, new int[]{9, 8, 4, 5, 6}, 3, 2), 4, "Intersection in longer lists at node 4")
        );

        TestRunner.runTests(
            tests,
            t -> IntersectionPointDebug.solve(t.input.l1, t.input.l2, t.input.skip1, t.input.skip2),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
