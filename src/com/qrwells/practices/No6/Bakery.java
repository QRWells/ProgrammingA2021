/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No6;

public class Bakery extends Shop {
    public Bakery() {
        super("パン屋");
    }

    @Override
    public String sell() {
        return "パン";
    }
}
