/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex9;

import com.qrwells.practices.no11.ex9.other.DiffPackTest;
import com.qrwells.practices.no11.ex9.other.OtherSubTest;

public class Test {
    public int publicI = 1;
    protected int protectedI = 2;
    int noneI = 3;
    private final int privateI = 4;

    public static void main(String[] args) {
        var t = new Test();
        var t2 = new Test2();
        var st = new SubTest();
        var dpt = new DiffPackTest();
        var ost = new OtherSubTest();

        t.get();
        t2.get();
        st.get();
        dpt.get();
        ost.get();
    }

    public int getPublicI() {
        return publicI;
    }

    protected int getProtectedI() {
        return protectedI;
    }

    int getNoneI() {
        return noneI;
    }

    private int getPrivateI() {
        return privateI;
    }

    public void get() {
        System.out.println("public int from this:" + getPublicI());
        System.out.println("protected int from this:" + getProtectedI());
        System.out.println("none int from this" + getNoneI());
        System.out.println("private int from this" + getPrivateI());
    }
}
