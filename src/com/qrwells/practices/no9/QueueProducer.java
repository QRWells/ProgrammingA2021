/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no9;

class QueueProducer extends Thread {
    final Queue queue;

    QueueProducer(Queue q) {
        queue = q;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            synchronized (queue) {
                while (queue.isFull()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.enqueue(i);
                System.out.println(getName() + " " + i + " 追加");
                queue.notifyAll();
            }
            sleepRandomly();
        }
    }

    void sleepRandomly() {
        try {
            int n = (int) (Math.random() * 1000);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
