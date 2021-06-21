/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex5;

public class Animal {
    public String say() {
        return "I'm an animal";
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal human = new Human();
        Animal dog = new Dog();

        System.out.println(a.say());
        System.out.println(human.say());
        System.out.println(dog.say());
    }
}

