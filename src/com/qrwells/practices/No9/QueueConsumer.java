/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No9;

class QueueConsumer extends Thread {
    final Queue queue;

    QueueConsumer(Queue q) {
        queue = q;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int x = queue.dequeue();
                System.out.println(getName() + " " + x + " を消費");
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
