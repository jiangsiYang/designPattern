package main.java.bean.proxy;

/**
 * Created by Yang on 2018/1/16.
 */
public class SoldState implements State {
    transient GumballMachine gumballMachine;    //State对象是可序列的，但是我们不希望糖果机GumballMachine也被序列化随着State对象一起传送

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball ");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops,out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
