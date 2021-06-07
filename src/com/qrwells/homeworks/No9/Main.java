package com.qrwells.homeworks.No9;
/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

public class Main {
    public static void main(String[] args) {
        Host host = new Host();
        Data data1 = host.request(10);
        Data data2 = host.request(20);
        Data data3 = host.request(30);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(data1.getContent());
        System.out.println(data2.getContent());
        System.out.println(data3.getContent());
    }
}

