package com.CS102.recitation5;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by fred on 10/4/2016.
 */
public class PostFixCalculator {
    public static void main(String[] args) {
        String expression = "5 1 2 + 4 * + 3 -";
        System.out.println(evaluate(expression));
    }

    static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<Integer>();
        int value;
        String operator;
        int operand1;
        int operand2;
        int result = 0;
        Scanner tokenizer = new Scanner(expression);
        while (tokenizer.hasNext()) {
            if (tokenizer.hasNextInt()) {
                value = tokenizer.nextInt();
                stack.push(value);
            } else {
                operator = tokenizer.next();
                if (stack.isEmpty()) {
                    throw new EmptyStackException();
                }
                operand2 = stack.pop();
                if (stack.isEmpty()) {
                    throw new EmptyStackException();
                }
                operand1 = stack.pop();

                switch (operator) {
                    case "/":
                        result = operand1 / operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    default:
                        throw new UnsupportedOperationException("Illegal symbol: " + operator);
                }
                stack.push(result);
            }
        }

        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        result = stack.pop();
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return result;
    }
}
