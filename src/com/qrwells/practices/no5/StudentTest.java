/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no5;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("青木", 80);
        Student s2 = new Student("田中", 120);
        System.out.println(s1.getName() + "は卒業できる: " + s1.isOK());
        System.out.println(s2.getName() + "は卒業できる: " + s2.isOK());
    }
}
