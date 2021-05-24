/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No7;

import java.util.ArrayList;

public class Paragraph extends Element {
    private static int counter = 1;
    private final int number;
    private final ArrayList<Element> elements = new ArrayList<>();

    public Paragraph() {
        number = counter++;
    }

    @Override
    public void print() {
        System.out.println("<p" + number + ">");
        for (Element e : elements) {
            if (e != null) e.print();
        }
        System.out.println("</p" + number + ">");
    }

    @Override
    public void add(Element e) {
        if (elements.size() < 10) {
            elements.add(e);
        } else
            throw new IndexOutOfBoundsException();
    }
}
