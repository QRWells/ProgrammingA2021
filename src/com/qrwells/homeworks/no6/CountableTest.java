/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no6;

public class CountableTest {
    public static void main(String[] args) {
        Countable[] countables = new Countable[3];
        countables[0] = new Text("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        countables[1] = new Text("100503");
        countables[2] = new IntArray(new int[]{100, 50, 3});
        for (Countable countable : countables) {
            System.out.println(countable.count());
        }
    }
}
