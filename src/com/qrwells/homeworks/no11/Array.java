/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] values = new int[]{62, 90, 75};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println(sum);
        System.out.println((double) sum / values.length);
        Arrays.stream(values).min().ifPresent(System.out::println);
        Arrays.stream(values).max().ifPresent(System.out::println);
    }
}
