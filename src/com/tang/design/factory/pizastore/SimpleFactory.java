package com.tang.design.interfaceisolation.factory.pizastore;

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
public class SimpleFactory {

    private static Pizza pizza = null;

    public static Pizza createPizza() {

        try {
                String type = getType();

                if (type.equals("chain")) {

                    pizza = new ChainPizza();
                    pizza.setName("chain");

                } else if (type.equals("cheese")) {

                    pizza = new CheesePizza();
                    pizza.setName("cheese");

                } else if (type.equals("greek")) {

                    pizza = new GreekPizza();
                    pizza.setName("greek");
                }else {
                    pizza = null;
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizza;
    }

    private static String getType() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String type = bufferedReader.readLine();

        return type;

    }

}