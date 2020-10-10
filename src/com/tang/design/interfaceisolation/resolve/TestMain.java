package com.tang.design.interfaceisolation.resolve;

/**
 * @Classname TestMain
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/9/26 18:47
 * @Created by ASUS
 */
public class TestMain {

    public static void main(String[] args) {

        A a = new A();

        C c = new C();

        a.operation1(c);
        a.operation2(c);
        a.operation3(c);

        B b = new B();

        D d = new D();

        b.operation1(d);
        b.operation4(d);
        b.operation5(d);


    }

}