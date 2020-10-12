package com.tang.design.interfaceisolation.chain;

/**
 * @Classname PMHandler
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2020/10/12 14:29
 * @Created by ASUS
 */
public class BossHandler extends AbstractHandler{

    private int leaverDay;

    public BossHandler(int leaverDay) {
        this.leaverDay = leaverDay;
    }

    @Override
    protected String handler() {
        return "Boss对你的请假进行了处理...";
    }

    @Override
    protected int getLeaverDay() {
        return this.leaverDay;
    }
}