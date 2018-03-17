package main.java.bean.FactoryPattern.SimpleFactory;

import main.java.bean.FactoryPattern.Pizza;
import main.java.bean.FactoryPattern.PizzaIngredientFactory;

/**
 * Created by Yang on 2017/11/28.
 */
public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("prepare cheesePizza");
    }
}
