package main.java.bean.proxy;

/**
 * Created by Yang on 2018/1/16.
 */
public class SoldOutState implements State {
    transient GumballMachine gumballMachine;    //State对象是可序列的，但是我们不希望糖果机GumballMachine也被序列化随着State对象一起传送

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The gumball is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("The gumball is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("The gumball is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("The gumball is sold out");
    }
}
