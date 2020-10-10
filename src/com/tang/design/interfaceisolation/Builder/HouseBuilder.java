package com.tang.design.interfaceisolation.Builder;

/**
 * @Classname HouseBuilder
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 18:25
 * @Created by ASUS
 */
public abstract class HouseBuilder {

    public House house = new House();

    public abstract void buildBisic();

    public abstract void buildWalls();

    public abstract void roofed();
//    构建房子
    public abstract House build();
}