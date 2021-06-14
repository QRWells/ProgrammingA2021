/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no8;/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

public class Factorial {
    public static int factorial1(int n) {
        if (n < 2) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial2(int n) {
        return n > 1 ?
                n * factorial2(n - 1) : 1;
    }

    public static int factorial3(int n) {
        if (n < 2) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (result > Integer.MAX_VALUE/i)
                throw new RuntimeException();
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial1(0));
        System.out.println(factorial2(0));
        System.out.println(factorial1(10));
        System.out.println(factorial2(10));
        System.out.println(factorial3(13));
    }
}
