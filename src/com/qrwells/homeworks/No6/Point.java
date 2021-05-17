/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No6;

public class Point extends Figure {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String draw() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void move(int mx, int my) {
        x += mx;
        y += my;
    }
}
