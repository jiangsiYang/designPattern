package main.java.bean.FactoryPattern.SimpleFactory;

import main.java.bean.FactoryPattern.Pizza;

/**
 * Created by Yang on 2017/11/28.
 * 简单工厂
 * 并不是一个设计模式，而是一种编程习惯,它只是把创建不同披萨类型的代码统一封装到一个简单工厂类中，如果需要更改这里面的逻辑，只需要去简单工厂类中修改即可，
 * 不需要影响到这里
 */
public abstract class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
