/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

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
