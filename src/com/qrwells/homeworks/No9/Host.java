package com.qrwells.homeworks.No9;/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

public class Host {
    public Data request(final int number) {
        final FutureData future = new FutureData();
        new Thread() {
            public void run() {
                RealData realdata = new RealData(number);
                future.setRealData(realdata);
            }
        }.start();
        return future;
    }
}

