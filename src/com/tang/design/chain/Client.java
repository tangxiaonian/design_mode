package com.tang.design.interfaceisolation.chain;

/**
 * @Classname Cliet
 * @Description [ 责任链模式 ]
 * @Author Tang
 * @Date 2020/10/12 14:38
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        PMHandler pmHandler = new PMHandler(3);

        BossHandler bossHandler = new BossHandler(5);
        // 设置责任链
        pmHandler.setNextHandler(bossHandler);

        pmHandler.handlerLeaver(6);

    }

}