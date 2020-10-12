package com.tang.design.interfaceisolation.chain;

import java.util.Objects;

/**
 * @Classname AbstractHandler
 * @Description [ 抽象处理 ]
 * @Author Tang
 * @Date 2020/10/12 14:25
 * @Created by ASUS
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    /***
     * @methodName handlerLeaver
     * @description [ 处理请假 ]
     **/
    public void handlerLeaver(int leaverDay) {
        // 请假的天数 <= 直接角色能审批的天数
        if (leaverDay <= getLeaverDay()) {
            // 请假成功的处理。
            System.out.println(handler());
        } else {
            if (Objects.nonNull(this.nextHandler)) {
                // 交给下一个流程
                this.nextHandler.handlerLeaver(leaverDay);
            } else {
                System.out.println("没人能批准你的假期...");
            }
        }
    }

    /**
     * 批准后的处理
     *
     * @return
     */
    protected abstract String handler();

    /**
     * 获取请假天数
     *
     * @return
     */
    protected abstract int getLeaverDay();

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}