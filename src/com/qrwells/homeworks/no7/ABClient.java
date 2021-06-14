/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no7;

public class ABClient {
    public static void main(String[] args) {
        System.out.println(A.getCounter());
        System.out.println(new A().m());
        System.out.println(new B(new A()).m());
        System.out.println(new B(new B(new A())).m());
        System.out.println(A.getCounter());
    }
}
