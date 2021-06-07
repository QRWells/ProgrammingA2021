/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No8.Access;

class Access {
    public String name = null;

    private Access() {
        super();
    }

    public Access(String s) {
        this();
        name = s;
    }

    protected void dosome() {
    }
}
