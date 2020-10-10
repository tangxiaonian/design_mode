package com.tang.design.interfaceisolation.Builder;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 18:33
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector(new CommonHouse());

        House house = houseDirector.constractHouse();

    }

}