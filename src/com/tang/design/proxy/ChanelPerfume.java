package com.tang.design.interfaceisolation.proxy;

/**
 * @Classname ChanelPerfume
 * @Description [ 香奈儿提供商：真实对象 ]
 * @Author Tang
 * @Date 2020/9/6 22:57
 * @Created by ASUS
 */
public class ChanelPerfume implements PerFumeInterface{
    @Override
    public void sellPerfume() {
        System.out.println("此香水由香奈儿提供售卖....");
    }
}