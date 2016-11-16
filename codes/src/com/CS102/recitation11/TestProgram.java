package com.CS102.recitation11;

import java.util.Date;
import java.util.Random;

/**
 * Created by fred on 11/16/2016.
 */
public class TestProgram {
    public static void main(String[] args) {
        int size = 100000;
        Random r = new Random(7);
        PrioQueue<Integer> heapPriorityQueue = new Heap<>(size);
        System.out.println("BEGIN INSERT to HEAP BASED.");
        System.out.println(new Date());
        for (int i = 0; i < size - 10; i++) {
            heapPriorityQueue.enqueue(r.nextInt(i + 1));
        }

        System.out.println("END INSERT to HEAP BASED.");
        System.out.println(new Date());

        r = new Random(7);
        PrioQueue<Integer> impl1PriorityQueue = new Impl1<>(size);

        System.out.println("BEGIN INSERT to IMPL1 BASED.");
        System.out.println(new Date());
        for (int i = 0; i < size - 10; i++) {
            impl1PriorityQueue.enqueue(r.nextInt(i + 1));
        }
        System.out.println("END INSERT to IMPL1 BASED.");
        System.out.println(new Date());
    }
}
