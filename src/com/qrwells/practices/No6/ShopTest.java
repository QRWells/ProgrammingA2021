/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No6;

class ShopTest {
    public static void main(String[] args) {
        Shop[] mall = new Shop[] {
                new FlowerShop(),
                new Bakery(),
                new FlowerShop()
        };
        for (Shop shop : mall) {
            System.out.println(shop.name + "の" + shop.sell());
        }
    }
}
