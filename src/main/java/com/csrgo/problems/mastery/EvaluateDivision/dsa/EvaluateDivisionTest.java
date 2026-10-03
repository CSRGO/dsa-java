// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.EvaluateDivision.dsa;

import java.util.*;
import com.csrgo.util.*;

public class EvaluateDivisionTest {

    static class Input {
        final String[][] equations;
        final double[] values;
        final String[][] queries;

        Input(String[][] equations, double[] values, String[][] queries) {
            this.equations = equations;
            this.values = values;
            this.queries = queries;
        }

        @Override
        public String toString() {
            return "Equations=" + Arrays.deepToString(equations)
                + ", Values=" + Arrays.toString(values)
                + ", Queries=" + Arrays.deepToString(queries);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, double[]>> testCases = List.of(
            new TestCase<>(
                "Standard Two Step Path and Unknown Variables",
                new Input(
                    new String[][]{{"a", "b"}, {"b", "c"}},
                    new double[]{2.0, 3.0},
                    new String[][]{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}}
                ),
                new double[]{6.0, 0.5, -1.0, 1.0, -1.0}
            ),
            new TestCase<>(
                "Disconnected Variables and Direct Inverse Lookups",
                new Input(
                    new String[][]{{"a", "b"}, {"b", "c"}, {"bc", "cd"}},
                    new double[]{1.5, 2.0, 5.0},
                    new String[][]{{"a", "c"}, {"c", "b"}, {"bc", "cd"}, {"cd", "bc"}}
                ),
                new double[]{3.0, 0.5, 5.0, 0.2}
            ),
            new TestCase<>(
                "Single Equation With Inverses and Missing Targets",
                new Input(
                    new String[][]{{"a", "b"}},
                    new double[]{0.5},
                    new String[][]{{"a", "b"}, {"b", "a"}, {"a", "c"}, {"x", "y"}}
                ),
                new double[]{0.5, 2.0, -1.0, -1.0}
            ),
            new TestCase<>(
                "Chain of Three Steps Resulting In Exact Cube",
                new Input(
                    new String[][]{{"a", "b"}, {"b", "c"}, {"c", "d"}},
                    new double[]{2.0, 2.0, 2.0},
                    new String[][]{{"a", "d"}, {"d", "a"}, {"b", "d"}}
                ),
                new double[]{8.0, 0.125, 4.0}
            ),
            new TestCase<>(
                "Square Of Four In Two Steps",
                new Input(
                    new String[][]{{"x", "y"}, {"y", "z"}},
                    new double[]{4.0, 4.0},
                    new String[][]{{"x", "z"}, {"z", "x"}, {"y", "y"}}
                ),
                new double[]{16.0, 0.0625, 1.0}
            ),
            new TestCase<>(
                "Self Division and Non Existent Node Handling",
                new Input(
                    new String[][]{{"m", "n"}},
                    new double[]{3.0},
                    new String[][]{{"m", "m"}, {"n", "n"}, {"k", "k"}, {"m", "n"}}
                ),
                new double[]{1.0, 1.0, -1.0, 3.0}
            ),
            new TestCase<>(
                "Two Completely Disconnected Graph Components",
                new Input(
                    new String[][]{{"p", "q"}, {"r", "s"}},
                    new double[]{2.0, 5.0},
                    new String[][]{{"p", "s"}, {"q", "r"}, {"p", "q"}, {"r", "s"}}
                ),
                new double[]{-1.0, -1.0, 2.0, 5.0}
            ),
            new TestCase<>(
                "Branching From Same Source Node",
                new Input(
                    new String[][]{{"a", "b"}, {"a", "c"}},
                    new double[]{2.0, 4.0},
                    new String[][]{{"b", "c"}, {"c", "b"}}
                ),
                new double[]{2.0, 0.5}
            ),
            new TestCase<>(
                "Alternating Multiplications Returning To Unity",
                new Input(
                    new String[][]{{"u", "v"}, {"v", "w"}, {"w", "x"}, {"x", "y"}},
                    new double[]{2.0, 0.5, 4.0, 0.25},
                    new String[][]{{"u", "y"}, {"y", "u"}, {"u", "w"}}
                ),
                new double[]{1.0, 1.0, 1.0}
            ),
            new TestCase<>(
                "Long Named String Identifiers and Inversion",
                new Input(
                    new String[][]{{"alpha", "beta"}},
                    new double[]{8.0},
                    new String[][]{{"beta", "alpha"}, {"gamma", "gamma"}}
                ),
                new double[]{0.125, -1.0}
            )
        );

        TestRunner<Input, double[]> runner = new TestRunner<>();

        runner.runTests(
            "Evaluate Division",
            testCases,
            input -> EvaluateDivision.solve(input.equations, input.values, input.queries),
            true
        );
    }
}
