package com.CS102.recitation5;

/**
 * Created by fred on 10/4/2016.
 */
class StackOverflowException extends RuntimeException {
    StackOverflowException() {
        super();
    }

    StackOverflowException(String message) {
        super(message);
    }
}