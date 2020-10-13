package com.tang.design.observer;

/**
 * @Classname WxSubject
 * @Description [ 具体的微信主题 ]
 * @Author Tang
 * @Date 2020/10/13 10:02
 * @Created by ASUS
 */
public class WxSubject extends AbstractSubject{

    public void change(String msg) {
        this.notifyAllObserver(msg);
    }

}