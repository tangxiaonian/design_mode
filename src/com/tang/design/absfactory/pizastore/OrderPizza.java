package com.tang.design.interfaceisolation.absfactory.pizastore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Classname OrderPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 18:38
 * @Created by ASUS
 */
public class OrderPizza {

    private AbsFactory absFactory = null;

    private Pizza pizza = null;

    public OrderPizza(AbsFactory absFactory) {

        this.absFactory = absFactory;

        while (true) {

            try {

                String type = this.getType();

                pizza = absFactory.createPizza(type);

                if (pizza == null) {
                    break;
                }

                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getType() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String type = bufferedReader.readLine();

        return type;

    }

}