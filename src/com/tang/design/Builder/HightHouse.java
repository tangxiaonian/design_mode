package com.tang.design.interfaceisolation.Builder;

/**
 * @Classname HightHouse
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 18:29
 * @Created by ASUS
 */
public class HightHouse extends HouseBuilder{

    @Override
    public void buildBisic() {
        System.out.println( "高楼构建地基..." );
    }

    @Override
    public void buildWalls() {
        System.out.println( "高楼构建墙..." );
    }

    @Override
    public void roofed() {
        System.out.println( "高楼构建屋顶..." );
    }

    @Override
    public House build() {
        return this.house;
    }
}