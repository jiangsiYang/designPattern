package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
