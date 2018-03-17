package main.java.bean.StrategyPattern;

/**
 * Created by Yang on 2018/2/22.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;    //重点，这里就是运用了组合，所有鸭子子类都继承它们
    QuackBehavior quackBehavior;

    public abstract void display();     //每种鸭子的display都是不同的，所以这里直接用个抽象方法


    public void performFly() {      //委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys");      //几乎所有鸭子都会游泳，所以这里直接提供个默认方法
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {       //这两个方法可以动态改变子类鸭子叫和飞的具体实现
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
