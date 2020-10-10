package com.tang.design.interfaceisolation.absfactory.pizastore;

/**
 * @Classname Pizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 15:39
 * @Created by ASUS
 */
public abstract class Pizza {

    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println( name + "烘烤。。。" );
    }

    public void cut() {
        System.out.println( name +  "切。。。" );
    }

    public void box() {
        System.out.println( name +  "打包。。。" );
    }

    public void setName(String name) {
        this.name = name;
    }
}