/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var list = new ArrayList<Integer>();

        while (true) {
            System.out.print(">");
            var s = sc.next();
            if (s.equals("end")) break;
            switch (s) {
                case "add" -> list.add(sc.nextInt());
                case "remove" -> list.remove((Integer) sc.nextInt());
                case "list" -> {
                    list.forEach(integer -> System.out.print(integer + ","));
                    System.out.println();
                }
                case "sum" -> System.out.println(list.stream().mapToInt(i -> i).sum());
                case "mean" -> list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);
                case "sort" -> list.sort(Comparator.naturalOrder());
            }
        }

        sc.close();
    }
}
