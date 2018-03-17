package main.java.bean.FactoryPattern.SimpleFactory;

import main.java.bean.FactoryPattern.Pizza;

/**
 * Created by Yang on 2017/11/28.
 */
public class clamPizza extends Pizza {
    public void prepare() {
        System.out.println("prepare clamPizza");
    }
}
