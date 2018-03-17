package main.java.service;

import main.java.bean.FactoryPattern.ChicagoStylePizzaStore;
import main.java.bean.FactoryPattern.NYStylePizzaStore;
import main.java.bean.FactoryPattern.Pizza;
import main.java.bean.FactoryPattern.PizzaStore;

/**
 * Created by Yang on 2017/11/28.
 * 工厂模式/抽象工厂
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();   //想吃纽约风味的
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("大熊订了个" + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoStylePizzaStore(); //想吃芝加哥风味的
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("光头强订了个" + pizza.getName() + "\n");
    }
}
