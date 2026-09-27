// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LRUCache.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/lru-cache/
public class LRUCacheDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int capacity, String[] operations) {
        class Node {
            int key;
            int value;
            Node prev;
            Node next;
            Node(int k, int v) {
                this.key = k;
                this.value = v;
            }
        }

        Map<Integer, Node> map = new HashMap<>();
        Node head = new Node(0, 0);
        Node tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            if (op.startsWith("put")) {
                String[] parts = op.split("\\s+");
                int key = Integer.parseInt(parts[1]);
                int val = Integer.parseInt(parts[2]);
                if (map.containsKey(key)) {
                    Node node = map.get(key);
                    node.value = val;
                } else {
                    if (map.size() >= capacity) {
                        Node mru = head.next;
                        head.next = mru.next;
                        mru.next.prev = head;
                    }
                    Node newNode = new Node(key, val);
                    map.put(key, newNode);
                    newNode.next = head.next;
                    newNode.prev = head;
                    head.next.prev = newNode;
                    head.next = newNode;
                }
                results.add(null);
            } else if (op.startsWith("get")) {
                String[] parts = op.split("\\s+");
                int key = Integer.parseInt(parts[1]);
                if (!map.containsKey(key)) {
                    results.add(-1);
                } else {
                    Node node = map.get(key);
                    results.add(node.value);
                }
            }
        }
        return results;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== LRU Cache (DEBUG) ====");
        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();
        System.out.print("Enter number of operations n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] operations = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter operation " + (i + 1) + ": ");
            operations[i] = sc.nextLine();
        }

        List<Integer> result = solve(capacity, operations);

        System.out.println("------------------------");
        System.out.println("Input  : capacity=" + capacity + ", operations=" + Arrays.toString(operations));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
