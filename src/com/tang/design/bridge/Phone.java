package com.tang.design.interfaceisolation.bridge;

/**
 * @Classname Phone
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 15:00
 * @Created by ASUS
 */
public abstract class Phone {

    public Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();
    public abstract void close();
    public abstract void call();

}