package com.tang.design.interfaceisolation.simplefactory.pizastore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Classname SimpleFactory
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 15:53
 * @Created by ASUS
 */
public abstract class SimpleFactory {

    public abstract Pizza createPizza();

    public String getType() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String type = bufferedReader.readLine();

        return type;

    }

}