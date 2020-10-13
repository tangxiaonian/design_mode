package com.tang.design.interfaceisolation.problem;

/**
 * @Classname B
 * @Description [ 通过Interface1 会依赖D 但用到接口里面的 1,4,5方法 ]
 * @Author Tang
 * @Date 2019/9/26 18:41
 * @Created by ASUS
 */
public class B {

    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation4(Interface1 interface1) {
        interface1.operation4();
    }

    public void operation5(Interface1 interface1) {
        interface1.operation5();
    }

}