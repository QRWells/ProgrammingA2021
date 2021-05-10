/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class Container2 {

    private final int[] values;

    Container2(int[] temp) {
        values = temp;
    }

    void printArray() {
        StringBuilder sb = new StringBuilder();
        for (int i : values) {
            sb.append(i);
            sb.append(", ");
        }
        int l = sb.length();
        sb.delete(l - 2, l);//delete the last comma(,) and space
        System.out.println(sb);
    }

    int search(int k) {
        for (int i = 0; i < values.length; ++i) {
            if (values[i] == k)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {
                100, 10, 1000, 50, 10000, 999, 5
        };
        int key = 10000;

        Container2 c = new Container2(array);
        c.printArray();
        System.out.println(key + " at " + c.search(key));
    }
}
