package com.CS102.recitation4;

import java.util.Random;

/**
 * Created by FredFung on 9/27/2016.
 */
public class PlusOne {
    public static void main(String[] args) {
        Random rg = new Random();
        ListNode header = new ListNode(9);
        ListNode currentNode = header;
        for (int i = 0; i < 10; i++) {
            currentNode.next = new ListNode(9);
            currentNode = currentNode.next;
        }

        ListNode.print(header);
        ListNode.print(plusOne(header));
    }

    private static ListNode plusOne(ListNode node) {
        ListNode header = node;
        node.val++;
        while (node.val >= 10) {
            if (node.next != null) {
                node.val -= 10;
                node.next.val++;
                node = node.next;
            } else {
                node.val -= 10;
                node.next = new ListNode(1);
                node = node.next;
            }
        }
        return header;
    }
}
