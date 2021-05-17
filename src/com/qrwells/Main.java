/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Invoke main function of different classes
        Animal h = new Human();
        IRunnable s = new Human();
        for (var v : h.viscera) System.out.println(v);
        s.run();
    }

    public interface IRunnable {
        void run();
    }

    public static abstract class Animal {
        ArrayList<String> viscera;
    }

    public static class Human extends Animal implements IRunnable {
        public Human() {
            viscera.add("lung");
            viscera.add("heart");
            viscera.add("etc.");
        }

        @Override
        public void run() {
            System.out.println("两条腿跑");
        }
    }
}
