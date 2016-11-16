package com.CS102.recitation11;

/**
 * Created by fred on 11/16/2016.
 */
public interface PrioQueue<T extends Comparable<T>> {
    void enqueue(T t);

    T dequeue();
}
