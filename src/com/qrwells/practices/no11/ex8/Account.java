/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex8;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    private final AtomicInteger balance = new AtomicInteger(0);

    public static void main(String[] args) {
        var a = new Account();
        var p = new Parent(a);
        var c = new Child(a);

        p.start();
        c.start();
    }

    public synchronized int getBalance() {
        return balance.get();
    }

    public synchronized void add(int cash) throws InterruptedException {
        while (balance.get() > 10000)
            wait();
        balance.addAndGet(cash);
        System.out.println("Balance:" + balance.get());
        notifyAll();
    }

    public synchronized void consume(int cash) throws InterruptedException {
        if (balance.get() == 0)
            wait();
        balance.addAndGet(-cash);
        System.out.println("Balance:" + balance.get());
        notifyAll();
    }
}
