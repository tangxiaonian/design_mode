package com.tang.design.interfaceisolation.proxy;

/**
 * @Classname XiaoHongProxy
 * @Description [ 小红代理对象 ]
 * @Author Tang
 * @Date 2020/9/6 22:58
 * @Created by ASUS
 */
public class XiaoHongProxy  implements PerFumeInterface{

    private ChanelPerfume chanelPerfume;

    public XiaoHongProxy(ChanelPerfume chanelPerfume) {
        this.chanelPerfume = chanelPerfume;
    }

    @Override
    public void sellPerfume() {
        // 1.前置增强
        chanelPerfume.sellPerfume();
        // 2.后置增强
    }
}