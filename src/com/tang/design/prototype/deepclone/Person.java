package com.tang.design.interfaceisolation.prototype.deepclone;

import java.io.*;

/**
 * @Classname Person
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 15:04
 * @Created by ASUS
 */
public class Person implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private IDCard idCard;

    public Person(String name, Integer age,IDCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }
// 深拷贝方法一
    @Override
    protected Object clone() {

        Person person = null;

        try {

            person = (Person)super.clone();

//          创建新的引用
            IDCard newIdCard = (IDCard)person.getIdCard().clone();

            person.setIdCard(newIdCard);

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
        return person;
    }

    /**
     * @MethodName deepMethod
     * @Description [ 深拷贝方法2  利用序列化和反序列化 ]
     * @Date 2019/10/9 15:51
     * @Param []
     * @return
     **/
    public Person deepMethod(){

        Person person = null;

        try {

//        把对象写到 字节数组流中
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
//          序列化对象
            oos.writeObject(this);

//      从字节数组中重新读取对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

//          反序列化对象
            person = (Person)ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard=" + idCard +
                '}';
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
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
}