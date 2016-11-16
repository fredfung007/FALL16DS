package com.CS102.recitation11;

/**
 * Created by fred on 11/15/2016.
 */
public class Heap<T extends Comparable<T>> implements PrioQueue<T> {
    private static final int FRONT = 1;
    private T[] Heap;
    private int size;
    private int maxsize;

    public Heap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = (T[]) new Comparable[this.maxsize + 1];
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        T tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos].compareTo(Heap[leftChild(pos)]) < 0 ||
                    Heap[pos].compareTo(Heap[rightChild(pos)]) < 0) {
                if (Heap[leftChild(pos)].compareTo(Heap[rightChild(pos)]) >= 0) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    @Override
    public void enqueue(T element) {
        Heap[++size] = element;
        int current = size;
        try {
            while (Heap[current].compareTo(Heap[parent(current)]) >= 0) {
                swap(current, parent(current));
                current = parent(current);
            }
        } catch (NullPointerException ex) {

        }
    }

    @Override
    public T dequeue() {
        T popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        maxHeapify(FRONT);
        return popped;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void maxHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            maxHeapify(pos);
        }
    }


}
