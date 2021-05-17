/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.No6;

public class BikeFactory extends Factory {
    public BikeFactory() {
        super("自転車工場");
    }

    @Override
    public String produce() {
        return "自転車";
    }
}
