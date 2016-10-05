package com.CS102.recitation5;

import java.util.Stack;

/**
 * Created by fred on 10/4/2016.
 */
public class ReverseString {
    public static void main (String[] args){
        String s = "abcdef";
        System.out.println(s);
        System.out.println(reverseString(s));
    }

    static String reverseString(String input){
        String result = "";
        Stack<Character> stringStack = new Stack<Character>();
        for (char c : input.toCharArray()){
            stringStack.push(c);
        }
        while(!stringStack.isEmpty()){
            result = result + stringStack.pop();
        }
        return result;
    }
}
