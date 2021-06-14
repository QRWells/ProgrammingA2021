/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

public class DataBuffer {

    private final ReadWriteLock2 lock = new ReadWriteLock2();
    private final StringBuffer value = new StringBuffer();

    public static void main(String[] args) {
        DataBuffer data = new DataBuffer();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data).start();
        new WriterThread(data).start();
    }

    public String read() throws InterruptedException {
        lock.readLock();
        try {
            Thread.sleep(100);
            return value.toString() + " " + lock.readingReaders + " " + lock.writingWriters;
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
}
