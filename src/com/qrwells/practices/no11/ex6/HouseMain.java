/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex6;

public class HouseMain {
    public static void main(String[] args) {
        var house = new House();
        IName jack = new Human("Jack");
        IName tom = new Human("Tom");
        IName dog = new Pet("dog");

        house.add(jack);
        house.add(tom);
        house.add(dog);

        System.out.println("List:");
        System.out.print(house.getInformation());

        house.remove(tom);
        System.out.println("List:");
        System.out.print(house.getInformation());

        IName jack2 = new Human("Jack2");
        IName jack3 = new Human("Jack3");
        IName jack4 = new Human("Jack4");
        IName jack5 = new Human("Jack5");//Size 21

        house.add(jack2);
        house.add(jack3);
        house.add(jack4);
        System.out.println("List:");
        System.out.println(house.getInformation());
        house.add(jack5);//Throw
    }
}
