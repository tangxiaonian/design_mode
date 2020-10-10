package com.tang.design.interfaceisolation.bridge;

/**
 * @Classname Vivo
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 14:58
 * @Created by ASUS
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println( "Vivo 开机" );
    }

    @Override
    public void close() {
        System.out.println( "Vivo 关机" );
    }

    @Override
    public void call() {
        System.out.println( "Vivo 打电话" );
    }
}