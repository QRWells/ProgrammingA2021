/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no6;

public class Line extends Figure {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public String draw() {
        return "(" + start.draw() + "," + end.draw() + ")";
    }

    @Override
    public void move(int mx, int my) {
        start.move(mx, my);
        end.move(mx, my);
    }
}
