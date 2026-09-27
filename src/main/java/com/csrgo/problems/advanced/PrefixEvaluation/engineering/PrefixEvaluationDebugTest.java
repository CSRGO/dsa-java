// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrefixEvaluation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PrefixEvaluationDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, Integer>> testCases = List.of(
            new TestCase<>("Multi-operation Mixed Spaced", "- + 2 * 3 1 9", -4),
            new TestCase<>("Single Digit Compact Expression", "-+2/*6483", 2),
            new TestCase<>("Simple Two Operand Addition", "+ 4 5", 9),
            new TestCase<>("Simple Two Operand Subtraction", "- 4 5", -1),
            new TestCase<>("Clean Division Operation", "/ 10 2", 5),
            new TestCase<>("Extended Multi-operator Sequence", "- + 5 * + 1 2 4 3", 14),
            new TestCase<>("Consecutive Division And Multiply", "* / 9 3 2", 6),
            new TestCase<>("Addition Before Precedent Multiply", "+ 3 * 4 5", 23),
            new TestCase<>("Single Operand Prefix", "8", 8),
            new TestCase<>("Multi-digit Operand Product", "* / 12 4 5", 15)
        );

        TestRunner<String, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Prefix Evaluation (DEBUG)",
            testCases,
            input -> PrefixEvaluationDebug.solve(input),
            false
        );
    }
}
