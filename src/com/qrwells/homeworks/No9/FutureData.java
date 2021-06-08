/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No9;

public class FutureData implements Data {
    private RealData realdata = null;
    private boolean ready = false;

    public synchronized void setRealData(RealData r) {
        if (ready) {
            return;
        }
        realdata = r;
        ready = true;
        notifyAll();
    }

    public synchronized String getContent() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realdata.getContent();
    }
}

