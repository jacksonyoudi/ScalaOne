package org.jackson.chapter07.abstractclass;


/**
 * java中匿名子类
 */
public class JDemo {
    public static void main(String[] args) {
        H h = new H() {

            @Override
            public void cry() {
                System.out.println("hello");
            }
        };
        h.cry();
    }
}

abstract class H {
    abstract public void cry();
}
