/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex9.other;

import com.qrwells.practices.no11.ex9.Test;

public class OtherSubTest extends Test {
    public void get() {
        System.out.println("public int from subclass in different package:" + getPublicI());
        System.out.println("protected int from subclass in different package:" + getProtectedI());
    }
}
