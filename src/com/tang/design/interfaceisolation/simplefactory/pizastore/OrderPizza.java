package com.tang.design.interfaceisolation.simplefactory.pizastore;

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
    private SimpleFactory simpleFactory = null;

    public OrderPizza(SimpleFactory simpleFactory) {

        this.simpleFactory = simpleFactory;

        while (true) {

            pizza = simpleFactory.createPizza();

            if (pizza == null) {
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();
        }
    }

}