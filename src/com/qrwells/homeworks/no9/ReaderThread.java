/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

public class ReaderThread extends Thread {
    private final DataBuffer data;

    public ReaderThread(DataBuffer d) {
        data = d;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " reads " + data.read());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
