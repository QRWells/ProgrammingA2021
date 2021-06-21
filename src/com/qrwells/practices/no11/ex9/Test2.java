/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex9;

public class Test2 {
    public void get() {
        var t = new Test();
        System.out.println("get public int from same package:" + t.getPublicI());
        System.out.println("get protected int from same package:" + t.getProtectedI());
        System.out.println("get none int from same package:" + t.getNoneI());
    }
}
