/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex7;

public abstract class Collect {
    void created() {
        System.out.println("Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Collected");
    }
}
