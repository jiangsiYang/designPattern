package main.java.bean.DecoratorPattern;

/**
 * Created by Yang on 2018/2/26.
 * 摩卡，并不特指一种咖啡，而是一种调料（装饰者）
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;      //根据装饰者模式的类图，装饰者子类会有一个实例变量引用被装饰者
    private double condimentCost = 0;   //调料的价格，根据饮料的size确定

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        if (beverage.getSize() == sizeEnum.TALL.getCode()) {
            condimentCost = 0.19;
        } else if (beverage.getSize() == sizeEnum.GRANDE.getCode()) {
            condimentCost = 0.29;
        } else if (beverage.getSize() == sizeEnum.VENTI.getCode()) {
            condimentCost = 0.39;
        }
    }

    @Override
    public String getDescription() {
        //这就是为什么在调料抽象类 需要子类重新实现getDescription()的原因，因为我们希望不只是描述饮料，而是连完整的调料也描述出来
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        //整个饮料的价格是当前装饰者+被装饰者的 价格总和
        return condimentCost + beverage.cost();
    }
}
