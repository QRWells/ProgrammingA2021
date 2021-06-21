/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no11;

public class SwitchStatement {
    public static void main(String[] args) {
        char answer = 'i';
        switch (answer) {
            case 'y':
                System.out.println("Yes");
                break;
            case 'n':
                System.out.println("No");
                break;
            default:
                System.out.println("エラー");
                break;
        }
    }
}
