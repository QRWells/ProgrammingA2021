/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No9;

public class RealData implements Data {
    private final String content;

    public RealData(int number) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < number; i++) {
            try {
                Thread.sleep(100);
                temp.append('a');
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("RealData has been made: " + temp);
        content = temp.toString();
    }

    public String getContent() {
        return content;
    }
}

