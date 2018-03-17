package main.java.bean.FactoryPattern;

import java.util.ArrayList;

/**
 * Created by Yang on 2017/11/28.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    ArrayList toppings = new ArrayList();

    PizzaIngredientFactory ingredientFactory;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void  prepare();

    public void bake() {
        System.out.println("pizza is bake");
    }

    public void cut() {
        System.out.println("pizza is cut");
    }

    public void box() {
        System.out.println("pizza is box");
    }

}
