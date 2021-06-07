package com.qrwells.practices.No9;

class ThreadXX2 extends Thread {
    MessagePrint m;

    public ThreadXX2(MessagePrint nm) {
        super();
        m = nm;
    }

    public void run() {
        while (true) {
            synchronized (m) {
                m.notifyAll();
                try {
                    m.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m.message("XX");
                m.notifyAll();
            }
        }
    }
}

class ThreadYY2 extends Thread {
    MessagePrint m = null;

    public ThreadYY2(MessagePrint nm) {
        super();
        m = nm;
    }

    public void run() {
        while (true) {
            synchronized (m) {
                m.notifyAll();
                try {
                    m.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m.message("YY");
                m.notifyAll();
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
