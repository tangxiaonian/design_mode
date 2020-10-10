package com.tang.design.interfaceisolation.Builder;

/**
 * @Classname HouseDirector
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 18:32
 * @Created by ASUS
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    /**
     * @MethodName constractHouse
     * @Description [ 指挥步骤并且构造一个房子 ]
     * @Date 2019/10/9 18:35
     * @Param []
     * @return
     **/
    public House constractHouse() {

        this.houseBuilder.buildBisic();

        this.houseBuilder.buildWalls();

        this.houseBuilder.roofed();

        return this.houseBuilder.build();
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}