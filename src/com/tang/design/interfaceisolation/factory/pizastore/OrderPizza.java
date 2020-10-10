package com.tang.design.interfaceisolation.factory.pizastore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Classname OrderPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 15:43
 * @Created by ASUS
 */
public class OrderPizza {

    private String type = "";
    private Pizza pizza = null;

    public OrderPizza() {

        while (true) {

            pizza = SimpleFactory.createPizza();

            if (pizza == null) {
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();
        }

//        try {
//
//            while (true) {
//
//                this.type = this.getType();
//
//                if (type.equals("chain")) {
//
//                    pizza = new ChainPizza();
//                    pizza.setName("chain");
//
//                } else if (type.equals("cheese")) {
//
//                    pizza = new CheesePizza();
//                    pizza.setName("cheese");
//
//                } else if (type.equals("greek")) {
//
//                    pizza = new GreekPizza();
//                    pizza.setName("greek");
//
//                }else {
//                    break;
//                }
//
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.bake();
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}