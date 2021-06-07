/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No8;

public class Queue {
    private final int[] values;
    private int first = 0;
    private int last = 0;

    public Queue(int size) {
        values = new int[size + 1];
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        for (int i = 0; !q.isFull(); i++) q.enqueue(i);
        q.dequeue();
        q.enqueue(4);
        q.dequeue();
        while (!q.isEmpty()) q.dequeue();
    }

    public void enqueue(int data) {
        if (isFull()) throw new RuntimeException();
        values[last] = data;
        last = (last + 1) % values.length;
        System.out.println("Enqueue: " + data);
    }

    public void dequeue() {
        if (isEmpty()) throw new RuntimeException();
        int data = values[first];
        first = (first + 1) % values.length;
        System.out.println("Dequeue: " + data);
    }

    public boolean isFull() {
        return (((last + 1) % values.length) == first);
    }

    public boolean isEmpty() {
        return (last == first);
    }
}
