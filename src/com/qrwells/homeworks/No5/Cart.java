/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No5;

public class Cart {

    private final Item[] items;
    private int current = 0;

    public Cart() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        if (items.length < 10) {
            items[current] = item;
            current++;
        }
    }

    public void info() {
        for (int i = 0; i < current; ++i) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(Item.getNumberOfInstances());
        Cart cart = new Cart();
        Item i1 = new Item("PC", 98000);
        Item i2 = new Item("Display", 40000);
        cart.addItem(i1);
        cart.addItem(i2);
        cart.info();
        System.out.println(Item.getNumberOfInstances());
    }
}
