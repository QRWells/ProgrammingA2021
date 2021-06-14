/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no9;

import java.util.ArrayList;

public class FibonacciThread extends Thread {
    private int value = 0;

    public FibonacciThread(int v) {
        value = v;
    }

    public static void printFibonacci(int n) {
        System.out.println(Thread.currentThread() + "" + fibonacci(n));
    }

    public static long fibonacci(int n) {
        return (n == 0 || n == 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws InterruptedException {
        long previousTime = 0;

        previousTime = System.currentTimeMillis();
        ArrayList<FibonacciThread> ts = new ArrayList<>();
        for (int i = 30; i < 40; i++) {
            var t = new FibonacciThread(i);
            ts.add(t);
            t.start();
        }
        try {
            for (FibonacciThread t : ts) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Time spent for multi-threaded execution: "
                + (System.currentTimeMillis() - previousTime));

        previousTime = System.currentTimeMillis();
        for (int i = 30; i < 40; i++) {
            printFibonacci(i);
        }
        System.out.println("Time spent for single-threaded execution: "
                + (System.currentTimeMillis() - previousTime));
    }

    public void run() {
        printFibonacci(value);
    }
}
