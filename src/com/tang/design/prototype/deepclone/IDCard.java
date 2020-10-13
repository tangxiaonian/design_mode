package com.tang.design.interfaceisolation.prototype.deepclone;

import java.io.Serializable;

/**
 * @Classname IDCard
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 15:05
 * @Created by ASUS
 */
public class IDCard implements Cloneable, Serializable {

    private String id;

    private String address;

    public IDCard(String id, String address) {
        this.id = id;
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}