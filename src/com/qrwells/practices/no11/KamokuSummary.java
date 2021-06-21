/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package com.qrwells.practices.no11;

import java.util.ArrayList;
import java.util.Arrays;

public class KamokuSummary {
    public static void main(String[] args) {
        var grades = new ArrayList<>(Arrays.asList(80, 100, 90, 75, 90));
        for (var i : grades) {
            System.out.println(i);
        }
        System.out.println("合計: " + grades.stream().mapToInt(i -> i).sum());
        System.out.print("平均: ");
        grades.stream().mapToDouble(value -> (double) value).average().ifPresent(System.out::println);
    }
}
