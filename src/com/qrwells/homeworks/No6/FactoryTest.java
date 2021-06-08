/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No6;

class FactoryTest {
    public static void main(String[] args) {
        Factory[] factories = new Factory[]{
                new BikeFactory(),
                new CarFactory(),
                new CarFactory()
        };
        for (Factory factory : factories) {
            System.out.println(factory.name + "の" + factory.produce());
        }
    }
}
