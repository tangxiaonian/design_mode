package com.tang.design.interfaceisolation.bridge;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 15:06
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        Phone phone = new FlodedPhone(new Vivo());

        phone.open();
        phone.call();
        phone.close();

    }

}