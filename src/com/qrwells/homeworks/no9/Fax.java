/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

import java.util.concurrent.locks.Lock;

class Fax extends Thread {
    private final Lock lock;
    private final Scanner scanner;

    public Fax(Scanner s, Lock l) {
        super();
        scanner = s;
        lock = l;
    }

    public void run() {
        while (true) {
            if (lock.tryLock()) {
                if (scanner.data != null) {
                    System.out.println("fax : " + scanner.data);
                    scanner.data = null;
                }
                lock.unlock();
            }
        }
    }
}

