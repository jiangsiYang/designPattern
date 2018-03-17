package main.java.bean.proxy;

/**
 * Created by Yang on 2018/1/16.
 * 已投币状态
 */
public class HasQuarterState implements State {
    transient GumballMachine gumballMachine;    //State对象是可序列的，但是我们不希望糖果机GumballMachine也被序列化随着State对象一起传送

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter already");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());    //退币，变为 待投币状态
        System.out.println("You eject a quarter success");
    }

    @Override
    public void turnCrank() {
        gumballMachine.setState(gumballMachine.getSoldState());
        System.out.println("You turned..");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
