package com.CS102.recitation5;

/**
 * Created by fred on 10/4/2016.
 */
interface StackInterface<T>

{
    void pop() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.

    T top() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.

    boolean isEmpty();
    // Returns true if this stack is empty, otherwise returns false.

}
