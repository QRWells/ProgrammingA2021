/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no7;

public class Text extends Element {
    private final String content;

    public Text(String s) {
        content = s;
    }

    @Override
    public void print() {
        System.out.println("<t>" + content + "</t>");
    }
}
