/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no9;

public class WorkerClient {
    public static void main(String[] args) {
        Room room = new Room();
        new Worker(room).start();
        new Worker(room).start();
        new Worker(room).start();
    }
}
