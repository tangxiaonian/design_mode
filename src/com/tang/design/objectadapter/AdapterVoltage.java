package com.tang.design.interfaceisolation.objectadapter;

/**
 * @Classname Voltage5V
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/10 18:04
 * @Created by ASUS
 */
public class AdapterVoltage implements Voltage5V {

    private Voltage200V voltage200V = null;

    public AdapterVoltage(Voltage200V voltage200V) {
        this.voltage200V = voltage200V;
    }

    @Override
    public Integer adapterMethod() {

        int v = this.voltage200V.charging200V();

        int src = v / 40;

        System.out.println("充电适配成5V.... ");

        return src;

    }
}