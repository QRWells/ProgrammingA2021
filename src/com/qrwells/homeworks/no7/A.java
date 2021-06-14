/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no7;

public class A {
    private static int counter;

    public A() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String m() {
        return "a";
    }
}
