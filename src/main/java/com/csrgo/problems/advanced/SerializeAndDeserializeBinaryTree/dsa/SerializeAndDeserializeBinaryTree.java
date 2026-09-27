// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SerializeAndDeserializeBinaryTree.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/serialize-and-deserialize-binary-tree/
public class SerializeAndDeserializeBinaryTree {

    public static String solve(String data) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Serialize and Deserialize Binary Tree ====");
        System.out.print("Enter serialized pre-order string: ");
        String data = sc.nextLine();

        String result = solve(data);

        System.out.println("------------------------");
        System.out.println("Input  : " + data);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
