/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11;

public class StringMain2 {
    String text = "helloworld";

    public static void main(String[] args) {
        var sm2 = new StringMain2();
        sm2.sort();
    }

    void sort() {
        var chs = text.toCharArray();
        for (int x = 0; x < chs.length - 1; x++) {
            for (int y = 0; y < chs.length - 1 - x; y++) {
                if (chs[y] > chs[y + 1]) {
                    char ch = chs[y];
                    chs[y] = chs[y + 1];
                    chs[y + 1] = ch;
                }
            }
        }
        System.out.println(chs);
    }
}
