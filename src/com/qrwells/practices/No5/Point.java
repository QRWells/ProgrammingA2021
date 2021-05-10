/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point[] points = {
                new Point(100, 10),
                new Point(-5, 20),
                new Point(0, 0)};
        int x = 0;
        int y = 0;

        for (Point p : points) {
            System.out.println(p);
            x += p.x;
            y += p.y;
        }

        System.out.println("x座標値の合計 = " + x);
        System.out.println("y座標値の合計 = " + y);
    }
}
