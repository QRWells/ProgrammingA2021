package com.qrwells.practices.No9;

class QueueProducer extends Thread {
    Queue queue = null;
    QueueProducer(Queue q) {
        queue = q;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            synchronized (queue)
            {
                while (queue.isFull())
                {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.enqueue(i);
                System.out.println(getName() + " " + i + " 追加");
                queue.notifyAll();
            }
            sleepRandomly();
        }
    }

    void sleepRandomly() {
        try {
            int n = (int)(Math.random() * 1000);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
