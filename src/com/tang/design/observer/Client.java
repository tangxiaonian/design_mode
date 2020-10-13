package com.tang.design.observer;

/**
 * @Classname Client
 * @Description [ 观察者模式 ]
 * @Author Tang
 * @Date 2020/10/13 10:06
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {
        WxSubject subject = new WxSubject();
        WxObserver observer_1 = new WxObserver("微信用户1");
        WxObserver observer_2 = new WxObserver("微信用户2");
        // 订阅观察者
        subject.attach(observer_1);
        subject.attach(observer_2);
        // 发布主题消息
        subject.change("消息1");
    }

}