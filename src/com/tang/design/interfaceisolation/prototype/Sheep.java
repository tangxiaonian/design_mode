package com.tang.design.interfaceisolation.prototype;

/**
 * @Classname Sheep
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 14:21
 * @Created by ASUS
 */
public class Sheep implements Cloneable{

    private String name;
    private Integer age;
    private String color;

    public Sheep friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}