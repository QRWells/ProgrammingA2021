/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No6;

public class FlowerShop extends Shop {

    //public String name;

    public FlowerShop() {
        super("花屋");
    }

    @Override
    public String sell() {
        return "花";
    }
}
