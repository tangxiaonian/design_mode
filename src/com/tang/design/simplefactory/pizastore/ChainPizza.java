package com.tang.design.interfaceisolation.simplefactory.pizastore;
/**
 * @Classname GreekPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 15:41
 * @Created by ASUS
 */
public class ChainPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println( "ChainPizza prepare...." );
    }
}