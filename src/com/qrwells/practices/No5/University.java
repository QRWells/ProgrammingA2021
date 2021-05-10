/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class University {
    public Student[] students;

    public void list()
    {
        for (Student s : students)
            System.out.println(s.getName() + "は卒業できる: " + s.isOK());
    }
}
