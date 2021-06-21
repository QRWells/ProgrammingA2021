/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no10;

public class DoorUser extends Thread {
    private final Door door;
    private final String name;

    public DoorUser(Door d, String s) {
        door = d;
        name = s;
    }

    public void run() {
        while (true) {
            try {
                door.pass(name);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
