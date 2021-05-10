/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class Student {
    private final String name;
    private final int credit;

    public Student(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public boolean isOK()
    {
        return credit >= 100;
    }
}
