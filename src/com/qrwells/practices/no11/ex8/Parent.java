/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex8;

import java.util.Random;

public class Parent extends Thread {
    private final Account account;
    private final Random random = new Random();

    public Parent(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            while (true) {
                account.add(Math.abs(random.nextInt()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
