package com.qrwells.practices.No6;

class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new Animal();
        Movable m2 = new Robot();
        m1.move();
        m2.move();
        m1.move();
    }
}
