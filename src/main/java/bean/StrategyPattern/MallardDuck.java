package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {  //绿头鸭具体需要怎么飞，怎么叫都在这里定义
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
