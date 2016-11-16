package com.CS102.recitation10;


import java.awt.*;
import java.net.Inet4Address;

/**
 * Created by FredFung on 11/9/2016.
 */
public class BST<T extends Comparable<? super T>>  {

    public void add (T t){
        throw new UnsupportedOperationException();
    }
    private void testAdd (BST<Integer> bst, Integer i) {
        bst.add(i);
    }
    private void testAdd (BST<String> bst, String i) {
        bst.add(i);
    }
    public static void main (String[] args){
        BST<String> stringBST = new BST<>();
        String a = "abc";
        String b = "xyz";
        System.out.println(a.compareTo(b));
    }
}
