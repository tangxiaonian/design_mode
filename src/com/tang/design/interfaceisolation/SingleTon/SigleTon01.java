package com.tang.design.interfaceisolation.SingleTon;

/**
 * @Classname SigleTon01
 * @Description [ 饿汉式 ]
 * @Author Tang
 * @Date 2019/9/28 14:48
 * @Created by ASUS
 */
public class SigleTon01 {

    public static void main(String[] args) {
        System.out.println( Single.INSTANCE  == Single.INSTANCE);
    }

}

enum Single{

    INSTANCE;

    public void method() {

    }

}