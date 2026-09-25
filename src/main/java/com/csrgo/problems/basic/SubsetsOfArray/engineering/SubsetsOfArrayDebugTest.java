// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SubsetsOfArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SubsetsOfArrayDebugTest {

    private static String buildExpected(int[] arr) {
        if (arr == null || arr.length == 0) return "";
        int n = arr.length;
        int limit = 1 << n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            int temp = i;
            String[] row = new String[n];
            for (int j = n - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;
                row[j] = (rem == 0) ? "-" : String.valueOf(arr[j]);
            }
            for (int j = 0; j < n; j++) {
                sb.append(row[j]);
                if (j < n - 1) sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<int[], String>> testCases = List.of(
            new TestCase<>("Three Elements Classic", new int[]{10, 20, 30}, "-\t-\t-\n-\t-\t30\n-\t20\t-\n-\t20\t30\n10\t-\t-\n10\t-\t30\n10\t20\t-\n10\t20\t30\n"),
            new TestCase<>("Two Elements Pair", new int[]{1, 2}, "-\t-\n-\t2\n1\t-\n1\t2\n"),
            new TestCase<>("Single Element", new int[]{5}, "-\n5\n"),
            new TestCase<>("Empty Array", new int[]{}, ""),
            new TestCase<>("Single Zero", new int[]{0}, "-\n0\n"),
            new TestCase<>("Identical Elements", new int[]{1, 1}, "-\t-\n-\t1\n1\t-\n1\t1\n"),
            new TestCase<>("Negative and Positive", new int[]{-5, 5}, "-\t-\n-\t5\n-5\t-\n-5\t5\n"),
            new TestCase<>("Three Elements Descending", new int[]{3, 2, 1}, "-\t-\t-\n-\t-\t1\n-\t2\t-\n-\t2\t1\n3\t-\t-\n3\t-\t1\n3\t2\t-\n3\t2\t1\n"),
            new TestCase<>("Single Hundred", new int[]{100}, "-\n100\n"),
            new TestCase<>("Four Elements Quad", new int[]{1, 2, 3, 4}, buildExpected(new int[]{1, 2, 3, 4}))
        );

        TestRunner<int[], String> runner = new TestRunner<>();

        runner.runTests(
            "Subsets of Array (DEBUG)",
            testCases,
            input -> SubsetsOfArrayDebug.solve(input), 
            false 
        );
    }
}
