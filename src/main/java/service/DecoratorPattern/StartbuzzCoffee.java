package main.java.service.DecoratorPattern;

import main.java.bean.DecoratorPattern.*;

/**
 * Created by Yang on 2018/2/26.
 * 来坐下享受一杯咖啡吧
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        //订一杯中杯espresso,不加任何调料
        Beverage espresso = new Espresso(Beverage.sizeEnum.TALL.getCode());
        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        //订一杯大杯houseBlend,加双倍摩卡和奶泡（好重口味~）
        Beverage houseBlend = new HouseBlend(Beverage.sizeEnum.VENTI.getCode());
        houseBlend = new Mocha(houseBlend); //没错，装饰者模式就是这样用的，直接用摩卡包裹hoeseBlend
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());
    }
}
