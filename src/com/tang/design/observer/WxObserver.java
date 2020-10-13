package com.tang.design.observer;

/**
 * @Classname WxObserver
 * @Description [ 具体的观察者 ]
 * @Author Tang
 * @Date 2020/10/13 10:03
 * @Created by ASUS
 */
public class WxObserver implements Observer{

    private String name;

    public WxObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println( this.name +"收到的消息为--->" + msg );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}