package com.tang.design.interfaceisolation.adapter;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/10 18:14
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        Phone phone = new Phone( new AdapterVoltage() );

        phone.charging();

    }

}