/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No7;

public class B extends A {
    private final A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public String m() {
        return "b" + a.m() + "b";
    }
}
