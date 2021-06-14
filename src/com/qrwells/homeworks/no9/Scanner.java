/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Scanner extends Thread {
    private final Lock lock;
    public String data = null;

    public Scanner(ReentrantLock l) {
        lock = l;
    }

    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();
        Scanner scanner = new Scanner(l);
        Fax fax = new Fax(scanner, l);
        scanner.start();
        fax.start();
    }

    public void run() {
        while (true) {
            if (lock.tryLock()) {
                if (data == null) {
                    data = "値が設定されています";
                    System.out.println("scan: " + data);
                }
                lock.unlock();
            }
        }
    }
}
