package com.tang.design.interfaceisolation.SingleTon;

/**
 * @Classname SigleTon01
 * @Description [ 饿汉式 ]
 * @Author Tang
 * @Date 2019/9/28 14:48
 * @Created by ASUS
 */
public class SingleTon {

    public static void main(String[] args) {
        SingleTon instance = getInstance();
        SingleTon instance01 = getInstance();

        System.out.println( instance == instance );

        System.out.println( "hashcode = " + instance.hashCode() );
        System.out.println( "hashcode = " + instance01.hashCode() );
    }

    private SingleTon() { }

    private static class SingleToneInstance {
        private final static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingleToneInstance.instance;
    }

}