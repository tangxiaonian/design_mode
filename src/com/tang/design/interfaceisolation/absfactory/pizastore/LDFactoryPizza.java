package com.tang.design.interfaceisolation.absfactory.pizastore;

/**
 * @Classname LDFactoryPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 18:37
 * @Created by ASUS
 */
public class LDFactoryPizza implements AbsFactory {

    private Pizza pizza = null;

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("chain")) {

            pizza = new ChainPizza();
            pizza.setName("LD chain");

        } else if (type.equals("cheese")) {

            pizza = new CheesePizza();
            pizza.setName("LD cheese");

        } else {
            pizza = null;
        }

        return pizza;
    }
}