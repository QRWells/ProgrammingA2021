/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex9;

public class SubTest extends Test {
    public void get() {
        System.out.println("public int from subclass:" + getPublicI());
        System.out.println("protected int from subclass:" + getProtectedI());
        System.out.println("none int from subclass" + getNoneI());
    }
}
