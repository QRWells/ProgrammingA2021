/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

public class MessageHost {

    private final MessageHelper helper = new MessageHelper();

    public static void main(String[] args) {
        MessageHost host = new MessageHost();
        host.request(10);
        host.request(100);
        host.request(1000);

    }

    public void request(final int number) {
        for (int i = 1; i <= 10; i++) {
            int finalI = number + i;
            new Thread(() -> helper.handle(finalI)).start();
        }
    }
}
