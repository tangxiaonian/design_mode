package com.tang.design.interfaceisolation.problem;

/**
 * @Classname A
 * @Description [ A 通过Interface1 会依赖C 但用到接口里面的 1,2,3方法 ]
 * @Author Tang
 * @Date 2019/9/26 18:41
 * @Created by ASUS
 */
public class A {

    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation2(Interface1 interface1) {
        interface1.operation2();
    }

    public void operation3(Interface1 interface1) {
        interface1.operation3();
    }


}