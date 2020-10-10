package com.tang.design.interfaceisolation.template;

/**
 * @Classname Client
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2020/10/10 14:13
 * @Created by ASUS
 */
public class Client {

    public static void main(String[] args) {

        AbstractDataParser abstractDataParser = new ExcelDataParser();

        abstractDataParser.doParser();

    }

}