/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no8;

public class ThreadEx {
    public static void main(String[] args) {
        new ThreadXX().start();
        new Thread(new ThreadYY()).start();
    }
}
