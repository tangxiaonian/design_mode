package com.tang.design.interfaceisolation.bridge;

/**
 * @Classname Vivo
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/11 14:58
 * @Created by ASUS
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println( "XiaoMi 开机" );
    }

    @Override
    public void close() {
        System.out.println( "XiaoMi 关机" );
    }

    @Override
    public void call() {
        System.out.println( "XiaoMi 打电话" );
    }
}