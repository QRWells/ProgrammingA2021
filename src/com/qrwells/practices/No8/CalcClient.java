/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No8;

import java.util.concurrent.atomic.AtomicInteger;

public class CalcClient extends Thread {
    Calc calc = null;

    public CalcClient(Calc c) {
        calc = c;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        new CalcClient(c).start();
        new CalcClient(c).start();
    }

    public void run() {
        while (true) {
            synchronized (calc) {
                calc.increment();
                calc.decrement();
            }
        }
    }
}
