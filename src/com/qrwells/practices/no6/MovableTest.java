/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no6;

class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new Animal();
        Movable m2 = new Robot();
        m1.move();
        m2.move();
        m1.move();
    }
}
