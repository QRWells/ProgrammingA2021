/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no8.animal;

public class Cat extends Animal {
    private Cat() {

    }

    public static Cat getInstance() {
        return new Cat();
    }

    @Override
    public String say() {
        return "ニャー";
    }
}
