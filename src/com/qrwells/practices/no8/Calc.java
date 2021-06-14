/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no8;

class Calc {
    int value = 0;
    void increment() {
        value++;
        System.out.println(Thread.currentThread() + ": " + value);
    }
    void decrement() {
        value--;
        System.out.println(Thread.currentThread() + ": " + value);
    }
}
