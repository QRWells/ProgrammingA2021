/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

class ForStatement {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i + ":"); //改行なし文字列表示
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
