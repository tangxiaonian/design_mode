package com.tang.design.interfaceisolation.decorator;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 18:03
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        LongBlack longBlack = new LongBlack();

        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        Milk milk = new Milk(longBlack);

        System.out.println(milk.cost());
        System.out.println(milk.getDes());

    }

}