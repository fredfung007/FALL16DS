package com.CS102.recitation11;

/**
 * Created by fred on 11/16/2016.
 */
public class Impl1<T extends Comparable<T>> implements PrioQueue<T> {
    T[] queue;
    int end;

    public Impl1(int size) {
        this.queue = (T[]) new Comparable[size];
        end = 0;
    }

    @Override
    public void enqueue(T t) {
        int i = 0;
        for (i = 0; i < end; i++) {
            if (queue[i].compareTo(t) > 0) {
                shift(i);
                break;
            }
        }
        queue[i] = t;
        end++;
    }

    private void shift(int index) {
        for (int i = (end - 1); i >= index; i--) {
            queue[i + 1] = queue[i];
        }
    }

    @Override
    public T dequeue() {
        T result = queue[0];
        for (int i = 1; i < end; i++) {
            queue[i - 1] = queue[i];
        }
        end--;
        return result;
    }
}
