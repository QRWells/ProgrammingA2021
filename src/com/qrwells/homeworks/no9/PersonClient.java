/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no9;

public class PersonClient {

    public static void main(String[] args) {
        Person p = new Person("Tokyo");
        System.out.println(p);

      /*
       This is code for Q.2-1

       int i = p.getAddress().getText().length();
       p.getAddress().getText().replace(0,i,"Paris");
      */

        System.out.println(p);
    }

}
