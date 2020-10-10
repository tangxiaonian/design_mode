package com.tang.design.interfaceisolation.proxy.dynamic;

import com.tang.design.interfaceisolation.proxy.ChanelPerfume;
import com.tang.design.interfaceisolation.proxy.ChanelWater;
import com.tang.design.interfaceisolation.proxy.PerFumeInterface;
import com.tang.design.interfaceisolation.proxy.WaterInterface;

import java.lang.reflect.Proxy;

/**
 * @Classname ProxyMain
 * @Description [ ProxyMain ]
 * @Author Tang
 * @Date 2020/9/6 23:02
 * @Created by ASUS
 */
public class ProxyMain {

    public static void main(String[] args) {
        // 目标对象
        ChanelPerfume chanelPerfume = new ChanelPerfume();

        // 目标对象的代理对象
        PerFumeInterface perFume = (PerFumeInterface)Proxy.newProxyInstance(
                ChanelPerfume.class.getClassLoader(),
                ChanelPerfume.class.getInterfaces(),
                new ProxyFactory(chanelPerfume)
        );
        perFume.sellPerfume();

        // 新增时需要添加：一个目标对象 + 目标对象所实现的接口
        ChanelWater chanelWater = new ChanelWater();
        WaterInterface newChanelWaterInstance = (WaterInterface)Proxy.newProxyInstance(
                ChanelWater.class.getClassLoader(),
                ChanelWater.class.getInterfaces(),
                new ProxyFactory(chanelWater)
        );
        newChanelWaterInstance.sellWater();
    }

}