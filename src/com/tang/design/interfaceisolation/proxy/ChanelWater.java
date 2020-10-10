package com.tang.design.interfaceisolation.proxy;

/**
 * @Classname ChanelPerfume
 * @Description [ 香奈儿提供商：真实对象 ]
 * @Author Tang
 * @Date 2020/9/6 22:57
 * @Created by ASUS
 */
public class ChanelWater implements WaterInterface{
    @Override
    public void sellWater() {
        System.out.println("此水由农夫山泉提供售卖....");
    }
}