/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no9;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Room {
    private final Random random = new Random();
    private final Lock lock = new ReentrantLock();

    public void rest() {
        if (lock.tryLock()) {
            try {
                System.out.println("Start resting :" + Thread.currentThread().getName());
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("End resting :" + Thread.currentThread().getName());
            }
        }
    }
}
