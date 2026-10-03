// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LargestRectangleInBinaryMatrix.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LargestRectangleInBinaryMatrixTest {

    public static void main(String[] args) {

        List<TestCase<char[][], Integer>> testCases = List.of(
            new TestCase<>("Classic 4x5 Matrix", new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}, 6),
            new TestCase<>("Single Zero", new char[][]{{'0'}}, 0),
            new TestCase<>("Single One", new char[][]{{'1'}}, 1),
            new TestCase<>("All Ones 3x3", new char[][]{{'1','1','1'},{'1','1','1'},{'1','1','1'}}, 9),
            new TestCase<>("All Zeros 2x3", new char[][]{{'0','0','0'},{'0','0','0'}}, 0),
            new TestCase<>("Tall Column Strip", new char[][]{{'1'},{'1'},{'1'},{'1'}}, 4),
            new TestCase<>("Wide Row Strip", new char[][]{{'1','1','1','1','1'}}, 5),
            new TestCase<>("Checkerboard Pattern", new char[][]{{'1','0','1'},{'0','1','0'},{'1','0','1'}}, 1),
            new TestCase<>("L Shaped Ones", new char[][]{{'1','0','0'},{'1','0','0'},{'1','1','1'}}, 3),
            new TestCase<>("Submatrix Block Inside", new char[][]{{'0','0','0','0'},{'0','1','1','0'},{'0','1','1','0'},{'0','0','0','0'}}, 4)
        );

        TestRunner<char[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Largest Rectangle in Binary Matrix",
            testCases,
            matrix -> LargestRectangleInBinaryMatrix.solve(matrix),
            true
        );
    }
}
