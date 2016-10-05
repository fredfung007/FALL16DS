package com.CS102.recitation5;

import java.util.Stack;

/**
 * Created by fred on 10/4/2016.
 */
public class WellFormedExpression {


    public static void main(String[] args){
        String input = "";
        System.out.println(test(input));
    }

    private static boolean test(String expression) {
        String openSet = "([{";
        String closeSet = ")]}";
        char currChar;
        int currCharIndex;
        int lastCharIndex;

        int openIndex;
        int closeIndex;

        boolean stillBalanced = true;

        Stack<Integer> stack = new Stack<Integer>();

        currCharIndex = 0;
        lastCharIndex = expression.length() - 1;

        while (stillBalanced && (currCharIndex <= lastCharIndex)) {
            currChar = expression.charAt(currCharIndex);
            openIndex = openSet.indexOf(currChar);

            if (openIndex != -1) {
                stack.push(openIndex);
            } else {
                closeIndex = closeSet.indexOf(currChar);
                if (closeIndex != -1) {
                    try {
                        openIndex = stack.pop();
                        if (openIndex != closeIndex) {
                            stillBalanced = false;
                        }
                    } catch (StackUnderflowException e) {
                        stillBalanced = false;
                    }
                }
            }
            currCharIndex++;
        }

        return stillBalanced && stack.isEmpty();
    }
}
