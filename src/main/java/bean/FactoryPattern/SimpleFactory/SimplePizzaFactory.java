package main.java.bean.FactoryPattern.SimpleFactory;

import main.java.bean.FactoryPattern.NYStyleCheesePizza;
import main.java.bean.FactoryPattern.Pizza;

/**
 * Created by Yang on 2018/3/3.
 * 用一个简单工厂封装创建披萨的代码
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new clamPizza();
        }
        return pizza;
    }
}
