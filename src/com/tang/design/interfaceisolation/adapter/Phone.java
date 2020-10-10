package com.tang.design.interfaceisolation.adapter;

/**
 * @Classname Phone
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/10 18:03
 * @Created by ASUS
 */
public class Phone {

    private Voltage5V voltage5V;

    public Phone(Voltage5V voltage5V) {
        this.voltage5V = voltage5V;
    }

    /**
     * @MethodName Charging
     * @Description [ 充电 ]
     * @Date 2019/10/10 18:11
     * @Param []
     * @return
     **/
    public void charging() {

        Integer src = this.voltage5V.adapterMethod();

        if (src == 5) {
            System.out.println("5V 充电成功...");
        } else {
            System.out.println("充电失败...");
        }

    }

}