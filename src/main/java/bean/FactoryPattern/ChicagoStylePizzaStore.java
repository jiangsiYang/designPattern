package main.java.bean.FactoryPattern;

/**
 * Created by Yang on 2017/11/28.
 * 芝加哥风格风味的披萨工厂
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza  = new ChicagoStyleCheesePizza(ingredientFactory);
        }else if(type.equals("clam")){
            pizza  = new ChicagoStyleClamPizza(ingredientFactory);
        }else if(type.equals("veggie")){
            pizza  = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
