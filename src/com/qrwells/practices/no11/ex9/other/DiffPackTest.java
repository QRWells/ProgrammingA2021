/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex9.other;

import com.qrwells.practices.no11.ex9.Test;

public class DiffPackTest {
    public void get() {
        var t = new Test();
        System.out.println("get public int from different package:" + t.getPublicI());
    }
}
