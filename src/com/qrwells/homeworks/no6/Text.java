/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no6;

public class Text implements Countable {
    private final String content;

    public Text(String s) {
        content = s == null ? "" : s;
    }

    @Override
    public int count() {
        return content.length();
    }
}
