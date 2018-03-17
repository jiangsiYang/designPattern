package main.java.bean.FactoryPattern;

/**
 * Created by Yang on 2017/11/28.
 * 工厂方法模式
 * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到了子类。
 * 体现了 依赖倒置原则（设计原则：要依赖抽象，不要依赖具体类）
 * 工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象
 */
public abstract class PizzaStore {   //类里只要有一个抽象方法 该类就必须为抽象的
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);  //抽象方法，让子类各自做决定如何制作披萨

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);  //这里不能对外部开放，只能内部调用，所以不能用public
}
