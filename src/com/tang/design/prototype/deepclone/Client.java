package com.tang.design.interfaceisolation.prototype.deepclone;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/9 15:08
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        Person person = new Person("tang", 12,new IDCard("12345","北京"));

//        Person person1 = (Person)person.clone();
//        Person person2 = (Person)person.clone();

        Person person1 = person.deepMethod();

        Person person2 = person.deepMethod();

        System.out.println("person.idCard = " + person.getIdCard().hashCode() );
        System.out.println("person.idCard = " +  person1.getIdCard().hashCode() );
        System.out.println( person2 );

    }

}