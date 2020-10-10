package com.tang.design.interfaceisolation.bridge;

/**
 * @Classname FlodedPhone
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 15:01
 * @Created by ASUS
 */
public class FlodedPhone extends Phone {

    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println( "折叠手机开机...." );
        this.brand.open();
    }

    @Override
    public void close() {
        System.out.println( "折叠手机关机...." );
        this.brand.close();
    }

    @Override
    public void call() {
        System.out.println( "折叠手机打电话...." );
        this.brand.call();
    }
}