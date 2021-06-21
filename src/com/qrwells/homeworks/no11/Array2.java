/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[][] vs = new int[][]{
                {62, 90, 75},
                {100, 0, 50},
                {30, 40}
        };
        int[] flatVs = Arrays.stream(vs)
                .flatMapToInt(Arrays::stream)
                .toArray();
        int sum = 0;
        for (int v : flatVs) {
            sum += v;
        }
        System.out.println(sum);
        System.out.println((double) sum / flatVs.length);
        Arrays.stream(flatVs).min().ifPresent(System.out::println);
        Arrays.stream(flatVs).max().ifPresent(System.out::println);
    }
}
