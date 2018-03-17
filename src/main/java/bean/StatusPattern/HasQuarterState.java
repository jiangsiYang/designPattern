package main.java.bean.StatusPattern;

/**
 * Created by Yang on 2018/1/16.
 * 已投币状态
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

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
