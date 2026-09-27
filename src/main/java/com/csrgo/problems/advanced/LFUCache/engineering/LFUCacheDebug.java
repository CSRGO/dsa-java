// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LFUCache.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/lfu-cache/
public class LFUCacheDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int capacity, String[] operations) {
        class Node {
            int key;
            int value;
            int freq;
            Node prev;
            Node next;
            Node(int k, int v) {
                this.key = k;
                this.value = v;
                this.freq = 1;
            }
        }

        class DLList {
            Node head;
            Node tail;
            int size;
            DLList() {
                head = new Node(0, 0);
                tail = new Node(0, 0);
                head.next = tail;
                tail.prev = head;
                size = 0;
            }
            void add(Node node) {
                node.next = head.next;
                node.prev = head;
                head.next.prev = node;
                head.next = node;
                size = size + 1;
            }
            void remove(Node node) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size = size - 1;
            }
            Node removeFirst() {
                if (size > 0) {
                    Node node = head.next;
                    remove(node);
                    return node;
                }
                return null;
            }
        }

        Map<Integer, Node> keyToNode = new HashMap<>();
        Map<Integer, DLList> freqToList = new HashMap<>();
        int[] minFreq = new int[]{0};
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            if (op.startsWith("put")) {
                if (capacity <= 0) {
                    results.add(null);
                    continue;
                }
                String[] parts = op.split("\\s+");
                int key = Integer.parseInt(parts[1]);
                int val = Integer.parseInt(parts[2]);
                if (keyToNode.containsKey(key)) {
                    Node node = keyToNode.get(key);
                    node.value = val;
                } else {
                    if (keyToNode.size() >= capacity) {
                        DLList minList = freqToList.get(minFreq[0]);
                        Node evicted = minList != null ? minList.removeFirst() : null;
                        if (evicted != null) {
                            keyToNode.remove(evicted.key);
                        }
                    }
                    Node newNode = new Node(key, val);
                    keyToNode.put(key, newNode);
                    minFreq[0] = 1;
                    freqToList.computeIfAbsent(1, k -> new DLList()).add(newNode);
                }
                results.add(null);
            } else if (op.startsWith("get")) {
                if (capacity <= 0) {
                    results.add(-1);
                    continue;
                }
                String[] parts = op.split("\\s+");
                int key = Integer.parseInt(parts[1]);
                if (!keyToNode.containsKey(key)) {
                    results.add(-1);
                } else {
                    Node node = keyToNode.get(key);
                    results.add(node.value);
                }
            }
        }
        return results;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== LFU Cache (DEBUG) ====");
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
