package main.java.bean.FactoryPattern;

/**
 * Created by Yang on 2017/11/28.
 * 纽约风格风味的披萨工厂
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        //纽约风味的工厂当然是用纽约风味的原理啦
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza  = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("纽约风味芝士披萨");
        }else if(type.equals("clam")){
            pizza  = new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza  = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
