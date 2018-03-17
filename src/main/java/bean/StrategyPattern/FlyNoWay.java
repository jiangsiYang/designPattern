package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm can't fly");
    }
}
