package com.tang.design.interfaceisolation.absfactory.pizastore;

/**
 * @Classname BJFactoryJPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 18:36
 * @Created by ASUS
 */
public class BJFactoryJPizza implements AbsFactory {

    private Pizza pizza = null;

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("chain")) {

            pizza = new ChainPizza();
            pizza.setName("BJ chain");

        } else if (type.equals("cheese")) {

            pizza = new CheesePizza();
            pizza.setName("BJ cheese");

        } else {
            pizza = null;
        }

        return pizza;
    }
}