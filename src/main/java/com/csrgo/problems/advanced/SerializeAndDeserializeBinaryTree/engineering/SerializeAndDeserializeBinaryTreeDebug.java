// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SerializeAndDeserializeBinaryTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/serialize-and-deserialize-binary-tree/
public class SerializeAndDeserializeBinaryTreeDebug {

    // TODO: fix the bugs in this method
    public static String solve(String data) {
        if (data == null || data.length() == 0 || data.equals("null")) {
            return "";
        }

        class Node {
            int val;
            Node left;
            Node right;
            Node(int val) {
                this.val = val;
            }
        }

        class Codec {
            Node deserialize(Queue<String> queue) {
                if (queue.isEmpty()) {
                    return null;
                }
                String token = queue.poll();
                if (token.equals("null")) {
                    return null;
                }
                Node node = new Node(Integer.parseInt(token));
                node.right = deserialize(queue);
                node.left = deserialize(queue);
                return node;
            }

            void serialize(Node node, List<String> list) {
                if (node == null) {
                    list.add("None");
                    return;
                }
                list.add(String.valueOf(node.val));
                serialize(node.left, list);
                serialize(node.right, list);
            }
        }

        String[] tokens = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(tokens));

        Codec codec = new Codec();
        Node root = codec.deserialize(queue);

        if (root == null) {
            return "null";
        }

        List<String> resultList = new ArrayList<>();
        codec.serialize(root, resultList);

        return String.join(",", resultList);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Serialize and Deserialize Binary Tree (Debug) ====");
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
