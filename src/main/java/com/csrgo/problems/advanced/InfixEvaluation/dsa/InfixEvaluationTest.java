// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixEvaluation.dsa;

import java.util.*;
import com.csrgo.util.*;

public class InfixEvaluationTest {

    public static void main(String[] args) {

        List<TestCase<String, Integer>> testCases = List.of(
            new TestCase<>("Precedence And Parentheses Mixed", "2 + (5 - 3 * 6 / 2)", -2),
            new TestCase<>("Parenthesized Addition Multiplied", "(2 + 3) * 4", 20),
            new TestCase<>("Standard Mixed Precedence", "10 + 20 * 30", 610),
            new TestCase<>("Nested Parentheses Expression", "(100 * ( 2 + 12 ) ) / 14", 100),
            new TestCase<>("Precedence With Division", "4 + 8 / 2 - 3 * 2", 2),
            new TestCase<>("Left Associative Subtraction", "15 - 5 - 2", 8),
            new TestCase<>("Left Associative Division", "100 / 10 / 2", 5),
            new TestCase<>("Multiple Parenthesized Groups", "(1 + 2) * (3 + 4)", 21),
            new TestCase<>("Single Operand", "42", 42),
            new TestCase<>("Complex Nested Multiplication", "2 * (3 + (4 * 5))", 46)
        );

        TestRunner<String, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Infix Evaluation",
            testCases,
            input -> InfixEvaluation.solve(input),
            true
        );
    }
}
