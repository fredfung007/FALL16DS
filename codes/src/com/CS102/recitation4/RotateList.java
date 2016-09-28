package com.CS102.recitation4;

import java.util.List;
import java.util.Random;

/**
 * Created by Fred Fung on 9/28/2016.
 */
public class RotateList {
    public static void main(String[] args) {
        Random rg = new Random();
        ListNode header = new ListNode(9);
        ListNode currentNode = header;
        for (int i = 0; i < 10; i++) {
            currentNode.next = new ListNode(rg.nextInt(10));
            currentNode = currentNode.next;
        }

        ListNode.print(header);
        ListNode.print(rotateList(header, 123));
    }

    private static ListNode rotateList(ListNode header, int k) {
        ListNode currentNode = header;
        int counter = 1;
        while (currentNode.next != null) {
            counter++;
            currentNode = currentNode.next;
        }
        currentNode = header;
        k = k % counter;
        for (int i = 0; i < counter - k - 1; i++) {
            currentNode = currentNode.next;
        }
        ListNode newHeader = currentNode.next;
        currentNode.next = null;
        currentNode = newHeader;
        for (int i = 0; i < k - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = header;
        return newHeader;
    }
}
