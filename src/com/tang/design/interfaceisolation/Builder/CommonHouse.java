package com.tang.design.interfaceisolation.Builder;

/**
 * @Classname CommonHouse
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 18:27
 * @Created by ASUS
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBisic() {
        System.out.println( "普通房子构建地基..." );
    }

    @Override
    public void buildWalls() {
        System.out.println( "普通房子构建墙..." );
    }

    @Override
    public void roofed() {
        System.out.println( "普通房子构建屋顶..." );
    }

    @Override
    public House build() {
        return this.house;
    }
}