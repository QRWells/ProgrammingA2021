/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No6;/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

public class FigureClient {
    public static void main(String[] args) {
        Figure[] figures = new Figure[2];
        figures[0] = new Point(0, 0);
        figures[1] = new Line(new Point(5, 8), new Point(10, 20));
        for (Figure figure : figures) {
            figure.move(100, 200);
            System.out.println(figure.draw());
        }
    }
}
