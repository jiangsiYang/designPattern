package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNoWay();  //一开始，模型鸭不会飞
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
