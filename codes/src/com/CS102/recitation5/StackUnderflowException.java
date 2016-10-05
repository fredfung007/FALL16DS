package com.CS102.recitation5;

/**
 * Created by fred on 10/4/2016.
 */
class StackUnderflowException extends RuntimeException {
    public StackUnderflowException() {
        super();
    }

    StackUnderflowException(String message) {
        super(message);
    }
}