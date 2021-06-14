package com.qrwells.practices.no10;

public final class Mutex {
    private boolean busy = false;

    public synchronized void lock() {
        while (busy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        busy = true;
    }

    public synchronized void unlock() {
        busy = false;
        notifyAll();
    }
}
