package com.qrwells.homeworks.No9;/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

public class DataBuffer {

    private final ReadWriteLock lock = new ReadWriteLock();
    private final StringBuffer value = new StringBuffer();

    public String read() throws InterruptedException {
        lock.readLock();
        try {
            Thread.sleep(100);
            return value.toString();
        } finally {
            lock.readUnlock();
        }
    }

    public void append(char c) throws InterruptedException {
        lock.writeLock();
        try {
            value.append(c);
        } finally {
            lock.writeUnlock();
        }
    }

    public static void main(String[] args) {
        DataBuffer data = new DataBuffer();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data).start();
        new WriterThread(data).start();
    }
}
