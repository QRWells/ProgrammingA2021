/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No9;

public class Person {

    final private Address address;

    public Person(String s) {
        address = new Address(s);
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return "Living in " + address.getText();
    }
}
