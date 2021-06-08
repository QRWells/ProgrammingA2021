/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No9;

public final class ReadWriteLock2 {
    private int readingReaders = 0;
    private int writingWriters = 0;

    public synchronized void readLock() throws InterruptedException {
        while (writingWriters > 0) {
            wait();
        }
        readingReaders++;
    }

    public synchronized void readUnlock() {
        readingReaders--;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        while (readingReaders > 0 || writingWriters > 0) {
            wait();
        }
        writingWriters++;
    }

    public synchronized void writeUnlock() {
        writingWriters--;
        notifyAll();
    }
}
