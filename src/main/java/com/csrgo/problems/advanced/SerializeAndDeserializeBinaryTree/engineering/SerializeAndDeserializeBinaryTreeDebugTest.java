// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SerializeAndDeserializeBinaryTree.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SerializeAndDeserializeBinaryTreeDebugTest {

    public static void main(String[] args) {
        List<TestCase<String, String>> testCases = List.of(
            new TestCase<>("Five Node Asymmetric Tree", "1,2,null,null,3,4,null,null,5,null,null", "1,2,null,null,3,4,null,null,5,null,null"),
            new TestCase<>("Empty Tree Literal Null Token", "null", "null"),
            new TestCase<>("Single Node Root Only", "10,null,null", "10,null,null"),
            new TestCase<>("Three Node Perfectly Balanced", "2,1,null,null,3,null,null", "2,1,null,null,3,null,null"),
            new TestCase<>("Left Skewed Unilateral Chain", "10,20,30,null,null,null,null", "10,20,30,null,null,null,null"),
            new TestCase<>("Right Skewed Unilateral Chain", "10,null,20,null,30,null,null", "10,null,20,null,30,null,null"),
            new TestCase<>("Root with Left Child Only", "1,2,null,null,null", "1,2,null,null,null"),
            new TestCase<>("Root with Right Child Only", "1,null,2,null,null", "1,null,2,null,null"),
            new TestCase<>("Tree with Negative Values", "-10,9,null,null,20,15,null,null,7,null,null", "-10,9,null,null,20,15,null,null,7,null,null"),
            new TestCase<>("Empty String Defaults to Null", "", "null")
        );

        TestRunner<String, String> runner = new TestRunner<>();

        runner.runTests(
            "Serialize and Deserialize Binary Tree (DEBUG)",
            testCases,
            input -> SerializeAndDeserializeBinaryTreeDebug.solve(input),
            false
        );
    }
}
