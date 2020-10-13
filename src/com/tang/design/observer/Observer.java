package com.tang.design.observer;

/**
 * @Classname Observer
 * @Description [ 观察者 ]
 * @Author Tang
 * @Date 2020/10/13 9:56
 * @Created by ASUS
 */
public interface Observer {
    // 观察者更新操作
    void update(String msg);
}
