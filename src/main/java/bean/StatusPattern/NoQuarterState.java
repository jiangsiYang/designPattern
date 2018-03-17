package main.java.bean.StatusPattern;

/**
 * Created by Yang on 2018/1/16.
 * 等待投币状态
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());   //将糖果机状态切换到HasQuarter状态
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay quarter first");

    }
}
