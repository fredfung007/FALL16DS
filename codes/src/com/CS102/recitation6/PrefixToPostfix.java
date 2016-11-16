package com.CS102.recitation6;

import java.io.IOException;
import java.util.Stack;

/**
 * Created by FredFung on 10/11/2016.
 */
public class PrefixToPostfix {
    private Stack<Character> theStack;
    private String input;
    private String output = "";

    public PrefixToPostfix(String in) {
        input = in;
        theStack = new Stack<Character>();
    }

    public static void main(String[] args)
            throws IOException {
        String input = "1+2*4/5-7+3/6";
        String output;
        PrefixToPostfix theTrans = new PrefixToPostfix(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }
}
