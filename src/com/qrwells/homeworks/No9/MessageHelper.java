/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No9;

public class MessageHelper {
    public void handle(int v) {
        try {
            Thread.sleep(100);
            System.out.println("Handled: " + v);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
