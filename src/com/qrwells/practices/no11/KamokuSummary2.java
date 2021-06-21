/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11;

import java.util.HashMap;

public class KamokuSummary2 {
    public static void main(String[] args) {
        var map = new HashMap<>() {{
            put("田中", 80);
            put("佐藤", 100);
            put("山本", 90);
            put("渡辺", 75);
            put("高橋", 90);
        }};
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + " -> " + entry.getValue().toString());
        }
        System.out.println("合計: " + map.values().stream().mapToInt(o -> (int) o).sum());
        System.out.println("平均: ");
        map.values().stream().mapToDouble(o -> (double) (int) o).average().ifPresent(System.out::println);
    }
}
