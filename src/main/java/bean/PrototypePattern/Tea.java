package main.java.bean.PrototypePattern;

/**
 * Created by Yang on 2018/3/13.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
