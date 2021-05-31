package com.qrwells.practices.No7;

import java.net.http.HttpClient;

class X {
    String info = null;
    X x = null;

    X(String s) {
        info = s;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("X"+ (info == null ? "" : info));
        super.finalize();
    }
}

class Y extends X {
    static Y last = null;

    Y(String s, X newXX) {
        super(s);
        x = newXX;
        last = this;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Y"+ (info == null ? "" : info));
        super.finalize();
    }
}

public class GcQuiz2 {
    static X x = new X("あ");
    Y y = new Y("い", x);

    public static void main(String[] args) throws InterruptedException {
        X[] a = new X[3];
        a[0] = new X("う");
        a[1] = new Y("え", a[0]);
        a[2] = new Y("お", new X("か"));
        if (new X("1き") == new X("2き")) {
            a[2] = new X("く");
        } else {
            a[2] = a[1];
        }
        if (new Y("け", x) instanceof X) {
            a[0] = new X("こ");
        }
        a[1] = null;
        System.gc();
        // ※この時点
        Thread.sleep(2000);
    }
}
