// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SubarraysOfArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SubarraysOfArrayDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], String>> testCases = List.of(
            new TestCase<>("Three Elements Standard", new int[]{10, 20, 30}, "10\n10\t20\n10\t20\t30\n20\n20\t30\n30\n"),
            new TestCase<>("Two Elements", new int[]{1, 2}, "1\n1\t2\n2\n"),
            new TestCase<>("Single Element", new int[]{5}, "5\n"),
            new TestCase<>("Empty Array", new int[]{}, ""),
            new TestCase<>("Two Identical Elements", new int[]{7, 7}, "7\n7\t7\n7\n"),
            new TestCase<>("Four Elements", new int[]{1, 2, 3, 4}, "1\n1\t2\n1\t2\t3\n1\t2\t3\t4\n2\n2\t3\n2\t3\t4\n3\n3\t4\n4\n"),
            new TestCase<>("Negative and Zero", new int[]{-1, 0, 1}, "-1\n-1\t0\n-1\t0\t1\n0\n0\t1\n1\n"),
            new TestCase<>("Single Zero", new int[]{0}, "0\n"),
            new TestCase<>("Hundreds Range", new int[]{100, 200}, "100\n100\t200\n200\n"),
            new TestCase<>("Descending Elements", new int[]{3, 2, 1}, "3\n3\t2\n3\t2\t1\n2\n2\t1\n1\n")
        );

        TestRunner<int[], String> runner = new TestRunner<>();

        runner.runTests(
            "Subarrays of Array (DEBUG)",
            testCases,
            input -> SubarraysOfArrayDebug.solve(input), 
            false 
        );
    }
}
