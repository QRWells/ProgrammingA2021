/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No7;

class ExceptionExam {

    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = 0;
            }
        } catch (Exception e) {
            System.out.println("例外：" + e.getClass().getName() + ":" + e.getMessage());
        }
        System.out.println("プログラムを終了します。");
    }

}
