/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

class ParkTest {

    public static class Park{
        private static String common;
        private String name;

        public Park()
        {
        }

        public static void setCommon(String common) {
            Park.common = common;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void print()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Park.setCommon("公園");
        Park p1 = new Park();
        Park p2 = new Park();
        p1.setName("上野");
        p2.setName("戸山");
        p1.print();
        p2.print();
        Park.setCommon("Park");
        p1.print();
        p2.print();
    }
}
