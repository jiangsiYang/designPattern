package main.java.bean.FactoryPattern;

/**
 * Created by Yang on 2017/11/28.
 */
public class NYStyleCheesePizza extends Pizza {


    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
