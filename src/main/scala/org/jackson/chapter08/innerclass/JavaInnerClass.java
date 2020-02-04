package org.jackson.chapter08.innerclass;


/**
 * 内部类
 * 1. 内部直接使用私有属性
 * 2. 延时加载，单例
 */
public class JavaInnerClass {
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass();
        OuterClass out2 = new OuterClass();
        OuterClass.InnerClass innerClass = out1.new InnerClass();
        OuterClass.InnerClass innerClass1 = out2.new InnerClass();
        innerClass.test(innerClass1);
        innerClass.test(innerClass);

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

    }
}


class OuterClass {
    class InnerClass {
        public void test(InnerClass ic) {
            System.out.println(ic);
        }

    }

    static class StaticInnerClass { // 静态内部类

    }
}