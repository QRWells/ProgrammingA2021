/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class UniversityTest {
    public static void main(String[] args) {
        University waseda = new University();
        waseda.students = new Student[] {
                new Student("田中", 100),
                new Student("山本", 50),
                new Student("森", 68),
        };
        waseda.list();
    }
}
