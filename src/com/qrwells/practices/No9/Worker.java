package com.qrwells.practices.No9;

import java.util.Random;

class Worker extends Thread {
    private final Random random = new Random();
    private Room room = null;

    public Worker(Room r) {
        room = r;
    }

    public void run() {
        while (true) {
            room.rest();
            System.out.println("    Work : " + Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
