package org.jackson.chapter07.staticpkg;

public class Sdemo {
    public static void main(String[] args) {
        C c = new C();
        C c2 = new C();
        C.getTot();
    }
}


class C {
    private static int tot = 0;

    public C() {
        tot++;
    }

    public static void getTot() {
        System.out.println(tot);
    }
}