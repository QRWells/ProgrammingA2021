/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardInput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine(); // 文字列の読み込み
            float number = Float.parseFloat(line); // 浮動小数点数への変換
            System.out.println("入力された浮動小数点数: " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
