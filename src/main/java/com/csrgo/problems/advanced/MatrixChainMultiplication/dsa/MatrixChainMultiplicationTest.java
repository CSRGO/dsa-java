// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MatrixChainMultiplication.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MatrixChainMultiplicationTest {

    public static void main(String[] args) {
        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Standard Five Matrices", new int[]{10, 20, 30, 40, 50}, 38000),
            new TestCase<>("Standard Variation Example", new int[]{40, 20, 30, 10, 30}, 26000),
            new TestCase<>("Two Matrices Direct Product", new int[]{10, 20, 30}, 6000),
            new TestCase<>("Single Matrix Zero Cost", new int[]{10, 20}, 0),
            new TestCase<>("Empty Dimension Array", new int[]{}, 0),
            new TestCase<>("Four Small Matrices Minimum Cost", new int[]{1, 2, 3, 4, 3}, 30),
            new TestCase<>("Two Small Matrices", new int[]{2, 3, 4}, 24),
            new TestCase<>("Three Matrices Multiples of Five", new int[]{5, 10, 15, 20}, 2250),
            new TestCase<>("Disproportionate Dimensions Set", new int[]{10, 100, 5, 50}, 7500),
            new TestCase<>("Alternating Dimension Scales", new int[]{10, 30, 5, 60}, 4500)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Matrix Chain Multiplication",
            testCases,
            input -> MatrixChainMultiplication.solve(input),
            true
        );
    }
}
