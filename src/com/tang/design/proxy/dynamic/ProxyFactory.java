package com.tang.design.interfaceisolation.proxy.dynamic;

import com.tang.design.interfaceisolation.proxy.ChanelPerfume;
import com.tang.design.interfaceisolation.proxy.PerFumeInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname ProxyFactory
 * @Description [ 代理工厂 ]
 * @Author Tang
 * @Date 2020/9/6 23:02
 * @Created by ASUS
 */
public class ProxyFactory implements InvocationHandler {

    // 真实对象
    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( "前置增强...." );
        Object result = method.invoke(this.object, args);
        System.out.println( "后置增强...." );
        return result;
    }
}