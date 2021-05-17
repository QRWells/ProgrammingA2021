/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No6;

public class Label {
    private final String caption;
    public static String common;

    public Label(String caption) {
        this.caption = caption;
    }

    public void output()
    {
        System.out.println(common+": "+caption);
    }
}
