package com.CS102.recitation4;

/**
 * Created by FredFung on 9/27/2016.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static void print(ListNode node) {
        while (node.next != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(node.val + "->null");
    }
}
