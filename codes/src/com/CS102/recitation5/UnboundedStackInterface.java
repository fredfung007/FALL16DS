package com.CS102.recitation5;

/**
 * Created by fred on 10/4/2016.
 */

interface UnboundedStackInterface<T> extends StackInterface<T> {
    void push(T element);
    // Places element at the top of this stack.

}