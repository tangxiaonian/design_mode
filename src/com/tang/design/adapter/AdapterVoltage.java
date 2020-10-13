package com.tang.design.interfaceisolation.adapter;

/**
 * @Classname Voltage5V
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/10 18:04
 * @Created by ASUS
 */
public class AdapterVoltage extends Voltage200V implements Voltage5V {

    @Override
    public Integer adapterMethod() {

        int v = this.charging200V();

        int src = v / 40;

        System.out.println("充电适配成5V.... ");

        return src;

    }
}