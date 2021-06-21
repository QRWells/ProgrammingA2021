/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

public class IfStatement {
    public static void main(String[] args) {
        int x = 10;
        if (x >= 0 && x <= 100) {
            if (x >= 80) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        } else {
            System.out.println("エラー");
        }
    }
}
