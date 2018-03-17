package main.java.bean.StatusPattern;

/**
 * Created by Yang on 2018/1/16.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

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
