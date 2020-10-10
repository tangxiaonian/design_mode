package com.tang.design.interfaceisolation.simplefactory.pizastore.method2;

import com.tang.design.interfaceisolation.simplefactory.pizastore.ChainPizza;
import com.tang.design.interfaceisolation.simplefactory.pizastore.CheesePizza;
import com.tang.design.interfaceisolation.simplefactory.pizastore.GreekPizza;
import com.tang.design.interfaceisolation.simplefactory.pizastore.Pizza;

/**
 * @Classname BJOrderPizza
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/10/8 16:23
 * @Created by ASUS
 */
public class BJOrderPizza extends OrderPizza {

    private Pizza pizza = null;

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("chain")) {

            pizza = new ChainPizza();
            pizza.setName("BJ chain");

        } else if (type.equals("cheese")) {

            pizza = new CheesePizza();
            pizza.setName("BJ cheese");

        } else if (type.equals("greek")) {

            pizza = new GreekPizza();
            pizza.setName("BJ greek");
        } else {
            pizza = null;
        }

        return pizza;
    }
}