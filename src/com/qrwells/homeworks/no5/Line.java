/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no5;

public class Line {

    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    private final double length;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        Line line1 = new Line(10.5, 20.1, 100.0, 50.0);
        Line line2 = new Line(-1.0, 0.0, 0.0, 1.0);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line2);
        System.out.println(line2.getLength());
    }

    @Override
    public String toString() {
        return "(" + x1 + "," + y1 +
                ")-(" + x2 + "," + y2 + ')';
    }

    public double getLength() {
        return length;
    }
}

