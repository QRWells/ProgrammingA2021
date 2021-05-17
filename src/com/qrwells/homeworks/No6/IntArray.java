/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No6;

public class IntArray implements Countable {
    private final int[] content;

    public IntArray(int[] ints) {
        content = ints == null ? new int[0] : ints;
    }

    @Override
    public int count() {
        return content.length;
    }
}
