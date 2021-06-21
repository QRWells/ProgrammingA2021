/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex8;

import java.util.Random;

public class Child extends Thread {
    private final Account account;
    private final Random random = new Random();

    public Child(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            while (true) {
                final int b = account.getBalance();
                if (b > 0)
                    account.consume(random.nextInt(b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
