package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
