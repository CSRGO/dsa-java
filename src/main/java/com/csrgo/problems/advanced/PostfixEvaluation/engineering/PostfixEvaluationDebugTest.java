// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PostfixEvaluation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PostfixEvaluationDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, Integer>> testCases = List.of(
            new TestCase<>("Multi-operation Mixed Spaced", "2 3 1 * + 9 -", -4),
            new TestCase<>("Single Digit Compact Expression", "264*8/+3-", 2),
            new TestCase<>("Simple Two Operand Addition", "4 5 +", 9),
            new TestCase<>("Simple Two Operand Subtraction", "4 5 -", -1),
            new TestCase<>("Clean Division Operation", "10 2 /", 5),
            new TestCase<>("Extended Multi-operator Sequence", "5 1 2 + 4 * + 3 -", 14),
            new TestCase<>("Consecutive Division And Multiply", "9 3 / 2 *", 6),
            new TestCase<>("Complex Classic RPN Evaluation", "15 7 1 1 + - / 3 * 2 1 1 + + -", 5),
            new TestCase<>("Single Operand Postfix", "8", 8),
            new TestCase<>("Multi-digit Operand Product", "12 4 / 5 *", 15)
        );

        TestRunner<String, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Postfix Evaluation (DEBUG)",
            testCases,
            input -> PostfixEvaluationDebug.solve(input),
            false
        );
    }
}
