package com.qrwells.practices.no10;

public class CountdownThread extends Thread {
    private final int value;

    public CountdownThread(int v) {
        value = v;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new CountdownThread(i + 1);
            threads[i].start();
        }
        for (var t : threads) {
            t.join();
        }
        System.out.println("FINISHED.");
    }

    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep((long) i * value);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(Thread.currentThread() + ": " + i * value);
        }
    }
}
