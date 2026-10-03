// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SurroundedRegions.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SurroundedRegionsTest {

    public static void main(String[] args) {

        List<TestCase<char[][], char[][]>> testCases = List.of(
            new TestCase<>("Classic 4x4 Board", new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}}, new char[][]{{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}}),
            new TestCase<>("Single Cell X", new char[][]{{'X'}}, new char[][]{{'X'}}),
            new TestCase<>("Single Cell O", new char[][]{{'O'}}, new char[][]{{'O'}}),
            new TestCase<>("All O 3x3", new char[][]{{'O','O','O'},{'O','O','O'},{'O','O','O'}}, new char[][]{{'O','O','O'},{'O','O','O'},{'O','O','O'}}),
            new TestCase<>("All X 3x3", new char[][]{{'X','X','X'},{'X','X','X'},{'X','X','X'}}, new char[][]{{'X','X','X'},{'X','X','X'},{'X','X','X'}}),
            new TestCase<>("Single Enclosed O", new char[][]{{'X','X','X'},{'X','O','X'},{'X','X','X'}}, new char[][]{{'X','X','X'},{'X','X','X'},{'X','X','X'}}),
            new TestCase<>("Boundary Connected O", new char[][]{{'X','O','X'},{'X','O','X'},{'X','X','X'}}, new char[][]{{'X','O','X'},{'X','O','X'},{'X','X','X'}}),
            new TestCase<>("Two Enclosed Blocks", new char[][]{{'X','X','X','X','X'},{'X','O','X','O','X'},{'X','X','X','X','X'}}, new char[][]{{'X','X','X','X','X'},{'X','X','X','X','X'},{'X','X','X','X','X'}}),
            new TestCase<>("Diagonal O Boundary", new char[][]{{'O','X','X'},{'X','O','X'},{'X','X','O'}}, new char[][]{{'O','X','X'},{'X','X','X'},{'X','X','O'}}),
            new TestCase<>("Corner O Cells", new char[][]{{'O','X','O'},{'X','O','X'},{'O','X','O'}}, new char[][]{{'O','X','O'},{'X','X','X'},{'O','X','O'}})
        );

        TestRunner<char[][], char[][]> runner = new TestRunner<>();

        runner.runTests(
            "Surrounded Regions",
            testCases,
            board -> SurroundedRegions.solve(board),
            true
        );
    }
}
