package com.tang.design.interfaceisolation.simplefactory.pizastore.method2;

import com.tang.design.interfaceisolation.simplefactory.pizastore.*;

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
public abstract class OrderPizza {

    private String type = "";
    private Pizza pizza = null;

    public abstract Pizza createPizza(String type);

    public OrderPizza() {

        try {

            while (true) {

                this.type = this.getType();
//              调用 实例化子类的方法
                this.pizza = createPizza(this.type);

                if (this.pizza == null) {
                    break;
                }

                this.pizza.prepare();
                this.pizza.bake();
                this.pizza.cut();
                this.pizza.bake();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private String getType() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String type = bufferedReader.readLine();

        return type;

    }
}