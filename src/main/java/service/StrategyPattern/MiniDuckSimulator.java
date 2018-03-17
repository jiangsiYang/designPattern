package main.java.service.StrategyPattern;

import main.java.bean.StrategyPattern.Duck;
import main.java.bean.StrategyPattern.FlyRocketPowered;
import main.java.bean.StrategyPattern.MallardDuck;
import main.java.bean.StrategyPattern.ModelDuck;

/**
 * Created by Yang on 2018/2/22.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();   //设计原则：针对接口编程，而不是针对实现编程
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();     //一开始，模型鸭不会飞
        modelDuck.setFlyBehavior(new FlyRocketPowered());   //改变模型鸭飞行的算法实现
        modelDuck.performFly();     //动态改变模型鸭的飞行行为
    }
}
