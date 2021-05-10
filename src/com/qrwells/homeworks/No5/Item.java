/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No5;

public class Item {
    private final String name;
    private final int price;

    private static int instanceNum = 0;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        instanceNum++;
    }

    public static int getNumberOfInstances()
    {
        return instanceNum;
    }

    @Override
    public String toString() {
        return name + ", " +price;
    }
}
