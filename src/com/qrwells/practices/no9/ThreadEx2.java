/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no9;

class ThreadXX2 extends Thread {
    final MessagePrint m;

    public ThreadXX2(MessagePrint nm) {
        super();
        m = nm;
    }

    public void run() {
        while (true) {
            synchronized (m) {
                m.message("XX");
                m.notifyAll();
                try {
                    m.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadYY2 extends Thread {
    final MessagePrint m;

    public ThreadYY2(MessagePrint nm) {
        super();
        m = nm;
    }

    public void run() {
        while (true) {
            synchronized (m) {
                m.message("YY");
                m.notifyAll();
                try {
                    m.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MessagePrint {
    public void message(String text) {
        System.out.println(text);
    }
}

public class ThreadEx2 {
    public static void main(String[] args) {
        MessagePrint m = new MessagePrint();
        new ThreadXX2(m).start();
        new ThreadYY2(m).start();
    }
}
