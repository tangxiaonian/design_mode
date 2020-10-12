package com.tang.design.interfaceisolation.chain;

/**
 * @Classname PMHandler
 * @Description [ 项目经理 ]
 * @Author Tang
 * @Date 2020/10/12 14:29
 * @Created by ASUS
 */
public class PMHandler extends AbstractHandler{

    private int leaverDay;

    public PMHandler(int leaverDay) {
        this.leaverDay = leaverDay;
    }

    @Override
    protected String handler() {
        return "项目经理对你的请假进行了处理...";
    }

    @Override
    protected int getLeaverDay() {
        return this.leaverDay;
    }
}