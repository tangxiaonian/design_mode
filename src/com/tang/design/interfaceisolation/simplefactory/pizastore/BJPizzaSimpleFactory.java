package com.tang.design.interfaceisolation.simplefactory.pizastore;

import java.io.IOException;

/**
 * @Classname BJPizzaSimpleFactory
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 16:08
 * @Created by ASUS
 */
public class BJPizzaSimpleFactory extends SimpleFactory {

    private static Pizza pizza = null;

    @Override
    public Pizza createPizza() {

        try {
            String type = this.getType();

            if (type.equals("chain")) {

                pizza = new ChainPizza();
                pizza.setName("BJ chain");

            } else if (type.equals("cheese")) {

                pizza = new CheesePizza();
                pizza.setName("BJ cheese");

            } else if (type.equals("greek")) {

                pizza = new GreekPizza();
                pizza.setName("BJ greek");
            }else {
                pizza = null;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizza;
    }
}