package main.java.service.AdapterAndFacadePattern.AdapterPattern;

import main.java.bean.AdapterAndFacadePattern.AdapterPattern.Duck;
import main.java.bean.AdapterAndFacadePattern.AdapterPattern.MallardDuck;
import main.java.bean.AdapterAndFacadePattern.AdapterPattern.TurkeyAdapter;
import main.java.bean.AdapterAndFacadePattern.AdapterPattern.WildTurKey;

/**
 * Created by Yang on 2018/3/9.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurKey turKey = new WildTurKey();   //我是火鸡
        Duck turKeyAdapter = new TurkeyAdapter(turKey);     //火鸡变身 一只鸭子！

        System.out.println("The Turkey says...");
        turKey.gobble();
        turKey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The turKeyAdapter says...");
        testDuck(turKeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
