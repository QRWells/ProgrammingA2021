/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no5;

public class Container {
    static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i);
            sb.append(", ");
        }
        int l = sb.length();
        sb.delete(l - 2, l);//delete the last comma(,) and space
        System.out.println(sb);
    }

    static int search(int[] a, int k) {
        for (int i = 0; i < a.length; ++i)
            if (a[i] == k)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {
                100, 10, 1000, 50, 10000, 999, 5
        };
        int key = 10000;
        printArray(array);
        System.out.println(key + " at " + search(array, key));
    }
}
