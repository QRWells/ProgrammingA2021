/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex7;

public class CollectMain {
    public static void main(String[] args) {
        var c = new CollectA();
        c = null;
        System.gc();
    }
}
