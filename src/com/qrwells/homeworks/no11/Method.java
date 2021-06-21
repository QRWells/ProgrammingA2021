/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

public class Method {
    public static void main(String[] args) {
        System.out.println(getPower(2, 8));
    }

    public static int getPower(int base, int exponent) {
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power = power * base;
        }
        return power;
    }
}
