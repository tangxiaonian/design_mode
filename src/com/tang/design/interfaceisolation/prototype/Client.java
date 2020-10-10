package com.tang.design.interfaceisolation.prototype;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 14:23
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 12, "白色");

        sheep.friend = new Sheep("jack", 14,"黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();

        System.out.println("sheep1.friend.hashCode = " + sheep1.friend.hashCode() );
        System.out.println("sheep2.friend.hashCode = " + sheep2.friend.hashCode() );
        System.out.println( sheep3 );

    }

}