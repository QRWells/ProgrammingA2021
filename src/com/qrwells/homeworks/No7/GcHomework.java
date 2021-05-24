package com.qrwells.homeworks.No7;

class Person {
    String name = null;
    Person friend = null;

    Person(String s) {
        name = s;
    }

    void setFriend(Person p) {
        friend = p;
    }
}

public class GcHomework {

    public static void main(String[] args) {
        Person p1 = new Person("P1");
        Person p2 = new Person("P2");
        Person p3 = new Person("P3");
        p1.setFriend(p2);
        p2.setFriend(p3);
        p3.setFriend(p1);
        p1 = null;
        p2 = null;
        //p3 = null;
        System.gc();
    }

}
