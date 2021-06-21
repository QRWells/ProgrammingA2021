/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no7;

public class TagMain {
    public static void main(String[] args) {
        Element p1 = new Paragraph();
        Element p2 = new Paragraph();
        Element t1 = new Text("aabbcc");
        Element t2 = new Text("XYZ");
        Element t3 = new Text("10000");
        try {
            p1.add(t1);
            p1.add(t2);
            p2.add(t3);
            p1.add(p2);
            while (true) {
                p1.add(new Paragraph());
            }
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        p1.print();
    }
}
