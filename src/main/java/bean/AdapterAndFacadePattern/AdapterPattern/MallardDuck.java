package main.java.bean.AdapterAndFacadePattern.AdapterPattern;

/**
 * Created by Yang on 2018/3/9.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
