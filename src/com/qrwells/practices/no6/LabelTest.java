/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no6;

class LabelTest {
    public static void main(String[] args) {
        Label.common = "図";
        Label l1 = new Label("チーズを好む皇帝ペンギン");
        Label l2 = new Label("人類補完計画達成率");
        l1.output();
        l2.output();
        Label.common = "表";
        l1.output();
        l2.output();
    }
}
