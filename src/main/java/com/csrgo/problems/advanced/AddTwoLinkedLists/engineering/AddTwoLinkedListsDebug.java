// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddTwoLinkedLists.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-two-linked-lists/
public class AddTwoLinkedListsDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] l1, int[] l2) {
        int i = 0;
        int j = 0;
        int carry = 0;

        int maxLen = l1.length;
        if (l2.length > maxLen) {
            maxLen = l2.length;
        }
        int[] temp = new int[maxLen + 1];
        int count = 0;

        while (i < l1.length || j < l2.length) {
            int x = 0;
            if (i < l1.length) {
                x = l1[i];
                i = i + 1;
            }

            int y = 0;
            if (j < l2.length) {
                y = l2[j];
                i = i + 1;
            }

            int sum = x + y + carry;
            carry = sum / 10;
            temp[count] = sum;
            count = count + 1;
        }

        int[] result = new int[count];
        for (int k = 0; k < count; k = k + 1) {
            result[k] = temp[k];
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add Two Linked Lists (Debug) ====");
        System.out.print("Enter size of first list n: ");
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            l1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second list m: ");
        int m = sc.nextInt();
        int[] l2 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            l2[i] = sc.nextInt();
        }

        int[] result = solve(l1, l2);

        System.out.println("------------------------");
        System.out.println("List 1 : " + Arrays.toString(l1));
        System.out.println("List 2 : " + Arrays.toString(l2));
        System.out.println("Sum    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
