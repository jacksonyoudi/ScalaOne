package org.jackson.chapter07.overwrite;


/**
 * 成员变量不能覆写
 * 对于同一个对象，使用父类的引用，就是父类， 使用子类，就是子类
 * <p>
 * 将一个子类的对象地址交给父类的变量
 * java的动态绑定机制
 * 如果调用是方法，则jvm就会将该方法和对象的内存地址绑定
 * 如果调用是属性，则没有动态绑定，在哪里调用，就返回对应值
 */
public class JavaFileOver {
    public static void main(String[] args) {
        Sub c1 = new Sub();
        System.out.println(c1.s);
        System.out.println(((Super) c1).s);

        Super c2 = new Super();
        System.out.println(c2.s);

    }
}

class Super {
    String s = "super";
}

class Sub extends Super {
    String s = "subb";
}