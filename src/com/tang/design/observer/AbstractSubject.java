package com.tang.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname AbstractSubject
 * @Description [ 抽象主题 ]
 * @Author Tang
 * @Date 2020/10/13 9:55
 * @Created by ASUS
 */
public class AbstractSubject {

    private List<Observer> observerList = new ArrayList<>(16);

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    protected void notifyAllObserver(String msg) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(msg);
        }
    }

}