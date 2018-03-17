package main.java.bean.DecoratorPattern;

/**
 * Created by Yang on 2018/2/26.
 * 调料抽象类，继承饮料超类
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();    //调料装饰者必须重新实现getDescription()方法，区别于饮料子类
}
