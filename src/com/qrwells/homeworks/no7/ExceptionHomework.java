/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no7;

public class ExceptionHomework {

    static int number(String s) throws OriginalException {
        try {
            System.out.println("try");
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("catch");
            throw new OriginalException();
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(number("10"));
            System.out.println(number("XXXXXXXXX"));
        } catch (OriginalException e) {
            System.out.println(e.getMessage());
        }
    }

}
