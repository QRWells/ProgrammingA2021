/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no8.city;

import com.qrwells.practices.no8.animal.Animal;
import com.qrwells.practices.no8.animal.Cat;
import com.qrwells.practices.no8.animal.Dog;

public class House {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = Cat.getInstance();
        // animals[3] = new Cat();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].say());
        }
    }
}
