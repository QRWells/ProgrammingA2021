/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No8;

public class DataClient {

    public static void main(String[] args) {
        Data d = new Data();
        d.setNumber(100);
        d.setText("NEW");
        System.out.println(d.getNumber());
        System.out.println(d.getText());
    }

}
