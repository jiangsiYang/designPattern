package main.java.bean.FactoryPattern;

/**
 * Created by Yang on 2017/11/29.
 * 本接口负责创建所有的原料
 * 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * 当你需要创建产品家族和想让制造的相关产品集合起来时，可以使用 抽象工厂模式
 * 抽象工厂使用对象组合：对象的创建被实现在工厂接口所暴露出来的方法中
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();
//    public Cheese createCheese(); 其它原料类似 省略了 。。
}
